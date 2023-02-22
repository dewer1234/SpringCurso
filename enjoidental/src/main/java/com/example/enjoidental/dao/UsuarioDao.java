package com.example.enjoidental.dao;

import java.util.List;
import com.example.enjoidental.models.Usuario;

public interface UsuarioDao{

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}