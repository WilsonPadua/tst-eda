import java.io.*;

public class Solucao {

	public static void main(String[] args){
		try{       
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = "";

            while((line = reader.readLine()) != null){
                String[] tokens = line.split(" ");
                System.out.println(encontraPrimeiroNegativo(tokens, 0));
            }
		} catch(IOException ioe) {}
	}

	public static String encontraPrimeiroNegativo(String[] in, int idx){
		if(idx == in.length) return "-";
		int num = Integer.parseInt(in[idx]);
		if(num < 0) return in[idx];
		return encontraPrimeiroNegativo(in, idx += 1);


	}
}
