public class Nave {
    String nome;
    int vida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Nave(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }
}

