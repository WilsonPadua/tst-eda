import java.io.*;
import java.util.*;

public class Solucao{
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			String[] tokens = line.split(" ");

			int[] seq = new int[tokens.length];

			for(int i = 0; i < tokens.length; i++){
				int e = Integer.parseInt(tokens[i]);
				seq[i] = e;
			}

			lomuto(seq, 0, seq.length -1);

			System.out.println(Arrays.toString(seq));

		} catch (IOException ioe) {}
	}

	public static void lomuto(int[] v, int ini, int fim){
		if (ini >= fim) return;

		int posPivot = particiona(v, ini, fim);

		lomuto(v, ini, posPivot -1);
		lomuto(v, posPivot +1, fim);
	}

	public static int particiona(int[] v, int ini, int fim){
		int pivot = v[fim];
		int i = ini -1;

		for(int j = ini; j < fim; j++){
			if(v[j] < pivot){
				i++;
				swap(v, i, j);
				System.out.println(Arrays.toString(v));
			}
		}

		swap(v, i +1, fim);
		return i +1;
	}

	public static void swap(int[] v, int a, int b){
		int temp = v[a];
		v[a] = v[b];
		v[b] = temp;
	}
}
