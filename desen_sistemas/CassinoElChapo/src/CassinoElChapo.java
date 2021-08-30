
import javax.swing.JOptionPane;


public class CassinoElChapo extends javax.swing.JFrame {
    String nome;
    float valorEntrada = 0;
    float troco = 0;
    int ficha = 0;
    int qtd10_f = 0;
    int qtd100_f = 0;
    int qtd500_f = 0;
    
    public CassinoElChapo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoEntrada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ficha100 = new javax.swing.JButton();
        ficha10 = new javax.swing.JButton();
        ficha500 = new javax.swing.JButton();
        labelTroco = new javax.swing.JLabel();
        jogar = new javax.swing.JButton();
        ficha50 = new javax.swing.JButton();
        ficha200 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelFichas = new javax.swing.JLabel();
        imgfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vineta BT", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Cassino El Chapo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 700, 60));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Jogador:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, 30));

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 220, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor de entrada:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 30));

        campoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(campoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 220, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade de fichas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 180, 30));

        ficha100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ficha100.setText("100");
        ficha100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha100ActionPerformed(evt);
            }
        });
        getContentPane().add(ficha100, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 60, -1));

        ficha10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ficha10.setText("10");
        ficha10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha10ActionPerformed(evt);
            }
        });
        getContentPane().add(ficha10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 60, -1));

        ficha500.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ficha500.setText("500");
        ficha500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha500ActionPerformed(evt);
            }
        });
        getContentPane().add(ficha500, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 63, -1));

        labelTroco.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelTroco.setForeground(new java.awt.Color(255, 255, 255));
        labelTroco.setText("Troco:");
        getContentPane().add(labelTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 200, 30));

        jogar.setFont(new java.awt.Font("Vineta BT", 2, 14)); // NOI18N
        jogar.setForeground(new java.awt.Color(153, 0, 0));
        jogar.setText("Prosseguir");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });
        getContentPane().add(jogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 180, 36));

        ficha50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ficha50.setText("50");
        ficha50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha50ActionPerformed(evt);
            }
        });
        getContentPane().add(ficha50, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 60, -1));

        ficha200.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ficha200.setText("200");
        ficha200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficha200ActionPerformed(evt);
            }
        });
        getContentPane().add(ficha200, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Vineta BT", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("     Cassino El Chapo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 52));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Nome do Jogador:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 170, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Valor de entrada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setText("Quantidade de fichas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 180, 24));

        labelFichas.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelFichas.setForeground(new java.awt.Color(255, 255, 255));
        labelFichas.setText("Fichas:");
        getContentPane().add(labelFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 210, -1));

        imgfundo.setForeground(new java.awt.Color(255, 255, 255));
        imgfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundocassino.jpg"))); // NOI18N
        getContentPane().add(imgfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ficha500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha500ActionPerformed
        comprarFicha(500);
    }//GEN-LAST:event_ficha500ActionPerformed

    private void ficha10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha10ActionPerformed
        comprarFicha(10);
    }//GEN-LAST:event_ficha10ActionPerformed

    private void ficha100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha100ActionPerformed
        comprarFicha(100);
    }//GEN-LAST:event_ficha100ActionPerformed

    private void valorEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorEntradaActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void ficha200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha200ActionPerformed
        comprarFicha(200);
    }//GEN-LAST:event_ficha200ActionPerformed

    private void ficha50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficha50ActionPerformed
        comprarFicha(50);
    }//GEN-LAST:event_ficha50ActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        MeuJogos menu = new MeuJogos();
        menu.setVisible(true);
    }//GEN-LAST:event_jogarActionPerformed
    public void comprarFicha(int valor_ficha){
       nome = campoNome.getText();
       valorEntrada = Float.parseFloat(campoEntrada.getText());
        
       ficha = ficha + valor_ficha;
       troco = valorEntrada - ficha;
        
       labelFichas.setText("Ficha: " + ficha);
       labelTroco.setText("Troco: " + troco);
    }
    
   
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
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CassinoElChapo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEntrada;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton ficha10;
    private javax.swing.JButton ficha100;
    private javax.swing.JButton ficha200;
    private javax.swing.JButton ficha50;
    private javax.swing.JButton ficha500;
    private javax.swing.JLabel imgfundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jogar;
    private javax.swing.JLabel labelFichas;
    private javax.swing.JLabel labelTroco;
    // End of variables declaration//GEN-END:variables
}
