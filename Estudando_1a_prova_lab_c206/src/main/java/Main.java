public class Main {

    public static void main(String[] args) {
        //b) sout mostrar informaçoes do deck e suas cartas
     Deck d1 = new Deck();
     d1.dono = "Pedro";


     Carta c1 = new Carta();
     c1.nome = "Cavaleiro";
     c1.poder = 10;
     c1.classificacao = "Soldado";

     Carta c2 = new Carta();
     c2.nome = "Robin Wood";
     c2.poder = 13;
     c2.classificacao = "Arqueiro";

     Carta c3 = new Carta();
     c3.nome = "Taylor";
     c3.poder = 32;
     c3.classificacao = "Pesado";

     Carta c4 = new Carta();
     c4.nome = "John";
     c4.poder = 18;
     c4.classificacao = "Soldado";
 //a)sout  adicionar uma carta ao deck
    d1.adicionarCarta(c1);
    d1.adicionarCarta(c2);
    d1.adicionarCarta(c3);
    d1.adicionarCarta(c4);

//c) sout mostrar o poder total do deck e sua media aritmetica
        d1.mostraInfo();

        //d) sout Calcular quantos soldados, arqueiros e pesados há no deck
        d1.calcularPoderMedio();
        d1.calcularClassificacao();
    }
}
