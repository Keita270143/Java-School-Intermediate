import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("人数を入力してください ->");
            int human = sc.nextInt();
            int sum;
            if (human < 5) {
                sum = human * 600;
                System.out.println(human + "人の入場料金の合計は" + sum + "です。");
            } else if (human >= 5 && human < 20) {
                sum = human * 550;
                System.out.println(human + "人の入場料金の合計は" + sum + "です。");
            } else if (human >= 20) {
                sum = human * 500;
                System.out.println(human + "人の入場料金の合計は" + sum + "です。");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数以外が入力されました");
        }
        sc.close();
    }

}
