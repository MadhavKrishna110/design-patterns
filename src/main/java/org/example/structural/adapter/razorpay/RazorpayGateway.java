package org.example.structural.adapter.razorpay;

import java.sql.SQLOutput;

public class RazorpayGateway {

    public String payByCreditCard(String ceditCard,String cvv,String expiry){
        System.out.println("Payment Done by Razorpay");
        return "123";
    }

    public boolean checkPaymentStatus(String id){
        return false;
    }
}
