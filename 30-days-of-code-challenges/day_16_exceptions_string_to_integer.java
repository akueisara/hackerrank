import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_16_exceptions_string_to_integer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            // write exception-throwing code here
            System.out.println(Integer.parseInt(S));
        }
        catch(Exception e){
             System.out.println("Bad String");
        }
    }
}
