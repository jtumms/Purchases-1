package com.theironyard;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rdw1995 on 10/24/16.
 */
public interface PurchaseRepo extends CrudRepository<Purchase, Integer> {
    List<Purchase> findByCategory (String category);

}
