/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.FrequenciaDAO;
import br.edu.ifsp.pep.dao.FuncionarioDAO;
import br.edu.ifsp.pep.modelo.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author murilo
 */
public class LoginView extends javax.swing.JFrame {

   private Funcionario funcionario;
   private List<Funcionario> funcionarios;
   private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
   private final FrequenciaDAO frequenciaDAO = new FrequenciaDAO();
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        
        initComponents();
        funcionarios = funcionarioDAO.findByCargo("Administrador");
        if (funcionarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe nenhum usuário administrador, insira um para começar a usar o sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            FuncionarioInserirView funcionarioInserirView = new FuncionarioInserirView();
            funcionarioInserirView.setarCargo();
            funcionarioInserirView.setVisible(true);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pImagem = new javax.swing.JPanel();
        bIconeGym = new javax.swing.JButton();
        pLogin = new javax.swing.JPanel();
        lLogin = new javax.swing.JLabel();
        lUsername = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        lPassword = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        pfSenha = new javax.swing.JPasswordField();
        bSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pImagem.setBackground(new java.awt.Color(102, 204, 255));

        bIconeGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/gym.png"))); // NOI18N
        bIconeGym.setBorder(null);
        bIconeGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIconeGymActionPerformed(evt);
            }
        });

        pLogin.setBackground(new java.awt.Color(255, 255, 255));

        lLogin.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lLogin.setText("LOGIN");

        lUsername.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lUsername.setText("Username");

        tfLogin.setBackground(new java.awt.Color(204, 204, 204));
        tfLogin.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        lPassword.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lPassword.setText("Password");

        bEntrar.setBackground(new java.awt.Color(0, 153, 255));
        bEntrar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        pfSenha.setBackground(new java.awt.Color(204, 204, 204));
        pfSenha.setFont(new java.awt.Font("Liberation Sans", 0, 17)); // NOI18N

        bSair.setBackground(new java.awt.Color(255, 51, 51));
        bSair.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(lLogin))
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lUsername)
                            .addComponent(lPassword)
                            .addComponent(tfLogin)
                            .addComponent(bEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pfSenha)
                            .addComponent(bSair, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(lLogin)
                .addGap(76, 76, 76)
                .addComponent(lUsername)
                .addGap(18, 18, 18)
                .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lPassword)
                .addGap(18, 18, 18)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(bEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSair)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pImagemLayout = new javax.swing.GroupLayout(pImagem);
        pImagem.setLayout(pImagemLayout);
        pImagemLayout.setHorizontalGroup(
            pImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pImagemLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(bIconeGym)
                .addGap(225, 225, 225)
                .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pImagemLayout.setVerticalGroup(
            pImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pImagemLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(bIconeGym)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        if (tfLogin.getText().length() > 0) {
            String senha = String.valueOf(pfSenha.getPassword());
            if (senha.length() > 0) {
                funcionarios = funcionarioDAO.findByLogin(tfLogin.getText());
                if (!funcionarios.isEmpty()) {
                    funcionario = funcionarios.get(0);
                    if (funcionario.getSenha().equals(senha)) {
                        if (funcionario.getCargo().equals("Funcionario")) {
                            MenuFuncionarioView menuFuncionarioView = new MenuFuncionarioView();
                            menuFuncionarioView.setVisible(true);
                            this.dispose();
                        } else {
                            MenuAdministradorView menuAdministradorView = new MenuAdministradorView();
                            menuAdministradorView.setVisible(true);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha não cadastrada.", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Login não cadastrado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite a senha para entrar.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite o login para entrar.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bEntrarActionPerformed

    private void bIconeGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIconeGymActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIconeGymActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bIconeGym;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lUsername;
    private javax.swing.JPanel pImagem;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfLogin;
    // End of variables declaration//GEN-END:variables
}
