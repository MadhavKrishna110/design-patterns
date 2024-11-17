package org.example.factory.simplefactory;

import org.example.factory.simplefactory.algorithm.NewTaxAlgorithm;
import org.example.factory.simplefactory.algorithm.OldTaxAlgorithm;
import org.example.factory.simplefactory.algorithm.TaxAlgorithm;

public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime taxRegime){
        switch(taxRegime) {
            case OLD :
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }
        throw new RuntimeException("Invalid Regime");
    }
}
