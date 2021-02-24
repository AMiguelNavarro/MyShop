package com.sanvalero.myshop.service;

import com.sanvalero.myshop.domain.Product;
import com.sanvalero.myshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service // Indica a Spring que este es mi Service
public class ProductServiceImpl implements ProductService{
    // LOGICA DE NEGOCIO

    @Autowired // Para traer el ProductRepository que necesitaremos para la BD
    private ProductRepository productRepository; // Este objeto tiene todos los métodos de la clase correspondiente

    @Override
    public Set<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Set<Product> findAllProducts(String category) {
        return null;
    }

    @Override
    public void increasePrice(Product product) {

    }

}
