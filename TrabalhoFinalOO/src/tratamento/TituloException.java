package tratamento;

public class TituloException extends Exception
{
    public void tratartitulo(boolean Titulo)throws TituloException 
    {
       if(Titulo)
       {
           throw new TituloException();
       }
    }
}
