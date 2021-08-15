package com.misiontic.inventory_ms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Transaccion {
    @Id
    private String Id;
    private String usuario;
    private Producto producto;
    private Categoria categoria;
    private Integer cantidad;
    private LocalDate fecha;
}
