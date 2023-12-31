/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drws.library.swing;

import drws.library.BancoDados;
import drws.library.Options;
import drws.library.model.Emprestimo;
import drws.library.model.Leitor;
import drws.library.model.Livro;
import java.awt.Color;
import javax.swing.JFrame;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author drws
 */
public class DevolucaoFrame extends JFrame {
    private BancoDados bancoDados;
    private Emprestimo emprestimo;
    private Leitor leitor;
    private Livro livro;

    /**
     * Creates new form EmprestimoFrame
     */
    public DevolucaoFrame(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
        initComponents();
        this.setDate();
        this.textFieldCodigoEmprestimo.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEmprestimo = new javax.swing.JPanel();
        labelCodigoEmprestimo = new javax.swing.JLabel();
        textFieldCodigoEmprestimo = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        textFieldData = new javax.swing.JTextField();
        labelDevolucao = new javax.swing.JLabel();
        textFieldDevolucao = new javax.swing.JTextField();
        buttonBuscaEmprestimo = new javax.swing.JButton();
        panelLeitor = new javax.swing.JPanel();
        labelCodigoLeitor = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        textFieldCodigoLeitor = new javax.swing.JTextField();
        textFieldCPF = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        panelLivro = new javax.swing.JPanel();
        labelCodigoLivro = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        textFieldAutor = new javax.swing.JTextField();
        textFieldCodigoLivro = new javax.swing.JTextField();
        textFieldTitulo = new javax.swing.JTextField();
        panelBotoes = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonDevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolução");

        labelCodigoEmprestimo.setText("Código:");

        textFieldCodigoEmprestimo.setColumns(4);
        textFieldCodigoEmprestimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldCodigoEmprestimoFocusLost(evt);
            }
        });

        labelData.setText("Data:");

        textFieldData.setEditable(false);
        textFieldData.setColumns(6);
        textFieldData.setFocusable(false);

        labelDevolucao.setText("Devolução:");

        textFieldDevolucao.setEditable(false);
        textFieldDevolucao.setColumns(6);
        textFieldDevolucao.setFocusable(false);
        textFieldDevolucao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldDevolucaoFocusLost(evt);
            }
        });

        buttonBuscaEmprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\T-GAMER\\Documents\\NetBeansProjects\\library\\src\\main\\resources\\images\\search-white.png")); // NOI18N
        buttonBuscaEmprestimo.setEnabled(false);

        javax.swing.GroupLayout panelEmprestimoLayout = new javax.swing.GroupLayout(panelEmprestimo);
        panelEmprestimo.setLayout(panelEmprestimoLayout);
        panelEmprestimoLayout.setHorizontalGroup(
            panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmprestimoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoEmprestimo)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmprestimoLayout.createSequentialGroup()
                        .addComponent(textFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(labelDevolucao)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEmprestimoLayout.createSequentialGroup()
                        .addComponent(textFieldCodigoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmprestimoLayout.setVerticalGroup(
            panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmprestimoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCodigoEmprestimo)
                        .addComponent(textFieldCodigoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonBuscaEmprestimo))
                .addGap(18, 18, 18)
                .addGroup(panelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(textFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDevolucao)
                    .addComponent(textFieldDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        panelLeitor.setBorder(javax.swing.BorderFactory.createTitledBorder("Leitor"));

        labelCodigoLeitor.setText("Código:");

        labelCPF.setText("CPF:");

        textFieldCodigoLeitor.setEditable(false);
        textFieldCodigoLeitor.setColumns(4);
        textFieldCodigoLeitor.setFocusable(false);

        textFieldCPF.setEditable(false);
        textFieldCPF.setColumns(8);
        textFieldCPF.setFocusable(false);

        labelNome.setText("Nome:");

        textFieldNome.setEditable(false);
        textFieldNome.setColumns(20);
        textFieldNome.setFocusable(false);

        javax.swing.GroupLayout panelLeitorLayout = new javax.swing.GroupLayout(panelLeitor);
        panelLeitor.setLayout(panelLeitorLayout);
        panelLeitorLayout.setHorizontalGroup(
            panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeitorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoLeitor)
                    .addComponent(labelCPF)
                    .addComponent(labelNome))
                .addGap(18, 18, 18)
                .addGroup(panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCodigoLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelLeitorLayout.setVerticalGroup(
            panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLeitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoLeitor)
                    .addComponent(textFieldCodigoLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(textFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLeitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelLivro.setBorder(javax.swing.BorderFactory.createTitledBorder("Livro"));

        labelCodigoLivro.setText("Código:");

        labelAutor.setText("Autor:");

        labelTitulo.setText("Título:");

        textFieldAutor.setEditable(false);
        textFieldAutor.setColumns(20);
        textFieldAutor.setFocusable(false);

        textFieldCodigoLivro.setEditable(false);
        textFieldCodigoLivro.setColumns(4);
        textFieldCodigoLivro.setFocusable(false);

        textFieldTitulo.setEditable(false);
        textFieldTitulo.setColumns(20);
        textFieldTitulo.setFocusable(false);

        javax.swing.GroupLayout panelLivroLayout = new javax.swing.GroupLayout(panelLivro);
        panelLivro.setLayout(panelLivroLayout);
        panelLivroLayout.setHorizontalGroup(
            panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLivroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCodigoLivro)
                    .addComponent(labelTitulo)
                    .addComponent(labelAutor))
                .addGap(18, 18, 18)
                .addGroup(panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(textFieldAutor))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelLivroLayout.setVerticalGroup(
            panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigoLivro)
                    .addComponent(textFieldCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonDevolver.setText("Devolver");
        buttonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDevolver)
                .addGap(18, 18, 18)
                .addComponent(buttonCancelar)
                .addGap(45, 45, 45))
        );

        panelBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonCancelar, buttonDevolver});

        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonDevolver))
                .addGap(25, 25, 25))
        );

        panelBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonCancelar, buttonDevolver});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEmprestimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLeitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDevolverActionPerformed
        if(isEverythingOk()) {
            int codigoEmprestimo = Integer.parseInt(this.textFieldCodigoEmprestimo.getText());
            this.bancoDados.getBiblioteca().devolverLivro(livro);
            //this.bancoDados.getBiblioteca().removerEmprestimo(codigoEmprestimo);
            this.bancoDados.getBiblioteca().removeEmprestimo(emprestimo);
            this.limparTela();
        }
    }//GEN-LAST:event_buttonDevolverActionPerformed

    private void textFieldDevolucaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldDevolucaoFocusLost
        if(!textFieldDevolucao.getText().isBlank()) {
            textFieldDevolucao.setBackground(Options.textFieldcolor);
        }
    }//GEN-LAST:event_textFieldDevolucaoFocusLost

    private void textFieldCodigoEmprestimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldCodigoEmprestimoFocusLost
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();

            int codigo = Integer.parseInt(textFieldCodigoEmprestimo.getText());
            int index = this.bancoDados.getBiblioteca().getIndexEmprestimoPeloCodigo(codigo);
            emprestimo = this.bancoDados.getBiblioteca().getEmprestimos().get(index);
            livro = emprestimo.getLivro();
            leitor = emprestimo.getLeitor();
            String data = emprestimo.getData();
            this.textFieldData.setText(data);

            textFieldDevolucao.setText(String.valueOf(dateFormat.format(date)));

            this.textFieldCodigoLeitor.setText(String.valueOf(leitor.getId()));
            this.textFieldNome.setText(leitor.getName());
            this.textFieldCPF.setText(leitor.getCpf());

            this.textFieldCodigoLivro.setText(String.valueOf(livro.getId()));
            this.textFieldTitulo.setText(livro.getTitle());
            this.textFieldAutor.setText(livro.getAuthor().getName());

            this.textFieldCodigoEmprestimo.setBackground(Options.textFieldcolor);
            //this.buttonBuscaLeitor.setFocusable(false);
        }
        catch(Exception e) {
            this.textFieldCodigoLeitor.setText(null);
            this.textFieldNome.setText(null);
            this.textFieldCPF.setText(null);

            this.textFieldData.setText(null);
            this.textFieldCodigoLivro.setText(null);
            this.textFieldTitulo.setText(null);
            this.textFieldAutor.setText(null);

            this.textFieldCodigoEmprestimo.setBackground(Color.red);
        }
    }//GEN-LAST:event_textFieldCodigoEmprestimoFocusLost

    private void limparTela() {
        this.textFieldCodigoEmprestimo.setText(null);
        //textFieldData.setText(null);
        //textFieldDevolucao.setText(null);
        textFieldCodigoLeitor.setText(null);
        textFieldCPF.setText(null);
        textFieldNome.setText(null);
        textFieldCodigoLivro.setText(null);
        textFieldTitulo.setText(null);
        textFieldAutor.setText(null);
        this.textFieldCodigoEmprestimo.requestFocus();
    }
    
    private boolean isEverythingOk() {
        //boolean isOk = true;
        
        //if(textFieldCodigoEmprestimo.getText().isBlank()) {
            //textFieldCodigoLeitor.setBackground(Color.red);
            //isOk = false;
        //}
        //return isOk;
        return !textFieldCodigoEmprestimo.getText().isBlank();
    }
    
    private void setDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        this.textFieldDevolucao.setText(String.valueOf(dateFormat.format(date)));
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
            java.util.logging.Logger.getLogger(DevolucaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolucaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolucaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolucaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscaEmprestimo;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDevolver;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCodigoEmprestimo;
    private javax.swing.JLabel labelCodigoLeitor;
    private javax.swing.JLabel labelCodigoLivro;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDevolucao;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelEmprestimo;
    private javax.swing.JPanel panelLeitor;
    private javax.swing.JPanel panelLivro;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JTextField textFieldCPF;
    private javax.swing.JTextField textFieldCodigoEmprestimo;
    private javax.swing.JTextField textFieldCodigoLeitor;
    private javax.swing.JTextField textFieldCodigoLivro;
    private javax.swing.JTextField textFieldData;
    private javax.swing.JTextField textFieldDevolucao;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
