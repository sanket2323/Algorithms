package Generic;

import LangPackage.ObjectClass;

class Data <T>{   //this is for the single date
    private T obj;

    public void setObj(T v){   //this method is taking template type value v
        obj=v;
    }

    public T getObj(){
        return obj;
    }

}

//generic for the array

class Myarray<P>{
    P marr[]= (P[]) new Object[10];  //we cant create the object of the Generic class so we make it of Object Class

    int lenght=0;
    //create the append and display method

    void append(P v){
        marr[lenght]=v;
        lenght++;
    }

    void display(){
        for (int i = 0; i < marr.length; i++) {
            System.out.println(marr[i]);
        }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Data<String> d=new Data<>();
        d.setObj("blanket");

        System.out.println(d.getObj());


    }
}
