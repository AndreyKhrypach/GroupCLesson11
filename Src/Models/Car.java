package Models;

public class Car {
    private String name;
    private int model;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public static void pathKm(int km){
        System.out.println("Inside parent class km=" + km);
    }
}
