import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] cost = new int[n];
            int[] weight = new int[n];
            for(int j=0;j<n;j++){
                cost[j] = scan.nextInt();
                weight[j] = cost[j];
            }
            
            int[] c = new int[k+1];
            for (int j=0; j<n; ++j)
                for (int z = weight[j]; z <= k; ++z)
                    c[z] = Math.max(c[z], c[z - weight[j]] + cost[j]);
            System.out.println(c[k]);
        }
    }    
}