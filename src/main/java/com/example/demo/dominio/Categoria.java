/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Christian
 */
@Data
@Entity
@Table(name = "categoria")
public class Categoria implements  Serializable{
    
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)   
 private  long id_categoria;
 private  String descripcion;
 private  boolean activo;

    public Categoria() {
    }

    public Categoria(long id_categoria, String descripcion, boolean activo) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.activo = activo;
    }

   
 
}
