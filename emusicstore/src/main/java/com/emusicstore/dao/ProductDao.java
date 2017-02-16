package com.emusicstore.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.emusicstore.model.Product;

/**
 * Created by Le on 1/6/2016.
 */
/*@Repository
*/
@RepositoryRestResource
public interface ProductDao extends CrudRepository<Product, Integer> {

   /* void addProduct(Product product);

    void editProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);*/
}
