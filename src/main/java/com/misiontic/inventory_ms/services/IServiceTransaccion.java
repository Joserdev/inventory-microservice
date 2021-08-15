package com.misiontic.inventory_ms.services;

import com.misiontic.inventory_ms.models.Transaccion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IServiceTransaccion extends MongoRepository<Transaccion, String> {
}
