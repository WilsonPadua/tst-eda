import java.io.*;
import java.util.*;

public class Solucao {
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			String strNum = reader.readLine();

			String[] tokens = line.split(" ");
			int num = Integer.parseInt(strNum);
			ArrayList<Integer> seq = new ArrayList<>();

			for(String e : tokens){
				int temp = Integer.parseInt(e);
				seq.add(temp);
			}
			
			while(ordenaLista(seq) > 0){
				Collections.swap(seq, ordenaLista(seq), ordenaLista(seq) -1);
			}
			
			for(int i = 0; i < num; i++){
				System.out.print(seq.get(i) + " ");
			}

		} catch (IOException ioe) {}
	}

	public static int ordenaLista(ArrayList<Integer> in){
		for(int i = 1; i < in.size(); i++){
			int num = in.get(i);
			int ant = in.get(i - 1);
			if(ant < num){
				return i;
			}
		}
		return -1;
	}
}
