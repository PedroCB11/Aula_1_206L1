import br.inatel.cdg.*;

import java.beans.PersistenceDelegate;


public class Main {
    public static void main(String[] args) {

        Guilda[] guildas = new Guilda[4];

       // Humano humano = new Humano(10,"Pedro","xx","longo");
        Anao anao = new Anao(50,"Alexandre","Anao","Grande");
        Humano humn = new Humano(10,"PEDRO","xxx","imenso");
        Orc orczin = new Orc(40,"otavio","asdasd","verde");
        Troll trollzin = new Troll(60,"marcos","Troll","enórme");

        Personagem personagem1 = new Personagem(50,"bbb", "Anao",1);
        Personagem personagem2 = new Personagem(10,"aaa", "Humano",1);
        Personagem personagem3 = new Personagem(40,"c", "Troll",1);
        Personagem personagem4 = new Personagem(60,"d", "Orc",1);




        guildas[0]= anao;
        guildas[1]= humn;
        guildas[2]= orczin;
        guildas[3]= trollzin;



        //Personagem personagem2 = new Personagem(15,"humano1","xxx",2);



        for (int i=0; i < guildas.length;i++){
            if(guildas[i] != null){
                if(guildas[i] instanceof Anao){
                    System.out.println("Esta posiçao contem um anao");
                    Anao anao = (Anao)guildas[i];
                    anao.mostraInfo();
                    anao.CastarSpell();
                    anao.Endurecer();
                    anao.ForTheAliance();
                    anao.InvadirHorda();
                }

                else if (guildas[i]instanceof Humano){
                    System.out.println("Esta posiçao contem um hunano");
                        Humano humano = (Humano) guildas[i];
                    humano.mostraInfo();
                    humano.getTamanhoDoCabelo();
                    humano.Motivar();
                    humano.SacarArma();
                    humano.InvadirHorda();
                    humano.ForTheAliance();

                }else if (guildas[i] instanceof Orc){
                    System.out.println("Esta posiçao contem um orc");
                   Orc orc = (Orc) guildas[i];
                    orc.mostraInfo();
                    orc.Enfurecer();
                    orc.ForTheHorde();
                    orc.InvadirAliança();
                    orc.getCorDaPele();
                    orc.SacarArma();

                } else {
                        System.out.println("Esta posiçao contem um troll");
                        Troll troll = (Troll) guildas[i];
                        troll.mostraInfo();
                        troll.CastarSpell();
                        troll.InvadirAliança();
                        troll.Regenerar();
                        troll.ForTheHorde();
                    }
            }
        }



    }
}
