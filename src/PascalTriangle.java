public class PascalTriangle {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {

        int modulo = n % 2;
        for (int row = 1; row <=  n; row++) {

            int i = 0;
            for (int col = 1; col < 2 * n; col++) {
                if ((row + col) % 2 == modulo) {
                    System.out.print(" ");
                }
                else {
                    if ((col < n - row) || (col > n + row)) {
                        System.out.print(" ");
                    }
                    else {
                        if (col >= n - row + 1 || col < n + row - 1) {
                            int temp = pascalValue(row - 1, i);
                            System.out.print(temp);
                            i++;
                        }
                        else {
                            System.out.print(" ");
                        }
                    }

                }
            }
            System.out.println();
        }

    }
    private static int pascalValue(int row, int col) {
        int temp = factorial(row) / (factorial(col) * (factorial(row - col)));
        return temp;
    }

    private static int factorial(int n) {
        if (n <= 1) return  1;
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
}
