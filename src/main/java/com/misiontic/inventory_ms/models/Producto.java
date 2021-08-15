package com.misiontic.inventory_ms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Producto {
    private String nombre;
    private String descripcion;
    private Categoria categoria;
    private String codigo;

}
