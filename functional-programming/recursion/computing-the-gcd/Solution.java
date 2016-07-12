import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a == b)
			System.out.println(a);
		else {
			int x, y;
			if(a > b) {
				x = a;
				y = b;
			}
			else {
				x = b;
				y = a;
			}
			while(x!=y) {
				x = x-y;
				if(x<y) {
					int temp = x;
					x = y;
					y = temp;
				}
			}
			System.out.println(x);
		}      
	}
}