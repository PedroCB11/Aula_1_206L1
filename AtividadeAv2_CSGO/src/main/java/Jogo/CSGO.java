package Jogo;

public abstract class CSGO implements Comparable <CSGO>{

    protected String players;
    protected double precos;

    public CSGO (String players, double preco){
        this.players = players;
        this.precos = preco;
    }

    public double getPrecos() {
        return precos;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public void setPrecos(double precos) {
        this.precos = precos;
    }

    @Override
    public int compareTo(CSGO c)
    {
        if(this.precos < c.getPrecos()){
            return 1;
        }
        if(this.precos > c.getPrecos()){
            return -1;
        }
        return 0;
    }




}
