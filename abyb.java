import java.util.Scanner;

public class abyb {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a = sc.nextInt();
        System.out.println("enter second number");
        b = sc.nextInt();
        if (b==0)
            System.out.println("b cannot be 0");
        else if (a % b == 0)
            System.out.println("a is divisible by b");
        else
            System.out.println("a is  not divisible by b");

    }

}
