public class NumberTriangular {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }

    }
}
