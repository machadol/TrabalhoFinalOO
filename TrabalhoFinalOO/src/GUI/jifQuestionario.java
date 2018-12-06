package GUI;

import formulario.Lista;
import formulario.Questionario;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class jifQuestionario extends javax.swing.JInternalFrame
{
    Questionario q = new Questionario();
    
    private int pos = 80;
    
    public jifQuestionario()
    {
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jDescricao = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Questionário");

        jTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTitulo.setText("asdfg");

        jDescricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jDescricao.setText("asdfg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDescricao)
                    .addComponent(jTitulo))
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(150, 10, 590, 299);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables

    public void recebeTituloDescricao(String titulo, String Descricao)
    {
        q.setTitulo(titulo);
        q.setDescricao(Descricao);
        jTitulo.setText(titulo);
        jDescricao.setText(Descricao);
    }
        
    public void criaLista(Lista l)
    {
        JComboBox cbLista = new JComboBox();
        JLabel    enun    =  new JLabel();
        
        enun.setLocation(20, pos - 20);
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
        jPanel1.add(cbLista);
        jPanel1.add(enun);
    }
}
