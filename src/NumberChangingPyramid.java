public class NumberChangingPyramid {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {

        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((k++) + " ");

            }
            System.out.println();
        }

    }
}
