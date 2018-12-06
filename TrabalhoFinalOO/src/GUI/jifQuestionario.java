package GUI;

import formulario.Aberta;
import formulario.Lista;
import formulario.Questionario;
import javax.swing.BoundedRangeModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class jifQuestionario extends javax.swing.JInternalFrame
{
    Questionario questionario = new Questionario();
    private int numQuestao = 1;
    
    private int pos = 80;
    
    public jifQuestionario()
    {
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jpQuestionario = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jDescricao = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Questionário");

        jTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTitulo.setText("sada");

        jDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jDescricao.setText("assssssssssss");

        javax.swing.GroupLayout jpQuestionarioLayout = new javax.swing.GroupLayout(jpQuestionario);
        jpQuestionario.setLayout(jpQuestionarioLayout);
        jpQuestionarioLayout.setHorizontalGroup(
            jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuestionarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDescricao)
                    .addComponent(jTitulo))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jpQuestionarioLayout.setVerticalGroup(
            jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuestionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDescricao)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpQuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpQuestionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(150, 10, 590, 299);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jDescricao;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JPanel jpQuestionario;
    // End of variables declaration//GEN-END:variables
    
    private void criaTituloDescricao()
    {
        jTitulo.setText(questionario.getTitulo());
        jDescricao.setText(questionario.getDescricao());
        
    }
    
    private void criaLista(Lista l)
    {
        JComboBox cbLista = new JComboBox();
        JLabel    enun    =  new JLabel();
        JLabel    numQ    =  new JLabel();
        
        numQ.setLocation(20, pos - 20);
        numQ.setSize(100, 20);
        numQ.setText(Integer.toString(numQuestao)+"-");
        enun.setLocation(35, pos - 20);
        enun.setSize(100, 20);
        enun.setText(l.getEnunciado());
        
        cbLista.setLocation(20, pos);
        cbLista.setSize(250, 30);
        cbLista.removeAllItems();
        
        for(int i = 0; i < l.getItemList().size(); i++)
        {
            cbLista.addItem(l.getItemList().get(i).getTexto());
        }
        
        enun.setVisible(true);
        cbLista.setVisible(true);
        jpQuestionario.add(cbLista);
        jpQuestionario.add(enun);
        jpQuestionario.add(numQ);
        numQuestao+=1;
        pos+=50;
    }
    public void criaAberta(Aberta a)
    {
        JLabel numQ =  new JLabel();
        JLabel enun =  new JLabel();
        JTextArea  respLonga = new JTextArea();
        JTextField respCurta = new JTextField();
        
        numQ.setLocation(20, pos - 20);
        numQ.setSize(100, 20);
        numQ.setText(Integer.toString(numQuestao)+"-");
        
        enun.setLocation(35, pos - 20);
        enun.setSize(100, 20);
        enun.setText(a.getEnunciado());
        
        if(a.getTamResposta())
        {
            respLonga.setLocation(20, pos);
            respLonga.setSize(540,75);
            respLonga.setLineWrap(true);
            jpQuestionario.add(respLonga);
            pos+=95;
        }
        else
        {   
            respCurta.setLocation(20, pos);
            respCurta.setSize(540, 25);
            jpQuestionario.add(respCurta);
            pos+=45;            
        }
        
        jpQuestionario.add(enun);
        jpQuestionario.add(numQ);
        numQuestao+=1;
    }
    
    public void visualizaQuestionario(Questionario q)
    {        
        questionario.setArrayListQ(q.getArrayListQ());
        questionario.setTitulo(q.getTitulo());
        questionario.setDescricao(q.getDescricao());
        
        criaTituloDescricao();
        for (int i = 0; i < questionario.getArrayListQ().size(); i++)
        {
            if (questionario.getArrayListQ().get(i) instanceof Lista)
            {
                criaLista((Lista) questionario.getArrayListQ().get(i));               
            }
            else if (questionario.getArrayListQ().get(i) instanceof Aberta)
            {
                criaAberta((Aberta) questionario.getArrayListQ().get(i));
            }
        }
    }
}
