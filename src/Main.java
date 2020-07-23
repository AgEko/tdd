import product.*;
import utility.ReceiptCalculator;
import utility._TEST_ReceiptCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        _TEST_ReceiptCalculator test = new _TEST_ReceiptCalculator();
        ReceiptCalculator receiptCalc = new ReceiptCalculator();

        List<Products> inputOne = new ArrayList<>();
        inputOne.add(new Book("Book", 12.49, false, true));
        inputOne.add(new MusicCD("MusicCD", 14.99, false, false));
        inputOne.add(new ChocoBar("ChocolateBar", 0.85, false, true));

        List<Products> inputTwo = new ArrayList<>();
        inputTwo.add(new BoxOChocos("Box Of Chocolates", 10.00, true, true));
        inputTwo.add(new BottleOfPerfume("Perfume", 47.50,true, false       ));

        List<Products> inputThree = new ArrayList<>();
        inputThree.add(new BottleOfPerfume("Perfume Import", 27.99, true, false));
        inputThree.add(new BottleOfPerfume("Perfume", 18.99, false, false));
        inputThree.add(new HeadachePills("Headache Pills", 9.75, false, true));
        inputThree.add(new BoxOChocos("ChocoBox Import.", 11.25, true, true));


        receiptCalc.processReceipt(inputOne);
        System.out.println("");
        receiptCalc.processReceipt(inputTwo);
        System.out.println("");
        receiptCalc.processReceipt(inputThree);


    }
}


