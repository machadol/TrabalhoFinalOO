package GUI;

import formulario.Alternativa;
import formulario.Item;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tratamento.AlternativasNaoInformadasException;
import tratamento.EnunciadoNaoInformadoException;

public class jifAlternativa extends javax.swing.JInternalFrame
{
    private int pos = 5;
    private int numIndice = 1;
    JTextField enunItem;
    private Alternativa alternativa = new Alternativa();
    private ArrayList<Item> itens = new ArrayList<>();

    public Alternativa getAlternativa()
    {
        return alternativa;
    }

    public void setAlternativa(Alternativa alternativa)
    {
        this.alternativa = alternativa;
    }

    public jifAlternativa()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtfEnunciado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpItens = new javax.swing.JPanel();
        jrbSim = new javax.swing.JRadioButton();
        jrbNao = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Questão Alternativa");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Enunciado");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Os itens serão do tipo exclusiva?");

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
        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

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

        btnGroup.add(jrbSim);
        jrbSim.setSelected(true);
        jrbSim.setText("Sim");

        btnGroup.add(jrbNao);
        jrbNao.setText("Não");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEnunciado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddItem)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrbSim)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbNao)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbSim)
                    .addComponent(jrbNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddItem)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
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
        catch(EnunciadoNaoInformadoException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvarActionPerformed
    {//GEN-HEADEREND:event_btnSalvarActionPerformed
        try
        {
            verificaEnunciado();
            verificaItens();
            if(enunItem != null)
            {
                Item i = new Item();
                i.setTexto(enunItem.getText());
                itens.add(i);       
            }
            alternativa.setExclusiva(btnGroup.isSelected(jrbSim.getModel()));
            dispose();
        }
        catch(EnunciadoNaoInformadoException | AlternativasNaoInformadasException e)
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
            throw new EnunciadoNaoInformadoException("Enunciado não informado!");
        }
        else
        {
            alternativa.setEnunciado(jtfEnunciado.getText());
        }
    }
    
    private void verificaItens()
    {
        if (itens.isEmpty())
        {
            throw new AlternativasNaoInformadasException("Nenhum item de resposta foi adcionado!");
        }
        else
        {
            alternativa.setItemList(itens);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpItens;
    private javax.swing.JRadioButton jrbNao;
    private javax.swing.JRadioButton jrbSim;
    private javax.swing.JTextField jtfEnunciado;
    // End of variables declaration//GEN-END:variables
}
