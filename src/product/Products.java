package product;

public abstract class Products {
    private String name;
    private double price;

    private boolean isImported;
    private boolean isTaxExempt;


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
    public boolean isTaxExempt() {
        return isTaxExempt;
    }
}

