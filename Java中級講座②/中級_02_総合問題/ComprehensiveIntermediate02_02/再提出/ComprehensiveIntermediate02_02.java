public class ComprehensiveIntermediate02_02 {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        manager.showMenu("sandwitch");
        manager.setMenu("sandwitch", "ビッグバーガー");
        manager.showMenu("sandwitch");
        manager.searchMenu("ホットミルク");
        manager.searchMenu("オレンジジュース");
    }
}
