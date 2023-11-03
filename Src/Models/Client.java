package Models;

public class Client extends Person{
    private String bank;
    private int deposit;

    public Client(String name, String bank, int deposit) {
        super(name);
        this.bank = bank;
        this.deposit = deposit;
    }

    public void display(){

        System.out.println("Name: " + name + " has account in " + bank + " has deposit = " + deposit);
    }

    @Override
    public String toString() {
        return "Client{" +
                "bank='" + bank + '\'' +
                ", deposit=" + deposit +
                ", name='" + name + '\'' +
                '}';
    }
}
