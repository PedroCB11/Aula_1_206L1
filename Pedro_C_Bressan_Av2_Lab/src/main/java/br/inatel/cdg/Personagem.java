package br.inatel.cdg;

public class Personagem {
    private double vida;
    private String nome, classe;
    private static int PersonagensCriados = 0;

//CONSTRUTOR


    public Personagem(double vida, String nome, String classe) {
        this.nome = nome;
        this.vida = vida;
        this.classe = classe;

    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getPersonagensCriados() {
        return PersonagensCriados;
    }

    public void setPersonagensCriados(int personagensCriados) {
        PersonagensCriados = personagensCriados;
    }


    public void entrarEmPVP(){
        System.out.println(this.nome + "Entrando na arena PVP");
    }
    public void entrarEmRaid(){
        System.out.println(this.nome + "Entrando em raid");
    }
    public void mostraInfo(){
        System.out.println("info dos personagens:");
        System.out.println("Nome: "+ nome);
        System.out.println("Vida: "+ vida);
        System.out.println("Classe: "+ classe);
        System.out.println(PersonagensCriados++);

    }
}
