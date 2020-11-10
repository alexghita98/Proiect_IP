package backery_pck;

public class Pretzel implements Product {
    private int pretzelPrice;
    private int pretzelQuantity;

    public Pretzel(int pretzelPrice, int pretzelQuantity) {
        this.pretzelPrice = pretzelPrice;
        this.pretzelQuantity = pretzelQuantity;
    }

    @Override
    public void nutrition() {
        System.out.println("Strudel delicioas si gustoas cu pretul" + this.pretzelPrice + " si cantitatea "+this.pretzelQuantity+"!\n");
    }

    @Override
    public int getPrice() {
        return this.pretzelPrice;
    }

    @Override
    public int getQuantity() {
        return this.pretzelQuantity;
    }
}
