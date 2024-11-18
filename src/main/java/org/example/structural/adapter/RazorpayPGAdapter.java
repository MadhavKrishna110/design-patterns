package org.example.structural.adapter;

import org.example.structural.adapter.razorpay.RazorpayGateway;

public class RazorpayPGAdapter implements PaymentGateway {
    RazorpayGateway razorpayGateway = new RazorpayGateway();
    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiryString = String.valueOf(expiryMonth)+"/"+String.valueOf(expiryYear);
        String transaction = razorpayGateway.payByCreditCard(cardNumber,cvvString,expiryString);
        return Long.parseLong(transaction);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(id));
        if(status==true){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
