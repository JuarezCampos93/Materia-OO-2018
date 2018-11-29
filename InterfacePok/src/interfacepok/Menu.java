/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepok;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pokemons.Agua;
import pokemons.Fogo;
import pokemons.Jogador;
import pokemons.Terra;
import pokemons.Normal;
import pokemons.Voador;
import pokemons.Pokedex;

/**
 *
 * @author Juarez
 */
public class Menu extends javax.swing.JFrame {
    
    /**
     * Creates new form Menu
     */
    TelaConsultaPoke telaConsPoke;
    TelaConsultaGinasio telaConsGin;
    TelaCadastroPokemon telaCadPoke;
    TelaCadastroGinasio telaCadGin;
    TelaDeletaPoke telaDelPoke;
    TelaDeletaGinasio telaDelGin;
    public static Pokedex  poke;
    Jogador  jg = TelaCadastroJogador.getJg();
    
     
    
   public void salvarObjeto(Pokedex obj){
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("gravObj.dat");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(obj);
            objGravar.flush();
            objGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        }catch(Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }
    }
    /**
     * Retorna o objeto pokedex que está salvo no disco
     * @return 
     */
    public Pokedex getObjecto(){
        
        try{
            
            //Carrega o arquivo
 
            FileInputStream arquivoLeitura = new FileInputStream("gravObj.dat");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            Pokedex pok = (Pokedex)objLeitura.readObject();
            System.out.println("Leitura finalizada com sucesso");
            objLeitura.close();
            arquivoLeitura.close();
            return pok;
            
        }catch(Exception e) {
 
            System.out.println("Erro ao ler arquivo");
            return null;
        }
    }
    
    
    /**
     * Salva os objetos jogador instanciados em um arquivo no disco
     * @param obj 
     */
    public void salvarObjetoJg(Jogador obj){
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("gravObjJg.dat");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(obj);
            objGravar.flush();
            objGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        }catch(Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }
    }
    /**
     * Retorna o objeto jogador que está salvo no disco
     * @return 
     */
    public Jogador getObjectoJg(){
        
        try{
            
            //Carrega o arquivo
 
            FileInputStream arquivoLeitura = new FileInputStream("gravObjJg.dat");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            Jogador jg = (Jogador)objLeitura.readObject();
            System.out.println("Leitura finalizada com sucesso");
            objLeitura.close();
            arquivoLeitura.close();
            return jg;
            
        }catch(Exception e) {
 
            System.out.println("Erro ao ler arquivo");
            return null;
        }
    }
    
    
    
    public Menu() {
        initComponents();
        this.telaCadGin = new TelaCadastroGinasio();
        this.telaCadPoke = new TelaCadastroPokemon();
        this.telaConsGin = new TelaConsultaGinasio();
        this.telaConsPoke = new TelaConsultaPoke();
        this.telaDelGin = new TelaDeletaGinasio();
        this.telaDelPoke = new TelaDeletaPoke();
        
        
    }
        public static Pokedex getPoke() {
            if (poke == null){
            poke = new Pokedex();
            return poke; }
            else{
            return poke;
            }        
         }
        
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SystemPokémon");

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        jMenu1.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/door_open.png"))); // NOI18N
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/disk.png"))); // NOI18N
        jMenuItem2.setText("Salvar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/PokébolaC.png"))); // NOI18N
        jMenu2.setText("Pokémon");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/user_add.png"))); // NOI18N
        jMenuItem3.setText("Cadastrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/user_edit.png"))); // NOI18N
        jMenuItem4.setText("Consultar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/user_delete.png"))); // NOI18N
        jMenuItem5.setText("Deletar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/award_star_gold_2.png"))); // NOI18N
        jMenu3.setText("Ginasio");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/medal_gold_add.png"))); // NOI18N
        jMenuItem6.setText("Cadastrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/pencil.png"))); // NOI18N
        jMenuItem7.setText("Consultar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/medal_gold_delete.png"))); // NOI18N
        jMenuItem8.setText("Deletar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons2/information.png"))); // NOI18N
        jMenu4.setText("Sobre");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/door_out.png"))); // NOI18N
        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Instancia da tela de consulta poke
       jDesktopPane1.add(telaConsPoke);
       telaConsPoke.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //Instancia da tela de consulta ginasio
       jDesktopPane1.add(telaConsGin);
       telaConsGin.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        //Saida do sistema
        System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        //Instancia da tela de cadastro poke
       jDesktopPane1.add(telaCadPoke);
       telaCadPoke.setVisible(true);
     /*               String str;
                    int val;
                    
                            Agua ag = new Agua();
                            //setando o tipo
                            ag.setTipo();
                            str = telaCadPoke.jTextNomePoke.getText();
                            ag.setNome(str);
                            str = telaCadPoke.jTextSexoPoke.getText();
                            ag.setSexo(str);
                            str = telaCadPoke.jTextHabilPoke.getText();
                            ag.setHabilidade(str);
                            str = telaCadPoke.jBoxFraqPoke.toString();
                            ag.setFraqueza(str);
                            str = telaCadPoke.jBoxVantaPoke.toString();
                            ag.setVantagem(str);
                            str = telaCadPoke.jTextDescPoke.toString();
                            ag.setDescricao(str);
                            val = Integer.parseInt(telaCadPoke.jTextAlturaPoke.getText());
                            ag.setAltura(val);
                            val = Integer.parseInt(telaCadPoke.jTextPesoPoke.getText());
                            ag.setPeso(val);
                            val = Integer.parseInt(telaCadPoke.jTextEvolucao.getText());
                            ag.setEvolucao(val);
                            pokedex.setObjetoPokemon(ag);
                            
                            if(pokedex.getNumPokemon() == 1){
                                JOptionPane.showMessageDialog(null,"Deu");
                            }
    */                        
      
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        //Instancia da tela de cadastro ginasio
       jDesktopPane1.add(telaCadGin);
       telaCadGin.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        //Instancia da tela de deleta poke
        jDesktopPane1.add(telaDelPoke);
        telaDelPoke.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        //Instancia da tela de deleta ginasio
        jDesktopPane1.add(telaDelGin);
        telaDelGin.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        /// DESENVOLVER ROTINA DE ABRIR E FECHAR ARQUIVOS
       if(getObjecto() != null){      
       poke = getObjecto();
        JOptionPane.showMessageDialog(null, "Arquivos carregados");
       }
       else {
       JOptionPane.showMessageDialog(null, "Erro em carregar os Arquivos");
       }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        //Informações sobre os Desenvolvedores
        JOptionPane.showMessageDialog(jDesktopPane1, "|Nome: "+jg.getNomeJogador()+"\n"
                                          + "|Sexo: "+jg.getSexoJogador()+"\n"
                                          + "|Idade: "+jg.getIdade()+"\n"
                                          + "|N° de pokebolas: "+jg.getNumPokebolas()
                                          + "|Insignias: " + jg.getInsigniaJogador(0));
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(jg!= null && poke != null){
        salvarObjeto(getPoke());
        salvarObjetoJg(jg);
        JOptionPane.showMessageDialog(null, "Poke e Jogador Salvos");
        }
        else{
        JOptionPane.showMessageDialog(null, "Erro em Salvar");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables

  
}
