package GUI;

import formulario.Item;
import formulario.Lista;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class jifLista extends javax.swing.JInternalFrame
{
    private int pos = 75;
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
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(btnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap())
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
                .addContainerGap(437, Short.MAX_VALUE))
        );

        setBounds(470, 10, 400, 560);
    }// </editor-fold>//GEN-END:initComponents

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
        lista.setItemList(itens);
        lista.setEnunciado(enunciado);
        dispose();
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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField jtfEnunciado;
    private javax.swing.JLabel labelEnunciado;
    // End of variables declaration//GEN-END:variables
}
