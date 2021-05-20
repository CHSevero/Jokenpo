package controladores;

import entidades.ControladorPlacarDeJogo;
import entidades.Jogador;

public class Jogo {
    private ControladorPlacarDeJogo controladorPlacarDeJogo;
    private Jogador jogador;

    public Jogo(){
        this.controladorPlacarDeJogo = new ControladorPlacarDeJogo();
        this.jogador = new Jogador();
    }

    public void palpiteJogador(String palpite) {
        this.controladorPlacarDeJogo.setJogadaJogador(palpite);
    }

    public void palpiteComputador() {
        int number_palpite = (int)((Math.random() * 3) + 1);
        if(number_palpite == 1){
            this.controladorPlacarDeJogo.setJogadaComputador("pedra"); 
        }else if(number_palpite == 2){
            this.controladorPlacarDeJogo.setJogadaComputador("papel");
        }else {
            this.controladorPlacarDeJogo.setJogadaComputador("tesoura");
        } 
    }


    public void jogar() {
        if((this.controladorPlacarDeJogo.getJogadaComputador().equalsIgnoreCase("pedra") && this.controladorPlacarDeJogo.getJogadaJogador().equalsIgnoreCase("tesoura"))
            || (this.controladorPlacarDeJogo.getJogadaComputador().equalsIgnoreCase("tesoura") && this.controladorPlacarDeJogo.getJogadaJogador().equalsIgnoreCase("papel"))
            || (this.controladorPlacarDeJogo.getJogadaComputador().equalsIgnoreCase("papel") && this.controladorPlacarDeJogo.getJogadaJogador().equalsIgnoreCase("pedra"))) {
            this.controladorPlacarDeJogo.setQtdVitoriasComputador();
            System.out.println("Computador venceu"); 
            System.out.println("Palpite do computador: "+this.controladorPlacarDeJogo.getJogadaComputador());
            System.out.println("Palpite do jogador: "+this.controladorPlacarDeJogo.getJogadaJogador());
            System.out.println("Quantidade de vitorias computador: "+this.controladorPlacarDeJogo.getQtdVitoriasComputador());
            System.out.println("Quantidade de vitorias do jogador: "+this.controladorPlacarDeJogo.getQtdVitoriasJogador());
        }else if((this.controladorPlacarDeJogo.getJogadaComputador().equalsIgnoreCase("tesoura") && this.controladorPlacarDeJogo.getJogadaJogador().equalsIgnoreCase("pedra"))
        || (this.controladorPlacarDeJogo.getJogadaComputador().equalsIgnoreCase("papel") && this.controladorPlacarDeJogo.getJogadaJogador().equalsIgnoreCase("tesoura"))
        || (this.controladorPlacarDeJogo.getJogadaComputador().equalsIgnoreCase("pedra") && this.controladorPlacarDeJogo.getJogadaJogador().equalsIgnoreCase("papel"))) {
            this.controladorPlacarDeJogo.setQtdVitoriasJogador();
            System.out.println("Você venceu"); 
            System.out.println("Palpite do computador: "+this.controladorPlacarDeJogo.getJogadaComputador());
            System.out.println("Palpite do jogador: "+this.controladorPlacarDeJogo.getJogadaJogador());
            System.out.println("Quantidade de vitorias computador: "+this.controladorPlacarDeJogo.getQtdVitoriasComputador());
            System.out.println("Quantidade de vitorias do jogador: "+this.controladorPlacarDeJogo.getQtdVitoriasJogador());
        }else{
            System.out.println("Empate"); 
            System.out.println("Palpite do computador: "+this.controladorPlacarDeJogo.getJogadaComputador());
            System.out.println("Palpite do jogador: "+this.controladorPlacarDeJogo.getJogadaJogador());
            System.out.println("Quantidade de vitorias computador: "+this.controladorPlacarDeJogo.getQtdVitoriasComputador());
            System.out.println("Quantidade de vitorias do jogador: "+this.controladorPlacarDeJogo.getQtdVitoriasJogador());
        }
    }
}
