/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;


import com.example.demo.dominio.Categoria;
import java.util.List;

/**
 *
 * @author Christian
 */
public interface CategoriaService {
 
public List <Categoria> getCategorias();

public Categoria  getCategoria(Categoria categoria);

public void  save(Categoria categoria);

public  void delete(Categoria categoria);   
}
