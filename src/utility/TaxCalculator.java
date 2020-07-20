package utility;

import org.jetbrains.annotations.NotNull;
import product.Products;

import java.util.List;

public class TaxCalculator {

    public Double calculateTax(@NotNull List<Products> cart){
        double taxTotal = 0;

        for (Products item : cart){
            double taxRate = 0.10;
            if(item.isTaxExempt()){
                taxRate = 0.0;
            }
            if(item.isImported()){
                taxRate += 0.05;
            }
            taxTotal += (item.getPrice() * taxRate);
        }

        return Math.round(taxTotal * 20.0) / 20.0;
    }

}
