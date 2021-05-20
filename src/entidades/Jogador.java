package entidades;

public class Jogador {
    private int vitorias;
    private int derrotas;

    public Jogador() {
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public void setVitorias() {
        this.vitorias++;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setDerrotas(){
        this.derrotas++;
    }

    public int getDerrotas(){
        return this.derrotas;
    }
}