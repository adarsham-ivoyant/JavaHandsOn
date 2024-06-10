package ObjectClass;

//toString method
class Student{
    int rollnum;
    String name;

    Student(int rollnum,String name){
        this.rollnum = rollnum;
        this.name = name;
    }
    @Override
    public String toString(){
        return rollnum+" "+name;
    }

}
public class Pro1 {
    public static void main(String[] args) {
        Student s=new Student(1,"adarsh");
        System.out.println(s);
    }

}
