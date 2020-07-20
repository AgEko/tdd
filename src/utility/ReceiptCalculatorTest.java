package utility;

import product.BottleOfPerfume;
import product.Products;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptCalculatorTest {

    @org.junit.jupiter.api.Test
    void processReceipt() {
        ReceiptCalculator receiptCalc = new ReceiptCalculator();
        List<Products> inputThree = new ArrayList<>();
        inputThree.add(new BottleOfPerfume("Eau de stinc.", 27.99, true, false));

        assertEquals("4.20", receiptCalc.processReceipt(inputThree));
    }


}