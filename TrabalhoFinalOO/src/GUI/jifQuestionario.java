package GUI;

import formulario.Aberta;
import formulario.Alternativa;
import formulario.Lista;
import formulario.Questionario;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class jifQuestionario extends javax.swing.JInternalFrame
{
    Questionario questionario = new Questionario();
    private int numQuestao = 1;
    
    private int pos = 10;
    private int posBox = 10;
    
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Questionário");

        jpQuestionario.setAutoscrolls(true);

        jTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTitulo.setText("sada");

        jDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jDescricao.setText("assssssssssss");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout jpQuestionarioLayout = new javax.swing.GroupLayout(jpQuestionario);
        jpQuestionario.setLayout(jpQuestionarioLayout);
        jpQuestionarioLayout.setHorizontalGroup(
            jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuestionarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpQuestionarioLayout.createSequentialGroup()
                        .addComponent(jDescricao)
                        .addContainerGap(488, Short.MAX_VALUE))
                    .addGroup(jpQuestionarioLayout.createSequentialGroup()
                        .addComponent(jTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jpQuestionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpQuestionarioLayout.setVerticalGroup(
            jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuestionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        setBounds(150, 10, 611, 550);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
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
        
        enun.setText(Integer.toString(numQuestao)+" - "+l.getEnunciado());
        enun.setLocation(10, pos);
        enun.setSize(100, 20);
        
        cbLista.setLocation(10, pos+20);
        cbLista.setSize(250, 30);
        cbLista.removeAllItems();
        
        for(int i = 0; i < l.getItemList().size(); i++)
        {
            cbLista.addItem(l.getItemList().get(i).getTexto());
        }
        
        enun.setVisible(true);
        cbLista.setVisible(true);
        jPanel1.add(cbLista);
        jPanel1.add(enun);
        numQuestao+=1;
        pos+=50;
    }
    
    private void criaAberta(Aberta a)
    {
        JLabel enun =  new JLabel();
        JTextArea  respLonga = new JTextArea();
        JTextField respCurta = new JTextField();
        
        enun.setLocation(10, pos);
        enun.setSize(100, 20);
        enun.setText(Integer.toString(numQuestao)+" - "+ a.getEnunciado());
                
        if(a.getTamResposta())
        {
            respLonga.setLocation(10, pos);
            respLonga.setSize(540,75);
            respLonga.setLineWrap(true);
            jPanel1.add(respLonga);
            pos+=95;
        }
        else
        {   
            respCurta.setLocation(10, pos);
            respCurta.setSize(540, 25);
            jPanel1.add(respCurta);
            pos+=45;            
        }
        
        jPanel1.add(enun);
        numQuestao+=1;
    }
    
    private void criaAlternativa(Alternativa al)
    {
        if (!al.getExclusiva())
        {
            JLabel enun   = new JLabel();
            enun.setText(Integer.toString(numQuestao)+" - "+al.getEnunciado());
            enun.setLocation(10, pos);
            enun.setSize(100,40);
            enun.setVisible(true);
            jPanel1.add(enun);
            for (int i = 0; i < al.getItemList().size(); i++)
            {
                JCheckBox box = new JCheckBox();
                box.setText(al.getItemList().get(i).getTexto());
                box.setSize(100,40);
                box.setLocation(12, posBox+20);
                box.setVisible(true);
                jPanel1.add(box);
                posBox+=20;
            }
            numQuestao+=1;
        }
        else
        {
            JLabel enun   = new JLabel();
            enun.setText(Integer.toString(numQuestao)+" - "+al.getEnunciado());
            enun.setLocation(10, pos);
            enun.setSize(100,40);
            enun.setVisible(true);
            jPanel1.add(enun);
            for (int i = 0; i < al.getItemList().size(); i++)
            {
                JRadioButton box = new JRadioButton();
                box.setText(al.getItemList().get(i).getTexto());
                box.setSize(100,40);
                box.setLocation(12, posBox+20);
                box.setVisible(true);
                jPanel1.add(box);
                posBox+=20;
            }
            numQuestao+=1;
        }

        pos+=posBox;
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
            else if (questionario.getArrayListQ().get(i) instanceof Alternativa)
            {
                criaAlternativa((Alternativa) questionario.getArrayListQ().get(i));
            }
        }
    }
}
