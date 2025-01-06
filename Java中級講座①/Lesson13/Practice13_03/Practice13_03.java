class Greeting {
    String country;
    String japan;
    String korea;
    String unknown;

    public String greet(String country) {
        if (country == japan) {
            String greet1 = "こんにちは";
            return greet1;
        } else if (country == korea) {
            String greet2 = "アンニョンハセヨ";
            return greet2;
        } else if (country == unknown) {
            String greet3 = "わかりません";
            return greet3;
        }
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