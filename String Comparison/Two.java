import java.util.*;
class One{
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        String a1 = "apple";
        String a2 = "apple";

        System.out.println(f1 == f2); //FALSE --- Because it will not check the reference only the value , if we use new keyword it will check the reference
        System.out.println(f1.equals(f2)); //TRUE --- Because we are using inbuild function() - equals
        System.out.println(a1==a2); //TRUE --- Because it will check the reference
    }
}