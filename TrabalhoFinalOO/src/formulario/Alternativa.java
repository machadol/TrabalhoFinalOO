package formulario;

import java.util.ArrayList;

public class Alternativa extends Questao
{
    private boolean exclusiva; // TRUE = exclusiva FALSE = não exclusiva
    ArrayList <Item> itemList = new ArrayList <>();

    public ArrayList<Item> getItemList()
    {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList)
    {
        this.itemList = itemList;
    }

    public boolean getExclusiva()
    {
        return exclusiva;
    }

    public void setExclusiva(boolean exclusiva)
    {
        this.exclusiva = exclusiva;
    }
    
}
