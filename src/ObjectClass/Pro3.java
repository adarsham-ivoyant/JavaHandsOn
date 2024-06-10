package ObjectClass;

//getCLass()
class Car {
    String model;
    int year;


    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString(){
        return model+" "+year;
    }
}
public class Pro3 {
    public static void main(String[] args) {
        Car car = new Car("Toyota",200);
        System.out.println(car.getClass());



    }
}
