package com.misiontic.inventory_ms.models;

import lombok.NoArgsConstructor;

import java.util.List;

public class Stock {
    private List<Producto> productos;
    private Integer cantidad;
    private String categoria;
}
