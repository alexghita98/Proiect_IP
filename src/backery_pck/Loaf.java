package backery_pck;

public class Loaf implements Product{
    private int loafPrice;
    private int loafQuantity;

    public Loaf(int loafPrice, int loafQuantity) {
        this.loafPrice = loafPrice;
        this.loafQuantity = loafQuantity;
    }

    @Override
    public void nutrition() {
        System.out.println("Franzela delicioasa si gustoasa cu pretul" + loafPrice + " si cantitatea "+loafQuantity+"!\n");
    }

    @Override
    public int getPrice() {
        return loafPrice;
    }

    @Override
    public int getQuantity() {
        return loafQuantity;
    }
}
