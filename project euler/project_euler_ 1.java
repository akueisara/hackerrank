/***************************
 * This problem is a programming version of Problem 1 from projecteuler.net
 *
 ***************************/
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class project_euler_1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++) {
            int n = scan.nextInt();
            int maxthMultiplesOfThree = (n-1) - (n-1)%3;
            int maxthMultiplesOfFive = (n-1) - (n-1)%5;
            int maxthMultiplesOfFifteen = (n-1) - (n-1)%15;
            long totalNumberOfThree = maxthMultiplesOfThree / 3;
            long totalNumberOfFive = maxthMultiplesOfFive / 5;
            long totalNumberOfFifteen = maxthMultiplesOfFifteen / 15;
            long sigma_of_three = 3 * totalNumberOfThree *(totalNumberOfThree + 1) >> 1;
            long sigma_of_five = 5 * totalNumberOfFive *(totalNumberOfFive + 1) >> 1;
            long sigma_of_fifteen = 15 * totalNumberOfFifteen *(totalNumberOfFifteen + 1) >> 1;
            System.out.println(sigma_of_three + sigma_of_five - sigma_of_fifteen);
        }          
    }
}