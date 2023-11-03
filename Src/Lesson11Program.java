import Models.*;

public class Lesson11Program {

    public static void main(String[] args) {

        Car vehicle = new Vehicle();
        vehicle.pathKm(10);
        Vehicle v2 = new Vehicle();
        v2.pathKm(20);

//        Human tom = new Human();
//        Human bob = new Human();
//
//        tom.displayId();    // Id = 1
//        bob.displayId();    // Id = 2
//        System.out.println(Human.counter); // 3
//
//        // змінюємо Person.counter
//        Human.counter = 8;
//
//        Human sam = new Human();
//        sam.displayId();    // Id = 8
//        System.out.println(Human.counter);

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Client){
//
//            Client clientKate = (Client) kate;
//            clientKate.display();
//        }
//        else{
//
//            System.out.println("Conversion is invalid");
//        }

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Employee emp = (Employee) kate;
//        emp.display();
//
//        // або таке
//       ((Employee)kate).display();

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        // приведення від батьківського класу Object до типу Person
//        ((Person)kate).display();
//
//        Object sam = new Employee("Sam", "Oracle");
//        // приведення від батьківського класу Object до типу Employee
//        ((Employee)sam).display();

//        Object sam = new Employee("Sam", "Oracle");
//
//        // приведення від батьківського класу Object до типу Employee
//        Employee emp = (Employee)sam;
//        emp.display();
//        System.out.println(emp.getCompany());

//        Object tom = new Person("Tom");
//        Object sam = new Employee("Sam", "Oracle");
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        Person alice = new Employee("Alice", "Google");
//
//        System.out.println(kate);
//        System.out.println(bob);

//        Person tom = new Person("Tom");
//        tom.display();
//        Person sam = new Employee("Sam", "Oracle");
//        sam.display();
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        bob.display();

//        Employee sam = new Employee("Sam", "Microsoft");
////        sam.display();  // Sam
////        sam.work();     // Sam works in Microsoft
//        System.out.println(sam);

//        Animal animal = new Animal("Crocodile");
//        System.out.println(animal.getName());
//
//        Tiger tiger = new Tiger("Tiger");
//        System.out.println(tiger.getName());

//        Car car = new Car();
       // System.out.println(car.name);
       // System.out.println(car.getName());

//        car.setName("BMW");
//        System.out.println(car.getName());
    }
}
