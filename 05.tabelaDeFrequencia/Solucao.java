import java.util.*;
import java.io.*;

public class Solucao{

    public static void main(String [] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStream(System.in));
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            int[] seq = new int[tokens.length];

            for(int i = 0; i < seq.length; i++){
                seq[i] = Interger.parseInt(tokens[i]);
            }




        } catch (IOException) {}
    }

    public int[] freq(int[] v){
        int maior = 0;
        for(int e : v){
            if(e > maior) maior = e;
        }

        int[] freq = new int[maior];

        for(int i = freq.length -1; i > 0; i--){
                freq[i - maior] = v[i];
        }
    }

}
