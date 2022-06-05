package br.inatel.cdg.classes;

import br.inatel.cdg.Nome_IgualException;
import br.inatel.cdg.Sem_NotaException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fetin
{
    private float nota;
    private String projeto;

    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public String getProjeto() {
        return projeto;
    }
    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
    List<String> Nome = new ArrayList<>();


    Map<String, Float> map = new HashMap<String, Float>();



    public void map (String nome, float nota) throws Nome_IgualException, Sem_NotaException
    {
        if (nota > 60)
        {
            map.put(nome, nota);
        }
        else
            throw new Sem_NotaException("Sem nota pra passar");
    }

    public void Nome(String nome) throws Nome_IgualException
    {

        if (!Nome.contains(nome))
        {
            Nome.add(nome);
        }
        else
            throw new Nome_IgualException("Mais de um projeto com o mesmo nome");
    }

    public void mostraInfo()
    {
        map.forEach((nome, nota)->
        {
            System.out.println("Projeto: "+ nome);
            System.out.println("Nota: "+ nota);
        });
    }




}