package com.roger.twodata.services.parking;

import com.roger.twodata.model.parking.Usuario;
import com.roger.twodata.repositories.parking.UsuariosRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    @Autowired
    private UsuariosRepositories repositories;


    public List<Usuario> findAll() {
        return repositories.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> obj = repositories.findById(id);
        return obj.get();
    }



    @Override
    public List<Usuario> obterUsuarios() {
        return null;
    }
}
