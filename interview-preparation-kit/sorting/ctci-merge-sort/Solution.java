import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        MergeSort ms = new MergeSort();
        return ms.sort(arr);
    }

    /* reference: https://algs4.cs.princeton.edu/22mergesort/Merge.java.html */
    private static class MergeSort {
        private long swapCount = 0;

        public long sort(int[] arr) {
            int[] helper = new int[arr.length];
            sort(arr, helper, 0, arr.length - 1);
            return swapCount;
        }

        private void sort(int[] arr, int[] helper, int low, int high) {
            if (high <= low) return;
            int mid = low + (high - low) / 2;
            sort(arr, helper, low, mid);
            sort(arr, helper, mid + 1, high);
            merge(arr, helper, low, mid, high);
        }

        private void merge(int[] arr, int[] helper, int low, int mid, int high) {
            // copy to helper[]
            for (int k = low; k <= high; k++) {
                helper[k] = arr[k];
            }

            // merge back to a[]
            int i = low, j = mid + 1;
            for (int k = low; k <= high; k++) {
                if(i > mid) {
                    swapCount += mid + 1 - i;
                    arr[k] = helper[j++];
                } else if(j > high) {
                    arr[k] = helper[i++];
                } else if(helper[j] < helper[i]) {
                    swapCount += mid + 1 - i;
                    arr[k] = helper[j++];
                } else {
                    arr[k] = helper[i++];
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            long result = countInversions(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}