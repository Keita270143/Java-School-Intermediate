public class Practice12_02 {
    public static void main(String[] args) {
        String[] day = { "朝", "昼", "夜" };
        greet(day);

        for (int i = 0; i < day.length; i++) {
            System.out.println(day[i]);
        }
    }

    private static void greet(String[] aryData) {
        aryData[0] = "Good morning!!";
        aryData[1] = "Good afternoon!!";
        aryData[2] = "Good evening!!";
    }

}
