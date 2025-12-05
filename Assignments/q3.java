//Get input for 3 integer variables: a,b,c. Now multiple all variables and store it in d.Now add all variables and store it in e.

import java.util.*;

class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a*b*c;
        System.out.println(d); //2000

        int e = a+b+c;
        System.out.println(e); //40

        System.out.println(d / e); //50
    }
}