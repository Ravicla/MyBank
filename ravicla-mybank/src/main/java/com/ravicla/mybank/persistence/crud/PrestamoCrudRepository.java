package com.ravicla.mybank.persistence.crud;

import com.ravicla.mybank.persistence.entity.Prestamo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PrestamoCrudRepository extends CrudRepository<Prestamo, Integer> {
    List<Prestamo>findByIdUsuario(int idUsuario);
}
