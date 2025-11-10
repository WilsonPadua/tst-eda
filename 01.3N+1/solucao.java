import java.util.*;
import java.io.*;

public class solucao {
    public static void main(String[] args){
        try{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "";
        String str2 = "";

        str1 = reader.readLine();
        str2 = reader.readLine();



        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int cont1 = 1;
        int cont2 = 1;

        while(num1 != 1 && num2!= 1){
            if(num1 % 2 == 0){
                num1 = num1/2;
                cont1++;
            }else{
                num1 = (num1 * 3) + 1;
                cont1++;
            }

            if (num2 % 2 == 0){
                num2 = num2/2;
                cont2++;
            }else{
                num2 = (num2 * 3) + 1;
                cont2++;
            }
        }
        if(cont1 >= cont2){
            System.out.println(cont1);
        }else{
            System.out.println(cont2);
        }

        } catch(IOException ioe){}

    }

}
