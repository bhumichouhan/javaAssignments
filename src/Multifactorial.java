public class Multifactorial {
    public static void main(String[] args) {
        int fact = 1;
        int i = 10;
        while (i > 1) {
            fact *= i;
            i--;
        }
        System.out.println(fact);
    }
}
