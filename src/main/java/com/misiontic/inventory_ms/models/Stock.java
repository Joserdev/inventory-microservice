package com.misiontic.inventory_ms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;
@AllArgsConstructor
@Getter @Setter
public class Stock {
    @Id
    private String id;
    private List<Producto> productos;
    private Integer cantidad;
    private String categoria;
}
