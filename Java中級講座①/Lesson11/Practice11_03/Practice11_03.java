import java.util.Random;

public class Practice11_03 {
    public static void main(String[] args) {
        int i = 1;

        while (i < 11) {
            int num = new Random().nextInt(7) + 1;
            if (num == 1 || num == 3 || num == 5) {
                System.out.println(i + "回目、" + num + "が出ました");
                i++;
            } else {
                continue;
            }
        }
    }
}
