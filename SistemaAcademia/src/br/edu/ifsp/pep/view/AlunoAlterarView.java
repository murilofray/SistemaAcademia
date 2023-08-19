/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.AlunoDAO;
import br.edu.ifsp.pep.modelo.Aluno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class AlunoAlterarView extends javax.swing.JDialog {

    private AlunoDAO alunoDAO = new AlunoDAO();
    private List<Aluno> alunos;
    private Aluno aluno;

    /**
     * Creates new form AlunoInserirView
     */
    public AlunoAlterarView() {
        initComponents();
        this.inicializarDataChooser();
    }

    void inicializarDataChooser() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dData.setMinSelectableDate(format.parse("01/01/1922"));
        } catch (ParseException ex) {
            Logger.getLogger(AlunoInserirView.class.getName()).log(Level.SEVERE, null, ex);
        }

        dData.setMaxSelectableDate(new Date());;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bIcone = new javax.swing.JButton();
        lNome = new javax.swing.JLabel();
        lDataNascimento = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        lCep = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfCep = new javax.swing.JTextField();
        dData = new com.toedter.calendar.JDateChooser();
        cbSexo = new javax.swing.JComboBox<>();
        lSexo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bAlterar.setText("Alterar");
        bAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bAlterar.setPreferredSize(new java.awt.Dimension(42, 24));
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bCancelar.setPreferredSize(new java.awt.Dimension(42, 24));
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/aluno.png"))); // NOI18N
        bIcone.setBorder(null);
        bIcone.setBorderPainted(false);
        bIcone.setContentAreaFilled(false);
        bIcone.setDefaultCapable(false);

        lNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lNome.setText("Nome:");

        lDataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lDataNascimento.setText("Data de Nascimento:");

        lCpf.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lCpf.setText("CPF:");

        lTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lTelefone.setText("Telefone:");

        lCep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lCep.setText("CEP:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Masculino", "Feminino" }));

        lSexo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lSexo.setText("Sexo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lNome)
                                .addComponent(lDataNascimento)
                                .addComponent(lCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCep, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lSexo)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bIcone)
                        .addGap(324, 324, 324))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lDataNascimento)
                    .addComponent(dData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCep)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    protected void carregarDados(Aluno alunoParamentro) {
        this.aluno = alunoParamentro;
        tfNome.setText(aluno.getNome());
        tfCpf.setText(aluno.getCpf());
        tfCep.setText(aluno.getCep());
        tfTelefone.setText(aluno.getTelefone());
        dData.setDate(aluno.getDataNascimento());
        if (aluno.getSexo().equals("Masculino")) {
            cbSexo.setSelectedIndex(1);
        } else {
            cbSexo.setSelectedIndex(2);
        }
    }


    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        String nome = tfNome.getText();
        String cpf = tfCpf.getText();
        String telefone = tfTelefone.getText();
        String cep = tfCep.getText();
        String sexo = (String) cbSexo.getSelectedItem();
        String mensagem = "Aluno Alterado!";
        if (nome.length() > 2) {
            if (nome.length() <= 100) {
                if (cpf.matches("^\\d{11}+$")) {
                    if (dData.getDate() != null) {
                        if (cbSexo.getSelectedIndex() > 0) {
                            if ("".equals(telefone) || telefone.matches("^\\d{11}+$")) {
                                if ("".equals(cep) || cep.matches("^\\d{8}+$")) {
                                    alunos = alunoDAO.findByCpf(cpf);
                                    if (aluno.getCpf().equals(cpf) || alunos.isEmpty()) {
                                        aluno.setNome(nome);
                                        aluno.setCep(cep);
                                        aluno.setCpf(cpf);
                                        aluno.setDataNascimento(dData.getDate());
                                        aluno.setTelefone(telefone);
                                        aluno.setSexo(sexo);
                                        try {
                                            alunoDAO.alterar(aluno);
                                            JOptionPane.showMessageDialog(null, mensagem);

                                            this.setVisible(false);

                                        } catch (Exception ex) {
                                            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "CPF já cadastrado.", "Atenção", JOptionPane.WARNING_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Informe os 8 dígitos para o cep, somente números(caso não saiba, deixe em branco).", "Atenção", JOptionPane.WARNING_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "São aceitos apenas números para o telefone(caso não saiba, deixe em branco).", "Atenção", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Selecione o sexo do aluno.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Informe a data de nascimento.", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Informe os 11 dígitos para o cpf, somente números.", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade maxima de caracteres no campo nome é 100. Quantidade Digitada = " + nome.length(), "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe pelo menos 3 caracteres no campo nome.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoAlterarView().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bIcone;
    private javax.swing.JComboBox<String> cbSexo;
    private com.toedter.calendar.JDateChooser dData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lDataNascimento;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lSexo;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}