package com.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessDetails {
    private String businessName;
    private String businessAddress;
    private String businessPhoneNumber;
    private String businessEmail;
    private String logoUrl;
    private String bannerUrl;
}
