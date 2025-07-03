import java.util.*;

public class Buy_2_Chocolates {
    public static int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < prices.length; i++) {
            if (min1 > prices[i]) {
                min1 = prices[i];
                idx = i;
            }
        }
        for (int i = 0; i < prices.length; i++) {
            if (min2 > prices[i] && i != idx) {
                min2 = prices[i];
            }
        }
        return money - min1 - min2 < 0 ? money : money - min1 - min2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        System.out.println(buyChoco(prices, money));
    }
}
