/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine;

import java.awt.Color;

/**
 *
 * @author kyluk1259
 */
public class window extends javax.swing.JFrame {

    /**
     * Creates new form window
     */
    public window() {
        initComponents();
        questionLabel.setVisible(false);
        answerField.setVisible(false);
        answerButton.setVisible(false);
        responseField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameButton = new javax.swing.JButton();
        heartImage = new javax.swing.JLabel();
        responseField = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        answerButton = new javax.swing.JButton();
        answerField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nameField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        nameField.setToolTipText("");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("TI Uni", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("What is your name? Please tell me.");
        nameLabel.setAutoscrolls(true);

        nameButton.setText("Submit");
        nameButton.setToolTipText("Submit your name.");
        nameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameButtonActionPerformed(evt);
            }
        });

        heartImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kyle's PC\\Documents\\NetBeans Projects\\Valentine\\Assets\\love-romantic-valentine-valentines-day-heart-hearts-7-24087.png")); // NOI18N

        responseField.setEditable(false);
        responseField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        responseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responseFieldActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Valentine's Day Companion");

        questionLabel.setFont(new java.awt.Font("TI Uni", 0, 18)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionLabel.setText("Were you happy with this Valentine's Day? Let me know.");
        questionLabel.setAutoscrolls(true);

        answerButton.setText("Submit");
        answerButton.setToolTipText("Submit your short message.");
        answerButton.setOpaque(true);
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        answerField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        answerField.setToolTipText("");
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(heartImage, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(responseField, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameButton)
                    .addComponent(answerButton)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(answerField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(questionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(heartImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameButton)
                        .addGap(18, 18, 18)
                        .addComponent(questionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerButton)
                        .addGap(22, 22, 22)
                        .addComponent(responseField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(199, 199, 199))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
        String question = "Were you happy with this Valentines Day ";
        String request = "? Let me know.";

        if (nameField.getText().equals("")) {
            questionLabel.setText("You did not enter a name.");
        } else {
            questionLabel.setText(question + nameField.getText() + request);
            questionLabel.setVisible(true);
            answerField.setVisible(true);
            answerButton.setVisible(true);
            responseField.setVisible(true);

        }
    }//GEN-LAST:event_nameFieldActionPerformed

    private void responseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responseFieldActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed
        // TODO add your handling code here:
        String answer = answerField.getText();
        String name = nameField.getText() + ".";
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        String keyOne = "no";
        String keyTwo = "yes";
        String keyThree = "loved";
        String keyFour = "great";
        String keyFive = "sucked";

        if (answer.toLowerCase().indexOf(keyOne.toLowerCase()) != -1) {
            responseField.setText("I'm sorry to hear that " + name);
        } else if (answer.toLowerCase().indexOf(keyTwo.toLowerCase()) != -1) {
            responseField.setText("I'm glad to hear that you enjoyed your day " + name);
        } else if (answer.toLowerCase().indexOf(keyThree.toLowerCase()) != -1) {
            responseField.setText("I'm glad to hear that you enjoyed your day " + name);
        } else if (answer.toLowerCase().indexOf(keyFour.toLowerCase()) != -1) {
            responseField.setText("I'm glad to hear that you enjoyed your day " + name);
        } else if (answer.toLowerCase().indexOf(keyFive.toLowerCase()) != -1) {
            responseField.setText("I'm sorry to hear that " + name);
        } else {
            responseField.setText("Well I bet it'll be great next year " + name);
        }
    }//GEN-LAST:event_answerButtonActionPerformed

    private void nameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameButtonActionPerformed
        // TODO add your handling code here:
        String question = "Were you happy with this Valentines Day ";
        String request = "? Let me know.";

        if (nameField.getText().equals("")) {
            questionLabel.setText("You did not enter a name.");
        } else {
            questionLabel.setText(question + nameField.getText() + request);
            questionLabel.setVisible(true);
            answerField.setVisible(true);
            answerButton.setVisible(true);
            responseField.setVisible(true);
        }
    }//GEN-LAST:event_nameButtonActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
        String answer = answerField.getText();
        String name = nameField.getText() + ".";
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        String keyOne = "no";
        String keyTwo = "yes";
        String keyThree = "loved";
        String keyFour = "great";
        String keyFive = "sucked";
        String Meme = "meme";

        if (answer.toLowerCase().indexOf(keyOne.toLowerCase()) != -1) {
            responseField.setText("I'm sorry to hear that " + name);
        } else if (answer.toLowerCase().indexOf(keyTwo.toLowerCase()) != -1) {
            responseField.setText("I'm glad to hear that you enjoyed your day " + name);
        } else if (answer.toLowerCase().indexOf(keyThree.toLowerCase()) != -1) {
            responseField.setText("I'm glad to hear that you enjoyed your day " + name);
        } else if (answer.toLowerCase().indexOf(keyFour.toLowerCase()) != -1) {
            responseField.setText("I'm glad to hear that you enjoyed your day " + name);
        } else if (answer.toLowerCase().indexOf(keyFive.toLowerCase()) != -1) {
            responseField.setText("I'm sorry to hear that " + name);
        } else {
            responseField.setText("Well I bet it'll be great next year " + name);
        }
    }//GEN-LAST:event_answerFieldActionPerformed

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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel heartImage;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nameButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextField responseField;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
