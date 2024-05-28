package ExceptionHandling;

public class Demo4 {

    static int meth1(){
        return 2/0;
    }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    public static void main(String[] args) {
        try {
            meth3();
        }catch (Exception e){
            System.out.println("error handled here: "+e);
        }
    }
}
