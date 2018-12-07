
package tratamento;


public class DescricaoException extends Exception
{
    public void tratardescricao(boolean Descricao)throws DescricaoException 
    {
        
       if(Descricao)
       {
           throw new DescricaoException();
       }
   }
}
