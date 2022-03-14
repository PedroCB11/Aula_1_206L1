public class Deck {
    public String dono;
    Carta[] cartas;

    //a) adicionando carta ao deck
    //inicializando a array com publick Deck()
    public Deck() {
        cartas = new Carta[15];
    }

    void adicionarCarta(Carta carta) {
        boolean flag = true;
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] == null && flag) {
                cartas[i] = carta;
                flag = false;
                System.out.println("Carta adicionada");
            }

        }
        if (flag) {
            System.out.println("Sem espaço no deck");
        }
    }

    //b) mostrar a informaçao do deck e suas cartas
    void mostraInfo() {
        System.out.println("Dono do deck: " + dono);
        for (Carta carta : cartas) { // para cada carta//
            if (carta != null) { //se nao for diferente de nulo
                carta.mostraInfo();
            }
        }
    }

    //c) mostrar o poder total do deck e sua media aritimetica
    void calcularPoderMedio() {
        int poder = 0;
        int totalCartas = 0;
        float media;

        for (Carta carta : cartas) {// para cada carta//
            if (carta != null) { //se nao for diferente de nulo
                poder += carta.poder;
                totalCartas++;
            }
        }
        System.out.println("Poder total: " + poder);
        media = (float) poder / totalCartas; // calculando a media aritimetica do poder das cartas
        System.out.println("Poder Médio: " + media);
    }

    //d) Calcular quantos soldados, arqueiros e pesados há no deck
    void calcularClassificacao() {
        int arqueiros = 0;
        int soldados = 0;
        int pesados = 0;

        for (Carta carta : cartas) {// para cada carta//
            if (carta != null) { //se nao for diferente de nulo
                if (carta.classificacao.equals("Soldado")) {
                    soldados++;

                } else if (carta.classificacao.equals("Arqueiro")) {
                    arqueiros++;
                } else {
                    pesados++;

                }


            }


        }
    }
}