package br.edu.ifsp.pep.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class MenuAdministradorView extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuFuncionariosView
     */
    public MenuAdministradorView() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bIconeGym = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bFuncionario = new javax.swing.JButton();
        bModalidade = new javax.swing.JButton();
        bTurma = new javax.swing.JButton();
        bAluno = new javax.swing.JButton();
        lFuncionario = new javax.swing.JLabel();
        lModalidae = new javax.swing.JLabel();
        lAluno = new javax.swing.JLabel();
        lTurma = new javax.swing.JLabel();
        bDeslogar = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        bMatricula = new javax.swing.JButton();
        lMatricula = new javax.swing.JLabel();
        bRelatorio = new javax.swing.JButton();
        lRelatorio = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel17.setText("jLabel17");

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrador");
        setMinimumSize(new java.awt.Dimension(690, 526));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(690, 526));

        bIconeGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/gym.png"))); // NOI18N
        bIconeGym.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/id-card.png"))); // NOI18N
        bFuncionario.setBorder(null);
        bFuncionario.setBorderPainted(false);
        bFuncionario.setContentAreaFilled(false);
        bFuncionario.setDefaultCapable(false);
        bFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFuncionarioActionPerformed(evt);
            }
        });

        bModalidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/sport.png"))); // NOI18N
        bModalidade.setBorder(null);
        bModalidade.setBorderPainted(false);
        bModalidade.setContentAreaFilled(false);
        bModalidade.setDefaultCapable(false);
        bModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModalidadeActionPerformed(evt);
            }
        });

        bTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/turma.png"))); // NOI18N
        bTurma.setBorder(null);
        bTurma.setBorderPainted(false);
        bTurma.setContentAreaFilled(false);
        bTurma.setDefaultCapable(false);
        bTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTurmaActionPerformed(evt);
            }
        });

        bAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/aluno.png"))); // NOI18N
        bAluno.setBorder(null);
        bAluno.setBorderPainted(false);
        bAluno.setContentAreaFilled(false);
        bAluno.setDefaultCapable(false);
        bAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlunoActionPerformed(evt);
            }
        });

        lFuncionario.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lFuncionario.setText("Funcionário");

        lModalidae.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lModalidae.setText("Modalidade");

        lAluno.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lAluno.setText("Aluno");

        lTurma.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lTurma.setText("Turma");

        bDeslogar.setText("Deslogar");
        bDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeslogarActionPerformed(evt);
            }
        });

        bFechar.setText("Fechar");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        bMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/registration.png"))); // NOI18N
        bMatricula.setBorder(null);
        bMatricula.setBorderPainted(false);
        bMatricula.setContentAreaFilled(false);
        bMatricula.setDefaultCapable(false);
        bMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMatriculaActionPerformed(evt);
            }
        });

        lMatricula.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lMatricula.setText("Matricula");

        bRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/relatorio.png"))); // NOI18N
        bRelatorio.setBorder(null);
        bRelatorio.setBorderPainted(false);
        bRelatorio.setContentAreaFilled(false);
        bRelatorio.setDefaultCapable(false);
        bRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioActionPerformed(evt);
            }
        });

        lRelatorio.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lRelatorio.setText("Relatório");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bFuncionario)
                        .addComponent(lFuncionario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lMatricula))
                    .addComponent(bMatricula))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lModalidae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lRelatorio)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(122, 122, 122)
                                    .addComponent(bAluno))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bModalidade)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(lAluno)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bRelatorio)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lTurma)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bTurma)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bModalidade))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lFuncionario)
                                .addGap(40, 40, 40)
                                .addComponent(bMatricula)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lMatricula)
                            .addComponent(lModalidae))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(bTurma)
                        .addGap(18, 18, 18)
                        .addComponent(lTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(bRelatorio)
                        .addGap(18, 18, 18)
                        .addComponent(lRelatorio)
                        .addGap(106, 106, 106))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(bIconeGym)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bIconeGym)
                .addGap(177, 177, 177))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlunoActionPerformed
        AlunoView alunoView = new  AlunoView();
        alunoView.setVisible(true);
    }//GEN-LAST:event_bAlunoActionPerformed

    private void bTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTurmaActionPerformed
        TurmaView turmaView = new  TurmaView();
        turmaView.setVisible(true);
    }//GEN-LAST:event_bTurmaActionPerformed

    private void bModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModalidadeActionPerformed
        ModalidadeView modalidadeView = new  ModalidadeView();
        modalidadeView.setVisible(true);
    }//GEN-LAST:event_bModalidadeActionPerformed

    private void bFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFuncionarioActionPerformed
        FuncionarioView funcionarioView = new  FuncionarioView();
        funcionarioView.setVisible(true);
    }//GEN-LAST:event_bFuncionarioActionPerformed

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
         System.exit(0);
    }//GEN-LAST:event_bFecharActionPerformed

    private void bDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeslogarActionPerformed
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bDeslogarActionPerformed

    private void bMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMatriculaActionPerformed
        MatricularView matricularView = new MatricularView();
        matricularView.setVisible(true);
    }//GEN-LAST:event_bMatriculaActionPerformed

    private void bRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioActionPerformed
        RelatoriosView relatoriosView = new RelatoriosView();
        relatoriosView.setVisible(true);
    }//GEN-LAST:event_bRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministradorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAluno;
    private javax.swing.JButton bDeslogar;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bFuncionario;
    private javax.swing.JButton bIconeGym;
    private javax.swing.JButton bMatricula;
    private javax.swing.JButton bModalidade;
    private javax.swing.JButton bRelatorio;
    private javax.swing.JButton bTurma;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lAluno;
    private javax.swing.JLabel lFuncionario;
    private javax.swing.JLabel lMatricula;
    private javax.swing.JLabel lModalidae;
    private javax.swing.JLabel lRelatorio;
    private javax.swing.JLabel lTurma;
    // End of variables declaration//GEN-END:variables
}
