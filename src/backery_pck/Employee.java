package backery_pck;

public class Employee implements Person {

    private String tipPerson;
    private int employeeAge;
    private int employeeSalary;
    private int employeePhoneNumber;
    private int employeeHours;

    public Employee(String tipPerson, int employeeAge, int employeeSalary, int employeePhoneNumber, int employeeHours) {
        this.tipPerson = tipPerson;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeHours = employeeHours;
    }

    public void setTipPerson(String tipPerson) {
        this.tipPerson = tipPerson;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeePhoneNumber(int employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public void setEmployeeHours(int employeeHours) {
        this.employeeHours = employeeHours;
    }

    @Override
    public void information() {
        System.out.println(tipPerson+" are varsta "+employeeAge+ ", salariu de "+employeeSalary+ " numarul de telefon "+employeePhoneNumber + "si munceste "+ employeeHours+ "pe saptamana!\n");
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

    public int getEmployeeHours() {
        return employeeHours;
    }
}
