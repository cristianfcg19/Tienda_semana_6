/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dominio.Articulo;
import com.example.demo.services.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Christian
 */
@Controller
public class ArticuloController {
     @Autowired
    private ArticuloService articuloService;
   
     
       @GetMapping("/articulo")
    public String articulo (Model model)
    {
        
        
          var articulo=articuloService.getArticulos();
          model.addAttribute("articulos", articulo);
        
        return "articulo";
    } 
     
     
    @GetMapping("/articulo/nuevo")
    public String ArticuloNuevo(Articulo articulo)
    {
             
        return "crearArticulo";
    }
    
    
    @PostMapping("/articulo/guardar")
    public String ArticuloGuardar(Articulo articulo)
    {
        articuloService.save(articulo);
        return "redirect:/articulo";
    }
    
    
        
    @GetMapping("/articulo/actualiza/{id_articulo}")
    public String ArticuloActualiza(Articulo articulo,Model model)
    {
          articulo=articuloService.getArticulo(articulo);
          model.addAttribute("articulo", articulo);
          return "crearArticulo";
    }
    
 
     @GetMapping("/articulo/eliminar/{id_articulo}")
    public String ArticuloEliminar(Articulo articulo)
    {
          articuloService.delete(articulo);
           return "redirect:/articulo";
    }
    
}
