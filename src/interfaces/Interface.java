package interfaces;

import java.util.Scanner;

import controladores.Jogo;

public class Interface {
    private Jogo jogo;

    public Interface(){
        this.jogo = new Jogo();
    }

    public void jogar(){
        boolean desejaJogar = true;
        String jogada;
        Scanner sc = new Scanner(System.in);
        while(desejaJogar){
            System.out.println();
            jogo.palpiteComputador();
            System.out.println("Escolha sua jogada");
            System.out.println("1- pedra");
            System.out.println("2- papel");
            System.out.println("3- tesoura");
            System.out.println("X- sair");
            jogada = sc.nextLine();

            switch(jogada.toUpperCase()){
                case "1":
                    this.jogo.palpiteJogador("pedra");
                    jogo.jogar();
                    System.out.println();
                    break;
                case "2":
                    this.jogo.palpiteJogador("papel");
                    jogo.jogar();
                    System.out.println();
                    break;
                case "3":
                    this.jogo.palpiteJogador("tesoura");
                    jogo.jogar();
                    System.out.println();
                    break;
                case "X":
                    desejaJogar = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
                    System.out.println();
                    break;
            }
        }
        sc.close();
    }
}