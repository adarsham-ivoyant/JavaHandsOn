package ObjectClass;

import java.util.Objects;

//equals()
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the equals() method to compare name and age
    @Override
    public boolean equals(Object obj){
        System.out.println("bool method");
        System.out.println(this.name);
        System.out.println(obj);
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;// Cast obj to Person
        return age== person.age && name.equals(person.name);//compare name and age

    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}

class EqualsPro{
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alic21", 10);
        Person person3 = new Person("Bob", 25);
        // Test equality between person1 and person2
        System.out.println("person1 equals person2: " + person1.equals(person2)); // Should print true

        // Test equality between person1 and person3
        System.out.println("person1 equals person3: " + person1.equals(person3)); // Should print false

        // Test equality between person2 and person3
        System.out.println("person2 equals person3: " + person2.equals(person3)); // Should print false

        // Print out the objects
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);

    }
}
