/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.dao.ModalidadeDAO;
import br.edu.ifsp.pep.dao.TurmaDAO;
import br.edu.ifsp.pep.modelo.Modalidade;
import br.edu.ifsp.pep.modelo.Turma;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author muril
 */
public class TurmaAlterarView extends javax.swing.JDialog {

    private final TurmaDAO turmaDAO = new TurmaDAO();
    private final ModalidadeDAO modalidadeDAO = new ModalidadeDAO();
    private Turma turma;

    public TurmaAlterarView() {
        initComponents();
    }

    private void carregarTiposModalidades() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbModalidade.getModel();
        for (Modalidade modalidade : modalidadeDAO.findAll()) {
            modelo.addElement(modalidade);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lId = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        bIcon = new javax.swing.JButton();
        tfDescricao = new javax.swing.JTextField();
        lDescricao = new javax.swing.JLabel();
        lCapacidade = new javax.swing.JLabel();
        tfCapacidade = new javax.swing.JTextField();
        ftfHoraFim = new javax.swing.JFormattedTextField();
        lHoraFim = new javax.swing.JLabel();
        lHoraInicio = new javax.swing.JLabel();
        ftfHoraInicio = new javax.swing.JFormattedTextField();
        cbModalidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lId.setText("*Modalide:");

        lNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lNome.setText("*Nome:");

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

        bIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsp/pep/imagens/turma.png"))); // NOI18N
        bIcon.setBorder(null);
        bIcon.setBorderPainted(false);
        bIcon.setContentAreaFilled(false);
        bIcon.setDefaultCapable(false);

        lDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lDescricao.setText("Descrição:");

        lCapacidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lCapacidade.setText("*Capacidade maxima:");

        ftfHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));

        lHoraFim.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lHoraFim.setText("*Horario Fim:");

        lHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lHoraInicio.setText("*Horario Inicio:");

        ftfHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));

        cbModalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("* Campos Obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lHoraFim, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lCapacidade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ftfHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ftfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfCapacidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cbModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(257, 257, 257))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(bIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bIcon)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lId)
                    .addComponent(cbModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lHoraInicio)
                            .addComponent(ftfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftfHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lHoraFim))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCapacidade))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        String mensagem = "Turma Alterada!";
        String nome = tfNome.getText();
        String descricao = tfDescricao.getText();

        if (cbModalidade.getSelectedIndex() > 0) {
            Modalidade modalidade = (Modalidade) cbModalidade.getSelectedItem();
            if (nome.length() > 2) {
                if (nome.length() <= 100) {
                    if (descricao.equals("") || descricao.length() <= 100) {
                        if (tfCapacidade.getText().length() > 0) {
                            if (tfCapacidade.getText().matches("^\\d+$")) {
                                int capacidade = Integer.parseInt(tfCapacidade.getText());
                                DateFormat formatador = new SimpleDateFormat("HH:mm");
                                Date data;
                                try {
                                    data = formatador.parse(ftfHoraInicio.getText());
                                    Time horaInicio = new Time(data.getTime());
                                    data = formatador.parse(ftfHoraFim.getText());
                                    Time horaFim = new Time(data.getTime());
                                    turma.setNome(nome);
                                    turma.setDescricao(descricao);
                                    turma.setModalidadeId(modalidade);
                                    turma.setCapacidadeMaxima(capacidade);
                                    turma.setHorarioFim(horaFim);
                                    turma.setHorarioInicio(horaInicio);
                                    try {
                                        turmaDAO.alterar(turma);
                                        JOptionPane.showMessageDialog(null, mensagem);
                                        this.setVisible(false);

                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                                    }

                                } catch (ParseException ex) {
                                    Logger.getLogger(TurmaInserirView.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Digite somente números para capacidade.", "Atenção", JOptionPane.WARNING_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Digite a capacidade máxima da turma.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Quantidade maxima de caracteres no campo nome é 100. Quantidade Digitada = " + nome.length(), "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade maxima de caracteres no campo descrição é 100. Quantidade Digitada = " + descricao.length(), "Atenção", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Digite ao menos 3 caracteres no nome.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione a modalidade da turma.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_bAlterarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    
    protected void carregarDados(Turma turmaParametro) {
        this.carregarTiposModalidades();
        this.turma = turmaParametro;
        DateFormat formato = new SimpleDateFormat("HH:mm:ss");
        String horaFormatadaInicio = formato.format(turma.getHorarioInicio());
        String horaFormatadaFim = formato.format(turma.getHorarioFim());
        tfNome.setText(turma.getNome());
        tfDescricao.setText(turma.getDescricao());
        cbModalidade.setSelectedItem(turma.getModalidadeId());
        tfCapacidade.setText(Integer.toString(turma.getCapacidadeMaxima()));
        ftfHoraInicio.setText(horaFormatadaInicio);
        ftfHoraFim.setText(horaFormatadaFim);
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
            java.util.logging.Logger.getLogger(TurmaAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurmaAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurmaAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurmaAlterarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TurmaAlterarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bIcon;
    private javax.swing.JComboBox<String> cbModalidade;
    private javax.swing.JFormattedTextField ftfHoraFim;
    private javax.swing.JFormattedTextField ftfHoraInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lCapacidade;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lHoraFim;
    private javax.swing.JLabel lHoraInicio;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lNome;
    private javax.swing.JTextField tfCapacidade;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
