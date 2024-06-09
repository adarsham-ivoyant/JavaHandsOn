package ThisSuper;

class GrandParent{
    GrandParent(){
        System.out.println("grandParent class");
    }
}

class Parent1 extends GrandParent{
    Parent1(){
        //super();
        System.out.println("Parent Class");
    }
}

class Child1 extends Parent1{
    Child1(){
      //  super();
        System.out.println("Child class");
    }
}
public class Pro3 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
    }
}
