import java.util.Scanner;

public class Msg {
    public static void main(String [] args)
    {
        System.out.println("enter time");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       if  ( t < 12)
           System.out.println("good morning");
       else if (t >=12)
           System.out.println("gud afternoon");
       else if (t>=16)
           System.out.println("gud evening");
       else if (t>20)
           System.out.println("gud night");

       }
    }


