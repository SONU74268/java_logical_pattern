public class Pattern_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("A");
                }
            }
            System.out.println();
        }
    }
}
