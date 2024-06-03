package ExceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try{
            validateAge(18);
        }catch (IllegalArgumentException e){
            System.out.println("Caught IlliegalArgu: "+e.getMessage());
        }
    }
    public static void validateAge(int age){
        if(age<19){
            throw new IllegalArgumentException("age must be 18 or older to vote");
        }
        System.out.println("age is valid to vote");
    }
}
