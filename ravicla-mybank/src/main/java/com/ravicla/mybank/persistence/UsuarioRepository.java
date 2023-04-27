package com.ravicla.mybank.persistence;

import com.ravicla.mybank.domain.User;
import com.ravicla.mybank.domain.repository.DepositRepository;
import com.ravicla.mybank.domain.repository.LoanRepository;
import com.ravicla.mybank.domain.repository.UserRepository;
import com.ravicla.mybank.persistence.crud.UsuarioCrudRepository;
import com.ravicla.mybank.persistence.entity.Usuario;
import com.ravicla.mybank.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UsuarioRepository implements UserRepository {
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;
    @Autowired
    private LoanRepository loanRepository;
    @Autowired
    DepositRepository depositRepository;
    @Autowired
    private UserMapper mapper;


    @Override
    public List<User> getAll() {
        List<Usuario>usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return mapper.toUsers(usuarios);
    }

    @Override
    public Optional<User> getUser(int userId) {
        return usuarioCrudRepository.findById(userId).map(usuario -> mapper.toUser(usuario));
    }
    @Override
    public Optional<User> getUserDetailsDeposit(int userId) {
        Optional<User>user = usuarioCrudRepository.findById(userId).map(usuario -> mapper.toUser(usuario));
        user.get().setDeposits(depositRepository.getDepositUser(userId));
        return user;
    }

    @Override
    public Optional<User> getUserDetailsLoan(int userId) {
        Optional<User>user = usuarioCrudRepository.findById(userId).map(usuario -> mapper.toUser(usuario));
        user.get().setLoans(loanRepository.getLoanUser(userId));
        return user;
    }


    @Override
    public User save(User user) {
        Usuario usuario = mapper.toUsuario(user);
        return mapper.toUser(usuarioCrudRepository.save(usuario));
    }

    @Override
    public void delete(int usuarioId) {
        usuarioCrudRepository.deleteById(usuarioId);

    }

}
