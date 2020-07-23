package utility;

import product.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptCalculatorTest {

    @org.junit.jupiter.api.Test
    void emptyCartReturnsZeroItemsInCart() {
        List<Products> cart = new ArrayList<>();
        List<Products> empty = new ArrayList<>();
        List<Products> notEmpty = new ArrayList<>();
        notEmpty.add(new Book("",1,false, false));

        System.out.println("There are " + cart.size() + " items in the cart.");
        for (Products e : cart){
            System.out.println(e.getName());
        }
        assertEquals(empty, cart);
        assertNotEquals(notEmpty, cart);
    }


    @org.junit.jupiter.api.Test
    void callPriceAndTaxesFromItem0InCart() {
        List<Products> cart = new ArrayList<>();
        cart.add(new Book("Book", 12.49, false, true));
        System.out.println(
                "\n price:        " + cart.get(0).getPrice() +
                        "\n isExempt: " + cart.get(0).isTaxExempt() +
                        "\n isImport:   " + cart.get(0).isImported() +
                        "\n Tax calculation is done in TaxCalculator.java");
        assertEquals(12.49, cart.get(0).getPrice());
        assertFalse(cart.get(0).isImported());
        assertTrue(cart.get(0).isTaxExempt());
    }

    @org.junit.jupiter.api.Test
    void runTaxCalcOnSingleItemRETURNTaxOnImport() {
        List<Products> cart = new ArrayList<>();
        cart.add(new Book("Book", 12.49, true, true));

        TaxCalculator taxCalc = new TaxCalculator();
        DecimalFormat twoDigits = new DecimalFormat("#0.00");
        String roundedTax = twoDigits.format(taxCalc.calculateTax(cart));
        System.out.println(
                "Price: " + cart.get(0).getPrice() +
                        "\nTax  : " + roundedTax);

        assertEquals(0.60, taxCalc.calculateTax(cart));

    }

    @org.junit.jupiter.api.Test
    void multipleItemsInListRETURNSubtotalPrice() {
        List<Products> cart = new ArrayList<>();
        cart.add(new Book("Book", 12.49, false, true));

        TaxCalculator taxCalc = new TaxCalculator();
        DecimalFormat twoDigits = new DecimalFormat("#0.00");
        String roundedTax = twoDigits.format(taxCalc.calculateTax(cart));
        double subTotal = 0;

        for (Products e : cart){
            subTotal += e.getPrice();
        }

        assertEquals(12.49, subTotal);
    }

    @org.junit.jupiter.api.Test
    void multipleItemsInListRETURNSubtotalPriceWithTaxCalc() {
        List<Products> cart = new ArrayList<>();
        cart.add(new Book("Book", 12.49, false, true));
        cart.add(new MusicCD("MusicCD", 14.99, false, false));


//        assertEquals();
    }



    @org.junit.jupiter.api.Test
    void TaxProcessOnImportTrueExemptFalse() {
        ReceiptCalculator receiptCalc = new ReceiptCalculator();
        List<Products> cart = new ArrayList<>();
        cart.add(new BottleOfPerfume("Eau de stinc.", 27.99, true, false));

        assertEquals("4.20", receiptCalc.processReceipt(cart));
    }

    @org.junit.jupiter.api.Test
    void fullTestOnInputThree() {
        List<Products> cart = new ArrayList<>();
        cart.add(new BottleOfPerfume("Perfume Import", 27.99, true, false));
        cart.add(new BottleOfPerfume("Perfume", 18.99, false, false));
        cart.add(new HeadachePills("Headache Pills", 9.75, false, true));
        cart.add(new BoxOChocos("ChocoBox Import.", 11.25, true, true));

        TaxCalculator taxCalc = new TaxCalculator();
        DecimalFormat twoDigits = new DecimalFormat("#0.00");

        double subTotal = 0;

        for (Products e : cart){
            subTotal += e.getPrice();
        }

        assertEquals("67.98", twoDigits.format(subTotal));
        assertEquals("6.70", twoDigits.format(taxCalc.calculateTax(cart)));
        assertEquals("74.68", twoDigits.format(subTotal + taxCalc.calculateTax(cart)));
    }




}