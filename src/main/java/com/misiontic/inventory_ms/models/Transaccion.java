package com.misiontic.inventory_ms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@AllArgsConstructor
@Getter @Setter
public class Transaccion {
    @Id
    private String id;
    private String usuario;
    private Producto producto;
    private Categoria categoria;
    private Integer cantidad;
    private LocalDate fecha;
}
