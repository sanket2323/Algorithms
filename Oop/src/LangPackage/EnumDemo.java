package LangPackage;

enum dept{
    civil,cs,ecs
}

public class EnumDemo {
    public static void main(String[] args) {
        dept d=dept.cs;

        //here we can assign only upper three values to the dept not any other

        //ordinal method is used for giving index for the above four values

        System.out.println(d.ordinal());
    }
}
