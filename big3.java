import java.util.Scanner;
public class big3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st no: ");
    int no1 = sc.nextInt();
    System.out.println("enter 2nd no:");
    int no2 = sc.nextInt();
    System.out.println("Enter 3rd no:");
    int no3 = sc.nextInt();
    
    int big;
    if (no1 >= no2 && no1 >= no3) {
        big = no1;
    } else if (no2 >= no1 && no2 >= no3) {
        big = no2;
    } else {
        big = no3;
    }
    System.out.println("THE BIGGEST :"+ big);

    sc.close();
}
}
