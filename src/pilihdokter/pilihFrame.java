/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihdokter;

/**
 *
 * @author Ridha Nadhira Febyan
 */
public class pilihFrame extends javax.swing.JFrame {

    /**
     * Creates new form pilihFrame
     */
    public pilihFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtalamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtusia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtjenis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtgol = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtstatus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtkewar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtwaktu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtspesial = new javax.swing.JTextField();
        jconadokt = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setText("Pilih Dokter");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 70, 70, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 10, 210, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identitas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setText("Nama");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 70, 14);

        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtnama);
        jtxtnama.setBounds(120, 30, 150, 20);

        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 60, 70, 14);

        jtxtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtalamatActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtalamat);
        jtxtalamat.setBounds(120, 60, 150, 20);

        jLabel5.setText("Usia");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 90, 70, 14);

        jtxtusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusiaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtusia);
        jtxtusia.setBounds(120, 90, 150, 20);

        jLabel6.setText("Jenis Kelamin");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 120, 70, 14);

        jtxtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtjenisActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtjenis);
        jtxtjenis.setBounds(120, 120, 150, 20);

        jLabel7.setText("Gologan Darah");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 150, 90, 14);

        jtxtgol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgolActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtgol);
        jtxtgol.setBounds(120, 150, 150, 20);

        jLabel8.setText("Status");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 180, 70, 14);

        jtxtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstatusActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtstatus);
        jtxtstatus.setBounds(120, 180, 150, 20);

        jLabel9.setText("Kewarganegaraan");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 210, 100, 14);

        jtxtkewar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtkewarActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtkewar);
        jtxtkewar.setBounds(120, 210, 150, 20);

        jLabel10.setText("Waktu  Praktek");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 240, 100, 14);

        jtxtwaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtwaktuActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtwaktu);
        jtxtwaktu.setBounds(120, 240, 150, 20);

        jLabel11.setText("Dokter Spesialis");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 270, 100, 14);

        jtxtspesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtspesialActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtspesial);
        jtxtspesial.setBounds(120, 270, 150, 20);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 110, 360, 310);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        jPanel2.add(jconadokt);
        jconadokt.setBounds(140, 70, 140, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 390, 420);

        setBounds(0, 0, 416, 461);
    }// </editor-fold>//GEN-END:initComponents

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
        if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){ 
            jtxtnama.setText("DR. Farras Yassar "); 
            jtxtalamat.setText("Jl. Surabaya 16, Malang"); 
            jtxtusia.setText("20 Tahun"); 
            jtxtjenis.setText("Laki-Laki"); 
            jtxtgol.setText("A"); 
            jtxtstatus.setText("Belum Menikah "); 
            jtxtkewar.setText("Indonesia"); 
            jtxtspesial.setText("Dokter Umum"); 
            jtxtwaktu.setText(" Pagi (07.00-15.00)"); 
        }
        
        if(jconadokt.getSelectedItem().equals("DR. Anisa Putri ")){ 
            jtxtnama.setText("DR. Anisa Putri"); 
            jtxtalamat.setText("Jl. Veteran 3, Malang"); 
            jtxtusia.setText("20 Tahun"); 
            jtxtjenis.setText("Perempuan"); 
            jtxtgol.setText("O"); 
            jtxtstatus.setText("Belum Menikah"); 
            jtxtkewar.setText("Indonesia"); 
            jtxtspesial.setText("Dokter Gigi"); 
            jtxtwaktu.setText(" Sore (16.00-22.00)"); 
        }
        
        if(jconadokt.getSelectedItem().equals("DR. Harun Fajar ")){ 
            jtxtnama.setText("DR. Harun Fajar "); 
            jtxtalamat.setText("Jl. Bandung 9, Malang"); 
            jtxtusia.setText("20 Tahun"); 
            jtxtjenis.setText("Laki-Laki"); 
            jtxtgol.setText("B"); 
            jtxtstatus.setText("Belum Menikah"); 
            jtxtkewar.setText("Indonesia"); 
            jtxtspesial.setText("Dokter Gizi"); 
            jtxtwaktu.setText(" Malam (22.00-06.00)"); 
        } 
        
    }//GEN-LAST:event_jconadoktActionPerformed

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

    private void jtxtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtalamatActionPerformed

    private void jtxtusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusiaActionPerformed

    private void jtxtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtjenisActionPerformed

    private void jtxtgolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgolActionPerformed

    private void jtxtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstatusActionPerformed

    private void jtxtkewarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtkewarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtkewarActionPerformed

    private void jtxtwaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtwaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtwaktuActionPerformed

    private void jtxtspesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtspesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtspesialActionPerformed

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
            java.util.logging.Logger.getLogger(pilihFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pilihFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pilihFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pilihFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pilihFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
