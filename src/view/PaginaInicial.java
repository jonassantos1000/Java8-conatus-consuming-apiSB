/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static util.Criptografia.criptografar;
//import Util.Mascara;
//import Util.ValidaNumeros;
//import static Util.coalesce.coalesce;
//import static Util.SendEmail.testaEnvio;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.User;
import service.UserService;
import view.Clientes.ClientePrincipal;

/**
 *
 * @author Jonas Santos
 */
public class PaginaInicial extends javax.swing.JFrame {

    private boolean status=false;
    String usuario;
    User user;
    public PaginaInicial() {       
        initComponents();
        bloquearAcesso();
        //txtPortaSMTP.setDocument(new ValidaNumeros());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Suporte = new javax.swing.JDialog();
        pnSuporte = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btCliente = new javax.swing.JButton();
        btServico = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        btMovimentacao = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btSuporte = new javax.swing.JButton();
        pnCentral = new javax.swing.JPanel();
        painelImagemFundo1 = new view.painelImagemFundo();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btLogar = new javax.swing.JToggleButton();
        btConfiguracoesGerais = new javax.swing.JButton();

        Suporte.setMinimumSize(new java.awt.Dimension(398, 210));
        Suporte.setResizable(false);

        pnSuporte.setBackground(new java.awt.Color(255, 255, 255));
        pnSuporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        pnSuporte.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 2));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Suporte ");
        pnSuporte.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 390, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("WhatsApp:");
        pnSuporte.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel9.setText("(11) 986778840 ");
        pnSuporte.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 17));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Suporte.png"))); // NOI18N
        pnSuporte.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 130));

        jLabel13.setText("suporteconatus@gmail.com");
        pnSuporte.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 17));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("E-mail:");
        pnSuporte.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel15.setText("Para solicitar customizações, ajustes de bug's");
        pnSuporte.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel16.setText("ou auxilio para tirar dúvidas nos contate ");
        pnSuporte.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel17.setText("através dos nossos canais de atendimento:");
        pnSuporte.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        javax.swing.GroupLayout SuporteLayout = new javax.swing.GroupLayout(Suporte.getContentPane());
        Suporte.getContentPane().setLayout(SuporteLayout);
        SuporteLayout.setHorizontalGroup(
            SuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SuporteLayout.setVerticalGroup(
            SuporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(825, 494));
        setPreferredSize(new java.awt.Dimension(690, 303));

        pnTitulo.setBackground(new java.awt.Color(0, 0, 0));
        pnTitulo.setName(""); // NOI18N
        pnTitulo.setPreferredSize(new java.awt.Dimension(684, 0));

        jLabel2.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnTitulo, java.awt.BorderLayout.PAGE_START);

        pnMenu.setBackground(new java.awt.Color(0, 0, 0));
        pnMenu.setForeground(new java.awt.Color(51, 51, 51));
        pnMenu.setMaximumSize(new java.awt.Dimension(380, 344));
        pnMenu.setPreferredSize(new java.awt.Dimension(220, 300));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 2));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 2));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Barber Shop");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbMenu.setBackground(new java.awt.Color(0, 0, 0));
        lbMenu.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lbMenu.setForeground(new java.awt.Color(240, 240, 240));
        lbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Logo.jpg"))); // NOI18N
        lbMenu.setText(" ");
        lbMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbMenu.setMaximumSize(new java.awt.Dimension(300, 120));
        lbMenu.setMinimumSize(new java.awt.Dimension(15, 100));
        lbMenu.setOpaque(true);
        lbMenu.setPreferredSize(new java.awt.Dimension(10, 50));

        jLabel3.setText("  ");

        btCliente.setBackground(new java.awt.Color(0, 0, 0));
        btCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btCliente.setForeground(new java.awt.Color(255, 255, 255));
        btCliente.setText("Clientes");
        btCliente.setToolTipText("");
        btCliente.setBorderPainted(false);
        btCliente.setContentAreaFilled(false);
        btCliente.setFocusPainted(false);
        btCliente.setMaximumSize(new java.awt.Dimension(230, 50));
        btCliente.setMinimumSize(new java.awt.Dimension(120, 45));
        btCliente.setOpaque(true);
        btCliente.setPreferredSize(new java.awt.Dimension(180, 50));
        btCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btClienteMouseExited(evt);
            }
        });
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btServico.setBackground(new java.awt.Color(0, 0, 0));
        btServico.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btServico.setForeground(new java.awt.Color(255, 255, 255));
        btServico.setText("Serviços");
        btServico.setToolTipText("");
        btServico.setBorderPainted(false);
        btServico.setContentAreaFilled(false);
        btServico.setEnabled(false);
        btServico.setFocusPainted(false);
        btServico.setMaximumSize(new java.awt.Dimension(230, 50));
        btServico.setMinimumSize(new java.awt.Dimension(120, 45));
        btServico.setOpaque(true);
        btServico.setPreferredSize(new java.awt.Dimension(180, 45));
        btServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btServicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btServicoMouseExited(evt);
            }
        });
        btServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServicoActionPerformed(evt);
            }
        });

        btRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        btRelatorio.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btRelatorio.setText("Relatórios");
        btRelatorio.setToolTipText("");
        btRelatorio.setBorderPainted(false);
        btRelatorio.setContentAreaFilled(false);
        btRelatorio.setFocusPainted(false);
        btRelatorio.setMaximumSize(new java.awt.Dimension(230, 50));
        btRelatorio.setMinimumSize(new java.awt.Dimension(120, 45));
        btRelatorio.setOpaque(true);
        btRelatorio.setPreferredSize(new java.awt.Dimension(180, 45));
        btRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRelatorioMouseExited(evt);
            }
        });
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        btFuncionario.setBackground(new java.awt.Color(0, 0, 0));
        btFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btFuncionario.setText("Funcionarios");
        btFuncionario.setToolTipText("");
        btFuncionario.setBorderPainted(false);
        btFuncionario.setContentAreaFilled(false);
        btFuncionario.setFocusPainted(false);
        btFuncionario.setMaximumSize(new java.awt.Dimension(230, 50));
        btFuncionario.setMinimumSize(new java.awt.Dimension(120, 45));
        btFuncionario.setOpaque(true);
        btFuncionario.setPreferredSize(new java.awt.Dimension(180, 45));
        btFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFuncionarioMouseExited(evt);
            }
        });
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });

        btMovimentacao.setBackground(new java.awt.Color(0, 0, 0));
        btMovimentacao.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btMovimentacao.setForeground(new java.awt.Color(255, 255, 255));
        btMovimentacao.setText("Movimentação");
        btMovimentacao.setToolTipText("");
        btMovimentacao.setBorderPainted(false);
        btMovimentacao.setContentAreaFilled(false);
        btMovimentacao.setFocusPainted(false);
        btMovimentacao.setMaximumSize(new java.awt.Dimension(230, 50));
        btMovimentacao.setMinimumSize(new java.awt.Dimension(120, 45));
        btMovimentacao.setOpaque(true);
        btMovimentacao.setPreferredSize(new java.awt.Dimension(180, 45));
        btMovimentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMovimentacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMovimentacaoMouseExited(evt);
            }
        });
        btMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentacaoActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(0, 0, 0));
        btSair.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btSair.setForeground(new java.awt.Color(255, 255, 255));
        btSair.setText("Sair");
        btSair.setToolTipText("");
        btSair.setBorderPainted(false);
        btSair.setContentAreaFilled(false);
        btSair.setFocusPainted(false);
        btSair.setMaximumSize(new java.awt.Dimension(230, 50));
        btSair.setMinimumSize(new java.awt.Dimension(120, 45));
        btSair.setOpaque(true);
        btSair.setPreferredSize(new java.awt.Dimension(180, 45));
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSairMouseExited(evt);
            }
        });
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btSuporte.setBackground(new java.awt.Color(0, 0, 0));
        btSuporte.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btSuporte.setForeground(new java.awt.Color(255, 255, 255));
        btSuporte.setText("Suporte");
        btSuporte.setToolTipText("");
        btSuporte.setBorderPainted(false);
        btSuporte.setContentAreaFilled(false);
        btSuporte.setFocusPainted(false);
        btSuporte.setMaximumSize(new java.awt.Dimension(230, 50));
        btSuporte.setMinimumSize(new java.awt.Dimension(120, 45));
        btSuporte.setOpaque(true);
        btSuporte.setPreferredSize(new java.awt.Dimension(180, 45));
        btSuporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSuporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSuporteMouseExited(evt);
            }
        });
        btSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnMenuLayout.createSequentialGroup()
                                .addComponent(lbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(2, 2, 2)
                .addComponent(btCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btServico, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(btSuporte, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        getContentPane().add(pnMenu, java.awt.BorderLayout.LINE_START);

        pnCentral.setBackground(new java.awt.Color(218, 239, 249));
        pnCentral.setPreferredSize(new java.awt.Dimension(400, 200));

        painelImagemFundo1.setImg(new ImageIcon(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Version 1.0");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoInicial.png"))); // NOI18N

        lbSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSenha.setText("Senha:");

        lbLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbLogin.setText("Login:");

        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginFocusLost(evt);
            }
        });

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        btLogar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLogar.setText("Entrar");
        btLogar.setFocusPainted(false);
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        btConfiguracoesGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/config.png"))); // NOI18N
        btConfiguracoesGerais.setBorderPainted(false);
        btConfiguracoesGerais.setContentAreaFilled(false);
        btConfiguracoesGerais.setFocusPainted(false);
        btConfiguracoesGerais.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConfiguracoesGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfiguracoesGeraisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelImagemFundo1Layout = new javax.swing.GroupLayout(painelImagemFundo1);
        painelImagemFundo1.setLayout(painelImagemFundo1Layout);
        painelImagemFundo1Layout.setHorizontalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btLogar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(217, 217, 217))
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtLogin))
                    .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtSenha)))
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImagemFundo1Layout.createSequentialGroup()
                        .addComponent(btConfiguracoesGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        painelImagemFundo1Layout.setVerticalGroup(
            painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagemFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btConfiguracoesGerais)
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(painelImagemFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btLogar)
                .addGap(54, 54, 54)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout pnCentralLayout = new javax.swing.GroupLayout(pnCentral);
        pnCentral.setLayout(pnCentralLayout);
        pnCentralLayout.setHorizontalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentralLayout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        pnCentralLayout.setVerticalGroup(
            pnCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnCentral, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(819, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
            ClientePrincipal tela = new ClientePrincipal();
            tela.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteMouseEntered
        setButton(btCliente);
    }//GEN-LAST:event_btClienteMouseEntered

    private void btClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClienteMouseExited
        resetButton(btCliente);
    }//GEN-LAST:event_btClienteMouseExited

    private void btServicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btServicoMouseEntered
        setButton(btServico);
    }//GEN-LAST:event_btServicoMouseEntered

    private void btServicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btServicoMouseExited
        resetButton(btServico);
    }//GEN-LAST:event_btServicoMouseExited

    private void btRelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatorioMouseEntered
        setButton(btRelatorio);
    }//GEN-LAST:event_btRelatorioMouseEntered

    private void btRelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatorioMouseExited
        resetButton(btRelatorio);
    }//GEN-LAST:event_btRelatorioMouseExited

    private void btFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFuncionarioMouseEntered
        setButton(btFuncionario);
    }//GEN-LAST:event_btFuncionarioMouseEntered

    private void btFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFuncionarioMouseExited
        resetButton(btFuncionario);
    }//GEN-LAST:event_btFuncionarioMouseExited

    private void btMovimentacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMovimentacaoMouseEntered
        setButton(btMovimentacao);
    }//GEN-LAST:event_btMovimentacaoMouseEntered

    private void btMovimentacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMovimentacaoMouseExited
        resetButton(btMovimentacao);
    }//GEN-LAST:event_btMovimentacaoMouseExited

    private void btSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseEntered
        setButton(btSair);
    }//GEN-LAST:event_btSairMouseEntered

    private void btSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseExited
        resetButton(btSair);
    }//GEN-LAST:event_btSairMouseExited

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        FuncionarioPrincipal tela = new FuncionarioPrincipal();
        tela.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentacaoActionPerformed
        MovimentacaoPrincipal tela = new MovimentacaoPrincipal(user);
        tela.setVisible(true);
    }//GEN-LAST:event_btMovimentacaoActionPerformed

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        try{
            String login = txtLogin.getText();
            String senha= new String(txtSenha.getPassword());
            //System.out.println("login:"+login+"senha:"+senha);
            if(status==true){
                txtLogin.setText("");
                txtSenha.setText("");
                btLogar.setText("Entrar");
                bloquearAcesso();
                status=false;

            }else if(status==false){            
                String senhaCrip = (criptografar(senha));
                User usuario = UserService.find(login);              
                String senhaBanco= usuario.getSenha();
                user=usuario;
                
                if (senhaBanco.equals(senhaCrip)==true){
                    btLogar.setText("Sair");
                    btLogar.setSelected(true);
                    this.usuario=login;
                    liberaAcesso();
                    status=true;
                }
                else{
                    btLogar.setSelected(false);
                    JOptionPane.showMessageDialog(null, "Senha incorreta !");
                    status=false;
                }
            }
        }catch(Exception e){
            bloquearAcesso();
            JOptionPane.showMessageDialog(null, "Usuario invalido ! \n\nVerifique e tente acessar novamente !");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btLogarActionPerformed

    private void btServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServicoActionPerformed
        ServicoPrincipal tela = new ServicoPrincipal(user);
        tela.setVisible(true);
    }//GEN-LAST:event_btServicoActionPerformed

    private void txtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusLost
        String minuscula= txtLogin.getText();
        txtLogin.setText(minuscula.toUpperCase());
    }//GEN-LAST:event_txtLoginFocusLost

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
           btLogar.requestFocus(true);
           btLogar.doClick();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        RelatoriosPrincipal tela = new RelatoriosPrincipal();
        tela.setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

    private void btSuporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuporteMouseEntered
        setButton(btSuporte);
    }//GEN-LAST:event_btSuporteMouseEntered

    private void btSuporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuporteMouseExited
        resetButton(btSuporte);
    }//GEN-LAST:event_btSuporteMouseExited

    private void btSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuporteActionPerformed
        Suporte.setLocationRelativeTo(null);
        Suporte.setModal(true);
        Suporte.setVisible(true);
    }//GEN-LAST:event_btSuporteActionPerformed

    private void btConfiguracoesGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfiguracoesGeraisActionPerformed

        new Thread() {
            @Override
                public void run() {
                    Configuracao config = new Configuracao();
                    txtRazaoSocial.setText(config.pesquisar().getRazaoSocial());
                    txtResponsavelLegal.setText(config.pesquisar().getResponsavelLegal());
                    txtCNPJ.setText(config.pesquisar().getCnpj());
                    txtEmail.setText(config.pesquisar().getEmail());
                    txtSenhaEmail.setText(config.pesquisar().getSenha());
                    txtSMTP.setText(config.pesquisar().getSmtp());
                    txtPortaSMTP.setText(config.pesquisar().getPortaSMTP());
                    txtMensagemPadraoEmail.setText(config.pesquisar().getMensagemPadrao());
                    if(config.pesquisar().getSSL().equals("T")){
                        cbSSL.setSelected(true);
                    }else{
                        cbSSL.setSelected(false); 
                    }

                    if(config.pesquisar().getTLS().equals("T")){
                        cbTLS.setSelected(true);
                    }else{
                        cbTLS.setSelected(false); 
                    }  
                }
        }.start();
        
        ConfiguracoesGerais.setModal(true);
        ConfiguracoesGerais.setLocationRelativeTo(null);
        ConfiguracoesGerais.setVisible(true);
                
    }//GEN-LAST:event_btConfiguracoesGeraisActionPerformed
           
    private static void setButton(JButton botao){
        botao.setBackground(new Color(58,58,58));
        botao.setFont(new Font("Trebuchet MS",1,19));
    }
    
    private static void resetButton(JButton botao){
        botao.setBackground(new Color(0,0,0));
        botao.setFont(new Font("Trebuchet MS",1,18));
    }
    
    private void bloquearAcesso(){
        txtLogin.setEnabled(true);
        txtSenha.setEnabled(true);      
        btCliente.setEnabled(false);
        btFuncionario.setEnabled(false);
        btServico.setEnabled(false);
        btRelatorio.setEnabled(false);
        btMovimentacao.setEnabled(false);
        btConfiguracoesGerais.setEnabled(false);
        btLogar.setSelected(false);
        txtLogin.requestFocus(true);
    }
    
    private void liberaAcesso(){
        txtLogin.setEnabled(false);
        txtSenha.setEnabled(false);
        btCliente.setEnabled(true);
        btFuncionario.setEnabled(true);
        btServico.setEnabled(true);
        btConfiguracoesGerais.setEnabled(true);
        btRelatorio.setEnabled(true);
        btMovimentacao.setEnabled(true);
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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Suporte;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btConfiguracoesGerais;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JToggleButton btLogar;
    private javax.swing.JButton btMovimentacao;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btServico;
    private javax.swing.JButton btSuporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbMenu;
    private javax.swing.JLabel lbSenha;
    private view.painelImagemFundo painelImagemFundo1;
    private javax.swing.JPanel pnCentral;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnSuporte;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
