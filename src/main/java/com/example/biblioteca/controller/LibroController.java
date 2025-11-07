package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.service.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class LibroController {

    @Autowired
    private LibroServiceImpl libroService;
    @GetMapping
    public List<Libro> obtenerTodos(){
        return this.libroService.getLibros();

    }
    @GetMapping("/{id}")
    public Optional<Libro> getLibros(@PathVariable Long id){
        return this.libroService.getLibro(id);
    }

    @PostMapping
    void guardarOActualizarLibro(@RequestBody Libro libro){
        this.libroService.guardarOActualizarLibro(libro);
    }
    @DeleteMapping("/{libroId}")
    void eliminarLibro(@PathVariable("libroId")Long libroId){
        this.libroService.eliminarLibro(libroId);
    }


}

