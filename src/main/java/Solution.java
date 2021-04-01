import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> res = func(105);

        for (int i = 0; i < 105; i++) {
            System.out.println(res.get(i));
        }
    }

    public static List<String> func(int n) {
        List<String> res = new ArrayList<String>();

        for(int i = 1; i <= n; i ++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                res.add("Devhaus Learning Model");
            } else if (i % 3 == 0 && i % 5 == 0) {
                res.add("Devhaus Learning");
            } else if (i % 3 == 0 && i % 7 == 0) {
                res.add("Devhaus Model");
            } else if (i % 3 == 0) {
                res.add("Devhaus");
            } else if (i % 5 == 0) {
                res.add("Learning");
            } else if (i % 7 == 0) {
                res.add("Model");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
