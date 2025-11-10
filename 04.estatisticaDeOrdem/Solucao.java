import java.util.*;
import java.io.*;

public class Solucao{
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            
            int[] seq = new int[tokens.length];
            for(int i = 0; i < seq.length; i++){
                seq[i] = Integer.parseInt(tokens[i]);
            }

            System.out.println(posicao(seq));


        } catch(IOException ioe) {}
    }

    public static int posicao(int[] v){
        int cont = 0;
        for(int i = 0; i < v.length; i++){
            if(v[0] >= v[i]){
                cont += 1;
            }
        }
        return cont;
    }
}
