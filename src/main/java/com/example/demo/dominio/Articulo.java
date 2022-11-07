/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.dominio;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;
import java.io.Serializable;

/**
 *
 * @author Christian
 */

@Data
@Entity
@Table(name="articulo")
public class Articulo implements  Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_articulo")
    private long id_articulo;
    private String descripcion;
    private String detalle;
    private long precio;       
    private long existencias;
    private boolean activo;
//    @JoinColumn(name="id_categoria" , referencedColumnName="id_categoria")
//    @OneToMany
    private int id_categoria;

    public Articulo(long id_articulo, String descripcion, String detalle, long precio, long existencias, boolean activo, int id_categoria) {
        this.id_articulo = id_articulo;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
        this.id_categoria = id_categoria;
    }

    public Articulo() {
    }
    
    
    
    
}
