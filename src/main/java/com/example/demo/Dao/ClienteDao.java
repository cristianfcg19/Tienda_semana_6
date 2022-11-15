/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Dao;

import com.example.demo.dominio.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

/**
 *
 * @author Christian
 */
public interface ClienteDao extends JpaRepository<Cliente, Long>
{
 public List<Cliente> findByApellidos (String apellidos);
    
    
    
}
