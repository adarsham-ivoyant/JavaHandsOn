package ExceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo8 {

    static void Divide() throws Exception
    {


        try(FileInputStream fi=new FileInputStream("/Users/HP/Desktop/JumpBox.txt"); Scanner sc=new Scanner(fi) )
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }

    }

    public static void main(String[] args) {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //int x=sc.nextInt();

        // System.out.println(x);
    }
}
