package com.example.enjoidental.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.enjoidental.dao.UsuarioDao;
import com.example.enjoidental.models.Usuario;

@RestController
public class AuthController{

    @Autowired
    private UsuarioDao usuariodao;
    
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){

        if(usuariodao.verificarCredenciales(usuario)){
            return "OK";
        }else{
            return "FAIL";
        }
        
    }
}