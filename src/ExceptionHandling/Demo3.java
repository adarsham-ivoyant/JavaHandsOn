package ExceptionHandling;


class Temp extends Exception{
    public String toString(){
        return "Balance should not be less than 5000";
    }
}


public class Demo3 {

    static void func1(){
      try{
          throw new Temp();
      }catch (Temp e){
          System.out.println(e);
      }
    }
    static void func2(){
        func1();
    }
    static void func3(){
        func2();
    }
    public static void main(String[] args) {
        func3();
    }
}
