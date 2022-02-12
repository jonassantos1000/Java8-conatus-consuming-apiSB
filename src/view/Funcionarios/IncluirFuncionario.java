/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Funcionarios;

import javax.swing.JOptionPane;
import model.Employee;
import service.CountersService;
import service.EmployeeService;
import util.Mascara;
import static util.coalesce.coalesce;
import static util.coalesce.coalesceMascara;
import util.data;

/**
 *
 * @author Jonas Santos
 */
public class IncluirFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form IncluirFuncionario
     */
    public IncluirFuncionario() {
        initComponents();
        setcodigo();
        setMask();
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
        lbNome = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        lbcodigo = new javax.swing.JLabel();
        cod_servico = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        Numero = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lbCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtRG = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 100, 80));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Incluir Funcionario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 930, 50));

        lbNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome");
        getContentPane().add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 40, -1));

        lbRG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbRG.setForeground(new java.awt.Color(255, 255, 255));
        lbRG.setText("RG");
        getContentPane().add(lbRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 40, 20));

        txtnome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        txtnome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnome.setOpaque(false);
        txtnome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnomeFocusLost(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 290, -1));

        txtNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNumero.setOpaque(false);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 80, 20));

        lbCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(255, 255, 255));
        lbCPF.setText("CPF");
        getContentPane().add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 30, 20));

        lbcodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbcodigo.setText("Codigo");
        getContentPane().add(lbcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, -1));

        cod_servico.setEditable(false);
        cod_servico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cod_servico.setForeground(new java.awt.Color(255, 255, 255));
        cod_servico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cod_servico.setOpaque(false);
        getContentPane().add(cod_servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 60, -1));

        txtComplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtComplemento.setForeground(new java.awt.Color(255, 255, 255));
        txtComplemento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComplemento.setAutoscrolls(false);
        txtComplemento.setCaretColor(new java.awt.Color(255, 255, 255));
        txtComplemento.setOpaque(false);
        txtComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtComplementoFocusLost(evt);
            }
        });
        getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 230, 20));

        txtCPF.setForeground(new java.awt.Color(255, 255, 255));
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPF.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCPF.setOpaque(false);
        getContentPane().add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 130, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 20));

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndereco.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEndereco.setOpaque(false);
        txtEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnderecoFocusLost(evt);
            }
        });
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 270, -1));

        Numero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Numero.setForeground(new java.awt.Color(255, 255, 255));
        Numero.setText("Nº");
        getContentPane().add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 20, 20));

        lbBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(255, 255, 255));
        lbBairro.setText("Bairro");
        getContentPane().add(lbBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 60, 20));

        txtBairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(255, 255, 255));
        txtBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBairro.setText(" ");
        txtBairro.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBairro.setOpaque(false);
        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });
        getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 110, 20));

        lbCEP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCEP.setForeground(new java.awt.Color(255, 255, 255));
        lbCEP.setText("CEP");
        getContentPane().add(lbCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 30, 20));

        txtCEP.setForeground(new java.awt.Color(255, 255, 255));
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCEP.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCEP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCEP.setOpaque(false);
        getContentPane().add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 120, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Complemento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 40, 20));

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setCaretColor(new java.awt.Color(255, 255, 255));
        txtData.setOpaque(false);
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 110, -1));

        txtRG.setForeground(new java.awt.Color(255, 255, 255));
        txtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRG.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRG.setOpaque(false);
        getContentPane().add(txtRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 110, 20));

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
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 100, 80));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.setOpaque(false);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Celular");

        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefone.setText(" ");
        txtTelefone.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefone.setOpaque(false);

        txtCelular.setForeground(new java.awt.Color(255, 255, 255));
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCelular.setText(" ");
        txtCelular.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCelular.setOpaque(false);
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contato");

        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(94, 94, 94))
        );

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 360, 250));

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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 340, 210));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PainelFundo2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1020, 670));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FundoTelaInicial.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        setSize(new java.awt.Dimension(1020, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtnomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnomeFocusLost
        String minuscula= txtnome.getText();
        txtnome.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtnomeFocusLost

    private void txtComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtComplementoFocusLost
        String minuscula= txtComplemento.getText();
        txtComplemento.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtComplementoFocusLost

    private void txtEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnderecoFocusLost
        String minuscula= txtEndereco.getText();
        txtEndereco.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtEnderecoFocusLost

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        String minuscula= txtBairro.getText();
        txtBairro.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtBairroFocusLost

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if("".equals(txtnome.getText()) ){
            JOptionPane.showMessageDialog(null, "O campo Nome esta em branco, corrija e tente novamente");
        }
        else{
            int codigo = Integer.parseInt(cod_servico.getText());
            String nome = coalesce(txtnome.getText());
            String CPF = coalesceMascara(txtCPF.getText());
            String RG = coalesceMascara(txtRG.getText());
            String endereco = coalesce(txtEndereco.getText());
            String CEP = coalesceMascara(txtCEP.getText());
            String data =  util.data.formatDateToEUA(txtData.getText());
            String numero = coalesce(txtNumero.getText());
            String bairro = coalesce(txtBairro.getText());
            String complemento = coalesce(txtComplemento.getText());
            String email=coalesce(txtEmail.getText());
            String telefone=coalesceMascara(txtTelefone.getText());
            String celular=coalesceMascara(txtCelular.getText());
            String observacao= coalesce(txtObservacoes.getText());
            
            try {
                Employee incluirFuncionario = new Employee(codigo,nome,CPF,celular,email,data,"",RG,endereco,bairro,numero,CEP,complemento,telefone,observacao);
                EmployeeService.insert(incluirFuncionario);
                this.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String minuscula= txtEmail.getText();
        txtEmail.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed
           
    private void setMask(){
        txtCPF.setFormatterFactory(Mascara.getCpfMask());
        txtTelefone.setFormatterFactory(Mascara.getFoneFixoMask());
        txtCelular.setFormatterFactory(Mascara.getCelularMask());
        txtRG.setFormatterFactory(Mascara.getRgMask()); 
        txtCEP.setFormatterFactory(Mascara.getCEP());
    }
    
    public void setcodigo(){
        String campo= "COD_FUNCIONARIO";
        int codigo = CountersService.getId(campo);
        String codigoconv=Integer.toString(codigo);
        cod_servico.setText(codigoconv);
        txtData.setText(data.getdata());
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
            java.util.logging.Logger.getLogger(IncluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncluirFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Numero;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cod_servico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}