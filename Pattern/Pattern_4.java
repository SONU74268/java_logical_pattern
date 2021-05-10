public class Pattern_4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if ((i == 3) || (j == 3) || (i == 0 && (j != 1) && (j != 2)) || (i == 6 && (j != 4) && (j != 5))
                        || (j == 0 && ((i == 1) || (i == 2))) || (j == 6 && ((i == 4) || (i == 5)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
