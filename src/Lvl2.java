/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youcode
 */
public class Lvl2 extends javax.swing.JFrame {
    private String rep1,rep2,rep3,rep4,rep5;
    private int count =0;
    /**
     * Creates new form Lvl2
     */
    public Lvl2() {
        initComponents();
        btn1.setSelected(true);
        btn4.setSelected(true);
        btn7.setSelected(true);
        btn12.setSelected(true);
    }

    private void collecteRep(){
        if(btn2.isSelected()){
            rep1="Vrai";
            count +=20;
        }
        else{
            rep1="Faux /";
            count+=0;
        }
        
        if(btn6.isSelected()){
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
        if(btn13.isSelected()){
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
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btn4 = new javax.swing.JRadioButton();
        btn5 = new javax.swing.JRadioButton();
        btn6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btn7 = new javax.swing.JRadioButton();
        btn8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btn9 = new javax.swing.JRadioButton();
        btn10 = new javax.swing.JRadioButton();
        btn11 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btn12 = new javax.swing.JRadioButton();
        btn13 = new javax.swing.JRadioButton();
        btn14 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRep = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Level 2");

        jLabel2.setText("Après la compilation, un programme écrit en JAVA, il se transforme en programme en bytecode Quelle est l’extension du programme en bytecode ?");

        buttonGroup1.add(btn1);
        btn1.setSelected(true);
        btn1.setText("aucun des choix");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn2);
        btn2.setText(".JAVA");

        buttonGroup1.add(btn3);
        btn3.setText(".Class");

        jLabel3.setText("Class Test{ Public Test () { System.out.println(”Bonjour”);} public Test (int i) { this(); System.out.println(”Nous sommes en ”+i+ ” !”);}; } qu’affichera l’instruction suivante? Test t1=new Test (2018);");

        buttonGroup2.add(btn4);
        btn4.setText("aucun des choix");

        buttonGroup2.add(btn5);
        btn5.setText("Bonjour Nous sommes en 2018 !");

        buttonGroup2.add(btn6);
        btn6.setText("Nous sommes en 2018 !");

        jLabel4.setText("Voici un constructeur de la classe Employee, y-a-t'il un problème ? Public void Employe(String n){ Nom=n;}");

        buttonGroup3.add(btn7);
        btn7.setText("vrai");

        buttonGroup3.add(btn8);
        btn8.setText("faux");

        jLabel5.setText("Pour spécifier que la variable ne pourra plus être modifiée et doit être initialisée dès sa déclaration, on la déclare comme une constante avec le mot réservé");

        buttonGroup4.add(btn9);
        btn9.setText("aucun des choix");

        buttonGroup4.add(btn10);
        btn10.setText("final");

        buttonGroup4.add(btn11);
        btn11.setText("const");

        jLabel6.setText("Dans une classe, on accède à ses variables grâce au mot clé");

        buttonGroup5.add(btn12);
        btn12.setText("aucun des choix");

        buttonGroup5.add(btn13);
        btn13.setText("this");

        buttonGroup5.add(btn14);
        btn14.setText("super");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtRep.setColumns(20);
        txtRep.setRows(5);
        jScrollPane1.setViewportView(txtRep);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2)
                            .addComponent(btn1)
                            .addComponent(btn3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5)
                            .addComponent(btn4)
                            .addComponent(btn6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9)
                            .addComponent(btn11)
                            .addComponent(btn10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn13)
                            .addComponent(btn12)
                            .addComponent(btn14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8)
                            .addComponent(btn7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(393, 393, 393))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(510, 510, 510))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addComponent(btn7)
                .addGap(18, 18, 18)
                .addComponent(btn8)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
         Gover g = new Gover();
        Congrat1 d2 = new Congrat1();
        collecteRep();
        txtRep.append(rep1 +"\n");
        txtRep.append(rep2+ "\n");
        txtRep.append(rep3+ "\n");
        txtRep.append(rep4+ "\n");
        txtRep.append(rep5+ "\n");
        txtRep.append("Your Score :" + String.valueOf(count));
        if(count>=60){
            txtRep.append("Congrats ...");
            d2.setLocationRelativeTo(null);
            d2.setVisible(true);
            
        }else{
            g.setLocationRelativeTo(null);
            g.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lvl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lvl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lvl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lvl2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lvl2().setVisible(true);
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
    private javax.swing.JTextArea txtRep;
    // End of variables declaration//GEN-END:variables
}
