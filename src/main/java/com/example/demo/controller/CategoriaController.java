/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dominio.Categoria;
import com.example.demo.services.CategoriaService;
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
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
   
    
     @GetMapping("/categoria")
    public String Categoria(Model model)
    {
        
        
          var categoria=categoriaService.getCategorias();
          model.addAttribute("categorias", categoria);
        
        return "categoria";
    }
    
    
    
    
    @GetMapping("/categoria/nuevo")
    public String CategoriaNuevo(Categoria categoria)
    {
             
        return "categoriaCrear";
    }
    
    
    @PostMapping("/categoria/guardar")
    public String CategoriaGuardar(Categoria categoria)
    {
        categoriaService.save(categoria);
        return "redirect:/categoria";
    }
    
    
        
    @GetMapping("/categoria/actualiza/{id_categoria}")
    public String CategoriaActualiza(Categoria categoria,Model model)
    {
          categoria=categoriaService.getCategoria(categoria);
          model.addAttribute("categoria", categoria);
          return "categoriaCrear";
    }
    
 
     @GetMapping("/categoria/eliminar/{id_categoria}")
    public String CategoriaEliminar(Categoria categoria)
    {
          categoriaService.delete(categoria);
           return "redirect:/categoria";
    }
    
    
}
