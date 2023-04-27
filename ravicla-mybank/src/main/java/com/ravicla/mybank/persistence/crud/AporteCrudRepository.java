package com.ravicla.mybank.persistence.crud;

import com.ravicla.mybank.persistence.entity.Aporte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AporteCrudRepository extends CrudRepository<Aporte, Integer> {
    List<Aporte>findByIdUsuario(int idUsuario);

}
