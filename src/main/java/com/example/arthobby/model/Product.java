package com.example.arthobby.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data

//@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Column
    private String name;
    //    @Column
    private LocalDateTime dateOfCreate;
    //    @Column
    private Long price;
    //    @Column
    private String type;
    //    @Column
    private String material;
    //    @Column
    private String size;
    //    @Column
    private String fileName;
    //    @Column
    private String article;

}
