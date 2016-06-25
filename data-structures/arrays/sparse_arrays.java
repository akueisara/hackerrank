import java.io.*;
import java.util.*;

public class sparse_arrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String array[] = new String[n];
        for (int i=0; i<n; i++)
            array[i] = scan.next();
        int q = scan.nextInt();
        for (int i=0; i<q; i++) {
            String s = scan.next();
            int count=0;
            for (int j=0; j<n;j++) {
                if ( array[j].equals(s))
                    count++;
            }
            System.out.println(count);
        }
                
    }
}
