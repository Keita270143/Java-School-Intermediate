import java.util.Scanner;

public class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください ->");
        int num1 = sc.nextInt();
        System.out.print("2つ目の整数を入力してください ->");
        int num2 = sc.nextInt();
        System.out.print("3つ目の整数を入力してください ->");
        int num3 = sc.nextInt();

        if (num1 <= num2) {
            if (num2 <= num3) {
                System.out.println("OK");
            }
        } else {
            System.out.println("NG");
        }
        sc.close();
    }

}