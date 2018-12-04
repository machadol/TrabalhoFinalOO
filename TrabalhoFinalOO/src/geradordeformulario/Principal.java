package geradordeformulario;

import formulario.Lista;
import formulario.Questionario;

public class Principal
{
    public static void main(String[] args)
    {
        Questionario q;
        q = new Questionario();
        
        Lista l = q.CriarQuestaoLista("Qual a sua cidade?");
        
        q.InsereItemLista(l, 'a', "Ceilândia");
        q.InsereItemLista(l, 'b', "Taguatinga");
        q.InsereItemLista(l, 'c', "Gama");
        
        q.ImprimeLista(l);
        q.SalvaLista(l);
        
    }
}
