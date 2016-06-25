import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_5_loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i<10;i++){
            System.out.println(N + " x " + (i+1) + " = " + N*(i+1));
        }
    }
}
