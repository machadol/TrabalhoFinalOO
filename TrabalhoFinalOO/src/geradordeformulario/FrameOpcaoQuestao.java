/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeformulario;

import formulario.Questionario;

/**
 *
 * @author lucas
 */
public class FrameOpcaoQuestao extends javax.swing.JFrame
{
    Questionario q;

    /**
     * Creates new form FrameOpcaoQuestao
     */
    public FrameOpcaoQuestao()
    {
        this.q = new Questionario();
        initComponents();
        setResizable(false);
    }

    FrameOpcaoQuestao(Questionario q)
    {
        this.q = q;
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

        jLabel1 = new javax.swing.JLabel();
        btnSelectAberta = new javax.swing.JButton();
        btnSelectAlternativa = new javax.swing.JButton();
        btnSelectLista = new javax.swing.JButton();
        btnSelectOpcional = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Selecione o tipo de questão");

        btnSelectAberta.setText("Aberta");
        btnSelectAberta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectAbertaActionPerformed(evt);
            }
        });

        btnSelectAlternativa.setText("Alternativa");

        btnSelectLista.setText("Lista");
        btnSelectLista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectListaActionPerformed(evt);
            }
        });

        btnSelectOpcional.setText("Opcional");
        btnSelectOpcional.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSelectOpcionalActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFinalizar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSelectLista, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSelectAberta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSelectAlternativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSelectOpcional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectAberta)
                    .addComponent(btnSelectAlternativa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectLista)
                    .addComponent(btnSelectOpcional))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectAbertaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelectAbertaActionPerformed
    {//GEN-HEADEREND:event_btnSelectAbertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectAbertaActionPerformed

    private void btnSelectOpcionalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelectOpcionalActionPerformed
    {//GEN-HEADEREND:event_btnSelectOpcionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectOpcionalActionPerformed

    private void btnSelectListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSelectListaActionPerformed
    {//GEN-HEADEREND:event_btnSelectListaActionPerformed
        FrameLista obj = new FrameLista(q);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSelectListaActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFinalizarActionPerformed
    {//GEN-HEADEREND:event_btnFinalizarActionPerformed
        FrameQuestionario obj = new FrameQuestionario(q);
        obj.setVisible(true);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrameOpcaoQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrameOpcaoQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrameOpcaoQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrameOpcaoQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FrameOpcaoQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSelectAberta;
    private javax.swing.JButton btnSelectAlternativa;
    private javax.swing.JButton btnSelectLista;
    private javax.swing.JButton btnSelectOpcional;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
