/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.AlunoDAO;
import br.edu.ifsp.pep.modelo.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivi
 */
public class AlunoView extends javax.swing.JDialog {

    private final AlunoDAO alunoDAO = new AlunoDAO();
    private List<Aluno> alunos = alunoDAO.findAll();
    private Aluno aluno;

    /**
     * Creates new form TelaFuncionarioView
     */
    public AlunoView() {
        initComponents();
        this.atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        bVoltar = new javax.swing.JButton();
        bVisualizar = new javax.swing.JButton();
        bInserir = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cbPesquisa = new javax.swing.JComboBox<>();
        bPesquisa = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lTitulo.setText("Alunos");
        lTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bVoltar.setText("Voltar");
        bVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        bVisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bVisualizar.setText("Visualizar");
        bVisualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVisualizarActionPerformed(evt);
            }
        });

        bInserir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bInserir.setText("Inserir");
        bInserir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        bAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAlterar.setText("Alterar");
        bAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(bVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(bInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(bAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(bExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/aluno.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setDefaultCapable(false);

        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome:", "Id:", "Sexo:", "Cpf:" }));

        bPesquisa.setText("Pesquisar");
        bPesquisa.setActionCommand("bor");
        bPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lTitulo)
                                .addGap(21, 21, 21)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        AlunoInserirView alunoInserirView = new AlunoInserirView();
        alunoInserirView.setVisible(true);
        alunos = alunoDAO.findAll();
        atualizarTabela();
    }//GEN-LAST:event_bInserirActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            AlunoAlterarView alunoAlterarView = new AlunoAlterarView();
            aluno = this.alunos.get(jTable1.getSelectedRow());
            alunoAlterarView.carregarDados(aluno);
            alunoAlterarView.setVisible(true);
            alunos = alunoDAO.findAll();
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bAlterarActionPerformed

    private void bVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisualizarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            AlunoVisualizarView alunoVisualizarView = new AlunoVisualizarView();
            aluno = this.alunos.get(jTable1.getSelectedRow());
            alunoVisualizarView.carregarDados(aluno);
            alunoVisualizarView.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bVisualizarActionPerformed

    private void bPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisaActionPerformed
        int id;
        if (cbPesquisa.getSelectedIndex() == 0) {
            alunos = alunoDAO.findByNome(tfPesquisa.getText());
        } else {
            if (cbPesquisa.getSelectedIndex() == 1) {
                if (tfPesquisa.getText().equals("")) {
                    alunos = alunoDAO.findAll();
                } else {
                    try {
                        id = Integer.parseInt(tfPesquisa.getText());
                        alunos = alunoDAO.findById(id);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Para pesquisar por id, informe apenas números!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                }

            } else {
                if (cbPesquisa.getSelectedIndex() == 2) {
                    alunos = alunoDAO.findBySexo(tfPesquisa.getText());
                } else {
                    if (cbPesquisa.getSelectedIndex() == 3) {
                        if (tfPesquisa.getText().matches("^\\d+$")) {
                            alunos = alunoDAO.findByCpf(tfPesquisa.getText());
                        } else {
                            JOptionPane.showMessageDialog(null, "Para pesquisar por cpf, informe apenas números!", "Atenção", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }

        atualizarTabela();
    }//GEN-LAST:event_bPesquisaActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            aluno = this.alunos.get(jTable1.getSelectedRow());
            Object[] options = {"Confirmar", "Cancelar"};
            if (JOptionPane.showOptionDialog(null, "Ao excluir o aluno todas informações sobre ele serão excluidas junto(informações pessoais, matriculas e frequencias), clique em confirmar para continuar.", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) {
                alunoDAO.remover(aluno);
                alunos = alunoDAO.findAll();
                JOptionPane.showMessageDialog(null, "Aluno Excluído!");
                atualizarTabela();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bExcluirActionPerformed

    private void atualizarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for (Aluno alunoo : alunos) {
            modelo.addRow(new Object[]{alunoo.getId(), alunoo.getNome(), alunoo.getCpf(), alunoo.getSexo()});
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
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bInserir;
    private javax.swing.JButton bPesquisa;
    private javax.swing.JButton bVisualizar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JComboBox<String> cbPesquisa;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
}
