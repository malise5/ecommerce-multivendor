package com.ecom.model;

import com.ecom.domain.PaymentMethod;
import com.ecom.domain.PaymentOrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private PaymentOrderStatus status = PaymentOrderStatus.PENDING;


    private PaymentMethod paymentMethod;

    private String paymentLinks;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Order> orders = new HashSet<>();
}
