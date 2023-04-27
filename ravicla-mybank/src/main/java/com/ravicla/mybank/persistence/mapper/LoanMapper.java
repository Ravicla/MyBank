package com.ravicla.mybank.persistence.mapper;

import com.ravicla.mybank.domain.Loan;
import com.ravicla.mybank.persistence.entity.Prestamo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LoanMapper {
    @Mappings({
            @Mapping(source = "idPrestamo", target = "loanId"),
            @Mapping(source = "fechaPrestamo", target = "date"),
            @Mapping(source = "interes", target = "loanInterest"),
            @Mapping(source = "valoPrestamo", target = "amount"),
            @Mapping(source = "tiempoPrestamo", target = "time"),
            @Mapping(source = "idUsuario", target = "userId")
    })
    Loan toLoan(Prestamo prestamo);
    List<Loan>toLoans(List<Prestamo>prestamos);
    @InheritInverseConfiguration
    Prestamo toPrestamo(Loan loan);
}
