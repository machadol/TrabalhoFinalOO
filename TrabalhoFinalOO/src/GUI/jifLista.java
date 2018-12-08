package GUI;

import formulario.Item;
import formulario.Lista;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tratamento.EnunciadoException;

public class jifLista extends javax.swing.JInternalFrame
{
    private int pos = 5;
    private int numIndice = 1;

    JTextField enunItem;
    
    private Lista lista = new Lista();
    private ArrayList<Item> itens = new ArrayList<>();
    private String enunciado;

    public ArrayList<Item> getItens()
    {
        return itens;
    }

    public String getEnunciado()
    {
        return enunciado;
    }

    public Lista getLista()
    {
        return lista;
    }

    public jifLista()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        labelEnunciado = new javax.swing.JLabel();
        jtfEnunciado = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpItens = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Questão Lista");

        labelEnunciado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelEnunciado.setText("Enunciado");

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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        jpItens.setAutoscrolls(true);

        javax.swing.GroupLayout jpItensLayout = new javax.swing.GroupLayout(jpItens);
        jpItens.setLayout(jpItensLayout);
        jpItensLayout.setHorizontalGroup(
            jpItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        jpItensLayout.setVerticalGroup(
            jpItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jpItens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEnunciado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEnunciado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEnunciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        setBounds(500, 10, 400, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddItemActionPerformed
    {//GEN-HEADEREND:event_btnAddItemActionPerformed
        try
        {
            verificaEnunciado();
            if(enunItem != null)
            {
                Item i = new Item();
                i.setTexto(enunItem.getText());
                itens.add(i);       
            }
            addItem();
        }
        catch(EnunciadoException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvarActionPerformed
    {//GEN-HEADEREND:event_btnSalvarActionPerformed
        try
        {
            verificaEnunciado();
            if(enunItem != null)
            {
                Item i = new Item();
                i.setTexto(enunItem.getText());
                itens.add(i);       
            }
            lista.setItemList(itens);
            dispose();
        }
        catch(EnunciadoException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void addItem()
    {
        JLabel indice = new JLabel();
        enunItem      = new JTextField();
        
        indice.setText(Integer.toString(numIndice));
        indice.setSize(100,25);
        indice.setLocation(12, pos);
        indice.setVisible(true);

        enunItem.setSize(200,25);
        enunItem.setLocation(35, pos);
        enunItem.setVisible(true);
        
        jpItens.add(enunItem);
        jpItens.repaint();

        jpItens.add(indice);
        jpItens.repaint();

        numIndice += 1;
        pos += 30;
    }
    
    
    private void verificaEnunciado()
    {
        if (jtfEnunciado.getText().isEmpty())
        {
            throw new EnunciadoException("Enunciado não informado!");
        }
        else
        {
            lista.setEnunciado(jtfEnunciado.getText());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpItens;
    private javax.swing.JTextField jtfEnunciado;
    private javax.swing.JLabel labelEnunciado;
    // End of variables declaration//GEN-END:variables
}
