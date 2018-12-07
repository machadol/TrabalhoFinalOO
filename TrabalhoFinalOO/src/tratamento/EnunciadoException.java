
package tratamento;

public class EnunciadoException extends Exception
{
    public void tratarenunciado(boolean Enunciado)throws EnunciadoException {
        
       if(Enunciado){
           throw new EnunciadoException();
       }else{
           //System.out.println("concluido"); 
       }
   }
}
