package LangPackage;
import java.lang.*;
//every class in java is indirectly or directly are inhertied from the object class
public class ObjectClass {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;

        //if we want to print any object it will call tostring method by default

        //it will check if two object refference is same or not
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));

        //printing the hash code

        System.out.println(o1.hashCode());


    }
}
