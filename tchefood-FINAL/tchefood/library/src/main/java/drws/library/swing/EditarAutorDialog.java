/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package drws.library.swing;

import drws.library.BancoDados;
import drws.library.Options;
import drws.library.model.Autor;
import drws.library.model.Livro;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 *
 * @author drws
 */
public class EditarAutorDialog extends javax.swing.JDialog {
    private BancoDados bancoDados;
    private int indexAutor;
    /**
     * Creates new form CadastroAutorDialog
     */
    public EditarAutorDialog(java.awt.Frame parent, boolean modal, BancoDados bancoDados, int indexAutor) {
        super(parent, modal);
        this.bancoDados = bancoDados;
        this.indexAutor = indexAutor;
        initComponents();
        this.loadDados(indexAutor);
        this.textFieldCodigo.setEditable(true);
        this.textFieldCodigo.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodigo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNome = new javax.swing.JTextField();
        textFieldPais = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Autor");

        labelCodigo.setText("Código:");

        labelNome.setText("Nome:");

        labelPais.setText("País:");

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setColumns(5);

        textFieldNome.setColumns(20);
        textFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNomeFocusLost(evt);
            }
        });

        textFieldPais.setColumns(20);
        textFieldPais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPaisFocusLost(evt);
            }
        });
        textFieldPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldPaisKeyTyped(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.setMaximumSize(new java.awt.Dimension(76, 23));
        buttonSalvar.setMinimumSize(new java.awt.Dimension(76, 23));
        buttonSalvar.setPreferredSize(new java.awt.Dimension(76, 23));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(labelNome)
                            .addComponent(labelPais))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(textFieldPais))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancelar, buttonSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPais)
                    .addComponent(textFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancelar, buttonSalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(isEverythingOK()) {
            int codigo = Integer.parseInt(this.textFieldCodigo.getText());
            String nome = this.textFieldNome.getText();
            String pais = this.textFieldPais.getText();
            Autor autor = this.bancoDados.getAutores().get(indexAutor);
            autor.setId(codigo);
            autor.setName(nome);
            autor.setCountry(pais);
            //this.bancoDados.getAutores().get(indexAutor).setName(nome);
            
            //Autor autor = new Autor(codigo, nome, pais);
            //this.bancoDados.getAutores().set(indexAutor, autor); //nao dá ele troca um pelo outro, e precisaria alterar nos livros os dados tbm, acho melhor usar os setters
            this.dispose();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPaisKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c) || c == KeyEvent.VK_ENTER || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_TAB) {
            if(c != KeyEvent.VK_SPACE) {
                evt.consume();    
            }
        }
    }//GEN-LAST:event_textFieldPaisKeyTyped

    private void textFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNomeFocusLost
        if(!textFieldNome.getText().isBlank()) {
            textFieldNome.setBackground(Options.textFieldcolor);
        }
    }//GEN-LAST:event_textFieldNomeFocusLost

    private void textFieldPaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPaisFocusLost
        if(!textFieldPais.getText().isBlank()) {
            textFieldPais.setBackground(Options.textFieldcolor);
        }
    }//GEN-LAST:event_textFieldPaisFocusLost

    private boolean isEverythingOK() {
        boolean isOk = true;
        
        if(textFieldPais.getText().isBlank()) {
            textFieldPais.setBackground(Color.red);
            textFieldPais.requestFocus();
            isOk = false;
        }
        else {
            textFieldPais.setBackground(Options.textFieldcolor);
        }
        if(textFieldNome.getText().isBlank()) {
            textFieldNome.setBackground(Color.red);
            textFieldNome.requestFocus();
            isOk = false;
        }
        else {
            textFieldNome.setBackground(Options.textFieldcolor);
        }
        return isOk;
    }
    
    private void loadDados(int indexAutor) {
        Autor autor = this.bancoDados.getAutores().get(indexAutor);
        
        textFieldCodigo.setText(String.valueOf(autor.getId()));
        textFieldNome.setText(autor.getName());
        textFieldPais.setText(autor.getCountry());
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
            java.util.logging.Logger.getLogger(EditarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPais;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldPais;
    // End of variables declaration//GEN-END:variables
}
