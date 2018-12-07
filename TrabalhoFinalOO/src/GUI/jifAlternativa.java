package GUI;

import formulario.Alternativa;
import formulario.Item;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tratamento.EnunciadoException;
import tratamento.TituloException;

public class jifAlternativa extends javax.swing.JInternalFrame
{
    private int pos = 120;
    private int numIndice = 1;

    JTextField enunItem;
    
    private Alternativa alternativa = new Alternativa();
    private boolean exclusiva;
    private String enunciado;
    private ArrayList<Item> itens = new ArrayList<>();

    public Alternativa getAlternativa()
    {
        return alternativa;
    }

    public void setAlternativa(Alternativa alternativa)
    {
        this.alternativa = alternativa;
    }

    public boolean getExclusiva()
    {
        return exclusiva;
    }

    public void setExclusiva(boolean exclusiva)
    {
        this.exclusiva = exclusiva;
    }

    public String getEnunciado()
    {
        return enunciado;
    }

    public void setEnunciado(String enunciado)
    {
        this.enunciado = enunciado;
    }



    public jifAlternativa()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jtfEnunciado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnExclusiva = new javax.swing.JButton();
        btnNExclusiva = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setTitle("Questão Alternativa");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Enunciado");

        jtfEnunciado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jtfEnunciadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione o tipo de alternativa:");

        btnExclusiva.setText("Exclusiva");
        btnExclusiva.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExclusivaActionPerformed(evt);
            }
        });

        btnNExclusiva.setText("Não Exclusiva");
        btnNExclusiva.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNExclusivaActionPerformed(evt);
            }
        });

        btnAddItem.setText("Adicionar Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddItemActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEnunciado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExclusiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNExclusiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExclusiva))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnAddItem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnNExclusiva)))
                .addContainerGap(382, Short.MAX_VALUE))
        );

        setBounds(500, 10, 400, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEnunciadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jtfEnunciadoActionPerformed
    {//GEN-HEADEREND:event_jtfEnunciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnunciadoActionPerformed

    private void btnExclusivaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExclusivaActionPerformed
    {//GEN-HEADEREND:event_btnExclusivaActionPerformed
        setExclusiva(true);
    }//GEN-LAST:event_btnExclusivaActionPerformed

    private void btnNExclusivaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNExclusivaActionPerformed
    {//GEN-HEADEREND:event_btnNExclusivaActionPerformed
        setExclusiva(false);
    }//GEN-LAST:event_btnNExclusivaActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddItemActionPerformed
    {//GEN-HEADEREND:event_btnAddItemActionPerformed
        if(numIndice == 1)
        {
           this.enunciado = jtfEnunciado.getText();
        }

        if(enunItem != null)
        {
            Item i = new Item();
            i.setTexto(enunItem.getText());
            itens.add(i);       
        }
        addLabel();
        addTextField();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvarActionPerformed
    {//GEN-HEADEREND:event_btnSalvarActionPerformed
      if(enunItem != null)
        {
            Item i = new Item();
            i.setTexto(enunItem.getText());
            itens.add(i);       
        }
        alternativa.setItemList(itens);
        alternativa.setEnunciado(enunciado);
        alternativa.setExclusiva(exclusiva);
       try
        {
            this.enunciado = jtfEnunciado.getText();
            EnunciadoException a = new EnunciadoException();
            a.tratarenunciado(jtfEnunciado.getText().isEmpty());
            dispose();
        }
        catch(EnunciadoException ad)
        {
            JOptionPane.showMessageDialog(null, "Enunciado não informado!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void addLabel()
    {
        pos += 25;
        JLabel indice = new JLabel();
        indice.setText(Integer.toString(numIndice));
        indice.setSize(100,40);
        indice.setLocation(12, pos);
        numIndice += 1;
        getContentPane().add(indice);
        indice.setVisible(true);
        initComponents();        
    }
    
    private void addTextField()
    {
        pos += 9;
        enunItem = new JTextField();
        enunItem.setSize(200,25);
        enunItem.setLocation(35, pos);
        getContentPane().add(enunItem);
        enunItem.setVisible(true);
        initComponents();
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnExclusiva;
    private javax.swing.JButton btnNExclusiva;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jtfEnunciado;
    // End of variables declaration//GEN-END:variables
}
