import java.util.Scanner;

public class Practice11_04 {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("何段->");
        int inputNum = sc.nextInt();

        while (inputNum > 5) {
            System.out.print("何段->");
            inputNum = sc.nextInt();
        }

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= inputNum; j++) {
                if (inputNum < i + j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
