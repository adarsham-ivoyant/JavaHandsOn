package ExceptionHandling;

public class Demo7 {

    static void meth1() throws Exception{
        try{
            throw new Exception("err");
        }
        catch (Exception e){
            System.out.println(e+"temp");
        }
        finally {
            System.out.println("final message");
        }
    }
    public static void main(String[] args) throws Exception {
        meth1();
    }
}
