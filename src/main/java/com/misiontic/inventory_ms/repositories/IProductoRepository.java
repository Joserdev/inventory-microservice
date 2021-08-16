package com.misiontic.inventory_ms.repositories;

import com.misiontic.inventory_ms.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends MongoRepository<Producto, String> {
    @Query(value = "{'nombre': ?0}", fields = "{'nombre':1,'descripcion': 1, 'categoria' : 1}")
    Producto findProductoByName(String nombre);
}
