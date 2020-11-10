package backery_pck;

public class Strudel implements Product{
    private int strudelPrice;
    private int strudelQuantity;

    public Strudel(int breadPrice, int breadQuantity) {
        this.strudelPrice = breadPrice;
        this.strudelQuantity = breadQuantity;
    }

    @Override
    public void nutrition() {
        System.out.println("Strudel delicioas si gustoas cu pretul" + this.strudelPrice + " si cantitatea "+this.strudelQuantity+"!\n");
    }

    @Override
    public int getPrice() {
        return strudelPrice;
    }

    @Override
    public int getQuantity() {
        return strudelQuantity;
    }
}
