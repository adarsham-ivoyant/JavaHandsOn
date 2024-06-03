package ExceptionHandling;

class Mytemp extends Exception{
    public Mytemp(String message) {
        super(message);
    }
}
public class Demo5 {

    static int area(int l,int b) throws Mytemp {
        if(l<0 || b < 0)
            throw new Mytemp("err");
        return l+b;
    }
    static void meth1() throws Exception{
        System.out.println("Area is :"+area(10,-10));
    }
    public static void main(String[] args) throws Exception {
        try{
            meth1();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

