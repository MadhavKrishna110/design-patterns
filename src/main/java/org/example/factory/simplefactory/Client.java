package org.example.factory.simplefactory;

public class Client {
    public static void main(String[] args) {

        SalaryDetails salaryDetails = new SalaryDetails(60000.0,24000,16000);
        Double tax = TaxCalculator.calculateTax(TaxRegime.NEW,salaryDetails);
        System.out.println("Tax in New Regime is:"+ tax);
    }
}
