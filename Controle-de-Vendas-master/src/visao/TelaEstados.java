/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import controle.ConectaBanco;
import controle.ModeloTabela;
import utilitarios.UpperCaseDocument;

/**
 *
 * @author frede
 */
public class TelaEstados extends javax.swing.JFrame {

    ConectaBanco conexao = new ConectaBanco(); // instância da classe de conexão
    
    /**
     * Creates new form Estados
     */
    public TelaEstados() {
        initComponents();
        conexao.conectar(); // chamada do método de conexão
        //UpperCaseDocument maiuscula = new UpperCaseDocument();
        preencherTabela("select * from estados order by id_estado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstados = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSigla = new javax.swing.JLabel();
        jtfSigla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstados = new javax.swing.JTable();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        lblCadastroEstados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setResizable(false);

        pnlEstados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCodigo.setText("Código:");

        lblNome.setText("Nome:");

        jtfCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfCodigo.setEnabled(false);

        jtfNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfNome.setEnabled(false);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add32x32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Cadastra um Novo Estado");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save32x32.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar o Estado");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit32x32.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Alterar um Estado");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Delete32x32.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir um Estado");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close32x32.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Sair do Formulário");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblSigla.setText("Sigla:");

        jtfSigla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfSigla.setEnabled(false);

        tblEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEstados);

        btnPrimeiro.setText("<<");
        btnPrimeiro.setToolTipText("Primeiro Registro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setText(">>");
        btnUltimo.setToolTipText("Último Registro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.setToolTipText("Registro Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">");
        btnProximo.setToolTipText("Próximo Registro");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEstadosLayout = new javax.swing.GroupLayout(pnlEstados);
        pnlEstados.setLayout(pnlEstadosLayout);
        pnlEstadosLayout.setHorizontalGroup(
            pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstadosLayout.createSequentialGroup()
                        .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEstadosLayout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEstadosLayout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair)))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(pnlEstadosLayout.createSequentialGroup()
                        .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEstadosLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(10, 10, 10)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSigla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlEstadosLayout.createSequentialGroup()
                                .addComponent(btnPrimeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUltimo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlEstadosLayout.setVerticalGroup(
            pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSigla)
                    .addComponent(jtfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCadastroEstados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCadastroEstados.setForeground(new java.awt.Color(255, 0, 0));
        lblCadastroEstados.setText("Cadastro de Estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEstados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblCadastroEstados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastroEstados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(607, 412));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public void limpaCampos(){
        jtfCodigo.setText("");
        jtfNome.setText("");
        jtfSigla.setText("");
    }
    
    public void atualizaCampos(){
        try {
            if(conexao.rs.isAfterLast()){
                conexao.rs.last();
            }
            if(conexao.rs.isBeforeFirst()){
                conexao.rs.first();
            }
            
            jtfCodigo.setText(""+conexao.rs.getInt("id_estado"));
            jtfNome.setText(conexao.rs.getString("nome_estado"));
            jtfSigla.setText(conexao.rs.getString("sigla_estado"));
            
            setBotoes(false, false, true, true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados: " + e.getMessage());
        }
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into estados (nome_estado, sigla_estado) values (?,?)");
            pst.setString(1, jtfNome.getText());  // passagem dos parâmetros para incluir
            pst.setString(2, jtfSigla.getText()); // passagem dos parâmetros para incluir
            pst.executeUpdate(); // executa insert
            JOptionPane.showMessageDialog(null, "Estado Cadastrado com Sucesso!");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir: " + e.getMessage());
        }
        limpaCampos();
        setCampos(false, false, false);
        setBotoes(true, false, false, false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            //conexao.executaSQL("delete from estados where sigla_estado = '" + jtfSigla.getText() + "'");
            //JOptionPane.showMessageDialog(null, "Estado Excluído com Sucesso!");
            PreparedStatement pst = conexao.conn.prepareStatement("delete from estados where sigla_estado = ?");
            pst.setString(1, jtfSigla.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Estado Excluído com Sucesso!");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir: " + e.getMessage());
        }
        
        limpaCampos();
        setCampos(false, false, false);
        setBotoes(true, false, false, false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCampos();

        jtfNome.setDocument(new UpperCaseDocument());
        jtfSigla.setDocument(new UpperCaseDocument());
        
        setCampos(false, true, true);
        jtfNome.requestFocus();
        setBotoes(false, true, true, true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        setCampos(false, true, true);
        try {
            conexao.executaSQL("select * from estados");
            conexao.rs.first();
            atualizaCampos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados: " + e.getMessage());
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        setCampos(false, true, true);
        try {
            conexao.executaSQL("select * from estados");
            conexao.rs.last();
            atualizaCampos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        setCampos(false, true, true);
        try {
            conexao.rs.previous();
            atualizaCampos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        setCampos(false, true, true);
        try {
            conexao.rs.next();
            atualizaCampos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar Dados: " + e.getMessage());
        }        
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("update estados set nome_estado = ?, sigla_estado = ? where id_estado = ?");
            pst.setString(1, jtfNome.getText());
            pst.setString(2, jtfSigla.getText());
            pst.setInt(3, Integer.parseInt(jtfCodigo.getText()));
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Estado Alterado com Sucesso!");
            preencherTabela("select * from estados order by id_estado");
            
            setCampos(false, false, false);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        String [] Colunas = new String[]{"ID","Estado","UF"};
        conexao.executaSQL(SQL);
        
        try {
            conexao.rs.first();
            do{
              dados.add(new Object[]{conexao.rs.getInt("id_estado"),conexao.rs.getString("nome_estado"),conexao.rs.getString("sigla_estado")});
            }while(conexao.rs.next());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro o ArrayList: " + e.getMessage());
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tblEstados.setModel(modelo);
        
        // CAMPO ID_ESTADO
        tblEstados.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblEstados.getColumnModel().getColumn(0).setResizable(false);
        // CAMPO NOME_ESTADO
        tblEstados.getColumnModel().getColumn(1).setPreferredWidth(180);
        tblEstados.getColumnModel().getColumn(1).setResizable(false);
        // CAMPO SIGLA_ESTADO
        tblEstados.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblEstados.getColumnModel().getColumn(2).setResizable(false);
        
        // CONFIGURAÇÃO TBLESTADOS
        tblEstados.getTableHeader().setReorderingAllowed(false);
        tblEstados.setAutoResizeMode(tblEstados.AUTO_RESIZE_OFF);
        tblEstados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void setCampos(boolean Codigo, boolean Nome, boolean Sigla){
        jtfCodigo.setEnabled(Codigo);
        jtfNome.setEnabled(Nome);
        jtfSigla.setEnabled(Sigla);        
    }

    
    public void setBotoes(boolean btNovo, boolean btSalvar, boolean btAlterar, boolean btExcluir){
        btnNovo.setEnabled(btNovo);
        btnSalvar.setEnabled(btSalvar);
        btnAlterar.setEnabled(btAlterar);        
        btnExcluir.setEnabled(btExcluir);
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
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSigla;
    private javax.swing.JLabel lblCadastroEstados;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JPanel pnlEstados;
    private javax.swing.JTable tblEstados;
    // End of variables declaration//GEN-END:variables
}