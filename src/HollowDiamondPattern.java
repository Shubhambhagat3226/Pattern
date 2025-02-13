public class HollowDiamondPattern {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {


        int modulo = n % 2;
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                if ((row + col) % 2 == modulo) {
                    System.out.print(" ");
                }
                else {
                    if (row < n) {
                        if ((col == n - row + 1) || (col == n + row - 1)) {
                            System.out.print("*");

                        } else System.out.print(" ");

                    } else {
                        if ((row == n + col - 1) || (row + col - 1) == 3*(n-1) + 1) {
                            System.out.print("*");

                        } else System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
