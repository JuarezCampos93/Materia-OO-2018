/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepok;

import javax.swing.JOptionPane;

/**
 *
 * @author Juarez
 */
public class TelaDeletaPoke extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaDeletaPoke
     */
    public TelaDeletaPoke() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextDelePoke = new javax.swing.JTextField();
        jButDeletaPoke = new javax.swing.JButton();
        jButCancelPoke = new javax.swing.JButton();

        setClosable(true);
        setTitle("Deletar Pokémon");
        setName("TelaDeletaPoke"); // NOI18N

        jLabel2.setText("Digite o Id:");

        jButDeletaPoke.setText("Deletar");
        jButDeletaPoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButDeletaPokeActionPerformed(evt);
            }
        });

        jButCancelPoke.setText("Cancelar");
        jButCancelPoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancelPokeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButDeletaPoke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(jButCancelPoke))
                    .addComponent(jTextDelePoke))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDelePoke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButDeletaPoke)
                    .addComponent(jButCancelPoke))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButCancelPokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelPokeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButCancelPokeActionPerformed

    /**
     * Exclui o Pokemon da Pokedex pelo id
     * @param evt 
     */
    private void jButDeletaPokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButDeletaPokeActionPerformed
        // TODO add your handling code here:
        Menu.getPoke().excluiPokemon(Integer.parseInt(jTextDelePoke.getText()));
        JOptionPane.showMessageDialog(null, "Pokemon deletado com sucesso!");
        jTextDelePoke.setText("");
    }//GEN-LAST:event_jButDeletaPokeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButCancelPoke;
    private javax.swing.JButton jButDeletaPoke;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDelePoke;
    // End of variables declaration//GEN-END:variables
}
