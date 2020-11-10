package backery_pck;

public class Customer implements Person{
    int age_;
    int phoneNumber_;
    int salary_;

    public void setAge_(int age_) {
        this.age_ = age_;
    }

    public void setPhoneNumber_(int phoneNumber_) {
        this.phoneNumber_ = phoneNumber_;
    }

    public void setSalary_(int salary_) {
        this.salary_ = salary_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    String name_;

    Customer(String name,int phonen,int salary,int age)
    {
        this.name_=name;
        this.age_=age;
        this.salary_=salary;
        this.phoneNumber_=phonen;
    }

    @Override
    public void information() {
        System.out.println(this.name_+" are "+this.age_+" ani si ia pe luna "+this.salary_+" avand numarul de telefon "+this.phoneNumber_);
    }

    @Override
    public int getSalary() {
        return this.salary_;
    }

    @Override
    public int getAge() {
        return this.age_;
    }

    @Override
    public int getPhoneNumber() {
        return this.phoneNumber_;
    }
}
