/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8;

import java.awt.Color;
import java.awt.Graphics;
public class Zad_1 extends javax.swing.JFrame {
public Zad_1() {
initComponents();
}
public void paint(final Graphics g) {
g.drawLine(0, 0, 500, 0);
g.drawLine(0, 0, 0, 500);
g.drawLine(500, 0, 500, 500);
g.drawLine(500, 500, 0, 500);
Color newColor = new Color(0, 0, 255);
newColor = new Color(200, 50, 200);
g.drawLine(150, 480, 350, 480);
g.drawLine(150, 480, 150, 250);
g.drawLine(350, 480, 350, 250);
g.setColor(newColor);
g.drawLine(100, 250, 400, 250);
g.drawLine(100, 250, 250, 200);
g.drawLine(250, 200, 400, 250);
}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setPreferredSize(new java.awt.Dimension(500, 500));
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGap(0, 500, Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGap(0, 500, Short.MAX_VALUE)
);
pack();
}// </editor-fold>
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
java.util.logging.Logger.getLogger(Zad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
java.util.logging.Logger.getLogger(Zad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Zad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Zad_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
//</editor-fold>
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Zad_1().setVisible(true);
}
});
}
// Variables declaration - do not modify
// End of variables declaration

    
}
