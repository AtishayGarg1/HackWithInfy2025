import java.util.*;
public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findMinFibonacciNumbers(n));
    }

        public static int findMinFibonacciNumbers(int k) {
            int[] dp = new int[44];
            dp[0] = 1;
            dp[1] = 1;
            for(int i = 2;i<dp.length;i++){
                dp[i] = dp[i-1]+dp[i-2];
            }
            int c = 0;
            int l = dp.length-1;
            while(k != 0){
                if(k - dp[l] >= 0){
                    k = k-dp[l];
                    c++;
                }
                else{
                    l--;
                }
            }
            return c;
        }

}
