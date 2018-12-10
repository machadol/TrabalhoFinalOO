package formulario;

public class Opcional extends Questao
{
    private Item item = new Item();

    public String getItem()
    {
        return item.getTexto();
    }

    public void setItem(String Item)
    {
        item.setTexto(Item);
    }
}
