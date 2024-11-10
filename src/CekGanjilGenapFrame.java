import javax.swing.JOptionPane;

public class CekGanjilGenapFrame extends javax.swing.JFrame {

    public CekGanjilGenapFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTextField1 = new java.awt.TextField();
        JButton1 = new java.awt.Button();
        JButton2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplikasi Cek Nomor Ganjil Genap"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hasil akan ditampilkan disisni");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 98, 0, 108);
        jPanel1.add(jLabel1, gridBagConstraints);

        JTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTextField1FocusGained(evt);
            }
        });
        JTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField1ActionPerformed(evt);
            }
        });
        JTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JTextField1PropertyChange(evt);
            }
        });
        JTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 147;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 98, 0, 108);
        jPanel1.add(JTextField1, gridBagConstraints);

        JButton1.setBackground(new java.awt.Color(0, 255, 0));
        JButton1.setLabel("Hasil");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 98, 80, 0);
        jPanel1.add(JButton1, gridBagConstraints);

        JButton2.setBackground(new java.awt.Color(255, 0, 0));
        JButton2.setLabel("Bersihkan");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = -5;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 48, 80, 108);
        jPanel1.add(JButton2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
      //GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String input = JTextField1.getText();
    try {
        int number = Integer.parseInt(input);

        // Cek apakah angka ganjil atau genap
        String hasil = (number % 2 == 0) ? "Genap" : "Ganjil";
        
        // Cek apakah angka adalah bilangan prima
        if (isPrime(number)) {
            hasil += " dan Prima";
        }

        // Tampilkan hasil menggunakan JOptionPane (otomatis menutup dialog setelah klik "OK")
        JOptionPane.showMessageDialog(this, 
            "Angka " + number + " adalah " + hasil, 
            "Hasil Cek", 
            JOptionPane.INFORMATION_MESSAGE);

        jLabel1.setText("Hasil: " + hasil); // Memperbarui JLabel jika diinginkan

    } catch (NumberFormatException e) {
        // Tampilkan pesan error (otomatis menutup dialog setelah klik "OK")
        JOptionPane.showMessageDialog(this, 
            "Masukkan angka yang valid!", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
    }
  
        
    }                                        
         private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    //GEN-LAST:event_jButton1ActionPerformed
    }//GEN-LAST:event_JButton1ActionPerformed

    private void JTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField1ActionPerformed

    private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton2ActionPerformed
            JTextField1.setText("");
            jLabel1.setText("Hasil akan ditampilkan di sini");// TODO add your handling code here:
    }//GEN-LAST:event_JButton2ActionPerformed

    private void JTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JTextField1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField1PropertyChange

    private void JTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextField1FocusGained
        JTextField1.setText("");
          jLabel1.setText("Hasil akan ditampilkan di sini");// TODO add your handling code here:
    }//GEN-LAST:event_JTextField1FocusGained

    private void JTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField1KeyTyped
        char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume(); // Mencegah karakter non-angka
                }// TODO add your handling code here:
    }//GEN-LAST:event_JTextField1KeyTyped
    
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
            java.util.logging.Logger.getLogger(CekGanjilGenapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekGanjilGenapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekGanjilGenapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekGanjilGenapFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekGanjilGenapFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button JButton1;
    private java.awt.Button JButton2;
    private java.awt.TextField JTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
