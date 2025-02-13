public class RhombusPattern {
    public static void main(String[] args) {
        pattern(7);
    }

    public static void pattern(int n) {

        n--;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n*(n+1); j++) {
                if (j < i || (i == 0 && j > n*n)) {
                    System.out.print(" ");
                }
                else if ((j-i) % n == 0 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
