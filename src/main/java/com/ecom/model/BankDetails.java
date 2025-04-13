package com.ecom.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {

    private  String bankName;
    private  String accountNumber;
    private  String accountHolderName;
    private  String ifscCode;

}
