
public class Pattern_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k2 = 5; k2 >= i; k2--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
