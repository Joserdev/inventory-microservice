package com.misiontic.inventory_ms.services;

import com.misiontic.inventory_ms.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IServiceCategoria extends MongoRepository<Categoria, String> {
}
