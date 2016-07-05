import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day_28_regex_patterns_and_intro_to_databases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String emailRegEx = "[a-z]+@gmail.com";
        Pattern p = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher matcher = p.matcher(emailID);
            if (matcher.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
}
