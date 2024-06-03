package ExceptionHandling;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age=s.nextInt();
        if(age<18){
            throw new RuntimeException("you not eligible for vote");
        }
        else{
            System.out.println("eligible for vote");
        }

    }
}
