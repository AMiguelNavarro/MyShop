package com.sanvalero.myshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/* PARTE DE LOMBOK */
@Data // Con esto la clase ya tiene getters y setters
@AllArgsConstructor // Constructor con todos los argumentos
@NoArgsConstructor // Constructor vacío
/*------------------------------------------------------------*/

@Entity(name = "productos") // Le dice a java que esto es una entidad de la base de datos OJO!! la de javax.persistence
                            // Enlaza con la tabla productos de la base de datos

public class Product {

    @Id // Le indica que es in ID, ya entiende que es un primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Le dice que es autonumérico
    private long id;

    @Column // Indica que es una columna de la base de datos
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String category;

    @Column
    private float precio;

    @Column(name = "creation_date") // Cambia el nombre de la columna en la base de datos al que pongamos en name
    private LocalDateTime creationDate;

}
