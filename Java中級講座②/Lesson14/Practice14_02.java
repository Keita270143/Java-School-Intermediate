import java.util.Random;

public class Practice14_02 {
    public static void Ran(int num) {
        Random rand = new Random();
        int num1 = rand.nextInt(2);
        if (num1 == 0) {
            int num2 = 1 / num1;
            System.out.println(num2);
        } else if (num1 == 1) {
            String str = null;
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {

        try {
            int num4 = 1;
            Ran(num4);
        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
    }
}
