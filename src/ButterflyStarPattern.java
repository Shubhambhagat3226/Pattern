public class ButterflyStarPattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {

        int row = n * 2;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                if ((i + j) % 2 == 1){
                    System.out.print(" ");
                } else {
                    if (i < n) {
                        if ((j > i) && (j < (2*n - i))) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else {
                        if ((i > j) && ((i + j) >= row+1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }

                    }
                }
            }
            System.out.println();
        }

    }
}
