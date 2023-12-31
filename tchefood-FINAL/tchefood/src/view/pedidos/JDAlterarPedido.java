/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.pedidos;

import DAO.DAOUsuario;
import DAO.FormaPagamentoDAO;
import Model.ModelFormaPagamento;
import Model.ModelPedido;
import Model.ModelUsuario;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static view.pedidos.JDGerenciarPedidos.JTPedidos;

/**
 *
 * @author Vaio
 */
public class JDAlterarPedido extends javax.swing.JDialog {

    /**
     * Creates new form JDAlterarPedido
     */
    public JDAlterarPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFAlterarUsuarioID = new javax.swing.JTextField();
        JTFAlterarFormaPagamentoID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFAlterarStatusPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFAlterarStatusPagamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFAlterarTotal = new javax.swing.JTextField();
        JBSalvarAlteracao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Status do pagamento:");
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Forma do pagamento id:");
        jLabel5.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFAlterarUsuarioID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAlterarUsuarioIDActionPerformed(evt);
            }
        });
        JTFAlterarUsuarioID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFAlterarUsuarioIDKeyReleased(evt);
            }
        });

        JTFAlterarFormaPagamentoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAlterarFormaPagamentoIDActionPerformed(evt);
            }
        });
        JTFAlterarFormaPagamentoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFAlterarFormaPagamentoIDKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Usuário id:");
        jLabel6.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFAlterarStatusPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAlterarStatusPedidoActionPerformed(evt);
            }
        });
        JTFAlterarStatusPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFAlterarStatusPedidoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Status do pedido:");
        jLabel3.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFAlterarStatusPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAlterarStatusPagamentoActionPerformed(evt);
            }
        });
        JTFAlterarStatusPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFAlterarStatusPagamentoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total:");
        jLabel4.setPreferredSize(new java.awt.Dimension(44, 20));

        JTFAlterarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAlterarTotalActionPerformed(evt);
            }
        });
        JTFAlterarTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFAlterarTotalKeyReleased(evt);
            }
        });

        JBSalvarAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JBSalvarAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
        JBSalvarAlteracao.setText("Alterar");
        JBSalvarAlteracao.setEnabled(false);
        JBSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFAlterarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(JBSalvarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JTFAlterarUsuarioID, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTFAlterarFormaPagamentoID, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(JTFAlterarStatusPagamento)
                    .addComponent(JTFAlterarStatusPedido)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTFAlterarUsuarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAlterarFormaPagamentoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAlterarStatusPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAlterarStatusPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAlterarTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBSalvarAlteracao)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFAlterarUsuarioIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAlterarUsuarioIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAlterarUsuarioIDActionPerformed

    private void JTFAlterarFormaPagamentoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAlterarFormaPagamentoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAlterarFormaPagamentoIDActionPerformed

    private void JTFAlterarStatusPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAlterarStatusPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAlterarStatusPedidoActionPerformed

    private void JTFAlterarStatusPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAlterarStatusPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAlterarStatusPagamentoActionPerformed

    private void JTFAlterarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAlterarTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAlterarTotalActionPerformed

    private void JBSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarAlteracaoActionPerformed

        try {

            // Obtendo os valores dos campos de texto.

            ModelPedido pedido = new ModelPedido();
            
            int id = (int) (JTPedidos.getValueAt(JTPedidos.getSelectedRow(), 0));

            int usuarioId = Integer.parseInt(JTFAlterarUsuarioID.getText());
            int formaPagamentoId = Integer.parseInt(JTFAlterarFormaPagamentoID.getText());
            int statusPagamento = Integer.parseInt(JTFAlterarStatusPagamento.getText());
            int statusPedido = Integer.parseInt(JTFAlterarStatusPedido.getText());
            double total = Double.parseDouble(JTFAlterarTotal.getText());

            // Tentando converter.

            int usuario = DAOUsuario.getUsuarioId(usuarioId);
            int formaPagamento = FormaPagamentoDAO.getFormaPagamentoId(formaPagamentoId);

            // Verificando se as instâncias não são nulas.

            if (usuario != -1 || formaPagamento != -1) {

                ModelUsuario usuario2 = new ModelUsuario();
                usuario2.setId(usuario);
                pedido.setUsuarioId(usuario2);

                ModelFormaPagamento forma = new ModelFormaPagamento();
                forma.setId(formaPagamento);
                pedido.setFormaPagamentoId(forma);

                pedido.setStatusPagamento(statusPagamento);
                pedido.setStatusPedido(statusPedido);
                pedido.setTotal(total);
                pedido.setId(id);
                
            
            if(DAO.PedidoDAO.isIdValido(pedido)){
                
                DAO.PedidoDAO.atualizar(pedido);
                JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(this, "Id do pedido não encontrado.");
            }

            } else {
                JOptionPane.showMessageDialog(this, "Id do usuário ou forma de pagamento não encontrado.");
            }
        } catch (Exception Alterar) {
            throw new RuntimeException(Alterar);
        }
    }//GEN-LAST:event_JBSalvarAlteracaoActionPerformed

    private void JTFAlterarUsuarioIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAlterarUsuarioIDKeyReleased
        verificacaoAlterarUsuarioId = validacao("\\d+", JTFAlterarUsuarioID);
        visibilidade();
    }//GEN-LAST:event_JTFAlterarUsuarioIDKeyReleased

    private void JTFAlterarFormaPagamentoIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAlterarFormaPagamentoIDKeyReleased
        verificacaoAlterarFormaPagamentoId = validacao("\\d+", JTFAlterarFormaPagamentoID);
        visibilidade();
    }//GEN-LAST:event_JTFAlterarFormaPagamentoIDKeyReleased

    private void JTFAlterarStatusPagamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAlterarStatusPagamentoKeyReleased
        verificacaoAlterarStatusPagamento = validacao("\\d+", JTFAlterarStatusPagamento);
        visibilidade();
    }//GEN-LAST:event_JTFAlterarStatusPagamentoKeyReleased

    private void JTFAlterarStatusPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAlterarStatusPedidoKeyReleased
        verificacaoAlterarStatusPedido = validacao("\\d+", JTFAlterarStatusPedido);
        visibilidade();
    }//GEN-LAST:event_JTFAlterarStatusPedidoKeyReleased

    private void JTFAlterarTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAlterarTotalKeyReleased
        verificacaoAlterarTotal = validacao("[0-9]+(\\.[0-9]+)?", JTFAlterarTotal);
        visibilidade();
    }//GEN-LAST:event_JTFAlterarTotalKeyReleased

    private boolean verificacaoAlterarUsuarioId;
    private boolean verificacaoAlterarFormaPagamentoId;
    private boolean verificacaoAlterarStatusPagamento;
    private boolean verificacaoAlterarStatusPedido;
    private boolean verificacaoAlterarTotal;
    
    
    private void visibilidade(){
        if (verificacaoAlterarUsuarioId && verificacaoAlterarFormaPagamentoId && verificacaoAlterarStatusPagamento && 
                verificacaoAlterarStatusPedido && verificacaoAlterarTotal){
            JBSalvarAlteracao.setEnabled(true);
        } else {
            JBSalvarAlteracao.setEnabled(false);
        }
    }
    
    private boolean validacao(String letrinha, JTextField field){
        String texto = field.getText();
        
        if(texto.matches(letrinha)){
            field.setForeground(Color.blue);
            return true;
        } else {
            field.setForeground(Color.red);
            field.requestFocus();
            return false;
        }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(JDAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAlterarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAlterarPedido dialog = new JDAlterarPedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSalvarAlteracao;
    public static javax.swing.JTextField JTFAlterarFormaPagamentoID;
    public static javax.swing.JTextField JTFAlterarStatusPagamento;
    public static javax.swing.JTextField JTFAlterarStatusPedido;
    public static javax.swing.JTextField JTFAlterarTotal;
    public static javax.swing.JTextField JTFAlterarUsuarioID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
