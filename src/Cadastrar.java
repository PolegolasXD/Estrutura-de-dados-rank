
import java.awt.Color;
import modelo.Usuario;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Cadastrar extends javax.swing.JFrame {
    private Usuario usuario = new Usuario();

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
        initComponents();
    }
    
    private void abrirLogin()
    {
         new Login().setVisible(true);
         dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNome = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbLogar = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        jtfConSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);
        setSize(new java.awt.Dimension(472, 514));

        jtfNome.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jtfNome.setText("Nome");
        jtfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNomeFocusLost(evt);
            }
        });
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jtfEmail.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jtfEmail.setText("Email");
        jtfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfEmailFocusLost(evt);
            }
        });

        jbCadastrar.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro");

        jbLogar.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jbLogar.setText("Logar");
        jbLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogarActionPerformed(evt);
            }
        });

        jtfSenha.setText("********");
        jtfSenha.setMinimumSize(new java.awt.Dimension(64, 26));
        jtfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfSenhaFocusLost(evt);
            }
        });

        jtfConSenha.setText("********");
        jtfConSenha.setMinimumSize(new java.awt.Dimension(64, 26));
        jtfConSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfConSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfConSenhaFocusLost(evt);
            }
        });
        jtfConSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jbLogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNome)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfConSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfConSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jbLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(516, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogarActionPerformed
        abrirLogin();
        Cadastrar.this.dispose();
        
    }//GEN-LAST:event_jbLogarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        usuario.cadastrarUsuario(jtfNome.getText(),jtfEmail.getText(), jtfSenha.getText(),jtfConSenha.getText());
        
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeFocusGained
           if(jtfNome.getText().equals("Nome")){
                jtfNome.setText("");
                jtfNome.setForeground(new Color(0,0,0));
            }
    }//GEN-LAST:event_jtfNomeFocusGained

    private void jtfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeFocusLost
          if(jtfNome.getText().equals("")){
                jtfNome.setText("Nome");
                jtfNome.setForeground(new Color(51,51,51));
            }
    }//GEN-LAST:event_jtfNomeFocusLost

    private void jtfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailFocusGained
         if(jtfEmail.getText().equals("Email")){
                jtfEmail.setText("");
                jtfEmail.setForeground(new Color(0,0,0));
            }
    }//GEN-LAST:event_jtfEmailFocusGained

    private void jtfEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEmailFocusLost
        if(jtfEmail.getText().equals("")){
                jtfEmail.setText("Email");
                jtfEmail.setForeground(new Color(51,51,51));
            }
    }//GEN-LAST:event_jtfEmailFocusLost

    private void jtfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfSenhaFocusGained
         if(jtfSenha.getText().equals("********")){
                jtfSenha.setText("");
                jtfSenha.setForeground(new Color(0,0,0));
            }
    }//GEN-LAST:event_jtfSenhaFocusGained

    private void jtfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfSenhaFocusLost
        if(jtfSenha.getText().equals("")){
                jtfSenha.setText("********");
                jtfSenha.setForeground(new Color(51,51,51));
            }
    }//GEN-LAST:event_jtfSenhaFocusLost

    private void jtfConSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfConSenhaFocusGained
        if(jtfConSenha.getText().equals("********")){
                jtfConSenha.setText("");
                jtfConSenha.setForeground(new Color(0,0,0));
            }
    }//GEN-LAST:event_jtfConSenhaFocusGained

    private void jtfConSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfConSenhaFocusLost
        if(jtfConSenha.getText().equals("")){
                jtfConSenha.setText("********");
                jtfConSenha.setForeground(new Color(51,51,51));
            }
    }//GEN-LAST:event_jtfConSenhaFocusLost

    private void jtfConSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfConSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cadastrar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLogar;
    private javax.swing.JPasswordField jtfConSenha;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
