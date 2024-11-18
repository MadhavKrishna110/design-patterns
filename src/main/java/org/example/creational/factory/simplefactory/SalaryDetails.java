package org.example.creational.factory.simplefactory;

public class SalaryDetails {
    private double basePay;
    private double hra;

    public SalaryDetails() {
    }

    private double lta;

    public SalaryDetails(double basePay, double hra, double lta) {
        this.basePay = basePay;
        this.hra = hra;
        this.lta = lta;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getLta() {
        return lta;
    }

    public void setLta(double lta) {
        this.lta = lta;
    }
}
