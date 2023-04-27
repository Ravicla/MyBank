package com.ravicla.mybank.persistence;

import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.domain.repository.ShareRepository;
import com.ravicla.mybank.persistence.crud.CuotaCrudRepository;
import com.ravicla.mybank.persistence.entity.Cuota;
import com.ravicla.mybank.persistence.mapper.ShareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CuotaRepository implements ShareRepository {

    @Autowired
    private CuotaCrudRepository cuotaCrudRepository;
    @Autowired
    private ShareMapper mapper;


    @Override
    public List<Share> getAll() {
        List<Cuota>cuotas = (List<Cuota>) cuotaCrudRepository.findAll();
        return mapper.toShares(cuotas);
    }

    @Override
    public Optional<Share> getShare(int shareId) {
        return cuotaCrudRepository.findById(shareId).map(cuota -> mapper.toShare(cuota));
    }

    @Override
    public List<Share> getShareLoan(int prestamoId) {

        try{
            List<Cuota> listaCuotas = cuotaCrudRepository.findByIdPrestamo(prestamoId);
            List<Share> listShare = new ArrayList<>();
            for (Cuota cuota : listaCuotas) {
                Share share = mapper.toShare(cuota);
                listShare.add(share);
            }
            return listShare;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Share save(Share share) {
        Cuota cuota = mapper.toCuota(share);
        return mapper.toShare(cuotaCrudRepository.save(cuota));
    }

    @Override
    public void delete(int cuotaId) {
        cuotaCrudRepository.deleteById(cuotaId);
    }
}
