import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0)
            System.out.println("zero is neither even or odd");
        else if (n % 2 == 0) {
            System.out.println("no.is even");
        } else
            System.out.println("no. is odd");
    }

}
