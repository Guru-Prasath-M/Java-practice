import java.util.*;
class One{
    public static void main(String[] args) {
        String f1 = new String("apple");
        String f2 = new String("apple");

        System.out.println(f1 == f2); //FALSE --- Because it will check the reference not the value
    }
}