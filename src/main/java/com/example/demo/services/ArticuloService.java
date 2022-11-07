/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;


import com.example.demo.dominio.Articulo;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface ArticuloService {

public List <Articulo> getArticulos();

public Articulo  getArticulo(Articulo articulo);

public void  save(Articulo articulo);

public  void delete(Articulo articulo);
    
}
