package com.ravicla.mybank.persistence;

import com.ravicla.mybank.domain.TypeOfIncome;
import com.ravicla.mybank.domain.repository.TypeOfIncomeRepository;
import com.ravicla.mybank.persistence.crud.TipoIngresoCrudRepository;
import com.ravicla.mybank.persistence.entity.TipoIngreso;
import com.ravicla.mybank.persistence.mapper.TypeOfIncomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TipoIngresoRepository implements TypeOfIncomeRepository {
    @Autowired
    private TipoIngresoCrudRepository tipoIngresoCrudRepository;
    @Autowired
    private TypeOfIncomeMapper mapper;


    @Override
    public List<TypeOfIncome> getAll() {
        try {
            List<TipoIngreso>tipoIngresos =(List<TipoIngreso>) tipoIngresoCrudRepository.findAll();
            return mapper.toTypeOfIncomes(tipoIngresos);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Optional<TypeOfIncome> getTypeOfIncome(int typeOfIncomeId) {
        return tipoIngresoCrudRepository.findById(typeOfIncomeId).map(tipoIngreso -> mapper.toTypeOfIncome(tipoIngreso));
    }


    @Override
    public TypeOfIncome save(TypeOfIncome typeOfIncome) {
        TipoIngreso tipoIngreso = mapper.toTipoIngreso(typeOfIncome);
        return mapper.toTypeOfIncome(tipoIngresoCrudRepository.save(tipoIngreso));
    }

    @Override
    public void delete(int tipoIngresoId) {
        tipoIngresoCrudRepository.deleteById(tipoIngresoId);
    }
}
