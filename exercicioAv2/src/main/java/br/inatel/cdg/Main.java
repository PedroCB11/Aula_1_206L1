package br.inatel.cdg;

import br.inatel.cdg.AmongUs.*;

public class Main {
	public static void main(String[] args) {

		Astronauta jogadores[] = new Astronauta[10];

		Tripulante jogador1 = new Tripulante("Verde","Luva de Pedreiro");
		Impostor jogador2 = new Impostor("Azul","Pedro");

		Pet pet1 = new Pet("macaquinho");
		Pet pet2 = new Pet("girafinha");
		Skin skin1 = new Skin("Jedi");
		Skin skin2 = new Skin("Jarjar");

		jogador1.pet = pet1;
		jogador1.skin = skin1;

		jogador2.pet = pet2;
		jogador2.skin = skin2;

		jogadores[0] = jogador1;
		jogadores[1] = jogador2;

		for (int i = 0; i < 10; i++){
			if(jogadores[i]!=null)
			{
			 if (jogadores[i] instanceof Tripulante t){
                 System.out.println((i+1)+"o Jogador é um Tripulante.");
                 t.mostraInfo();
                 t.fazerMissao();
                 t.verCameras();
                 t.reparar();
                 t.reportar();
				 System.out.println("");

             } else{
                 Impostor sus = (Impostor) jogadores[i];
                 System.out.println((i+1)+"o Jogador é um Tripulante.");
                 sus.mostraInfo();
                 sus.fazerMissao();
                 sus.executar();
				 sus.sabotarComunicacao();
				 sus.sabotarLuz();
				 sus.sabotarOxigenio();
				 sus.sabotarReator();
				 sus.trancarPortas("Elétrica");
				 sus.usarVentoinha();
                 sus.reparar();
                 sus.reportar();
				 System.out.println("");
             }

			}

		}





	}
}
