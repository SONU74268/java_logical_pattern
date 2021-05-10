public class Pattern_10 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(count++);
                } else if (j == 2) {
                    System.out.print(count + 3);
                } else if (j == 3) {
                    System.out.print(count + 6);
                } else
                    System.out.print(count + 8);
            }
            System.out.println();
        }
    }
}
