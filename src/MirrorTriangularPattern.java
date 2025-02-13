public class MirrorTriangularPattern {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {


        int i;
        for (int row = 1; row < 2*n; row++) {

            if (row > n) {
                i = 2*n - row;
            } else {
                i = row;
            }
            for (int col = 1; col < 2 * n; col++) {
                if ((row + col) % 2 == 1) {
                    System.out.print(" ");
                }
                else {
                    if (row <= n) {
                        if ((row > col) || (row + col - 2) > 2 * (n - 1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print(i++);
                        }
                    } else {
                        if ((row + col - 2) < 2*(n-1) || i > n) {
                            System.out.print(" ");
                        } else {
                            System.out.print(i++);
                        }
                    }
                }

            }
            System.out.println();
        }

    }
}
