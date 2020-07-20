package utility;

import org.jetbrains.annotations.TestOnly;
import product.Products;

import java.text.DecimalFormat;
import java.util.List;

public class _TEST_ReceiptCalculator {

    @TestOnly
    public void emptyCartReturnsZeroItemsInCart(List<Products> cart){
        System.out.println("There are " + cart.size() + " items in the cart.");
        for (Products e : cart){
            System.out.println(e.getName());
        }
    }

    @TestOnly
    public void callPriceAndTaxesFromItem0InCart(List<Products> cart){
        System.out.println(
        "\n price:        " + cart.get(0).getPrice() +
        "\n isExempt: " + cart.get(0).isTaxExempt() +
        "\n isImport:   " + cart.get(0).isImported() +
        "\n Tax calculation is done in TaxCalculator.java");
    }

    @TestOnly
    public void runTaxCalcOnSingleItemRETURNPriceAndTax(List<Products> cart){
        TaxCalculator taxCalc = new TaxCalculator();
        DecimalFormat twoDigits = new DecimalFormat("#0.00");
        String roundedTax = twoDigits.format(taxCalc.calculateTax(cart));
        System.out.println(
                "Price: " + cart.get(0).getPrice() +
                "\nTax  : " + roundedTax);
    }

    @TestOnly
    public void multipleItemsInListRETURNSubtotalPrice(List<Products> cart){
        TaxCalculator taxCalc = new TaxCalculator();
        DecimalFormat twoDigits = new DecimalFormat("#0.00");
        String roundedTax = twoDigits.format(taxCalc.calculateTax(cart));
        double subTotal = 0;

        for (Products e : cart){
            subTotal += e.getPrice();
        }
        String roundedSubTotal = twoDigits.format(subTotal);
        System.out.println(roundedSubTotal);
    }

    @TestOnly
    public void multipleItemsInListRETURNSubtotalPriceWithTaxCalc(List<Products> cart){
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
    }

    @TestOnly
    public void fullTestOnInputThree(List<Products> cart){
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
    }

}
