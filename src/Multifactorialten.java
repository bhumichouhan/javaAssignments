public class Multifactorialten {
    public static void main(String[] args) {
        int fact = 1;
        int i = 10;
        while (i > 1) {
            System.out.println(fact);
            fact *= i;
            i--;
        }
        System.out.println(fact);
    }
}
