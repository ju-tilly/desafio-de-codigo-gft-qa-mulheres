package gft;

import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não

        String[] n_string = String.valueOf(n).split("");

        int resultado = 0;
        int posicao = 0;

        String resultadoString = "";

        do {
            for (int i = 0; i < n_string.length; i++){
                posicao = Integer.parseInt(String.valueOf(n_string[i]));
                resultado = (posicao * posicao) + resultado;
                resultadoString = String.valueOf(resultado);
            }

            if(resultado == 1){
                System.out.println(true);
                break;
            }else if(resultadoString.length() == 1){
                System.out.println(false);
                break;
            }
            n_string = String.valueOf(resultadoString).split("");
            resultado = 0;

        }while (true);
    }
}