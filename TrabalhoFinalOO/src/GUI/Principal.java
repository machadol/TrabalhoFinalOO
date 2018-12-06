package GUI;

import formulario.Lista;
import formulario.Questao;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame
{
//    Questionario q;
    ArrayList<Questao> questoes= new ArrayList<>();
    
    Lista lista = new Lista();
    
    jifTituloDescricao objTD;
    jifQuestionario objQ;
    jifLista objLista;

    public Principal()
    {
        initComponents();
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuNovoQuestionario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jInserirQuestao = new javax.swing.JMenu();
        jAlternativa = new javax.swing.JMenuItem();
        jAberta = new javax.swing.JMenuItem();
        jLista = new javax.swing.JMenuItem();
        jOpcional = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuVisualizarQuestionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Questionário");

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenu.setText("Menu");

        jMenuNovoQuestionario.setText("Novo Questionário");
        jMenuNovoQuestionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuNovoQuestionarioActionPerformed(evt);
            }
        });
        jMenu.add(jMenuNovoQuestionario);
        jMenu.add(jSeparator1);

        jInserirQuestao.setText("Inserir Questões");

        jAlternativa.setText("Aberta");
        jInserirQuestao.add(jAlternativa);

        jAberta.setText("Alternativa");
        jAberta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jAbertaActionPerformed(evt);
            }
        });
        jInserirQuestao.add(jAberta);

        jLista.setText("Lista");
        jLista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jListaActionPerformed(evt);
            }
        });
        jInserirQuestao.add(jLista);

        jOpcional.setText("Opcional");
        jOpcional.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jOpcionalActionPerformed(evt);
            }
        });
        jInserirQuestao.add(jOpcional);

        jMenu.add(jInserirQuestao);
        jMenu.add(jSeparator2);

        jMenuVisualizarQuestionario.setText("Visualizar Questionário");
        jMenuVisualizarQuestionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuVisualizarQuestionarioActionPerformed(evt);
            }
        });
        jMenu.add(jMenuVisualizarQuestionario);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(890, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuNovoQuestionarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuNovoQuestionarioActionPerformed
    {//GEN-HEADEREND:event_jMenuNovoQuestionarioActionPerformed
        objTD = new jifTituloDescricao();
        jdpPrincipal.add(objTD);
        objTD.setVisible(true);
    }//GEN-LAST:event_jMenuNovoQuestionarioActionPerformed

    private void jMenuVisualizarQuestionarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuVisualizarQuestionarioActionPerformed
    {//GEN-HEADEREND:event_jMenuVisualizarQuestionarioActionPerformed
        objQ = new jifQuestionario();
        jdpPrincipal.add(objQ);
        objQ.recebeTituloDescricao(objTD.getTitulo(), objTD.getDescricao());
        objQ.criaLista(objLista.getLista());
        objQ.criaLista(lista);
        objQ.setVisible(true);        
    }//GEN-LAST:event_jMenuVisualizarQuestionarioActionPerformed

    private void jListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jListaActionPerformed
    {//GEN-HEADEREND:event_jListaActionPerformed
        objLista = new jifLista();
        jdpPrincipal.add(objLista);
        objLista.setVisible(true);
        this.lista = objLista.getLista();
    }//GEN-LAST:event_jListaActionPerformed
    
    private void jOpcionalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jOpcionalActionPerformed
    {//GEN-HEADEREND:event_jOpcionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpcionalActionPerformed

    private void jAbertaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jAbertaActionPerformed
    {//GEN-HEADEREND:event_jAbertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAbertaActionPerformed
    
    private void salvaQuestaoLista()
    {
        
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAberta;
    private javax.swing.JMenuItem jAlternativa;
    private javax.swing.JMenu jInserirQuestao;
    private javax.swing.JMenuItem jLista;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuNovoQuestionario;
    private javax.swing.JMenuItem jMenuVisualizarQuestionario;
    private javax.swing.JMenuItem jOpcional;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
