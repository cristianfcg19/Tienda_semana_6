/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.Dao.ClienteDao;
import com.example.demo.dominio.Cliente;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexController 
{
    @Autowired
    private ClienteDao clienteDao;

    @GetMapping("/")
    
    public String inicio(Model model)
    {
        var text="Estamos en semana 4";
        model.addAttribute("saludo", text);
        /*
        Cliente cliente=new Cliente("Pedro","Jimenez Retana","pjumenez@gmail.com","112222");
        Cliente cliente2=new Cliente("Lucas","Juan Perez","pjuan@gmail.com","11aa");
        
        var clientes=Arrays.asList(cliente,cliente2);
        */
        var  clientes=clienteDao.findAll();
        
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
    
    
    
}
