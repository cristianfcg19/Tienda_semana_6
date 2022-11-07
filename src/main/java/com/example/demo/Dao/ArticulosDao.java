/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Dao;

import com.example.demo.dominio.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Christian
 */
public interface ArticulosDao extends  JpaRepository<Articulo, Long> {
    
}
