package ExceptionHandling;

public class Demo12 {
    public static void division(int dividend, int divisor) throws ArithmeticException{
        System.out.println("The result "+dividend/divisor);
    }
    public static void main(String[] args) {
        division(10,0);
    }
}
