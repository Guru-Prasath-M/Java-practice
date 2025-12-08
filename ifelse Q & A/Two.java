import java.util.*;
class Two{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income > 7000){
            System.out.println("Scholarship ship is available");
        }else{
            System.out.println("Not Eligible for scholarship");
        }
    }
}