package com.ravicla.mybank.persistence.mapper;

import com.ravicla.mybank.domain.User;
import com.ravicla.mybank.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "ci", target = "dni"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "correo", target = "email"),
            @Mapping(source = "telefono", target = "phoneNumber"),
            @Mapping(source = "estatus", target = "status"),
    })

    User toUser(Usuario usuario);
    List<User>toUsers(List<Usuario>usuarios);
    @InheritInverseConfiguration
    Usuario toUsuario(User user);

}
