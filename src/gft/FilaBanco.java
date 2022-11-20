package gft;
import java.util.Scanner;
/*
* Desafio:
* Elabore um programa que simule uma fila de atendimento bancário.
* O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
*/

public class FilaBanco {
    public static void main(String[] args) {
        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:

        //recebendo os nomes
        for(int i=0 ; i < 3 ; i++){
            //System.out.print("\nNome do cliente:" + (i+1) + ": ");
            nomesFila[i] = nome.next();
        }
        //exibindo os nomes e posição
        for(int i=0 ; i < 3 ; i++){
            System.out.printf("%s - esta na posicao: %d\n",nomesFila[i], i+1);
        }
    }
}