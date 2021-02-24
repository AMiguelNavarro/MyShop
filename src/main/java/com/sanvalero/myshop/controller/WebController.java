package com.sanvalero.myshop.controller;


import com.sanvalero.myshop.domain.Product;
import com.sanvalero.myshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller // Indica a Spring que es el Controller
public class WebController { // Aquí se definen los puntos de interacción que hay con la página web

    @Autowired
    private ProductService productService;

/* DEFINIR LOS PUNTOS DE ENTRADA A LA WEB (productos, entradas ...) */

    // Directorio raiz
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index"; // Ubicado en templates
    }


    // Directorio catálogo
    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {
        Set<Product> products = productService.findAllProducts();
        // TODO pintar los productos que tengamos en la BD
        return "catalog";
    }

}
