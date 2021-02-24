package com.sanvalero.myshop.repository;

import com.sanvalero.myshop.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
// Cosas muy finas, muy cercanas a la BD, sería el DAO


@Repository //Indica a Spring que este es mi repository
public interface ProductRepository extends CrudRepository<Product, Long> {  // Interfaz que ya tiene los métodos básicos de CRUD con la BD
                                                                            // Long hace referencia al tipo de dato ID de la tabla

    /* Se pueden añadir todos los que se quieran así */
    Set<Product>findAll();
    Product findByName(String name); // Busca productos en la BD por name, se autogenera solo
    Set<Product> findByNameAndPrice(String name, float price); // Busca por name y price en la BD


}
