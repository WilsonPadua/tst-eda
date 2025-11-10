import java.util.*;
import java.io.*;

public class Solucao{

    public static void main(String [] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            int[] seq = new int[tokens.length];

            for(int i = 0; i < seq.length; i++){
                seq[i] = Integer.parseInt(tokens[i]);
            }

        int[] freq = freq(seq);
        String resultado = tabelaFreq(seq, freq);

        System.out.println(resultado);

        } catch (IOException ioe) {}
    }

    public static int[] freq(int[] v){
        int maior = 0;
        
        for(int e : v){
            if(e > maior) maior = e;
        }

        int[] freq = new int[maior +1];

        for(int i = 0; i < v.length; i++){
                freq[v[i]] += 1;
        }

        return freq;
    }

    public static String tabelaFreq(int[] seq, int[] freq){
        String retorno = "";

        for(int i = 0; i < seq.length; i++){
            if(freq[seq[i]] > 0){
                retorno += seq[i] + "," + freq[seq[i]] + " ";
                freq[seq[i]] = 0;
            }
        }

        return retorno.trim();

    }

}
