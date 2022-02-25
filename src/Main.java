import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public static void main(String[] args) {
        List<Integer> filtredList = new ArrayList<>();
        for (int x : intList) {
            if (x > 0 && x % 2 == 0) filtredList.add(x);
        }
        Collections.sort(filtredList);
        for (int x : filtredList) {
            System.out.println(x);
        }
    }
}
