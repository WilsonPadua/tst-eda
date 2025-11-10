import java.io.*;
import java.util.*;

public class Solucao {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String line = read.readLine();
            String[] tokens = line.split(" ");
            ArrayList<String> seq = new ArrayList<>(Arrays.asList(tokens));
            int impostor = encontraImpostor(seq.toArray(new String[0]));
            while (impostor != -1) {
                for (int j = 0; j < seq.size() - 1; j++) {
                    if (seq.get(j + 1).equals(seq.get(impostor))) {
                        String temp = seq.get(impostor);
                        seq.set(impostor, seq.get(j));
                        seq.set(j, temp);
                    }
                }
                impostor = encontraImpostor(seq.toArray(new String[0]));
            }
            for (String a : seq) {
                System.out.print(a + " ");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static int encontraImpostor(String[] in) {
        int impostor = -1;
        for (int i = 0; i < in.length - 1; i++) {
            int num = Integer.parseInt(in[i]);
            int prox = Integer.parseInt(in[i + 1]);
            if (prox < num) {
                impostor = i;
                break;
            }
        }
        return impostor;
    }
}

