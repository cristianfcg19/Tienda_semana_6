/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.Dao.CategoriaDao;
import com.example.demo.dominio.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class CategoriaServiceImpl implements CategoriaService{
        @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Categoria> getCategorias() {
        return (List<Categoria>)categoriaDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Categoria getCategoria(Categoria categoria) {
        
    return categoriaDao.findById(categoria.getId_categoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
    categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
    categoriaDao.delete(categoria);
    }
}
