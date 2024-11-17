package org.example.factory.simplefactory;

public class TaxCalculator {
//    Issues:
//    Violating SRP, open/close, DRY

//    public static Double calculateTax(TaxRegime regime, SalaryDetails details){
//        switch(regime) {
//            case OLD:
//                return 0.4* details.getBasePay() + 0.3 * details.getHra();
//            case NEW:
//                return 0.4 * details.getBasePay() + 0.3 * details.getHra() + 0.2 * details.getLta();
//        }
//        return 0.4*(details.getHra()+details.getHra()+ details.getLta());
//    }

        public static Double calculateTax(TaxRegime taxRegime,SalaryDetails salary){
            return TaxCalculatorFactory.getTaxAlgorithm(taxRegime).calculateTax(salary);
        }
}
