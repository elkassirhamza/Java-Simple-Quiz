/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youcode
 */
public class Main extends javax.swing.JFrame {
    private String rep1,rep2,rep3,rep4,rep5;
    private int count =0;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    private void collecteRep(){
        if(btn1.isSelected()){
            rep1="Vrai";
            count +=20;
        }
        else{
            rep1="Faux /";
            count+=0;
        }
        
        if(btn4.isSelected()){
            rep2="Vrai";
            count +=20;
        }
        else{
            rep2="Faux";
            count+=0;
        }
        if(btn8.isSelected()){
            rep3="Vrai";
            count +=20;
        }else{
            rep3="Faux";
            count+=0;
        }
        if(btn10.isSelected()){
            rep4="Vrai";
            count +=20;
        }else{
            rep4="Faux";
            count+=0;
        }
        if(btn14.isSelected()){
            rep5="Vrai";
            count +=20;
        }else{
            rep5="Faux";
            count+=0;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btn4 = new javax.swing.JRadioButton();
        btn5 = new javax.swing.JRadioButton();
        btn6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btn7 = new javax.swing.JRadioButton();
        btn8 = new javax.swing.JRadioButton();
        btn9 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btn10 = new javax.swing.JRadioButton();
        btn11 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btn12 = new javax.swing.JRadioButton();
        btn13 = new javax.swing.JRadioButton();
        btn14 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRep = new javax.swing.JTextArea();
        next = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("JAVA est un langage");

        buttonGroup1.add(btn1);
        btn1.setText("Compilé");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn2);
        btn2.setText("Interprété");

        buttonGroup1.add(btn3);
        btn3.setText("Compilé et interpreté");

        jLabel2.setText("Toutes les classes héritent de la classe");

        buttonGroup2.add(btn4);
        btn4.setText("Main");

        buttonGroup2.add(btn5);
        btn5.setText("Object");

        buttonGroup2.add(btn6);
        btn6.setText("AWT");

        jLabel3.setText("Par convention une classe");

        buttonGroup3.add(btn7);
        btn7.setText("est en minuscule");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        buttonGroup3.add(btn8);
        btn8.setText("commence par une majuscule");

        buttonGroup3.add(btn9);
        btn9.setText("est en majuscules");

        jLabel4.setText("Est-ce que on peut avoir plusieurs constructeurs pour la même classe");

        buttonGroup4.add(btn10);
        btn10.setText("oui");

        buttonGroup4.add(btn11);
        btn11.setText("non");

        jLabel5.setText("Dans la ligne \"public class A implements B\", B est :");

        buttonGroup5.add(btn12);
        btn12.setText("Interface");

        buttonGroup5.add(btn13);
        btn13.setText("Classe parent");

        buttonGroup5.add(btn14);
        btn14.setText("Package");

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtRep.setColumns(20);
        txtRep.setRows(5);
        jScrollPane1.setViewportView(txtRep);

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setText("Level 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn7)
                                .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(btn10)
                            .addComponent(btn12))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2)
                                    .addComponent(btn5))
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6)
                                    .addComponent(btn3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn8)
                                    .addComponent(btn13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn14)
                                    .addComponent(btn9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)
                        .addComponent(next))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btn6)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7)
                            .addComponent(btn8)
                            .addComponent(btn9)
                            .addComponent(jLabel3))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btn10)
                            .addComponent(btn11))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn12)
                            .addComponent(btn13)
                            .addComponent(btn14)
                            .addComponent(jLabel5))))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(next))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        collecteRep();
       /* Lvl2 l2 = new Lvl2();
        Main m = new Main();
        Gover g = new Gover();
        
        if(count>=60){
            txtRep.append("Congrats ...");
            
            l2.setVisible(true);
            m.setVisible(false);
        }else{
            g.setVisible(true);
        }*/
        txtRep.append(rep1 +"\n");
        txtRep.append(rep2+ "\n");
        txtRep.append(rep3+ "\n");
        txtRep.append(rep4+ "\n");
        txtRep.append(rep5+ "\n");
        txtRep.append("Your Score :" + String.valueOf(count));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        Lvl2 l2 = new Lvl2();
        Main m = new Main();
        Gover g = new Gover();
        Congrat d = new Congrat();
        
        if(count>=40){
            txtRep.append("Congrats ...");
            d.setVisible(true);
            //l2.setVisible(true);
            m.setVisible(false);
        }else{
            g.setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
Main m = new Main();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                m.setVisible(true);
                m.setResizable(false);
                m.setTitle("<b>Quiz</b>");
                
            }
            
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn10;
    private javax.swing.JRadioButton btn11;
    private javax.swing.JRadioButton btn12;
    private javax.swing.JRadioButton btn13;
    private javax.swing.JRadioButton btn14;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JRadioButton btn5;
    private javax.swing.JRadioButton btn6;
    private javax.swing.JRadioButton btn7;
    private javax.swing.JRadioButton btn8;
    private javax.swing.JRadioButton btn9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JTextArea txtRep;
    // End of variables declaration//GEN-END:variables
}
