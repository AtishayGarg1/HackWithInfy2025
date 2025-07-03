import java.util.*;

class Assign_cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                ans++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ng = sc.nextInt();
        int[] g = new int[ng];
        for (int i = 0; i < ng; i++) {
            g[i] = sc.nextInt();
        }

        int ns = sc.nextInt();
        int[] s = new int[ns];
        for (int i = 0; i < ns; i++) {
            s[i] = sc.nextInt();
        }

        System.out.println(findContentChildren(g, s));
    }
}
