package com.fullstack.springboot.controllers;


import com.fullstack.springboot.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

@RequestMapping( value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable String id){

    Usuario usuario = new Usuario();
    usuario.setId(id);
    usuario.setNombre("Osman");
    usuario.setApellido("Mazariegos");
    usuario.setEmail("osman.mazariegos@gmail.com");
    usuario.setTelefono("50523804");

    return usuario;
}


}
