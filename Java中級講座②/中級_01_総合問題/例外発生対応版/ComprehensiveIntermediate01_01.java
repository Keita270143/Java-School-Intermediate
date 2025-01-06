import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("整数を入力してください ->");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("even");
            } else if (num % 2 == 1) {
                System.out.println("odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("整数以外が入力されました");
        }
        sc.close();
    }

}
