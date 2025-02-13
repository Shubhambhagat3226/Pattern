public class HallowHourglassPattern {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {

        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                if ((row + col) % 2 == 1) {
                    System.out.print(" ");
                } else {
                    if (row == 1 || (row == 2 * n - 1) || row == col
                            || ((row + col - 2) == 2*(n - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
