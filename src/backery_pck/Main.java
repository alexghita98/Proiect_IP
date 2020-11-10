package backery_pck;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        ArrayList<Product> products = new ArrayList<Product>();

        persons.add(new Employee("Brutar", 56, 2000, 12344, 50));
        persons.add(new Employee("Ingrijitor", 32, 1000, 22233, 50));
        persons.add(new Employee("Vanzatoare", 22, 1200, 999110, 40 ));
        persons.add(new Employee("Contabil", 22, 5200, 999120, 60 ));

        persons.add(new Customer("Costica Ion", 222113, 1500, 25));
        persons.add(new Customer("Marian Ion", 272113, 1700, 60));

        products.add(new Pretzel(25, 25));
        products.add(new Strudel(200, 30));
        products.add(new Bread(2,50));
        products.add(new Loaf(200, 200));

        Bakery my_bakery = new Bakery("MyLittlePony", products,persons);
        my_bakery.printPersons();
        my_bakery.printProducts();
    }
}
