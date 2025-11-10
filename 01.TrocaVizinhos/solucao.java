import java.io.*;
import java.util.*;

public class Solucao {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();

            String[] tokens = line.split(" ");

	    ArrayList<String> seq = new ArrayList<>(Arrays.asList(tokens));
	    if(seq.size() % 2 == 0){
	    	for(int i = 0; i < (seq.size() - 1); i += 2){
			String temp = seq.get(i);
			seq.set(i, seq.get(i+1));
			seq.set(i+1, temp);
		}
	    } else {
		for(int i = 0; i < (seq.size() - 2); i += 2){
			String temp = seq.get(i);
			seq.set(i, seq.get(i+1));
			seq.set(i+1, temp);
		}
	    }

	    for(String a : seq){
		String novo = a + " ";
	    	System.out.print(novo);
	    }

            
        } catch(IOException ioe){}
    }
}

