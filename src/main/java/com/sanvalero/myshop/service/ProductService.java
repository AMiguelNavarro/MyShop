package com.sanvalero.myshop.service;

import com.sanvalero.myshop.domain.Product;

import java.util.Set;

public interface ProductService { // Cosas más lejanas a la BD

    /* INTERFACE CON LAS COSAS QUE QUIERO PODER HACER, SEPARANDO INTERFAZ DE IMPLEMENTACIÓN PARA HACERLO MÁS MANEJABLE EN UN FUTURO */

    Set<Product> findAllProducts();
    Set<Product> findAllProducts(String category);
    void increasePrice(Product product);

}
