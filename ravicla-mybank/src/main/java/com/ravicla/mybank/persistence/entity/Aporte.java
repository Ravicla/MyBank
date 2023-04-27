package com.ravicla.mybank.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "aporte")
public class Aporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aporte_id")
    private Integer idAporte;
    @Column(name = "fecha_aporte")
    private Date fechaAporte;
    @Column(name = "valor_aporte")
    private Integer valorAporte;
    @Column(name = "usuario_id")
    private Integer idUsuario;
    @Column(name = "tipoingreso_id")
    private Integer idTipoIngreso;

    public Integer getIdTipoIngreso() {
        return idTipoIngreso;
    }

    public void setIdTipoIngreso(Integer idTipoIngreso) {
        this.idTipoIngreso = idTipoIngreso;
    }

    public Integer getIdAporte() {
        return idAporte;
    }

    public void setIdAporte(Integer idAporte) {
        this.idAporte = idAporte;
    }

    public Date getFechaAporte() {
        return fechaAporte;
    }

    public void setFechaAporte(Date fechaAporte) {
        this.fechaAporte = fechaAporte;
    }

    public Integer getValorAporte() {
        return valorAporte;
    }

    public void setValorAporte(Integer valorAporte) {
        this.valorAporte = valorAporte;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }


}

