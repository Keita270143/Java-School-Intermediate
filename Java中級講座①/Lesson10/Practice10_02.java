import java.util.Random;

public class Practice10_02 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);

        System.err.println(
                switch (age) {
                    case 0, 1, 2, 3 -> "あなたはbabyです";
                    case 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 -> "あなたはkidです";
                    case 18, 19, 20 -> "あなたはadultです";
                    default -> "";
                });
    }
}
