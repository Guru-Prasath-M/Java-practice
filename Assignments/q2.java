//Get input for variables : Name, age, address and print it?

import java.util.*;

class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int Age = sc.nextInt();
        sc.nextLine();
        String Address = sc.nextLine();
        System.out.println("My Name is " + Name);
        System.out.println("My Age is " + Age);
        System.out.println("My Address is " + Address);
    }
}