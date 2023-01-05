package gft;

import java.util.Scanner;

public class EmboscadaNoRpg {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador= leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo= leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        int critico = dados * 2;

        //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
        if (dados == 9) {
            ataqueDoJogador += critico;
            defesaDoJogador += critico;
        }

        vidaDoJogador -= (ataqueDoInimigo - (defesaDoJogador + dados));
        vidaDoInimigo -= (ataqueDoJogador + dados);

        if (vidaDoJogador <= 0)
            System.out.println("Jogador nao sobreviveu");
        else if (vidaDoInimigo > 0) {
            System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
        } else {
            System.out.println("Jogador sobreviveu e derrotou o inimigo");
        }
    }
}