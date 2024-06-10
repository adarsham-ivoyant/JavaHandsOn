package ObjectClass;

class Address{
    String city;
    Address(String city){
        this.city = city;
    }
    @Override
    public String toString(){
        return city;
    }
}

class Person1 implements Cloneable{
    String name;
    Address address;

    Person1(String name,Address address){
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();//performs shallow copy
    }

    @Override
    public String toString(){
        return name+" "+address;
    }
}
public class ShallowClone {

    public static void main(String[] args) {
        try{


        // Create an original person object
        Address address = new Address("New York");
        Person1 person1 = new Person1("John", address);

        // Clone the person object
        Person1 person2 = (Person1) person1.clone();

        // Print both person objects
        System.out.println("Original: " + person1); // John lives in New York
        System.out.println("Clone: " + person2);    // John lives in New York

        // Modify the address of the cloned person
        person2.address.city="Los Angeles";

        // Print both person objects again to see the effect of shallow cloning
        System.out.println("After modification:");
        System.out.println("Original: " + person1); // John lives in Los Angeles
        System.out.println("Clone: " + person2);    // John lives in Los Angeles
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
