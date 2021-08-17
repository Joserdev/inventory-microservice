package com.misiontic.inventory_ms.controllers;

import com.misiontic.inventory_ms.dtos.productoDto;
import com.misiontic.inventory_ms.models.Categoria;
import com.misiontic.inventory_ms.models.Producto;
import com.misiontic.inventory_ms.repositories.IProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final IProductoRepository productoRepository;
    private final AtomicInteger productoId = new AtomicInteger();
    private final AtomicInteger cateoriaId = new AtomicInteger();
    public ProductoController(IProductoRepository productoRepository, AtomicInteger counter) {
        this.productoRepository = productoRepository;
        Categoria categoria = new Categoria("01","Manual", "Herramientas usadas a mano");
        Producto producto01 = new Producto("01","martillo","El martillo es una herramienta de percusión utilizada para golpear directamente o indirectamente una pieza, causando su desplazamiento.", categoria);
        this.productoRepository.save(producto01);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getProducto(@PathVariable String id){
        Optional<Producto> producto = productoRepository.findById(id);
        return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
    @GetMapping("/listAll")
    public ResponseEntity<Object> getProducto(){
        List<Producto> producto = productoRepository.findAll();
        return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
    @GetMapping("/find/{nombre}")
    public ResponseEntity<Object> getProductoByName(@PathVariable String nombre){
        Producto producto = productoRepository.findProductoByName(nombre);
        return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
    @PostMapping("/create")
    public void createProduct(@RequestBody productoDto productoDto, HttpServletResponse response){
        Categoria categoria = new Categoria(Integer.toString(cateoriaId.getAndIncrement()),productoDto.getCategoria().getNombre(),productoDto.getCategoria().getDescripcion());
        Producto producto = new Producto(Integer.toString(productoId.getAndIncrement()),productoDto.getNombre(),productoDto.getDescripcion(),categoria);
        productoRepository.save(producto);
        response.setStatus(HttpServletResponse.SC_OK);
        //return new ResponseEntity<Object>(producto, HttpStatus.OK);
    }
}
