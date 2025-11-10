import java.io.*;
import java.util.*;

public class Solucao {

    public static void main(String[] args){
        try{
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String line = read.readLine();
            String strnum = read.readLine();
            String[] tokens = line.split(" ");
            int qtd = Integer.parseInt(strnum);

            ArrayList<String> seq = new ArrayList<>();

            for(int i = 0; i < qtd; i++){
                int idx = i % tokens.length;
                seq.add(tokens[idx]);
            }

            System.out.println(seq);

        } catch (IOException ioe){}
    }
}
