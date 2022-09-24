import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature");
        a = sc.nextInt();
      /*  result rs = new result();
        rs.passorfail(a);
*/
        Temp temp = new Temp();
        temp.temperature(a);
    }
}
