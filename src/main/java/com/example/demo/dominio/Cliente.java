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
@Table(name="cliente")

public class Cliente implements Serializable 
{   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Cliente() {
    }
    
    
    
    
    
    
}
