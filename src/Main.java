import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
        System.out.println("");
        List<Integer> number = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> set = new HashSet<>();

        for (int num : number) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }

        List<Integer> evenNums = new ArrayList<>(set);
        evenNums.sort(null);

        for (int num : evenNums) {
            System.out.print(num);
        }
        System.out.println("");

        List<String> string = new ArrayList<>(List.of("один ", "два ", "два ", "три ", "три ", "три "));
        Set<String> sets = new HashSet<>();
        for (String strings : string) {
            sets.add(strings);
        }
        List<String> evenNum = new ArrayList<>(sets);
        evenNum.sort(null);
        for (String strings : evenNum
        ) {
            System.out.print(strings);
        }
        System.out.println("");

        List<String> lok = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> loki = new HashSet<>(lok);
         System.out.println(lok.size() - loki.size());
    }
}