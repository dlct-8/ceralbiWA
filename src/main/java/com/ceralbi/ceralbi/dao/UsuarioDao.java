package com.ceralbi.ceralbi.dao;

import com.ceralbi.ceralbi.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    Usuario obtnerUsuarioPorCredenciales(Usuario usuario);
}
