package GUI;

import formulario.Aberta;
import formulario.Alternativa;
import formulario.Lista;
import formulario.Opcional;
import formulario.Questionario;
import javax.swing.ButtonGroup;
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
    
    public jifQuestionario()
    {
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jpQuestionario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescricao = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTitulo = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Questionário");

        jpQuestionario.setAutoscrolls(true);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        jDescricao.setColumns(20);
        jDescricao.setLineWrap(true);
        jDescricao.setRows(100);
        jScrollPane1.setViewportView(jDescricao);

        jTitulo.setColumns(20);
        jTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo.setLineWrap(true);
        jTitulo.setRows(10);
        jScrollPane3.setViewportView(jTitulo);

        javax.swing.GroupLayout jpQuestionarioLayout = new javax.swing.GroupLayout(jpQuestionario);
        jpQuestionario.setLayout(jpQuestionarioLayout);
        jpQuestionarioLayout.setHorizontalGroup(
            jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpQuestionarioLayout.setVerticalGroup(
            jpQuestionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuestionarioLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        setBounds(150, 10, 675, 630);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTitulo;
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
        enun.setSize(300, 20);
        
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
        enun.setSize(300, 20);
        enun.setText(Integer.toString(numQuestao)+" - "+ a.getEnunciado());
                
        if(a.getTamResposta())
        {
            respLonga.setLocation(10, pos+20);
            respLonga.setSize(540,75);
            respLonga.setLineWrap(true);
            jPanel1.add(respLonga);
            pos+=95;
        }
        else
        {   
            respCurta.setLocation(10, pos+20);
            respCurta.setSize(540, 25);
            jPanel1.add(respCurta);
            pos+=45;            
        }
        
        jPanel1.add(enun);
        numQuestao+=1;
    }
    
    private void criaAlternativa(Alternativa al)
    {
        int qtdItem = 0;
        int posBox = pos;

        if (al.getExclusiva())
        {
            JLabel enun      = new JLabel();
            ButtonGroup boxGroup = new ButtonGroup();
            
            enun.setText(Integer.toString(numQuestao)+" - "+al.getEnunciado());
            enun.setLocation(10, pos);
            enun.setSize(300,40);
            enun.setVisible(true);
            jPanel1.add(enun);
            for (int i = 0; i < al.getItemList().size(); i++)
            {
                JRadioButton box = new JRadioButton();
                box.setText(al.getItemList().get(i).getTexto());
                box.setSize(100,40);
                box.setLocation(12, posBox+20);
                box.setVisible(true);
                boxGroup.add(box);
                jPanel1.add(box);
                posBox+=20;
                qtdItem+=1;
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
                JCheckBox box = new JCheckBox();
                box.setText(al.getItemList().get(i).getTexto());
                box.setSize(100,40);
                box.setLocation(12, posBox+20);
                box.setVisible(true);
                jPanel1.add(box);
                posBox+=20;
                qtdItem+=1;
            }
            numQuestao+=1;
        }

        pos+=80+(qtdItem*2);
    }
    
    private void criaOpcional(Opcional op)
    {
        JLabel enun   = new JLabel();
        JCheckBox box = new JCheckBox();

        enun.setText(Integer.toString(numQuestao)+" - "+op.getEnunciado());
        enun.setLocation(10, pos);
        enun.setSize(100,40);
        enun.setVisible(true);

        box.setText(op.getItem());
        box.setSize(100,40);
        box.setLocation(12, pos+20);
        box.setVisible(true);
        
        jPanel1.add(enun);
        jPanel1.add(box);
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
            else if (questionario.getArrayListQ().get(i) instanceof Alternativa)
            {
                criaAlternativa((Alternativa) questionario.getArrayListQ().get(i));
            }
            else if (questionario.getArrayListQ().get(i) instanceof Opcional)
            {
                criaOpcional((Opcional) questionario.getArrayListQ().get(i));
            }
        }
    }
}
