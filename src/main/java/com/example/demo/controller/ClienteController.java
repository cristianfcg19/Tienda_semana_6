/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.Dao.ClienteDao;
import com.example.demo.dominio.Cliente;
import com.example.demo.services.ClienteService;
import com.example.demo.services.ClienteServiceImp;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ClienteController 
{
    
    @Autowired
    private ClienteService clienteService;
   
    @GetMapping("/cliente/nuevo")
    public String ClienteNuevo(Cliente cliente)
    {
             
        return "modificarCliente";
    }
    
    
    @PostMapping("/cliente/guardar")
    public String ClienteGuardar(Cliente cliente)
    {
        clienteService.save(cliente);
        return "redirect:/";
    }
    
    
        
    @GetMapping("/cliente/actualiza/{idCliente}")
    public String ClienteActualiza(Cliente cliente,Model model)
    {
          cliente=clienteService.getCliente(cliente);
          model.addAttribute("cliente", cliente);
          return "modificarCliente";
    }
    
 
     @GetMapping("/cliente/eliminar/{idCliente}")
    public String ClienteEliminar(Cliente cliente)
    {
          clienteService.delete(cliente);
           return "redirect:/";
    }
    
    
}
