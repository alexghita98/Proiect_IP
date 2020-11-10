package backery_pck;

public class Employee implements Person {

    private String tipPerson;
    private int employeeAge;
    private int employeeSalary;
    private int employeePhoneNumber;
    @Override
    public void information() {
        System.out.println(tipPerson+" are varsta "+employeeAge+ ", salariu de "+employeeSalary+ " numarul de telefon "+employeePhoneNumber +" !\n");
    }

    @Override
    public int getSalary() {
        return employeeSalary;
    }

    @Override
    public int getAge() {
        return employeeAge;
    }

    @Override
    public int getPhoneNumber() {
        return employeePhoneNumber;
    }
}
