import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] a = new int[size]; 
        for(int i = 0;i < size;i++) {
            a[i] = s.nextInt();
        }
        System.out.println(getMean(a));
        System.out.println(getMedian(a));
        System.out.println(getMode(a));
    }
    
    private static double getMean(int[] a) {
        double mean = 0;
        int sum = 0;
        int size = a.length;
        for(int i : a) {
            sum += i;
        }
        mean = (double) sum/size;
        return mean;
    }
    
    private static double getMedian(int[] a) {
        double median = 0;
        int size = a.length;
        int [] copy = a.clone();
        Arrays.sort(copy);
        if(size % 2 == 0)
            median = (double) (copy[size/2 - 1] + copy[size/2]) / 2;
        else {
            median = (double) copy[(size-1)/2];
        }
        return median;
    }
    
    private static int getMode(int[] a) {
        int mode = 0;
        int size = a.length;
        int [] copy = a.clone();
        Arrays.sort(copy);
        int count = 0, max = 0;
        int current = copy[0];
        for(int i = 0;i < size;i++) {
            if (copy[i] == current) {
                count++;
            } else {
                count = 1;
                current = copy[i];
            }
            if (count > max) {
                max = count;
                mode = copy[i];
            }
        }
        return mode;
    }
}