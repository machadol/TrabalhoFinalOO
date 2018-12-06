package formulario;

public class Aberta extends Questao
{
    private boolean tamResposta; // TRUE = Longa False = Curta

    public boolean getTamResposta()
    {
        return tamResposta;
    }

    public void setTamResposta(boolean tamResposta)
    {
        this.tamResposta = tamResposta;
    }
}
