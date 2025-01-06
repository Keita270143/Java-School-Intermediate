class Coffee {
    String[] cofee = { "ボス", "ジョージア" };
    String[] sugar = { "控え目", "甘め" };
    String[] milk = { "無し", "入り" };
    int[] nedan = { 110, 120 };

    public void buyDrink() {
        System.out.println(cofee[0] + "の甘さは" + sugar[0] + "、" + "ミルク" + milk[0] + "です。" + nedan[0] + "円になります。");
        System.out.println(cofee[1] + "の甘さは" + sugar[1] + "、" + "ミルク" + milk[1] + "です。" + nedan[1] + "円になります。");
    }
}

class Juice {
    String[] juice = { "バヤリース", "午後の紅茶" };
    String[] taste = { "オレンジ", "レモンティー" };
    int[] nedan = { 130, 150 };

    public void buyDrink() {
        System.out.println(juice[0] + "の" + taste[0] + "味です。" + nedan[0] + "円になります。");
        System.out.println(juice[1] + "の" + taste[1] + "味です。" + nedan[1] + "円になります。");
    }
}

public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice a = new Juice();
        a.buyDrink();

        Coffee b = new Coffee();
        b.buyDrink();
    }

}
