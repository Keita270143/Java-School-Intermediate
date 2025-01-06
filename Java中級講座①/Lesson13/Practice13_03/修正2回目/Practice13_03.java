class Greeting {
    String country;

    public String greet(String country) {
        String gr = null;
        if (country == "日本") {
            gr = "こんにちは";
        } else if (country == "韓国") {
            gr = "アンニョンハセヨ";
        } else if (country == "その他") {
            gr = "わかりません";
        }
        return gr;
    }
}

public class Practice13_03 {
    public static void main(String[] args) {

        Greeting greetJapan = new Greeting();
        Greeting greetKorea = new Greeting();
        Greeting greetUnknown = new Greeting();

        String japan = "日本";
        String korea = "韓国";
        String unknown = "その他";

        greetJapan.country = japan;
        greetKorea.country = korea;
        greetUnknown.country = unknown;

        System.out.println(greetJapan.country + "は " + greetJapan.greet(japan));
        System.out.println(greetKorea.country + "は " + greetKorea.greet(korea));
        System.out.println(greetUnknown.country + "は " + greetUnknown.greet(unknown));
    }
}