package backery_pck;

import java.util.ArrayList;

public class Bakery {
    private String bakeryName_;
    private ArrayList<Product> products_;
    private ArrayList<Person> persons_;

    public Bakery(String bakeryName_, ArrayList<Product> products_, ArrayList<Person> persons_) {
        this.bakeryName_ = bakeryName_;
        this.products_ = products_;
        this.persons_ = persons_;
    }

    public void setBakeryName_(String bakeryName_) {
        this.bakeryName_ = bakeryName_;
    }

    public void setProducts_(ArrayList<Product> products_) {
        this.products_ = products_;
    }

    public void setPersons_(ArrayList<Person> persons_) {
        this.persons_ = persons_;
    }

    public String getBakeryName_() {
        return bakeryName_;
    }

    public ArrayList<Product> getProducts_() {
        return products_;
    }

    public ArrayList<Person> getPersons_() {
        return persons_;
    }

    public void addPerson(Person p)
    {
        this.persons_.add(p);
    }

    public void addProduct(Product p)
    {
        this.products_.add(p);
    }

    


}
