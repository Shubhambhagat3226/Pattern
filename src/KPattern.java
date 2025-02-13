public class KPattern {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {

        for (int row = 1; row < 2 * n; row++) {
            for (int col = 0; col < n; col++) {
                if (row < n) {
                    if (col <= n - row) {
                        System.out.print("* ");
                    } else {
                        break;
                    }
                } else {
                    if (row >= col + n) {
                        System.out.print("* ");
                    } else {
                        break;
                    }
                }
            }
            System.out.println();
        }

    }
}
