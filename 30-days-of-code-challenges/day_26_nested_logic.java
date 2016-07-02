import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_26_nested_logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int day_a = scan.nextInt();
        int month_a = scan.nextInt();
        int year_a = scan.nextInt();
        int day_e = scan.nextInt();
        int month_e = scan.nextInt();
        int year_e = scan.nextInt();
        scan.close();
        
        int fine = 0;
        if (day_a > day_e && month_a == month_e && year_a == year_e) {
            fine = (day_a - day_e) * 15;
        }
        if (month_a > month_e && year_a == year_e) {
            fine = (month_a - month_e)*500;
        }
        if (year_a > year_e) {
            fine = 10000;
        }
        System.out.println(fine);
    }   
}