package org.example.structural.adapter.payu;

import org.example.structural.adapter.PaymentGateway;
import org.example.structural.adapter.PaymentStatus;

public class PayUGateway  {

    public String payViaCC(Long cardNumber, Long cvv, Long expiryMonth, Long expiryYear) {
        System.out.println("Payment Done by Razorpay");
        return "123";
    }


    public PayUPaymentStatus getStatus(Long id) {
        return PayUPaymentStatus.FAILURE;
    }
}
