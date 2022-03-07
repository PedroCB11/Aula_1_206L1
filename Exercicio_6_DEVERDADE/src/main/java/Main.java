public class Main {
    public static void main(String[] args) {

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "JUBINEUSONkart1";
        kart2.nome = "JANIEREkart2";

      kart1.motor.cilindradas = "150";
      kart1.motor.velocidadeMaxima = 95.20f;

      kart2.motor.cilindradas = "100";
      kart2.motor.velocidadeMaxima = 69.69f;

      Piloto piloto1 = new Piloto();
      Piloto piloto2 = new Piloto();

      piloto1.nome = "Piloto1";
      piloto2.nome = "Piloto2";

      kart1.piloto = piloto1;
      kart2.piloto = piloto2;

      piloto1.soltaSuperPoder();
      piloto2.soltaSuperPoder();

      kart1.fazerDrift();
      kart1.motor.mostraInfo();
      kart2.fazerDrift();
      kart2.motor.mostraInfo();


    }
}
