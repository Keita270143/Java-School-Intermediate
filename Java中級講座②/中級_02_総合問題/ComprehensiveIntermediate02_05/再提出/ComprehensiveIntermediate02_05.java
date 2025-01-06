class Juice {

    public void buyDrink(String juice, String taste, int nedan) {
        System.out.println(juice + "の" + taste + "味です。" + nedan + "円になります。");
    }
}

class Coffee {

    public void buyDrink(String cofee, String sugar, String milk, int nedan) {
        System.out.println(cofee + "の甘さは" + sugar + "、" + "ミルク" + milk + "です。" + nedan + "円になります。");
    }
}

public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice a = new Juice();
        a.buyDrink("バヤリース", "オレンジ", 130);
        a.buyDrink("午後の紅茶", "レモンティー", 150);

        Coffee b = new Coffee();
        b.buyDrink("ボス", "控え目", "無し", 110);
        b.buyDrink("ジョージア", "甘め", "入り", 120);
    }

}
