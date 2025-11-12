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
            
        mergeSort(seq, 0, 5);             

        } catch(IOException ioe) {}

    }

    public static void mergeSort(int[] v, int ini, int fim){
        if(ini >= fim) return;

        int meio = fim - ini;

        mergeSort(v, ini, meio -1);
        mergeSort(v, meio +1, fim);
        merge(v, ini, fim);
    }

    public static void merge(int[] v, int ini, int fim){
        int[] aux = new int[fim - ini +1];
        int meio = (aux.length -1) /2;
        int i = ini; 
        int j = meio +1;
        int k = ini;

        for(int idx = 0; idx < aux.length; idx++){
                aux[idx] = v[idx + ini];
        }

        while(i <= meio && j <= fim){
            if(aux[i] < aux[j]) v[k++] = aux[i++];
            else v[k++] = aux[j++];
        }
        while(i <= meio) v[k++] = aux[i++];
    }

}
