package org.example.structural.adapter;

import java.util.List;

public class Flipkart {
    private List<PaymentGateway> paymentGateway;

//    private PaymentGateway chooseBestGateway() {
//
//    }

    public Flipkart(List<PaymentGateway> paymentGateway) {
       this.paymentGateway= paymentGateway;
    }

    public void makePaymentViaCC(String cardNumber, int cvv, int expiryMonth,int expiryYear){
        Long transactionId = paymentGateway.get(0).payViaCC(cardNumber, cvv, expiryMonth, expiryYear);

        while(!paymentGateway.get(0).getStatus(transactionId).equals(PaymentStatus.SUCCESS)){
            System.out.println("Waiting");
        }

    }
}
