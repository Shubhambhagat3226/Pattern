public class PalindromeTrianglar {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            int temp = i + 1;
            for (int j = 0; j < n; j++) {

                if (j < n - i - 1) {
                    System.out.print(" ");

                } else {
                    System.out.print(temp--);
                }
            }

            temp++;
            while (temp <= i) {
                System.out.print(++temp);
            }
            System.out.println();
        }

    }
}
