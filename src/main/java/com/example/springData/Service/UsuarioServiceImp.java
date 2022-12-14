package com.example.springData.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springData.Dao.UsuarioDao;

import com.example.springData.Entity.Usuario;



@Service
public class UsuarioServiceImp implements IUsuarioService{
    @Autowired
    private UsuarioDao user;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) user.findAll();
    }
    @Override
    public void save(Usuario usuario) {
        user.save(usuario);
        
    }
    @Override
    public Optional<Usuario> findOne(Long id) {
        return user.findOne(id);

    }
    @Override
    public void delete(Long id) {
         user.delete(id);
        
    }
    
}
