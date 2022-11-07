/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;


import com.example.demo.dominio.Articulo;

import com.example.demo.Dao.ArticulosDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public class ArticuloServiceImpl  implements ArticuloService{
    
    @Autowired
    private ArticulosDao articuloDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Articulo> getArticulos() {
        return (List<Articulo>)articuloDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Articulo getArticulo(Articulo articulo) {
        
    return articuloDao.findById(articulo.getId_articulo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Articulo articulo) {
    articuloDao.save(articulo);
    }

    @Override
    @Transactional
    public void delete(Articulo articulo) {
    articuloDao.delete(articulo);
    }
}
