import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_1_data_types {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
        int second_i;
        double second_d;
        String second_s;
        /* Read and save an integer, double, and String to your variables.*/
        second_i = scan.nextInt();
        second_d = scan.nextDouble();
        scan.nextLine();
        second_s = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + second_i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + second_d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + second_s);
        scan.close();
    }
}
