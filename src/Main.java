import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int i;
        String s;
        Scanner console=new Scanner(System.in);
        do
        {
            s = console.nextLine();
            i =console.nextInt();
            if (i<0 || i>5)
                System.out.println(s);
            else
                for(int j=0;j<i;j++)
                    System.out.println(s);
            break;
        }
        while (true);//write your code here

    }
}

