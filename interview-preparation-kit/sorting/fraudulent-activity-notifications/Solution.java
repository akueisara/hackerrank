import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int n = expenditure.length;
        int ans = 0, med = 0;
        int[] freq = new int[201];
        for(int i = 0; i < n; i++) {
            int val = expenditure[i];

            if(i >= d) {
                med = findMedian(freq, d / 2 + d % 2);

                if(d % 2 == 0) {
                    int ret = findMedian(freq, d / 2 + 1);
                    if (val >= med + ret) {
                        ans++;
                    }
                } else {
                    if (val >= med * 2) {
                        ans++;
                    }
                }
            }

            freq[val]++;

            if(i >= d) {
                int prev = expenditure[i-d];
                freq[prev]--;
            }
        }
        return ans;
    }

    private static int findMedian(int[] freq, int idx) {
        int s = 0;
        for(int i = 0; i < 200; i++) {
            s += freq[i];
            if(s >= idx) {
                return i;
            }
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}