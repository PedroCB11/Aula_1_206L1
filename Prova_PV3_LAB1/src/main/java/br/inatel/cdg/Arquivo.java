package br.inatel.cdg;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public static void escrever(Pedido pedido, boolean flag){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {

            os = new FileOutputStream("Arquivo.txt",flag);//true escreve embaixo / false sobreescreve oq tem no arquivo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Pedido");
            bw.newLine();
            bw.write(pedido.tipoMadeira + "\n");
            bw.write(pedido.precoProducao + "\n");
            bw.write(pedido.precoVenda + "\n");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try{
                bw.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }



    }

    public static ArrayList<Pedido> ler(){

        ArrayList<Pedido> pedidos = new ArrayList<>();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try {
            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            linhaLer = br.readLine();

            while (linhaLer != null){
                if(linhaLer.contains("Pedido")){
                    Pedido p = new Pedido();
                    p.tipoMadeira = br.readLine();
                    p.precoProducao = Integer.parseInt(br.readLine());
                    p.precoVenda = Integer.parseInt(br.readLine());
                    pedidos.add(p);
                }
                linhaLer = br.readLine();
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        return pedidos;
    }
}
