//Get Input for 3 variables: Name, Score, Department. Let the user enter the score for 100 marks, you convert it for 10 and print it?

import java.util.*;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        double score = sc.nextDouble();
        sc.nextLine();
        String Department = sc.nextLine();

        System.out.println("My Name is "+ Name);
        System.out.println("My score is "+ score / 10 + "/10");
        System.out.println("My Department is "+ Department);
    }
}