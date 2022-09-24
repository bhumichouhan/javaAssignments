import java.util.Scanner;

public class buzznumber {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        a = sc.nextInt();
        if (a % 7 == 0 || a % 10 == 7)
            System.out.println("no.is buzz number");
        else
            System.out.println("no. is not buzz number");
    }
}