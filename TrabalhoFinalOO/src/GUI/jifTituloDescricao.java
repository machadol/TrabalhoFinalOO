package GUI;

import javax.swing.JOptionPane;
import tratamento.DescricaoObrigatoriaNaoInformadaException;
import tratamento.TituloObrigatoriaNaoInformadaException;

public class jifTituloDescricao extends javax.swing.JInternalFrame
{
    private String titulo;
    private String descricao;

    public jifTituloDescricao()
    {
        initComponents();
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getDescricao()
    {
        return descricao;
    }
    
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

        setResizable(true);
        setTitle("Novo Questionário");

        quetionarioTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        quetionarioTitulo.setText("Título");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Descrição");

        ftaDescricao.setColumns(20);
        ftaDescricao.setLineWrap(true);
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
                .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCriar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setBounds(10, 10, 450, 265);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCriarActionPerformed
    {//GEN-HEADEREND:event_btnCriarActionPerformed
        try
        {
            verificaTituloDescricao();
            dispose();
        }
        catch(TituloObrigatoriaNaoInformadaException | DescricaoObrigatoriaNaoInformadaException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCriarActionPerformed
    
    private void verificaTituloDescricao()
    {
        if (jtfTitulo.getText().isEmpty())
        {
            throw new TituloObrigatoriaNaoInformadaException("Titulo não informado!");
        }
        else
        {
            this.titulo = jtfTitulo.getText();
        }
            
        if (ftaDescricao.getText().isEmpty())
        {
            throw new DescricaoObrigatoriaNaoInformadaException("Descrição não informado!");
        }
        else
        {
            this.descricao = ftaDescricao.getText();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JTextArea ftaDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfTitulo;
    private javax.swing.JLabel quetionarioTitulo;
    // End of variables declaration//GEN-END:variables
}
