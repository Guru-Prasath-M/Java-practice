import java.util.*;

class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();

        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Get Ready");
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }
    }
}
