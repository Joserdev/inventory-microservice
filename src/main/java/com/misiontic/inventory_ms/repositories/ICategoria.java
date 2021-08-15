package com.misiontic.inventory_ms.repositories;

import com.misiontic.inventory_ms.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICategoria extends MongoRepository<Categoria, String> {
}
