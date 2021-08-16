package com.misiontic.inventory_ms.controllers;

import com.misiontic.inventory_ms.models.Categoria;
import com.misiontic.inventory_ms.models.Producto;
import com.misiontic.inventory_ms.repositories.IProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductoController {
    private final IProductoRepository productoRepository;

    public ProductoController(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
        Categoria categoria = new Categoria("01","Manual", "Herramientas usadas a mano");
        Producto producto01 = new Producto("01","martillo","El martillo es una herramienta de percusión utilizada para golpear directamente o indirectamente una pieza, causando su desplazamiento.", categoria);
        this.productoRepository.save(producto01);
    }
    @RequestMapping("/productos")
    @GetMapping("/{id}")
    ResponseEntity<Object> getProducto(@PathVariable String id){
        Optional<Producto> producto = productoRepository.findById(id);
        return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
    @GetMapping("/find/{nombre}")
    ResponseEntity<Object> getProductoByName(@PathVariable String nombre){
        Producto producto = productoRepository.findProductoByName(nombre);
        return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
    @PostMapping("/create")
    ResponseEntity<Object> createProduct(@RequestBody Producto producto){
        productoRepository.save(producto);
        return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
}
