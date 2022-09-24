public class EvenSum {
    public static void main(String[] args) {
        int i = 1;
        int evensum = 0;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evensum = evensum + i;
                System.out.println(evensum + "and" + i);
            }
        }
        System.out.println(evensum);

    }
}
