/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.Dao.ClienteDao;
import com.example.demo.dominio.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Christian
 */
@Service
public  class ClienteServiceImp implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    @Transactional(readOnly =true)
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly =true)
    public Cliente getClientesPorApellidos(Cliente cliente) {
        return clienteDao.findByApellidos(cliente.getApellidos());
    }
    
    
    @Override
    @Transactional(readOnly =true)
    public Cliente getCliente(Cliente cliente) {
        
    return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
    clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
    clienteDao.delete(cliente);
    }


}
