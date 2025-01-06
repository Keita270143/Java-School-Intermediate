class Animal {
    String name = "Jhon";
    String type = "nothing";

    public void cryAnimals() {
        System.out.println(
                switch (type) {
                    case "cat" -> "nya-";
                    case "dog" -> "wan";
                    default -> "特定できませんでした";
                });
    }
}

public class Practice13_01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "pochi";
        System.out.println(a.name);
        a.type = "dog";
        a.cryAnimals();

        Animal b = new Animal();
        b.name = "tama";
        System.out.println(b.name);
        b.type = "cat";
        b.cryAnimals();
    }

}
