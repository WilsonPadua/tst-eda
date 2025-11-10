import java.util.*;
import java.io.*;

public class Solucao {
    public static void main(String[] args){
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int num = Integer.parseInt(line);

        System.out.println(fibonnati(num));
        
        } catch(IOException ioe){}
    }

    public static int fibonnati(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;

        return fibonnati(num -1) + fibonnati(num -2);
    }
}
