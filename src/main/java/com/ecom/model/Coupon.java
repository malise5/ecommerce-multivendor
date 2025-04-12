package com.ecom.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private Double discount;

    private LocalDate validityStartDate;
    private LocalDate validityEndDate;

    private double minimumOrderAmount;

    private boolean isActive;

    @ManyToMany(mappedBy = "usedCoupon")
    private Set<User> usedByUsers = new HashSet<>();
}
