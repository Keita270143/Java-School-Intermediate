import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("係数aの値を入力してください ->");
            int a = sc.nextInt();
            System.out.print("係数bの値を入力してください ->");
            int b = sc.nextInt();
            System.out.print("係数cの値を入力してください ->");
            int c = sc.nextInt();

            int D = b * b - 4 * a * c;

            if (D > 0) {
                System.out.println("異なる2つの実数解を持つ");
            } else if (D == 0) {
                System.out.println("実数の重解を持つ");
            } else if (D < 0) {
                System.out.println("異なる2つの虚数解をもつ");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数以外が入力されました");
        }
        sc.close();
    }

}