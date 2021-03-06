import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_10_binary_numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0, max = 0;
        while(n > 0) {
            int remainder = n%2;
            n = n/2;
            if (remainder == 1) {
                count++;
                if (count > max)
                    max = count;
            }
            else
                count = 0;
        }
        System.out.println(max);
    }
}
