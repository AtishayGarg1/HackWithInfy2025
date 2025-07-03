import java.util.*;

class Non_Overlapping_Intervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        int prev = Integer.MIN_VALUE;
        for (int[] a : intervals) {
            if (prev <= a[0]) {
                ans++;
                prev = a[1];
            }
        }
        return intervals.length - ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        System.out.println(eraseOverlapIntervals(intervals));
    }
}
