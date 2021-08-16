package com.misiontic.inventory_ms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter @Setter
public class Producto {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private Categoria categoria;


}
