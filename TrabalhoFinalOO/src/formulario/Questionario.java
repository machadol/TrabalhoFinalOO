package formulario;

import java.util.ArrayList;

public class Questionario
{
    private String titulo;
    private String descricao;
    private ArrayList <Questao> q = new ArrayList<>();

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    // Lista
    
    public Lista CriarQuestaoLista(String enun)
    {
        Lista l;
        l = new Lista();
        l.setEnunciado(enun);
        return l;
    }
    
    public void InsereItemLista(Lista l, char letra, String txt)
    {
        l.InsereItem(letra, txt);
    }
    
    public void ImprimeLista(Lista l)
    {   
        System.out.println(l.getEnunciado());
        
        for (int i = 0; i< l.itemList.size(); i++)
        {   
            System.out.println(l.itemList.get(i).getTexto());
        }
    }
    
    public void SalvaLista(Lista l)
    {
        q.add(l);
    }
    
    // alternativa
    
    public Alternativa CriarQuestaoAlternativa(String enun)
    {
        Alternativa a;
        a = new Alternativa();
        a.setEnunciado(enun);
        return a;
    }
    
    public void InsereItemAlternativa(Lista a, char letra, String txt)
    {
        a.InsereItem(letra, txt);
    }
    
    public void ImprimeAlternativa(Lista a)
    {   
        System.out.println(a.getEnunciado());
        
        for (int i = 0; i< a.itemList.size(); i++)
        {   
            System.out.println(a.itemList.get(i).getTexto());
        }
    }
    
    public void SalvaAlternativa(Alternativa a)
    {
        q.add(a);
    }
    
    //Opcional
    
    public Opcional CriarQuestaoOpcional(String enun)
    {
        Opcional o;
        o = new Opcional();
        o.setEnunciado(enun);
        return o;
    }
    
    public void InsereItemOpcional(Lista o, char letra, String txt)
    {
        o.InsereItem(letra, txt);
    }
    
    public void ImprimeOpcional(Lista o)
    {   
        System.out.println(o.getEnunciado());
        
        for (int i = 0; i< o.itemList.size(); i++)
        {   
            System.out.println(o.itemList.get(i).getTexto());
        }
    }
    
    public void SalvaOpcional(Opcional o)
    {
        q.add(o);
    }
    
    
    //Aberta
    
    public Aberta CriarQuestaoAberta(String enun)
    {
        Aberta ab;
        ab = new Aberta();
        ab.setEnunciado(enun);
        return ab;
    }
    
    
    public void ImprimeAberta(Lista ab)
    {   
        System.out.println(ab.getEnunciado());
        
        for (int i = 0; i< ab.itemList.size(); i++)
        {   
            System.out.println(ab.itemList.get(i).getTexto());
        }
    }
    
    public void SalvaAberta(Aberta ab)
    {
        q.add(ab);
    }
    
    // mostra todos os objetos que estão na lista (erro)
    
    public void ImprimirQuestoes()
    {   
        for(int i = 0; i < q.size(); i++)
        {
            System.out.println(q.get(i).getEnunciado());
            System.out.println(q.get(i));
        }
    }
}   
