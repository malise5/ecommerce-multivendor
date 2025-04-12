package com.ecom.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double mrpPrice;
    private double sellingPrice;
    private int discountPercent;
    private int quantity;
    private String color;

    @ElementCollection
    private List<String> imageUrl = new ArrayList<>();

    private double numRating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private LocalDateTime dateAdded = LocalDateTime.now();

    @ManyToOne
    private Seller seller;

    private String sizes;

    private boolean isDeleted = false;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();
}
