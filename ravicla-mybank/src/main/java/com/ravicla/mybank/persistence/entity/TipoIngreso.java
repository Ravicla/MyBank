package com.ravicla.mybank.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipoingreso")
public class TipoIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoIngreso_id")
    private Integer idTipoIngreso;
    private String descripcion;


    public Integer getIdTipoIngreso() {
        return idTipoIngreso;
    }

    public void setIdTipoIngreso(Integer idTipoIngreso) {
        this.idTipoIngreso = idTipoIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
