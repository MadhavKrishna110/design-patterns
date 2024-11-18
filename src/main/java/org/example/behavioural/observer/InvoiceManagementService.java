package org.example.behavioural.observer;

public class InvoiceManagementService implements Subscriber{
    InvoiceManagementService(){
         Flipkart.registerSubscriber(Events.ORDER_PLACED,this); 
    }
    @Override
    public void listen(Order order) {
        generateInvoice(order);
    }

    public void generateInvoice(Order order){
        System.out.println("Generating Invoice for Order");
    }
}
