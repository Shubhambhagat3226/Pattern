public class ZeroOneTriangle {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( ((i + j) % 2 == 0) ? "1 ": "0 ");

            }
            System.out.println();
        }

    }
}
