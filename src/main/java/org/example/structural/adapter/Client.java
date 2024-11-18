package org.example.structural.adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(List.of(new RazorpayPGAdapter()));
    }
}
