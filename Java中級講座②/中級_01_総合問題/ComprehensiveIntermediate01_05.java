public class ComprehensiveIntermediate01_05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = i * j;
                if (num < 10) {
                    System.out.print(num + " |");
                } else {
                    System.out.print(num + "|");
                }
            }
            System.out.println();
            System.out.println("ーーーーーーーーーーーーーー");
        }
    }
}
