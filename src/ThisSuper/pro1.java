package ThisSuper;

class Parent{
    String str ="Parent variable";
}

class Child extends Parent{

    String str = "Child variable";
    public void method(){
        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);
    }
}
public class pro1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method();
    }
}
