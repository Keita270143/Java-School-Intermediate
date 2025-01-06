import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");
        System.out.print("0:グー 1:チョキ 2:パー >数字を入力してください");
        Scanner sc = new Scanner(System.in);
        int you = sc.nextInt();
        String Youte;

        while (you > 3 || you < 0) {
            System.out.println("ジャンケン");
            System.out.print("0:グー 1:チョキ 2:パー >数字を入力してください");
            you = sc.nextInt();
        }

        Random ran = new Random();
        int cpu = ran.nextInt(3);
        String Cpute;

        if (you == 0) {
            Youte = "グー";
            if (cpu == 0) {
                Cpute = "グー";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あいこです");
            } else if (cpu == 1) {
                Cpute = "チョキ";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あなたの勝ちです");
            } else if (cpu == 2) {
                Cpute = "パー";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あなたの負けです");
            }
        }

        if (you == 1) {
            Youte = "チョキ";
            if (cpu == 0) {
                Cpute = "グー";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あなたの負けです");
            } else if (cpu == 1) {
                Cpute = "チョキ";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あいこです");
            } else if (cpu == 2) {
                Cpute = "パー";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あなたの勝ちです");
            }
        }

        if (you == 2) {
            Youte = "パー";
            if (cpu == 0) {
                Cpute = "グー";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あなたの勝ちです");
            } else if (cpu == 1) {
                Cpute = "チョキ";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あなたの負けです");
            } else if (cpu == 2) {
                Cpute = "パー";
                System.out.println("あなたは" + Youte + "で相手は" + Cpute + "なので、あいこです");
            }
        }
        sc.close();
    }
}
