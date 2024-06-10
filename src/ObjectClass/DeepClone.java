package ObjectClass;

class Address1 implements Cloneable{
    String city;

    Address1(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return city;
    }
}

class Person3 implements Cloneable{
    String name;
    Address1 address;

    Person3(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Person3 clonePerson = (Person3) super.clone();
        clonePerson.address = (Address1) address.clone();//perform deep copy
        return clonePerson;
    }
    @Override
    public String toString() {
        return name + " lives in " + address;
    }
}
public class DeepClone {
    public static void main(String[] args) {
        try {
            // Create an original person object
            Address1 address = new Address1("New York");
            Person3 person1 = new Person3("John", address);


            // Clone the person object
            Person3 person2 = (Person3) person1.clone();

            // Print both person objects
            System.out.println("Original: " + person1); // John lives in New York
            System.out.println("Clone: " + person2);    // John lives in New York

            // Modify the address of the cloned person
            person2.address.city = "Los Angeles";

            // Print both person objects again to see the effect of deep cloning
            System.out.println("After modification:");
            System.out.println("Original: " + person1); // John lives in New York
            System.out.println("Clone: " + person2);    // John lives in Los Angeles

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }


}
