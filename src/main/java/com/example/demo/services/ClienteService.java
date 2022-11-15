/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.dominio.Cliente;
import java.util.List;


/**
 *
 * @author Christian
 */

public  interface ClienteService {
//CRUD = Create Read Update Delete
public List <Cliente> getClientes();

public List <Cliente> getClientesPorApellidos(String apellidos);

public Cliente  getCliente(Cliente cliente);

public void  save(Cliente cliente);

public  void delete(Cliente cliente);



}
