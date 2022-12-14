package gft;
import java.util.Scanner;
/*
* Desafio:
* Faça um Programa que pergunte em que turno você estuda.
* Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
* Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
*/

public class QualTurno {
    public static void main(String[] args) {

        System.out.println("Em que turno você estuda, digite M-matutino ou V-Vespertino ou N- Noturno: ");
        Scanner leitor = new Scanner(System.in);
        char turno = leitor.next().toUpperCase().charAt(0);

        //TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:
        switch (turno){
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}
