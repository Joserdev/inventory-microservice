package com.misiontic.inventory_ms.repositories;

import com.misiontic.inventory_ms.models.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IStockRepository extends MongoRepository<Stock, String>  {

}
