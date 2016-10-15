import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static double getMedian(ArrayList<Integer> list, int start, int end) {
        double median = 0;
        int size = end - start + 1;
        if(size % 2 == 0)
            median = (list.get(start + size/2 - 1) + list.get(start + size/2)) / 2;
        else {
            median = list.get(start + (size -1)/2);
        }
        return median;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            list.add(scan.nextInt());
        }
        for(int i=0; i<n; i++) {
            int element = list.get(i);
            int frequency = scan.nextInt();
            while(frequency-- > 1) {
                list.add(element);
            }
        }
        scan.close();
        
        Collections.sort(list);
        
        double Q1, Q2, Q3;
		n = list.size();
        Q1 = getMedian(list, 0, n / 2 - 1);
        Q2 = getMedian(list, 0, n - 1);
        if (n % 2 == 0) {
            Q3 = getMedian(list, n / 2, n - 1);
        } else {
            Q3 = getMedian(list, n / 2 + 1, n - 1);
        }
        
        System.out.println(Q3-Q1);
    }
}