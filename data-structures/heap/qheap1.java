import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class qheap1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i=0; i<n; i++) {
            int q = scan.nextInt();
            int v;
            switch(q){
                case 1:
                    v = scan.nextInt();
                    queue.add(new Integer (v));
                    break;
                case 2:
                    v = scan.nextInt();
                    queue.remove(v);
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }
}
