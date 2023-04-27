package com.ravicla.mybank.persistence.crud;

import com.ravicla.mybank.persistence.entity.TipoIngreso;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TipoIngresoCrudRepository extends CrudRepository<TipoIngreso, Integer> {


}
