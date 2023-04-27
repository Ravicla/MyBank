package com.ravicla.mybank.persistence.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioTest {
    private Usuario usuario;

    @Before
    public void setUp() throws Exception {
        usuario = new Usuario();
    }

    @Test
    public void getIdUsuario() {
        usuario.setIdUsuario(2);
        assertEquals(2, usuario.getIdUsuario().intValue());
    }
    @Test
    public void setIdUsuario() {
        usuario.setIdUsuario(2);
        assertEquals(2, usuario.getIdUsuario().intValue());
    }
    @Test
    public void getCi() {
        usuario.setCi("1234567890");
        assertEquals("1234567890", usuario.getCi());
    }
    @Test
    public void setCi() {
        usuario.setCi("1234567890");
        assertEquals("1234567890", usuario.getCi());
    }
    @Test
    public void getNombre() {
        usuario.setNombre("Thalia");
        assertEquals("Thalia", usuario.getNombre());
    }
    @Test
    public void setNombre() {
        usuario.setNombre("Thalia");
        assertEquals("Thalia", usuario.getNombre());
    }
    @Test
    public void getApellido() {
        usuario.setApellido("Alcivar");
        assertEquals("Alcivar", usuario.getApellido());
    }
    @Test
    public void setApellido() {
        usuario.setApellido("Alcivar");
        assertEquals("Alcivar", usuario.getApellido());
    }
    @Test
    public void getCorreo() {
        usuario.setCorreo("ravicla1993@gmail.com");
        assertEquals("ravicla1993@gmail.com", usuario.getCorreo());
    }
    @Test
    public void setCorreo() {
        usuario.setCorreo("ravicla1993@gmail.com");
        assertEquals("ravicla1993@gmail.com", usuario.getCorreo());
    }
    @Test
    public void getTelefono() {
        usuario.setTelefono("0939137821");
        assertEquals("0939137821", usuario.getTelefono());
    }
    @Test
    public void setTelefono() {
        usuario.setTelefono("0939137821");
        assertEquals("0939137821", usuario.getTelefono());
    }
    @Test
    public void getEstatus() {
        usuario.setEstatus("Activo");
        assertEquals("Activo", usuario.getEstatus());
    }
    @Test
    public void setEstatus() {
    }
    @Test
    public void getPassword() {
        usuario.setPassword("1234567890");
        assertEquals("1234567890", usuario.getPassword());
    }
    @Test
    public void setPassword() {
        usuario.setPassword("1234567890");
        assertEquals("1234567890", usuario.getPassword());
    }
}