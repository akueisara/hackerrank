import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] freq = new int[26];
        char[] firstCharArray = first.toCharArray();
        for(char c: firstCharArray) {
            freq[c-'a']++;
        }
        char[] secondCharArray = second.toCharArray();
        for(char c: secondCharArray) {
            freq[c-'a']--;
        }
        int deleteCount = 0;
        for(int i=0;i<26;i++) {
            deleteCount += Math.abs(freq[i]);
        }
        return deleteCount;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(numberNeeded(first, second));
    }
}