import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.print("begin と入力してください>");
        Scanner sc = new Scanner(System.in, "SHIFT_JIS");
        String str = sc.nextLine();

        while (!(str.equals("begin"))) {
            System.out.print("begin と入力してください>");
            str = sc.nextLine();
        }

        int i = 1;
        while (i <= 31) {
            Random ran = new Random();
            int num1 = ran.nextInt(7) + 1;
            int num2 = ran.nextInt(7) + 1;
            int num3 = ran.nextInt(7) + 1;

            System.out.println(i + "回目:" + num1 + num2 + num3);

            if (num1 == num2 && num2 == num3) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                break;
            } else {
                if (i >= 30) {
                    System.out.println("残念でした。終わります。");
                    break;
                }
                i++;
                continue;
            }
        }
        sc.close();
    }
}
