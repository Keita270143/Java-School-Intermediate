import java.util.Random;

public class Practice11_03 {
    public static void main(String[] args) {
        int i = 1;

        while (i < 11) {
            int num = new Random().nextInt(6) + 1;

            if (num % 2 == 1) {
                System.out.println(i + "回目、" + num + "が出ました");
            }
            i++;
        }
    }
}
