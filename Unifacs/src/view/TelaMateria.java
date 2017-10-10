/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.JavaConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Regina
 */
public class TelaMateria extends javax.swing.JFrame {

   Connection conn = null; 
    ResultSet rs =null;
    PreparedStatement pst=null;
    public TelaMateria() {
        initComponents();
        conn = JavaConnect.ConectDb();
        clear();
    }
 private void clear(){
        campopro.setText("");
        campomat.setText("");
        camponota1.setText("");
        camponota2.setText("");
        
    }
 private void Cadastrar (){
     String sql = "insert into BOLETIM (professor,materia,nota1,nota2,media,situação)values(?,?,?,?,?,?)";
     try {
         pst = conn.prepareStatement(sql);
         pst.setString(1, campopro.getText());
         pst.setString(2, campomat.getText());
         pst.setDouble(3, Double.valueOf(camponota1.getText()));
         pst.setDouble(4, Double.valueOf(camponota2.getText()));
         double not,not2,media;
         not =  Double.valueOf(camponota1.getText());
         not2 =  Double.valueOf(camponota2.getText());
         media= ((not*3)+(not2*4))/7;
         if (media < 4.0) {
                pst.setString(6, "REP");
            } 
            
          if (media >= 7.0) {
                pst.setString(6, "AP");
            }
            
            if (media >= 4.0 && media < 7.0) {
                pst.setString(6, "FI");
            }
         pst.setDouble(5, media);
         
         
         pst.execute();
         JOptionPane.showMessageDialog(null, "CADASTRADO");
         voltarTela();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botaotcad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campopro = new javax.swing.JTextField();
        campomat = new javax.swing.JTextField();
        camponota1 = new javax.swing.JTextField();
        camponota2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MATERIAS"));

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaotcad.setText("SALVAR");
        botaotcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaotcadActionPerformed(evt);
            }
        });

        jLabel1.setText("PROFESSOR:");

        jLabel2.setText("MATERIA :");

        jLabel3.setText("NOTA AV1:");

        jLabel4.setText("NOTA AV2");

        campopro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoproCaretUpdate(evt);
            }
        });

        campomat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campomatCaretUpdate(evt);
            }
        });
        campomat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campomatActionPerformed(evt);
            }
        });

        camponota1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                camponota1CaretUpdate(evt);
            }
        });

        camponota2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                camponota2CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campopro)
                    .addComponent(campomat)
                    .addComponent(camponota1)
                    .addComponent(camponota2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(botaotcad)
                .addGap(134, 134, 134))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campomat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(camponota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(camponota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(botaotcad)
                .addContainerGap())
        );

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campomatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campomatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campomatActionPerformed

    private void botaotcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaotcadActionPerformed
    Cadastrar();
    }//GEN-LAST:event_botaotcadActionPerformed

    private void campoproCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoproCaretUpdate
        habilitarBotaoCadastrar();
    }//GEN-LAST:event_campoproCaretUpdate

    private void campomatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campomatCaretUpdate
       habilitarBotaoCadastrar();
    }//GEN-LAST:event_campomatCaretUpdate

    private void camponota1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_camponota1CaretUpdate
       habilitarBotaoCadastrar();
    }//GEN-LAST:event_camponota1CaretUpdate

    private void camponota2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_camponota2CaretUpdate
        habilitarBotaoCadastrar();
    }//GEN-LAST:event_camponota2CaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        voltarTela();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaotcad;
    private javax.swing.JTextField campomat;
    private javax.swing.JTextField camponota1;
    private javax.swing.JTextField camponota2;
    private javax.swing.JTextField campopro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void voltarTela() {
        try {
            pst.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new TelaBoletim().setVisible(true);
        this.dispose();
    }
    private void habilitarBotaoCadastrar(){
        String professor,materia,nota1,nota2;
        professor = campopro.getText();
        materia = campomat.getText();
        nota1 = camponota1.getText();
        nota2 = camponota2.getText();
        
        boolean a = professor.replaceAll("", "").isEmpty();
        boolean b = materia.replaceAll("", "").isEmpty();
        boolean c = nota1.replaceAll("", "").isEmpty();
        boolean d = nota2.replaceAll("", "").isEmpty();
        
        if(!a && !b && !c && !d){
            botaotcad.setVisible(true);
            
        }
        
    }
}
