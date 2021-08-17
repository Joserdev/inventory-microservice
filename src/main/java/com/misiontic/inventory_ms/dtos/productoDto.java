package com.misiontic.inventory_ms.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class productoDto {
    private String nombre;
    private String descripcion;
    private categoriaDto categoria;

}
