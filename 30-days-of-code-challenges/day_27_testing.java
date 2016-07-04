import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_27_testing {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(5);
        System.out.println("4 3"); // YES
        System.out.println("0 -3 4 2");
        System.out.println("5 2"); // NO
        System.out.println("0 -3 4 2 2");
        System.out.println("3 3"); // YES
        System.out.println("0 -3 4");
        System.out.println("7 2"); // NO
        System.out.println("0 -3 1 1 1 1 1");
        System.out.println("6 3"); // YES
        System.out.println("0 -3 4 2 1 1");
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int [] a = new int[n];
            int arrive = 0;
            for(int j=0;j<n;j++) {
                a[j] = scan.nextInt();
                if (a[j]<=0)
                    arrive++;
            }
            if (arrive>=k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
