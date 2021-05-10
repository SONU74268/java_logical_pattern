public class Pattern_8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i == 4 || j == 4 || (i != 0 && (j == 3 || j == 5)) || (i == 3 && (j != 0 && j != 8))
                        || (i == 2 && ((j != 0 && j != 8) && (j != 1 && j != 7)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
