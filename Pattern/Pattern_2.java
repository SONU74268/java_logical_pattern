public class Pattern_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                if (((j % 3 != 0) && i == 0) || ((j % 3 == 0) && i == 1) || (i - j == 2) || ((i + j) == 8)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}