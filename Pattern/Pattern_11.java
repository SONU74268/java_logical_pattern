class Pattern_11 {
    public static void main(String[] args) {
        // System.out.println("jeljl");
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            int sum = 2;
            for (int j = 1; j <= 2 * i - 1; j++) {

                if ((i + j) % j == i) {
                    System.out.print(j - sum);
                    sum += 2;
                } else
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}
