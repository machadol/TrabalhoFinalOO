
package tratamento;

public class EnunciadoException extends Exception
{
    public void tratarenunciado(String Enunciado)throws EnunciadoException {
        
       if(Enunciado == null){
           throw new EnunciadoException();
       }else{
           //System.out.println("concluido"); 
       }
   }
}
