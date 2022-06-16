package br.inatel.cdg;

public class Jogador implements Comparable{
    private static String nick;
    private static long tempogasto;


    public String getNome() {
        return nick;
    }

    public void setNome(String nick) {
        this.nick = nick;
    }

    public long getTempogasto() {
        return tempogasto;
    }

    public void setTempogasto(long tempogasto) {
        this.tempogasto = tempogasto;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
