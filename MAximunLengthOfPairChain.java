import java.util.*;
public class MAximunLengthOfPairChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }

        System.out.println(findLongestChain(pairs));
    }
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b) -> Integer.compare(a[1],b[1]));
        int ans = 0;
        int prevend = Integer.MIN_VALUE;
        for(int[] pair : pairs){
            if(pair[0] > prevend){
                ans++;
                prevend = pair[1];
            }
        }
        return ans;
    }
}
