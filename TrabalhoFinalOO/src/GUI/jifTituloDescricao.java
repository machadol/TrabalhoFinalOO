/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


/**
 *
 * @author lucas
 */
public class jifTituloDescricao extends javax.swing.JInternalFrame
{
    Principal principal = new Principal();
    private String titulo;

     /**
     * Creates new form jifQuestionario
     */
    public jifTituloDescricao()
    {
        initComponents();
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        quetionarioTitulo = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ftaDescricao = new javax.swing.JTextArea();
        btnCriar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Novo Questionário");

        quetionarioTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        quetionarioTitulo.setText("Título");

        jtfTitulo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtfTituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Descrição");

        ftaDescricao.setColumns(20);
        ftaDescricao.setRows(5);
        jScrollPane1.setViewportView(ftaDescricao);

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quetionarioTitulo)
                            .addComponent(jLabel1))
                        .addGap(0, 324, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jtfTitulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCriar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quetionarioTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCriar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setBounds(50, 50, 455, 265);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jtfTituloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtfTituloActionPerformed
    {//GEN-HEADEREND:event_jtfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTituloActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCriarActionPerformed
    {//GEN-HEADEREND:event_btnCriarActionPerformed
        principal.enviaTitulo(jtfTitulo.getText());
        this.titulo = jtfTitulo.getText();
        System.out.println(jtfTitulo.getText());
        dispose();
    }//GEN-LAST:event_btnCriarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JTextArea ftaDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfTitulo;
    private javax.swing.JLabel quetionarioTitulo;
    // End of variables declaration//GEN-END:variables
}