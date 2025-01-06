public class Practice12_02 {
    public static void main(String[] args) {
        greet("朝");
        greet("昼");
        greet("夜");

    }

    private static void greet(String day) {
        if (day.equals("朝")) {
            System.out.println("Good morning!!");
        } else if (day.equals("昼")) {
            System.out.println("Good afternoon!!");
        } else if (day.equals("夜")) {
            System.out.println("Good evening!!");
        }
    }

}
