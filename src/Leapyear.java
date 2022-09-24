import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        int a, b = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year(e.g. 1986,1967 ");
        a = sc.nextInt();
        if (a % b == 0)
            System.out.println("year is leap year");
         else
            System.out.println("year is not leap year");
    }}
