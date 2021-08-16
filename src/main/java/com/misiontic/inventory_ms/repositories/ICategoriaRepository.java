package com.misiontic.inventory_ms.repositories;

import com.misiontic.inventory_ms.models.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface ICategoriaRepository extends MongoRepository<Categoria, String> {
}
