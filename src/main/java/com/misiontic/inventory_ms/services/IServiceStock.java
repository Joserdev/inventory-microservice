package com.misiontic.inventory_ms.services;

import com.misiontic.inventory_ms.models.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IServiceStock extends MongoRepository<Stock, String> {
}
