package com.ravicla.mybank.persistence.entity;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prestamo_id")
    private Integer idPrestamo;
    @Column(name = "fecha_prestamo")
    private Date fechaPrestamo;
    private Integer interes;
    @Column(name = "valor_prestamo")
    protected Double valoPrestamo;
    @Column(name = "tiempo_prestamo")
    private Integer tiempoPrestamo;
    @Column(name = "usuario_id")
    private Integer idUsuario;

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    public Double getValoPrestamo() {
        return valoPrestamo;
    }

    public void setValoPrestamo(Double valoPrestamo) {
        this.valoPrestamo = valoPrestamo;
    }

    public Integer getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(Integer tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }



}
