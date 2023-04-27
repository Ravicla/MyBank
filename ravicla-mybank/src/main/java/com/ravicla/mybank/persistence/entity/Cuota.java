package com.ravicla.mybank.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cuota")
public class Cuota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuota_id")
    private Integer idCuota;
    @Column(name = "fecha_cuota")
    private Date fechaCuota;
    @Column(name = "valor_capital")
    private Double valorCapital;
    @Column(name = "pago_capital")
    private Boolean pagoCapital;
    @Column(name = "valor_interes")
    private Double valorInteres;
    @Column(name = "pago_interes")
    private Boolean pagoInteres;
    @Column(name = "abono_capital")
    private Double abonoCapital;
    @Column(name = "abono_interes")
    private Double abonoInteres;
    @Column(name = "prestamo_id")
    private Integer idPrestamo;


    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(Integer idCuota) {
        this.idCuota = idCuota;
    }

    public Date getFechaCuota() {
        return fechaCuota;
    }

    public void setFechaCuota(Date fechaCuota) {
        this.fechaCuota = fechaCuota;
    }

    public Double getValorCapital() {
        return valorCapital;
    }

    public void setValorCapital(Double valorCapital) {
        this.valorCapital = valorCapital;
    }

    public Boolean getPagoCapital() {
        return pagoCapital;
    }

    public void setPagoCapital(Boolean pagoCapital) {
        this.pagoCapital = pagoCapital;
    }

    public Double getValorInteres() {
        return valorInteres;
    }

    public void setValorInteres(Double valorInteres) {
        this.valorInteres = valorInteres;
    }

    public Boolean getPagoInteres() {
        return pagoInteres;
    }

    public void setPagoInteres(Boolean pagoInteres) {
        this.pagoInteres = pagoInteres;
    }

    public Double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(Double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public Double getAbonoInteres() {
        return abonoInteres;
    }

    public void setAbonoInteres(Double abonoInteres) {
        this.abonoInteres = abonoInteres;
    }


}
