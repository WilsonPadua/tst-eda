import java.util.*;
import java.io.*;

public class Solucao{
    
    public static void main(String[] args){

        try{
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String reader = read.readLine();
            String n = read.readLine();
            int num = Integer.parseInt(n);
            String[] tokens = reader.split(" ");
            int[] seq = new int[tokens.length];

            for(int i = 0; i < seq.length; i++){
                seq[i] = Integer.parseInt(tokens[i]);
            }



        int[] ord = counting(seq, num);

        System.out.println(Arrays.toString(ord));
        

        } catch(IOException ioe){}

    }

    public static int[] counting(int[] v, int k){
        int[] freq = new int[k+1];
        String r = "";
        for(int i = 0; i < v.length; i++){
            freq[v[i]]++;
            r += freq;
            print(v);
            r = " ";
        }

        for(int i = 1; i < k+1; i++){
            freq[i] += freq[i-1];
        }

        int[] ord = new int[v.length];
        for(int i = v.length -1; i >= 0; i--){
            ord[freq[v[i]]-1] = v[i];
            freq[v[i]]--;
        }

        return ord;

    }
    
    public static void print(int[] v){
        String resultado = "";
        for(int e : v){
            resultado += e + " ";
        }
        System.out.println(resultado);
    }

}
