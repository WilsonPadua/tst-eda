import java.io.*;
import java.util.*;

public class Solucao {
    
    public static void main(String[] args){
        try{
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String line = read.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> seq = new ArrayList<>();

            for(String s : tokens){
                int temp = Integer.parseInt(s);
                seq.add(temp);
            }
            
            while(encontraN(seq) != -1){
                int idx = encontraN(seq) -1;
                Collections.swap(seq, idx, encontraN(seq));
                System.out.println(seq);
            }


        } catch(IOException ioe){}
    }
    
    public static int encontraN(ArrayList<Integer> in){
        for(int i = 1; i < in.size(); i++){
            int num = in.get(i);
            int ant = in.get(i -1);
            if(ant > num){
                return i;
            }
        }
        return -1;
    }
}
