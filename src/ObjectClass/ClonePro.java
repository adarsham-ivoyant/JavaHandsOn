package ObjectClass;

public class ClonePro implements Cloneable{
    int i=10;
    int j=20;
    public static void main(String[] args) throws CloneNotSupportedException{
        ClonePro obj = new ClonePro();
        ClonePro dup = (ClonePro) obj.clone();
        dup.i=888;
        dup.j=999;
        System.out.println(dup.i+"_____"+ dup.i);
        System.out.println(obj.i+"________"+ obj.j);
    }
}
