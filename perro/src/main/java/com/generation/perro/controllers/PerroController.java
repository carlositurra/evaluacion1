package com.generation.perro.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.perro.models.Perro;
import com.generation.perro.services.PerroService;

@Controller
@RequestMapping("/perro")
public class PerroController {
    @Autowired //inyeccion de dependencias
    PerroService perroService;
//listar perro
@RequestMapping("")
    public String listarPerro(@Valid @ModelAttribute("perro")Perro perro,Model model){
        List<Perro> listaPerros = perroService.listaPerros();
        model.addAttribute("listaPerros", listaPerros);
        return "perro.jsp";
    }
//agregar perro
@PostMapping("/registrar")
    public String registrarPerro(@Valid @ModelAttribute("perro") Perro perro){//buscar que es y para que sirve @Valid
        perroService.guardarPerro(perro);
        return"redirect:/perro";
    } 
//editar perro


//eliminar perro
@RequestMapping("/eliminar/{perroId}")
    public String eliminarPerro(@PathVariable("perroId")Long id){//padhVariable: se ocupa 
        perroService.eliminarPerro(id);

        return "redirect:/perro";
    }


}
