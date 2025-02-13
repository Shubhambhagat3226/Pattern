public class HollowTriangularPattern {
    public static void main(String[] args) {
        pattern(5);
    }


    public static void pattern(int n) {

        int mod = n % 2;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < 2 * n; col++) {
               if ((row + col) % 2 == mod) {
                   System.out.print(" ");
               } else if ((col == n - row + 1) || (col == n + row - 1) || (row == n)) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }

    }
}
