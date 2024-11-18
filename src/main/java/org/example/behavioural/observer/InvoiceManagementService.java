package org.example.behavioural.observer;

public class InvoiceManagementService implements Subscriber<Order>{
    InvoiceManagementService(){
         Flipkart.registerSubscriber(Events.ORDER_PLACED,this);
         Flipkart.registerSubscriber(Events.ORDER_CANCELLED,this);
    }
    @Override
    public void listen(Events events,Order order) {
        if(events==Events.ORDER_PLACED){
            generateInvoice(order);
        } else if(events==Events.ORDER_CANCELLED){
            cancelInvoice(order);
        }

    }

    public void generateInvoice(Order order){
        System.out.println("Generating Invoice for Order");
    }

    public void cancelInvoice(Order order){
        System.out.println("Cancelling Invoice for Order");
    }
}
