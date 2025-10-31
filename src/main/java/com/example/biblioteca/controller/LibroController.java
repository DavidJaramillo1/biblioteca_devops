package com.example.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class LibroController {

    @Autowired
    private LibroServiceImpl libroServiceImpl; //Se inyecta la depedencia

    @GetMapping
    public List<Libro> obtenerTodos(){
        return this.libroServiceImpl.getLibros();
    }

    @GetMapping
    public Optional<Libro> getLibro(@PathVariable Long id){
        this.libroServiceImpl.guardarOActualizarLibro(libro);
    }

    @PostMapping
    void guardarOActualizarLibro(@RequestBody Libro libro){
        this,libroServiceImpl.guardarOActualizarLibro(libro);

    }

    @DeleteMapping
    void eliminarLibro@PathVariable("libroId") Long libroId {
        this.libroServiceImpl.elimniarLibro(libroId);
    }

}
