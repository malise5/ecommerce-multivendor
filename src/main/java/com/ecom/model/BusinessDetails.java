package com.ecom.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
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
