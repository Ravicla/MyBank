package com.ravicla.mybank.persistence.mapper;

import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.persistence.entity.Cuota;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShareMapper {
    @Mappings({
            @Mapping(source = "idCuota", target = "shareId"),
            @Mapping(source = "fechaCuota", target = "date"),
            @Mapping(source = "valorCapital", target = "capitalValue"),
            @Mapping(source = "pagoCapital", target = "paidCapital"),
            @Mapping(source = "valorInteres", target = "interestValue"),
            @Mapping(source = "pagoInteres", target = "paidInterest"),
            @Mapping(source = "abonoCapital", target = "creditCapital"),
            @Mapping(source = "abonoInteres", target = "creditInterest"),
            @Mapping(source = "idPrestamo", target = "loanId"),
    })
    Share toShare(Cuota cuota);
    List<Share>toShares(List<Cuota>cuotas);
    @InheritInverseConfiguration
    Cuota toCuota(Share share);
}
