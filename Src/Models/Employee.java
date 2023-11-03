package Models;

public class Employee extends Person{
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company=company;
    }
    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }

    public void display(){

        System.out.println("Name: " + name + " works in " + company);
    }


    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
