package com.ravicla.mybank.persistence.crud;

import com.ravicla.mybank.persistence.entity.Aporte;
import com.ravicla.mybank.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {

}
