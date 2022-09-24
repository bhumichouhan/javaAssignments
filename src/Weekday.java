import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        System.out.println("enter number between 1 to 7");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1)
            System.out.println("sunday");
        else if (n == 2)
            System.out.println("monday");
        else if (n == 3)
            System.out.println("Tuesday");
        else if (n == 4)
            System.out.println("Wednesday");
        else if (n == 5)
            System.out.println("Thursday");
        else if (n == 6)
            System.out.println("Friday");
        else if (n == 7)
            System.out.println("Saturday");
        else
            System.out.println("number you entered is not in range");


    }

}


