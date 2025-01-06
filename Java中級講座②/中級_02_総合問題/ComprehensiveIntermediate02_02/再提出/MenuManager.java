import java.util.ArrayList;
import java.util.HashMap;

public class MenuManager {
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    MenuManager() {

        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch", list);

        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink", list);

        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu", list);
    }

    public void searchMenu(String menu) {

        if (map.get("sandwitch").contains(menu)) {
            System.out.println(menu + "はsandwitchに含まれています。");
        } else if (map.get("drink").contains(menu)) {
            System.out.println(menu + "はdrinkに含まれています。");
        } else if (map.get("sidemenu").contains(menu)) {
            System.out.println(menu + "はsidemenuに含まれています。");
        } else {
            System.out.println("該当するメニューはありません。");
        }
    }

    public void setMenu(String category, String menu) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        list.add(menu);
        map.put(category, list);
    }

    public void showMenu(String category) {
        System.out.println(map.get(category));
    }
}
