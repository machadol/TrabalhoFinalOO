package GUI;

import formulario.Aberta;

public class jifAberta extends javax.swing.JInternalFrame
{
    private Aberta aberta = new Aberta();
    private boolean tamResposta;
    private String enunciado;

    public boolean getTamResposta()
    {
        return tamResposta;
    }

    public void setTamResposta(boolean tamResposta)
    {
        this.tamResposta = tamResposta;
    }

    public String getEnunciado()
    {
        return enunciado;
    }

    public void setEnunciado(String enunciado)
    {
        this.enunciado = enunciado;
    }

    public Aberta getAberta()
    {
        return aberta;
    }

    public void setAberta(Aberta aberta)
    {
        this.aberta = aberta;
    }
    
    public jifAberta()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtfEnunciado = new javax.swing.JTextField();
        btnCurta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLonga = new javax.swing.JButton();

        setTitle("Questão Aberta");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Enunciado");

        jtfEnunciado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtfEnunciadoActionPerformed(evt);
            }
        });

        btnCurta.setText("Curta");
        btnCurta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCurtaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione o tamanho da resposta da questão aberta");

        btnLonga.setText("Longa");
        btnLonga.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLongaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfEnunciado))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnCurta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnLonga, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLonga)
                    .addComponent(btnCurta))
                .addGap(67, 67, 67))
        );

        setBounds(10, 285, 450, 274);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEnunciadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtfEnunciadoActionPerformed
    {//GEN-HEADEREND:event_jtfEnunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnunciadoActionPerformed

    private void btnCurtaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCurtaActionPerformed
    {//GEN-HEADEREND:event_btnCurtaActionPerformed
        setTamResposta(false);
        setEnunciado(jtfEnunciado.getText());
        aberta.setTamResposta(tamResposta);
        aberta.setEnunciado(enunciado);
        setAberta(aberta);
        dispose();
    }//GEN-LAST:event_btnCurtaActionPerformed

    private void btnLongaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLongaActionPerformed
    {//GEN-HEADEREND:event_btnLongaActionPerformed
        setTamResposta(true);
        setEnunciado(jtfEnunciado.getText());
        aberta.setTamResposta(tamResposta);
        aberta.setEnunciado(enunciado);
        setAberta(aberta);
        dispose();
    }//GEN-LAST:event_btnLongaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurta;
    private javax.swing.JButton btnLonga;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jtfEnunciado;
    // End of variables declaration//GEN-END:variables
}
