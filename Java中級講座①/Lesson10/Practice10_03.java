import java.util.Random;

public class Practice10_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        switch (age) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (gender == 0) {
                    System.out.println("あなたはbabyな男です");
                } else if (gender == 1) {
                    System.out.println("あなたはbabyな女です");
                }
                break;
            case 4:
            case 5:
                if (gender == 0) {
                    System.out.println("あなたはchildな男です");
                } else if (gender == 1) {
                    System.out.println("あなたはchildな女です");
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                if (gender == 0) {
                    System.out.println("あなたはkidな男です");
                } else if (gender == 1) {
                    System.out.println("あなたはkidな女です");
                }
                break;
            case 18:
            case 19:
            case 20:
                if (gender == 0) {
                    System.out.println("あなたはadultな男です");
                } else if (gender == 1) {
                    System.out.println("あなたはadultな女です");
                }
                break;
        }
    }
}
