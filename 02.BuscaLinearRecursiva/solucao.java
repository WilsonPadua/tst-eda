import java.io.*;
import java.util.*;

public class Solucao {

    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            String str = reader.readLine();
            int target = Integer.parseInt(str);
            String[] tokens = line.split(" ");
            ArrayList<Integer> seq = new ArrayList<>(); 

            for(String e : tokens){
                seq.add(Integer.parseInt(e));
            }
            
            System.out.println(busca(seq, target, 0));

        }catch(IOException ioe){}

    
    }

    public static int busca(ArrayList<Integer> in, int target, int idx){
        if(idx == in.size()) return -1;
        if(in.get(idx) == target) return idx;
        return busca(in, target, idx += 1);
    }
}
