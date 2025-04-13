package com.ecom.model;


import com.ecom.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String razorPaymentLinkedId;
    private String razorPaymentLinkedReferenceId;
    private String razorPaymentLinkedStatus;
    private String razorPaymentId;
    private PaymentStatus status;
}
