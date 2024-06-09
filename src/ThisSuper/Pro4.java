package ThisSuper;

class Vehicle{
    private String brand;
    private int speed;

    public Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle const called");
    }

    public void display(){
        System.out.println(brand+" "+ speed);
    }
}

class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand,int speed, int numberOfDoors){
        super(brand,speed);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car class called");
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Number of doors"+ numberOfDoors);
    }
}

public class Pro4 {
    public static void main(String[] args) {
        Car obj = new Car("Toyota",125,4);
        obj.display();
    }

}

