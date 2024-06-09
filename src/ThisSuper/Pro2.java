package ThisSuper;

public class Pro2 {
    Pro2(){
        this(10);
        System.out.println("This is default const");
    }
    Pro2(int i ){
        this(20,30);
        System.out.println("This is parametar const:"+i);
    }
    Pro2(int i,int j){
        this(40,50,60);
        System.out.println("This is 2 parameter const:"+i+" "+j);
    }
    Pro2(int i, int j,int k){
        System.out.println("This is 3rd para const: "+i+" "+j+" "+k);
    }

    public static void main(String[] args) {
        Pro2 obj = new Pro2();
    }
}
