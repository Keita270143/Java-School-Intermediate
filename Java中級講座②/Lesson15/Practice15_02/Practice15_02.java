import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practice15_02 {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<String>();

        List.add("kubo");
        List.add("mitoma");
        List.add("kamada");
        List.add("kamada");

        Set<String> set = new HashSet<String>(List);

        System.out.println(set);
    }

}