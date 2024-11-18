package org.example.creational.factory.simplefactory.algorithm;

import org.example.creational.factory.simplefactory.SalaryDetails;

public class OldTaxAlgorithm implements TaxAlgorithm{
    @Override
    public Double calculateTax(SalaryDetails salary) {
        return 0.4* salary.getBasePay()+0.3* salary.getHra()+0.2* salary.getLta();
    }
}
