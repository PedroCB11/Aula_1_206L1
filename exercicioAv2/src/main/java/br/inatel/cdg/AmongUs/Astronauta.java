package br.inatel.cdg.AmongUs;

public abstract class Astronauta {

    public static int cont = 0;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    public Astronauta(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
        cont++;
    }

    public void mostraInfo(){
        System.out.println("Informações do "+ this.cor);
        System.out.println("Nome: "+ this.nome);
        if(this.pet != null)
            System.out.println("Pet: "+this.pet.getNome());
        else System.out.println("Não possui pet");
        if(this.skin != null)
            System.out.println("Skin: "+this.skin.getTipo());
        else System.out.println("Não tem Skin");

    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public void verCameras(){
        System.out.println(this.nome + " olhou as câmeras");
    }

    public abstract void reportar();

    public abstract void reparar();


}
