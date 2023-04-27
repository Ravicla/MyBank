package com.ravicla.mybank.persistence.crud;

import com.ravicla.mybank.persistence.entity.Cuota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CuotaCrudRepository extends CrudRepository<Cuota, Integer> {
    List<Cuota> findByIdPrestamo(int idPrestamo);
}
