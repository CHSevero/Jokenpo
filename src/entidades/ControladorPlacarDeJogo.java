package entidades;

public class ControladorPlacarDeJogo {
    private int qtdVitoriasJogador;
    private int qtdVitoriasComputador;
    private String jogadaComputador;
    private String jogadaJogador;

    public ControladorPlacarDeJogo(){
        this.qtdVitoriasComputador = 0;
        this.qtdVitoriasJogador = 0;
    }

    public void setQtdVitoriasJogador() {
        this.qtdVitoriasJogador++;
    }

    public int getQtdVitoriasJogador() {
        return this.qtdVitoriasJogador;
    }

    public void setQtdVitoriasComputador() {
        this.qtdVitoriasComputador++;
    }

    public int getQtdVitoriasComputador() {
        return this.qtdVitoriasComputador;
    }

    public void setJogadaComputador(String jogada) {
        this.jogadaComputador = jogada;
    }

    public String getJogadaComputador(){
        return this.jogadaComputador;
    }

    public void setJogadaJogador(String jogada) {
        this.jogadaJogador = jogada;
    }

    public String getJogadaJogador() {
        return this.jogadaJogador;
    }

}
