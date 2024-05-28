package ExceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        int A[] ={10,0,30,40,50};

        try{
            int c=A[0]/A[3];
            System.out.println(c);

            try{
                System.out.println(A[5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("invalid index: "+e);
            }
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be 0: "+e);
        }
        System.out.println("final");
    }
}
