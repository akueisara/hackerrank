import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int S = scan.nextInt();
            int id = (S+M-1)%N;
            if(id == 0) 
                System.out.println(N);
            else
                System.out.println(id);
        }
    }
}