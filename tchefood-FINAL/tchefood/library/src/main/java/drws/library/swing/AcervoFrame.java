/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package drws.library.swing;

import drws.library.BancoDados;
import drws.library.model.Autor;
import drws.library.model.Livro;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author drws
 */
public class AcervoFrame extends JFrame {
    private BancoDados bancoDados;
    /**
     * Creates new form AcervoFrame
     */
    public AcervoFrame(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
        initComponents();
        this.loadAutores();
        this.textFieldTitulo.requestFocus();
        //initTable();
        tableAcervo.setModel(initTable());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        textFieldTitulo = new javax.swing.JTextField();
        textFieldGenero = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        comboBoxAutor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAcervo = new javax.swing.JTable();
        buttonEmprestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acervo");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        labelTitulo.setText("Título:");

        labelGenero.setText("Gênero:");

        labelAutor.setText("Autor:");

        textFieldTitulo.setColumns(20);
        textFieldTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldTituloFocusLost(evt);
            }
        });

        textFieldGenero.setColumns(20);
        textFieldGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldGeneroFocusLost(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonEditar.setText("Editar");
        buttonEditar.setMaximumSize(new java.awt.Dimension(76, 23));
        buttonEditar.setMinimumSize(new java.awt.Dimension(76, 23));
        buttonEditar.setPreferredSize(new java.awt.Dimension(76, 23));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        comboBoxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboBoxAutor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAutorItemStateChanged(evt);
            }
        });

        tableAcervo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Gênero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAcervo.setColumnSelectionAllowed(true);
        tableAcervo.setShowGrid(true);
        jScrollPane1.setViewportView(tableAcervo);
        tableAcervo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableAcervo.getColumnModel().getColumnCount() > 0) {
            tableAcervo.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        buttonEmprestar.setText("Emprestar");
        buttonEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmprestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(labelGenero)
                    .addComponent(labelAutor))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonEmprestar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancelar)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldGenero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancelar, buttonEditar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenero)
                    .addComponent(textFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(comboBoxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEmprestar))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancelar, buttonEditar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        //Era botao de excluir, fica para uma proxima vez, precisaria tratar os emprestimos para nao ficar em branco
        /*int linha = tableAcervo.getSelectedRow();
        this.bancoDados.getBiblioteca().removerLivro(linha);
        tableAcervo.setModel(initTable());*/
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        int linha = tableAcervo.getSelectedRow();
        
        if(linha != -1) {
            Object codigo = tableAcervo.getValueAt(linha, 0);
            int indexLivro = this.bancoDados.getBiblioteca().getIndexLivroPeloCodigo((int) codigo);

            EditarLivroDialog editarLivroDialog = new EditarLivroDialog(this, true, bancoDados, indexLivro);
            editarLivroDialog.setTitle("Editar Livro");
            editarLivroDialog.setVisible(true);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void textFieldGeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldGeneroFocusLost
            this.filtrar();
    }//GEN-LAST:event_textFieldGeneroFocusLost

    private void textFieldTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldTituloFocusLost
        this.filtrar();
    }//GEN-LAST:event_textFieldTituloFocusLost

    private void comboBoxAutorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAutorItemStateChanged
        this.filtrar();
    }//GEN-LAST:event_comboBoxAutorItemStateChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tableAcervo.setModel(initTable());
        this.filtrar();
    }//GEN-LAST:event_formWindowGainedFocus

    private void buttonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEmprestarActionPerformed
        int linha = tableAcervo.getSelectedRow();
        
        if(linha != -1) {
            EmprestimoFrame emprestimoFrame = new EmprestimoFrame(bancoDados);
            emprestimoFrame.setVisible(true);
            Object codigo = tableAcervo.getValueAt(linha, 0);
            int indexLivro = this.bancoDados.getBiblioteca().getIndexLivroPeloCodigo((int) codigo);
            Livro livro = this.bancoDados.getBiblioteca().getLivros().get(indexLivro);
            emprestimoFrame.selecionarLivro(livro);
            this.dispose();
        }
    }//GEN-LAST:event_buttonEmprestarActionPerformed
    
    
    private void loadAutores() {
        List<Autor> autores = this.bancoDados.getAutores();
        
        for(int i = 0; i < autores.size(); i++) {
            String codigo = String.valueOf(autores.get(i).getId());
            String nomeAutor = autores.get(i).getName();
            String item = codigo + " - " + nomeAutor;
            this.comboBoxAutor.addItem(item);
        }
    }
    
    private TableModel initTable() {
        return new LivroTableModel(bancoDados.getBiblioteca().getLivros());
    }
    
    public void limparTela() {
        this.textFieldTitulo.setText(null);
        this.textFieldGenero.setText(null);
        this.comboBoxAutor.setSelectedItem(0);
        //this.tableAcervo.setModel(initTable());
        this.tableAcervo.clearSelection();
    }
    
    private void filtrar() {
        String titulo = this.textFieldTitulo.getText().toLowerCase(); //deixar como atributos e ir trocando ou é melhor criar dinamicamente as variaveis?
        titulo.trim().replaceAll("\\s+", "");
        String genero = this.textFieldGenero.getText().toLowerCase();
        int indexAutor = this.comboBoxAutor.getSelectedIndex();
        LivroTableModel tableModel = new LivroTableModel(bancoDados.getBiblioteca().filtrarLivros(titulo, genero, indexAutor));
        tableAcervo.setModel(tableModel);
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
            java.util.logging.Logger.getLogger(AcervoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcervoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcervoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcervoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonEmprestar;
    private javax.swing.JComboBox<String> comboBoxAutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableAcervo;
    private javax.swing.JTextField textFieldGenero;
    private javax.swing.JTextField textFieldTitulo;
    // End of variables declaration//GEN-END:variables
}