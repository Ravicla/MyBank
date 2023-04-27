package com.ravicla.mybank.persistence;

import com.ravicla.mybank.domain.Deposit;
import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.domain.TypeOfIncome;
import com.ravicla.mybank.domain.repository.DepositRepository;
import com.ravicla.mybank.domain.repository.TypeOfIncomeRepository;
import com.ravicla.mybank.persistence.crud.AporteCrudRepository;
import com.ravicla.mybank.persistence.crud.TipoIngresoCrudRepository;
import com.ravicla.mybank.persistence.entity.Aporte;
import com.ravicla.mybank.persistence.entity.TipoIngreso;
import com.ravicla.mybank.persistence.mapper.DepositMapper;
import com.ravicla.mybank.persistence.mapper.TypeOfIncomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AporteRepository implements DepositRepository {
    @Autowired
    private AporteCrudRepository aporteCrudRepository;
    @Autowired
    private TipoIngresoCrudRepository tipoIngresoCrudRepository;
    @Autowired
    private DepositMapper mapper;
    @Autowired
    private TypeOfIncomeMapper typeOfIncomeMapper;


    @Override
    public List<Deposit> getAll() {
        List<Aporte>aportes = (List<Aporte>) aporteCrudRepository.findAll();
        return mapper.toDeposits(aportes);
    }

    @Override
    public Optional<Deposit> getDeposit(int depositId) {
        return aporteCrudRepository.findById(depositId).map(aporte -> mapper.toDeposit(aporte));
    }

    @Override
    public Optional<Deposit> getDepositDetails(int depositId) {
        try {
            Optional<Deposit> deposit = aporteCrudRepository.findById(depositId).map(aporte -> mapper.toDeposit(aporte));
            Optional<TipoIngreso> tipoIngreso = tipoIngresoCrudRepository.findById(deposit.get().getTypeOfIncomeId());
            TypeOfIncome typeOfIncome = typeOfIncomeMapper.toTypeOfIncome(tipoIngreso.get());
            deposit.get().setTypeOfIncome(typeOfIncome);
            return deposit;

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;

    }

    @Override
    public List<Deposit> getDepositUser(int usuarioId) {
        try {
            List<Aporte>listaAportes = aporteCrudRepository.findByIdUsuario(usuarioId);
            List<Deposit>listDeposit = new ArrayList<>();
            for (Aporte aporte : listaAportes){

                Optional<TipoIngreso> tipoIngresos = tipoIngresoCrudRepository.findById(aporte.getIdTipoIngreso());
                TypeOfIncome typeOfIncome = typeOfIncomeMapper.toTypeOfIncome(tipoIngresos.get());

                Deposit deposit = mapper.toDeposit(aporte);
                deposit.setTypeOfIncome(typeOfIncome);
                listDeposit.add(deposit);
            }
            return listDeposit;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }



    @Override
    public Deposit save(Deposit deposit) {
        Aporte aporte = mapper.toAporte(deposit);
        return mapper.toDeposit(aporteCrudRepository.save(aporte));
    }

    @Override
    public void delete(int aporteId) {
        aporteCrudRepository.deleteById(aporteId);

    }
}
