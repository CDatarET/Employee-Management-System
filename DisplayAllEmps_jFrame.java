
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class DisplayAllEmps_jFrame extends javax.swing.JFrame {
    
    
    // ATTRIBUTES
    private MyHashTable mainHT;  // This contains the ref value for theHT of MainJFrame.
    
    private DefaultTableModel model;

    
    // CONSTRUCTORS
    /**
     * Creates new form SeparateJFrame
     */
    public DisplayAllEmps_jFrame() {
        initComponents();
        /*
        model.addColumn("Status");
        model.addColumn("Employee Number");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        */
        //System.out.println("\n\nmodel row count is " + model.getRowCount());
        jLabel1.setText("Number of Employees in Table");
    }
    
    
    // METHODS
    
    
    public void setMainHT(MyHashTable refvalForHT) {
        mainHT = refvalForHT;
        System.out.println("HERE HERE HERE HERE");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Display employees currently in the hash table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateColumnsFromModel(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int numInHT = mainHT.getNumInHashTable();
        
        // Set up the colum headers and also state how many rows of data to display
        model = new DefaultTableModel(new Object[] {"Status",
                                                    "Emp Num",
                                                    "First Name",
                                                    "Last Name"},
                                                    numInHT);
        jTable1.setModel(model);
        jTable1.setAutoCreateColumnsFromModel(true);
            
        int empCounter = -1; // Row position in table for the employee
        
        jLabel1.setText("Currently this many employees in the table:  " + Integer.toString(numInHT));
        System.out.println("");
        System.out.println("Number of employees in the HT is " + numInHT);
        
        if (numInHT > 0) {
            System.out.println("Here are the employees:");
            for (int i = 0; i < mainHT.buckets.length; i++) {
                for (int j = 0; j < mainHT.buckets[i].size(); j++) {
                    
                    EmployeeInfo theEmp = mainHT.buckets[i].get(j);
                    
                    empCounter++;
                    
                    System.out.println("  Employee number " + Integer.toString(theEmp.getEmpNum()));
                    System.out.println("  First name, last name : " + theEmp.getFirstName() + " " + theEmp.getLastName());

                    if (theEmp instanceof FTE) {
                        FTE theFTE = (FTE) theEmp;
                        System.out.println("    That employee has gross yearly salary $" + Double.toString(theFTE.getYearlySalary()));
                        System.out.println("    That employee has net yearly income $" + Double.toString(theFTE.calcNetAnnualIncome()));
                        
                        model.setValueAt("Full Time", empCounter, 0);
                        model.setValueAt(theEmp.getEmpNum(), empCounter, 1);
                        model.setValueAt(theEmp.getFirstName(), empCounter, 2);
                        model.setValueAt(theEmp.getLastName(), empCounter, 3);

                    }
                    
                    if (theEmp instanceof PTE) {
                        PTE thePTE = (PTE) theEmp;
                        System.out.println("    That employee has hourly wage $" + Double.toString(thePTE.hourlyWage));
                        System.out.println("    That employee has hours per week " + Double.toString(thePTE.hoursPerWeek));
                        System.out.println("    That employee has weeks per year " + Double.toString(thePTE.weeksPerYear));
                        
                        model.setValueAt("Part Time", empCounter, 0);
                        model.setValueAt(theEmp.getEmpNum(), empCounter, 1);
                        model.setValueAt(theEmp.getFirstName(), empCounter, 2);
                        model.setValueAt(theEmp.getLastName(), empCounter, 3);


                   }
                }
            
            }           
        }

        else {
            System.out.println("Nothing in the HT!  Too bad so sad :-(");
        }
        
        System.out.println("\nTABLE ROW COUNT " + jTable1.getRowCount());
        System.out.println("\nTABLE COLUMN COUNT " + jTable1.getColumnCount());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllEmps_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllEmps_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
