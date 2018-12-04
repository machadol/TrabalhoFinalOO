package formulario;

import java.util.ArrayList;

public class Lista extends Questao
{   
    ArrayList <Item> itemList = new ArrayList <>();

    public ArrayList<Item> getItemList()
    {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList)
    {
        this.itemList = itemList;
    }
    
    public void InsereItem( String texto)
    {
        Item i;
        i = new Item();
        
        i.setTexto(texto);
      
        itemList.add(i);
    }    
}
