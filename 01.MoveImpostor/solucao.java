import java.io.*;
import java.util.*;

public class Solucao {
    public static void main(String[] args){
        try{
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String line = read.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> seq = new ArrayList<>();
            
            for(String s : tokens){
                seq.add(Integer.parseInt(s));
            }

	    int impostorIdx = encontraImpostor(seq);
	    int pos = 0;

	    for(int i = 0; i < seq.size(); i++){
	    	if(seq.get(impostorIdx) < seq.get(i)){
			pos = i;
			break;
		}
		pos = i + 1;
	    }

            while(impostorIdx != pos){
                Collections.swap(seq, impostorIdx, impostorIdx -1);
		impostorIdx--;
            }
            
            System.out.println(seq);


        } catch(IOException ioe){}
    }

    public static int encontraImpostor(ArrayList<Integer> in){
        for(int i = 1; i < in.size(); i++){
            if(in.get(i -1) > in.get(i)){
                return i;
            }
        }
        return -1;
    }

}
