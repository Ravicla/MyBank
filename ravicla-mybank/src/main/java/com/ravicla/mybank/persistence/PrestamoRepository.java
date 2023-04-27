package com.ravicla.mybank.persistence;

import com.ravicla.mybank.domain.Loan;
import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.domain.repository.LoanRepository;
import com.ravicla.mybank.domain.repository.ShareRepository;
import com.ravicla.mybank.persistence.crud.CuotaCrudRepository;
import com.ravicla.mybank.persistence.crud.PrestamoCrudRepository;
import com.ravicla.mybank.persistence.entity.Cuota;
import com.ravicla.mybank.persistence.entity.Prestamo;
import com.ravicla.mybank.persistence.mapper.LoanMapper;
import com.ravicla.mybank.persistence.mapper.ShareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PrestamoRepository implements LoanRepository {
    @Autowired
    private PrestamoCrudRepository prestamoCrudRepository;
    @Autowired
    private ShareRepository shareRepository;
    @Autowired
    private LoanMapper mapper;
    @Autowired
    private ShareMapper shareMapper;
    @Autowired
    private CuotaCrudRepository cuotaCrudRepository;

    @Override
    public List<Loan> getAll() {
        List<Prestamo>prestamos = (List<Prestamo>) prestamoCrudRepository.findAll();
        return mapper.toLoans(prestamos);
    }

    @Override
    public Optional<Loan> getLoan(int loanId) {
        return prestamoCrudRepository.findById(loanId).map(prestamo -> mapper.toLoan(prestamo));
    }

    @Override
    public Optional<Loan> getLoanDetails(int loanId) {
        Optional<Loan> loan = prestamoCrudRepository.findById(loanId).map(prestamo -> mapper.toLoan(prestamo));
        loan.get().setShares(shareRepository.getShareLoan(loanId));
        return loan;
    }

    @Override
    public List<Loan> getLoanUser(int usuarioId) {
        try{
            List<Prestamo>listaPrestamos = prestamoCrudRepository.findByIdUsuario(usuarioId);
            List<Loan>listLoan = new ArrayList<>();
            for (Prestamo prestamo : listaPrestamos){

                List<Cuota> listaCuotas = cuotaCrudRepository.findByIdPrestamo(prestamo.getIdPrestamo());
                List<Share> listShare = new ArrayList<>();

                for (Cuota listaCuota : listaCuotas) {
                    Share share = shareMapper.toShare(listaCuota);
                    listShare.add(share);
                }

                Loan loan = mapper.toLoan(prestamo);
                loan.setShares(listShare);
                listLoan.add(loan);
            }
            return listLoan;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Loan save(Loan loan) {
        Prestamo prestamo = mapper.toPrestamo(loan);
        return mapper.toLoan(prestamoCrudRepository.save(prestamo));
    }

    @Override
    public void delete(int prestamoId) {
        prestamoCrudRepository.deleteById(prestamoId);
    }
}




