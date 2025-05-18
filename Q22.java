import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> base = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            base.add(new ArrayList<>());
            for (int j = 0; j < d; j++) {
                base.get(i).add(sc.nextInt());
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(base.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
