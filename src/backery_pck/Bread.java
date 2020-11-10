package backery_pck;

public class Bread implements Product {

    private int breadPrice;
    private int breadQuantity;

    public Bread(int breadPrice, int breadQuantity) {
        this.breadPrice = breadPrice;
        this.breadQuantity = breadQuantity;
    }

    @Override
    public void nutrition() {
        System.out.println("Paine delicioasa si gustoasa cu pretul" + breadPrice + " si cantitatea "+breadQuantity+"!\n");
    }

    @Override
    public int getPrice() {
        return breadPrice;
    }

    @Override
    public int getQuantity() {
        return breadQuantity;
    }
}
