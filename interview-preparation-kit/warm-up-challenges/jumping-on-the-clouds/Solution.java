import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    // 000, 001, 010, 00
    static int jumpingOnClouds(int[] c) {
        int count = 0, i = 0;
        while(i != c.length -1) {
            if(c.length - 1 - i >= 2) {
                if ((c[i+1] == 0 && c[i+2] == 0) || (c[i+1] == 1 && c[i+2] == 0)) {
                    i+=2;
                    count++;
                } else if(c[i+1] == 0 && c[i+2] == 1) {
                    i++;
                    count++;
                }
            } else {
                i++;
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}