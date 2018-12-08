package GUI;

import formulario.Aberta;
import formulario.Alternativa;
import formulario.Lista;
import formulario.Opcional;
import formulario.Questao;
import formulario.Questionario;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame
{
    ArrayList<Questao> questoes= new ArrayList<>();
    Questionario questionario = new Questionario();
    Aberta aberta             = new Aberta();
    Alternativa alternativa   = new Alternativa();
    Lista lista               = new Lista();
    Opcional opcional         = new Opcional();
    
    jifTituloDescricao objTD;
    jifQuestionario    objQ;
    jifAberta      objAberta;
    jifAlternativa objAlternativa;
    jifLista       objLista;
    jifOpcional    objOpcional;
    
    public Principal()
    {
        initComponents();
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents()
    {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuNovoQuestionario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jInserirQuestao = new javax.swing.JMenu();
        jAberta = new javax.swing.JMenuItem();
        jAlternativa = new javax.swing.JMenuItem();
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
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
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

        jAberta.setText("Aberta");
        jAberta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jAbertaActionPerformed(evt);
            }
        });
        jInserirQuestao.add(jAberta);

        jAlternativa.setText("Alternativa");
        jAlternativa.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jAlternativaActionPerformed(evt);
            }
        });
        jInserirQuestao.add(jAlternativa);

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

        setSize(new java.awt.Dimension(910, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jMenuNovoQuestionarioActionPerformed(java.awt.event.ActionEvent evt)                                                      
    {                                                          
        objTD = new jifTituloDescricao();
        jdpPrincipal.add(objTD);
        objTD.setVisible(true);
    }                                                     

    private void jMenuVisualizarQuestionarioActionPerformed(java.awt.event.ActionEvent evt)                                                            
    {                                                                
        objQ = new jifQuestionario();
        jdpPrincipal.add(objQ);
        enviaQuestionario();
        try
        {
            exportar();
        } catch (IOException ex)
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        objQ.setVisible(true);        
    }                                                           

    private void jListaActionPerformed(java.awt.event.ActionEvent evt)                                       
    {                                           
        objLista = new jifLista();
        jdpPrincipal.add(objLista);
        objLista.setVisible(true);
        this.lista = objLista.getLista();
        questoes.add(lista);
    }                                      
    
    private void jOpcionalActionPerformed(java.awt.event.ActionEvent evt)                                          
    {                                              
        objOpcional = new jifOpcional();
        jdpPrincipal.add(objOpcional);
        objOpcional.setVisible(true);
        this.opcional = objOpcional.getOpcional();
        questoes.add(opcional);
    }                                         

    private void jAlternativaActionPerformed(java.awt.event.ActionEvent evt)                                             
    {                                                 
        objAlternativa = new jifAlternativa();
        jdpPrincipal.add(objAlternativa);
        objAlternativa.setVisible(true);
        this.alternativa= objAlternativa.getAlternativa();
        questoes.add(alternativa);
    }                                            

    private void jAbertaActionPerformed(java.awt.event.ActionEvent evt)                                        
    {                                            
        objAberta = new jifAberta();
        jdpPrincipal.add(objAberta);
        objAberta.setVisible(true);
        this.aberta = objAberta.getAberta();
        questoes.add(aberta);
    }                                       
    
    
    private void enviaQuestionario()
    {
        questionario.setArrayListQ(questoes);
        questionario.setTitulo(objTD.getTitulo());
        questionario.setDescricao(objTD.getDescricao());
        objQ.visualizaQuestionario(questionario);
    }
    
    public void exportar() throws IOException
    {
        FileWriter fw = new FileWriter("/home/lucas/Desktop/questionario.txt");
        PrintWriter gravararq = new PrintWriter(fw);   
        
        gravararq.printf(questionario.getTitulo()+"\n");
        gravararq.printf(questionario.getDescricao()+"\n\n");
       
        for (int i = 0; i < questionario.getArrayListQ().size(); i++)
        {
            if (questionario.getArrayListQ().get(i) instanceof Lista)
            {
               Lista l = (Lista) questionario.getArrayListQ().get(i);
               gravararq.printf((i+1)+" - "+questionario.getArrayListQ().get(i).getEnunciado()+"\n");
                for (int j = 0; j < l.getItemList().size(); j++)
                {
                    gravararq.printf("    "+l.getItemList().get(j).getTexto()+"\n");
                }
            }
            else if (questionario.getArrayListQ().get(i) instanceof Aberta)
            {
               gravararq.printf((i+1)+" - "+questionario.getArrayListQ().get(i).getEnunciado()+"\n\n\n");
            }
            else if (questionario.getArrayListQ().get(i) instanceof Alternativa)
            {
               Alternativa alt = (Alternativa) questionario.getArrayListQ().get(i);
               gravararq.printf((i+1)+" - "+questionario.getArrayListQ().get(i).getEnunciado()+"\n");
               
                for (int j = 0; j < alt.getItemList().size(); j++)
                {
                    gravararq.printf(alt.getItemList().get(j).getTexto()+"\n");
                }
            }
            else if (questionario.getArrayListQ().get(i) instanceof Opcional)
            {
               Opcional op = (Opcional) questionario.getArrayListQ().get(i);
               gravararq.printf((i+1)+" - "+questionario.getArrayListQ().get(i).getEnunciado()+"\n");
               gravararq.printf(op.getItem()+"\n");
            }
        }
        
        fw.close();
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

    // Variables declaration - do not modify                     
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
    // End of variables declaration                   
}
