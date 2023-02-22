package com.example.enjoidental.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.enjoidental.dao.UsuarioDao;
import com.example.enjoidental.models.Usuario;

@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioDao usuariodao;
    //Para decirle que busque un usuario por id, cuando nuestro id cambie (es decir, no busquemos el mismo id del usuario)
    //Agregamos /{id}
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Allen");
        usuario.setApellido("Iverson");
        usuario.setEmail("allen23@gmail.com");
        usuario.setTelefono("5512345678");
        //usuario.setPassword("jordan23");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){

        return usuariodao.getUsuarios();

    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){

        usuariodao.registrar(usuario);

    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(@PathVariable String id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Allen");
        usuario.setApellido("Iverson");
        usuario.setEmail("allen23@gmail.com");
        usuario.setTelefono("5512345678");
        //usuario.setPassword("jordan23");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuariodao.eliminar(id);

    }

    @RequestMapping(value = "usuario3")
    public Usuario crear(@PathVariable String id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Allen");
        usuario.setApellido("Iverson");
        usuario.setEmail("allen23@gmail.com");
        usuario.setTelefono("5512345678");
        //usuario.setPassword("jordan23");
        return usuario;
    }

}
