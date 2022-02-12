/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Produto;

import java.text.NumberFormat;
import util.ValidaNumeros;
import util.data;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Product;
import model.User;
import service.ProductService;

/**
 *
 * @author Jonas Santos
 */
public class ProdutoPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoPrincipal
     */
    User user;

    public ProdutoPrincipal(User usuario) {
        initComponents();
        user = usuario;
        TableColumnModel modeltable = grid.getColumnModel();
        modeltable.getColumn(0).setPreferredWidth(70);
        modeltable.getColumn(1).setPreferredWidth(250);
        modeltable.getColumn(2).setPreferredWidth(140);
        modeltable.getColumn(3).setPreferredWidth(150);
        modeltable.getColumn(4).setPreferredWidth(150);
        modeltable.getColumn(5).setPreferredWidth(150);
        txtCodigo.setDocument(new ValidaNumeros());
    }

    private ProdutoPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbCodigo3 = new javax.swing.JLabel();
        lbCodigo4 = new javax.swing.JLabel();
        lbLenlist = new javax.swing.JLabel();
        ckInativo = new javax.swing.JCheckBox();
        txtLimite = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btIncluir = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbPainelBotoes = new javax.swing.JLabel();
        lbmenu = new javax.swing.JLabel();
        lbfundo = new javax.swing.JLabel();
        lbimagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lbTitulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Serviços");
        lbTitulo.setOpaque(true);
        getContentPane().add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 690, 50));

        lbCodigo3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbCodigo3.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo3.setText("Descrição");
        getContentPane().add(lbCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lbCodigo4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbCodigo4.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo4.setText("Limite");
        getContentPane().add(lbCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        lbLenlist.setForeground(new java.awt.Color(255, 255, 255));
        lbLenlist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbLenlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 220, 30));

        ckInativo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ckInativo.setForeground(new java.awt.Color(255, 255, 255));
        ckInativo.setText("Listar Inativos");
        ckInativo.setOpaque(false);
        getContentPane().add(ckInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtLimite.setText("500");
        getContentPane().add(txtLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, -1));

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, -1));

        btAlterar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaoefetivar5.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setToolTipText("");
        btAlterar.setBorderPainted(false);
        btAlterar.setContentAreaFilled(false);
        btAlterar.setFocusPainted(false);
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setRequestFocusEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 160, 50));

        btIncluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btIncluir.setForeground(new java.awt.Color(255, 255, 255));
        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaoefetivar5.png"))); // NOI18N
        btIncluir.setText("Incluir");
        btIncluir.setToolTipText("");
        btIncluir.setBorderPainted(false);
        btIncluir.setContentAreaFilled(false);
        btIncluir.setFocusPainted(false);
        btIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIncluir.setRequestFocusEnabled(false);
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btIncluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 150, 50));

        btFechar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btFechar.setForeground(new java.awt.Color(255, 255, 255));
        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaocancelar6.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.setToolTipText("");
        btFechar.setBorderPainted(false);
        btFechar.setContentAreaFilled(false);
        btFechar.setFocusPainted(false);
        btFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFechar.setRequestFocusEnabled(false);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 140, 50));

        btExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaocancelar6.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("");
        btExcluir.setBorderPainted(false);
        btExcluir.setContentAreaFilled(false);
        btExcluir.setFocusPainted(false);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setRequestFocusEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 140, 50));

        btPesquisar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaoefetivar5.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setToolTipText("");
        btPesquisar.setBorderPainted(false);
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setFocusPainted(false);
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setRequestFocusEnabled(false);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 140, 50));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jScrollPane1.setOpaque(false);

        grid.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Valor", "Data Alteracao", "Data Cadastro", "Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grid.setToolTipText("");
        grid.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        grid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        grid.setGridColor(new java.awt.Color(239, 239, 239));
        grid.setName(""); // NOI18N
        grid.setSelectionBackground(new java.awt.Color(216, 216, 216));
        grid.setSelectionForeground(new java.awt.Color(61, 61, 61));
        grid.setShowHorizontalLines(false);
        grid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 690, 440));

        lbCodigo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("Código");
        getContentPane().add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 220, -1));

        btLimpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/botaoefetivar5.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setToolTipText("");
        btLimpar.setBorderPainted(false);
        btLimpar.setContentAreaFilled(false);
        btLimpar.setFocusPainted(false);
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 280, 90));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtros");
        jLabel1.setMaximumSize(new java.awt.Dimension(58, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(58, 30));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(58, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 279, 50));

        lbPainelBotoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPainelBotoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ClientePrincipal_fundo.png"))); // NOI18N
        lbPainelBotoes.setToolTipText("");
        getContentPane().add(lbPainelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 670, 50));

        lbmenu.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        lbmenu.setForeground(new java.awt.Color(255, 255, 255));
        lbmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/menuClientePrincipal_fundo.png"))); // NOI18N
        lbmenu.setText("Filtros");
        getContentPane().add(lbmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 540));

        lbfundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ClientePrincipal_fundo.png"))); // NOI18N
        getContentPane().add(lbfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 690, 540));

        lbimagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbimagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FundoTelaInicial.jpg"))); // NOI18N
        getContentPane().add(lbimagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        setSize(new java.awt.Dimension(1019, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        String minuscula = txtDescricao.getText();
        txtDescricao.setText(minuscula.toUpperCase());

    }//GEN-LAST:event_txtDescricaoFocusLost

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            Object obj = grid.getValueAt(grid.getSelectedRow(), 0);
            AlterarServico alterar = new AlterarServico(obj.toString(), user);
            alterar.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Selecione o produto que deseja alterar");
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        IncluirProduto incluir = new IncluirProduto(user);
        incluir.setVisible(true);
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        int codigo = txtCodigo.getText().equals("") ? 0 : Integer.parseInt(txtCodigo.getText());
        String cbInativo = ckInativo.isSelected() == false ? "F" : "T";
        String descricao = txtDescricao.getText();
        String limite = txtLimite.getText();
        List<Product> select = ProductService.findAll(String.valueOf(codigo), descricao, cbInativo, limite);

        DefaultTableModel modelo = (DefaultTableModel) grid.getModel();
        modelo.setNumRows(0);
        centralizar(grid, 0);
        centralizar(grid, 1);
        centralizar(grid, 2);
        centralizar(grid, 3);
        centralizar(grid, 4);
        centralizar(grid, 5);

        try {
            String lenlist = String.valueOf(select.size());
            for (Product prod : select) {
                String codigoformat = String.valueOf(prod.getCodigo());
                modelo.addRow(new Object[]{codigoformat, prod.getDescricao(), NumberFormat.getCurrencyInstance().format(prod.getPreco()), data.formataDataBD(prod.getData_alteracao()), data.formataDataBD(prod.getData_cadastro()), prod.getUsuario()});
            }
            if (lenlist.equals("1")) {
                lbLenlist.setText("A pesquisa retornou " + lenlist + " registro");
            } else {
                lbLenlist.setText("A pesquisa retornou " + lenlist + " registros");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no momento de listar Produtos, contate o suporte técnico");
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void gridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridMouseClicked
        if (evt.getClickCount() == 2) {
            Object obj = grid.getValueAt(grid.getSelectedRow(), 0);
            AlterarServico alterar = new AlterarServico(obj.toString(), user);
            alterar.setVisible(true);
        }
    }//GEN-LAST:event_gridMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtDescricao.setText("");
        txtCodigo.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            String codServicoSelecionado = grid.getValueAt(grid.getSelectedRow(), 0).toString();
            String descServicoSelecionado = grid.getValueAt(grid.getSelectedRow(), 1).toString();
            int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja excluir o produto selecionado ? \n Produto: " + codServicoSelecionado + " | " + descServicoSelecionado, "**** Atenção ****", 1);

            if (confirmacao == 0) {
                int cod = Integer.parseInt(codServicoSelecionado);
                ProductService.delete(cod);
            }
            btPesquisar.doClick();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Selecione o produto que deseja excluir !");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private static void centralizar(JTable table, int column) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(column).setCellRenderer(centerRenderer);
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
            java.util.logging.Logger.getLogger(ProdutoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JCheckBox ckInativo;
    private javax.swing.JTable grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo3;
    private javax.swing.JLabel lbCodigo4;
    private javax.swing.JLabel lbLenlist;
    private javax.swing.JLabel lbPainelBotoes;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbfundo;
    private javax.swing.JLabel lbimagem;
    private javax.swing.JLabel lbmenu;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtLimite;
    // End of variables declaration//GEN-END:variables
}
