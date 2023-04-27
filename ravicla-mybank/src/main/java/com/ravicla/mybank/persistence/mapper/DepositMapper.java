package com.ravicla.mybank.persistence.mapper;

import com.ravicla.mybank.domain.Deposit;
import com.ravicla.mybank.persistence.entity.Aporte;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepositMapper {
    @Mappings({
            @Mapping(source = "idAporte", target = "depositId"),
            @Mapping(source = "fechaAporte", target = "date"),
            @Mapping(source = "valorAporte", target = "amount"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "idTipoIngreso", target = "typeOfIncomeId")
    })
    Deposit toDeposit(Aporte aporte);
    List<Deposit>toDeposits(List<Aporte>aportes);
    @InheritInverseConfiguration
    Aporte toAporte(Deposit deposit);
}
