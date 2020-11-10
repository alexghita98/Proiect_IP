package backery_pck;

public class Strudel implements Product{
    private int strudelPrice;
    private int strudelQuantity;

    public Strudel(int strudelPrice, int strudelQuantity) {
        this.strudelPrice = strudelPrice;
        this.strudelQuantity = strudelQuantity;
    }

    @Override
    public void nutrition() {
        System.out.println("Strudel delicios si gustos cu pretul " + this.strudelPrice + " si cantitatea "+this.strudelQuantity+"!\n");
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
