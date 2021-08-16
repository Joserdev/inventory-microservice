package com.misiontic.inventory_ms.repositories;

import com.misiontic.inventory_ms.models.Transaccion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransaccionRepository extends MongoRepository<Transaccion, String>  {

}
