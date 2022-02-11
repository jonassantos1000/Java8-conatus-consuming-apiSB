/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Produto;

import javax.swing.JOptionPane;
import model.Product;
import model.User;
import service.ProductService;
import util.Mascara;
import static util.ValidaNumeros.nf;
import static util.coalesce.coalesce;
import util.data;

/**
 *
 * @author Jonas Santos
 */
public class AlterarServico extends javax.swing.JFrame {

    /**
     * Creates new form AlteraServico
     */
    String codigo;
    User user;

    public AlterarServico(String ID, User usuarios) {
        codigo = ID;
        user = usuarios;
        initComponents();
        setMask();
        setValue();
    }

    private AlterarServico() {
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

        btCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbData_alteracao = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        ckInativo = new javax.swing.JCheckBox();
        txtDataAlteracao = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        lbcodigo = new javax.swing.JLabel();
        cod_servico = new javax.swing.JTextField();
        txtValor = new javax.swing.JFormattedTextField();
        lbCEP = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaocancelar6.png"))); // NOI18N
        btCancelar.setText(" Cancelar");
        btCancelar.setBorder(null);
        btCancelar.setBorderPainted(false);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setFocusPainted(false);
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 100, 80));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Alterar Serviço");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 930, 50));

        lbData_alteracao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbData_alteracao.setForeground(new java.awt.Color(255, 255, 255));
        lbData_alteracao.setText("Ult. Alteração");
        getContentPane().add(lbData_alteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 100, 20));

        lbDescricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lbDescricao.setText("Descrição");
        getContentPane().add(lbDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, -1));

        ckInativo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ckInativo.setForeground(new java.awt.Color(255, 255, 255));
        ckInativo.setText("Inativo");
        ckInativo.setContentAreaFilled(false);
        ckInativo.setFocusPainted(false);
        getContentPane().add(ckInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 90, -1));

        txtDataAlteracao.setEditable(false);
        txtDataAlteracao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtDataAlteracao.setForeground(new java.awt.Color(255, 255, 255));
        txtDataAlteracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataAlteracao.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDataAlteracao.setOpaque(false);
        getContentPane().add(txtDataAlteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 120, 20));

        txtDescricao.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(255, 255, 255));
        txtDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescricao.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDescricao.setOpaque(false);
        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 460, -1));

        lbcodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbcodigo.setText("Codigo");
        getContentPane().add(lbcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 50, 20));

        cod_servico.setEditable(false);
        cod_servico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cod_servico.setForeground(new java.awt.Color(255, 255, 255));
        cod_servico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cod_servico.setOpaque(false);
        getContentPane().add(cod_servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 60, 20));

        txtValor.setForeground(new java.awt.Color(255, 255, 255));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setOpaque(false);
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 80, -1));

        lbCEP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCEP.setForeground(new java.awt.Color(255, 255, 255));
        lbCEP.setText("Preço");
        getContentPane().add(lbCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 50, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data cadastro");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 100, 20));

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setCaretColor(new java.awt.Color(255, 255, 255));
        txtData.setOpaque(false);
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 120, 20));

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaoefetivar5.png"))); // NOI18N
        btSalvar.setText(" Efetivar");
        btSalvar.setBorderPainted(false);
        btSalvar.setContentAreaFilled(false);
        btSalvar.setFocusPainted(false);
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 100, 80));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLayeredPane3.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txtObservacoes.setBackground(new java.awt.Color(0, 0, 0));
        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        txtObservacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtObservacoes.setOpaque(false);
        jScrollPane1.setViewportView(txtObservacoes);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Observações");

        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 550, 210));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PainelFundo2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1020, 670));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FundoTelaInicial.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        setSize(new java.awt.Dimension(1019, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        String minuscula = txtDescricao.getText();
        txtDescricao.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            if ("".equals(txtDescricao.getText())) {
                JOptionPane.showMessageDialog(null, "O campo Descrição está em branco, corrija e tente novamente");
            } else {
                Integer codigo = Integer.parseInt(cod_servico.getText());
                String descricao = coalesce(txtDescricao.getText());
                String data = util.data.formatDateToEUA(txtData.getText());
                Double preco = 0.0;
                String cbInativo = ckInativo.isSelected() == false ? "F" : "T";
                preco = nf(coalesce(txtValor.getText())).doubleValue();
                String observacao = coalesce(txtObservacoes.getText());
                String usuario = user.getUsuario();
                String dataAlteracao = util.data.formatDateToEUA(util.data.getdata());

                Product alterarServico = new Product(codigo, descricao, preco, data,dataAlteracao, usuario, observacao, cbInativo);
                ProductService.update(codigo,alterarServico);
                this.dispose();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void setValue() {
        int id = Integer.parseInt(codigo);
        Product selectAlteraServico = ProductService.findByID(codigo, "T");

        cod_servico.setText(codigo);
        txtDescricao.setText(selectAlteraServico.getDescricao());
        txtValor.setText(String.format("%.2f", selectAlteraServico.getPreco()).replace(".", ","));
        txtObservacoes.setText(selectAlteraServico.getObservacao());
        txtData.setText(data.formataDataBD(String.valueOf(selectAlteraServico.getData_cadastro())));
        txtDataAlteracao.setText(data.formataDataBD(String.valueOf(selectAlteraServico.getData_alteracao())));
        if (selectAlteraServico.getInativo().equals("T")) {
            ckInativo.setSelected(true);
        } else {
            ckInativo.setSelected(false);
        }
    }

    private void setMask() {
        txtValor.setFormatterFactory(Mascara.getValorMask());
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
            java.util.logging.Logger.getLogger(AlterarServico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarServico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarServico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarServico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox ckInativo;
    private javax.swing.JTextField cod_servico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbData_alteracao;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDataAlteracao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
