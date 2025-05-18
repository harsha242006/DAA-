import java.util.*;
public class Solution {
    private static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) return false;
        if ((i == game.length - 1) || i + leap > game.length - 1) return true;
        game[i] = 1;
        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int leap = scan.nextInt();
        int[] game = new int[n];
        for (int i = 0; i < n; i++) {
            game[i] = scan.nextInt();
        }
        scan.close();
        System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
    }
}
