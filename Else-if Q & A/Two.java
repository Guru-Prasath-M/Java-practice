import java.util.*;
class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();

        int total_marks = mark1 + mark2 + mark3 + mark4 + mark5;
        System.out.println("Total mark :" + total_marks);
        int avg = total_marks / 5;

        if(avg < 35){
            System.out.println("Additional class is required");
        }else{
            System.out.println("You are good to go");
        }

    }
}