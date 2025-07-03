import java.util.*;

public class MaximumUnitsOnTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] boxes = new int[m][2];
        for (int i = 0; i < m; i++) {
            boxes[i][0] = sc.nextInt();
            boxes[i][1] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(maximumUnits(boxes, n));
    }

    public static int maximumUnits(int[][] boxes, int n) {
        Arrays.sort(boxes, (a, b) -> Integer.compare(b[1], a[1]));
        int ans = 0;
        for (int[] box : boxes) {
            if (n - box[0] >= 0) {
                ans += box[0] * box[1];
                n -= box[0];
            } else {
                ans += n * box[1];
                break;
            }
        }
        return ans;
    }
}
