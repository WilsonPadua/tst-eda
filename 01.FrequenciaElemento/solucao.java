import java.io.*;

public class Solucao {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String obj = reader.readLine();
            String str2 = reader.readLine();

            String[] tokens = str2.split(" ");
            int cont = 0;

            for(String e : tokens){
                if(e.equals(obj)){
                    cont++;
                }
            }

            System.out.println(cont);


        } catch(IOException ioe){}
    }
}
