import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("係数aの値を入力してください ->");
        int a = sc.nextInt();
        System.out.print("係数bの値を入力してください ->");
        int b = sc.nextInt();
        System.out.print("係数cの値を入力してください ->");
        int c = sc.nextInt();

        if (b * b - 4 * a * c > 0) {
            System.out.println("異なる2つの実数解を持つ");
        } else if (b * b - 4 * a * c == 0) {
            System.out.println("実数の重解を持つ");
        } else if (b * b - 4 * a * c < 0) {
            System.out.println("異なる2つの虚数解をもつ");
        }
        sc.close();
    }

}