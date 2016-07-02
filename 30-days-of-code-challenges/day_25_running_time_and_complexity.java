import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_25_running_time_and_complexity {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            int n = scan.nextInt();
            if (isPrime(n)) {
                System.out.println("Prime");
            }
            else
                System.out.println("Not prime");
        }
    }
    
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        else {
            for(int i=2; i<= (int)Math.sqrt(n);i++) {
                if(n%i == 0)
                    return false;
            }
        }
        return true;
        
    }
}