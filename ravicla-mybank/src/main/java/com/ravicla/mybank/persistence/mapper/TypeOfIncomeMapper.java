package com.ravicla.mybank.persistence.mapper;

import com.ravicla.mybank.domain.TypeOfIncome;
import com.ravicla.mybank.persistence.entity.TipoIngreso;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeOfIncomeMapper {
    @Mappings({
            @Mapping(source = "idTipoIngreso", target = "typeOfIncomeId"),
            @Mapping(source = "descripcion", target = "typeOfIncome"),
    })
    TypeOfIncome toTypeOfIncome(TipoIngreso tipoIngreso);
    List<TypeOfIncome>toTypeOfIncomes(List<TipoIngreso>tipoIngresos);

    @InheritInverseConfiguration
    TipoIngreso toTipoIngreso(TypeOfIncome typeOfIncome);
}
