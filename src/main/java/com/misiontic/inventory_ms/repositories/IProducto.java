package com.misiontic.inventory_ms.repositories;

import com.misiontic.inventory_ms.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProducto extends MongoRepository<Producto, String> {
}
