package product;

public abstract class Products {
    private String name;
    private double price;

    private boolean isImported;
    private boolean isTaxExempt;
    private double priceWithTax;

    public Products(String name, double price, boolean isImported, boolean isTaxExempt) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.isTaxExempt = isTaxExempt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        this.isImported = imported;
    }

    public boolean isTaxExempt() {
        return isTaxExempt;
    }

    public void setTaxExempt(boolean taxExempt) {
        this.isTaxExempt = taxExempt;
    }

    public double getPriceWithTax() {
        return priceWithTax;
    }

    public void setPriceWithTax(double priceWithTax) {
        this.priceWithTax = priceWithTax;
    }
}

