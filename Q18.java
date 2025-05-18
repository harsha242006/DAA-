import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = sum - num;
            if (map.getOrDefault(complement, 0) > 0)
                System.out.println("(" + complement + ", " + num + ")");
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
}
