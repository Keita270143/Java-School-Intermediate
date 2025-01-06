import java.util.Random;

public class Practice10_04 {
    public static void main(String[] args) {
        int color = new Random().nextInt(6) + 1;

        System.err.println(
                switch (color) {
                    case 1 -> "今日のラッキーカラーは ピンク です";
                    case 2, 3, 4 -> "今日のラッキーカラーは レッド です";
                    case 5 -> "今日のラッキーカラーは ゴールド です";
                    default -> "";
                });
    }
}
