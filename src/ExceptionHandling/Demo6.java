package ExceptionHandling;


//create Custom exception
class MyCustomException extends Exception{
    public String toString(){
        return "Dimensions of a Rectangle cannot be Negative";
    }
}
public class Demo6 {

    static int area(int l,int b) throws MyCustomException{
        if(l<0 || b<0)
            throw new MyCustomException();
        return l*b;
    }
    static void meth1() throws MyCustomException{
        System.out.println("Area is "+ area(10,-15));
    }
    public static void main(String[] args) throws MyCustomException {
        try{
            meth1();
        }catch (MyCustomException e){
            System.out.println("handled exception  "+e);
        }
        System.out.println("Hii");
    }
}
