package utility;

import product.Products;

import java.text.DecimalFormat;
import java.util.List;

public class ReceiptCalculator {

    public String processReceipt(List<Products> cart){
        TaxCalculator taxCalc = new TaxCalculator();
        DecimalFormat twoDigits = new DecimalFormat("#0.00");

        double subTotal = 0;

        for (Products e : cart){
            subTotal += e.getPrice();
        }

        String roundedTotal = twoDigits.format(subTotal + taxCalc.calculateTax(cart));
        String roundedSubTotal = twoDigits.format(subTotal);
        String roundedTax = twoDigits.format(taxCalc.calculateTax(cart));

        System.out.println(roundedSubTotal);
        System.out.println(roundedTax);
        System.out.println(roundedTotal);
        return roundedTax;
    }
}
