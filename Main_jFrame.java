import java.io.FileWriter;
import java.io.IOException;

public class Main_jFrame extends javax.swing.JFrame {
    // ATTRIBUTES
    public MyHashTable theHT;
    
    public Main_jFrame() {
        initComponents();
        
        theHT = new MyHashTable(10);
        System.out.println("HERE HERE");
        
    }
    
    
    // METHODS   
    
    public MyHashTable getTheHT() {
        return theHT;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Create three employees, add to hash table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Display all employees");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add new employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressed_jButton3(evt);
            }
        });

        jButton4.setText("Load all Employees from file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicked_jButton4(evt);
            }
        });

        jButton5.setText("Save all employees to file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Edit Employee");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove Employee");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Get Employee");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       
        FTE theFTE;
        PTE thePTE;
        
        theFTE = new FTE(111111, "Elmer", "Fudd", 0, 3, 0.2, 80000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");
                
        thePTE = new PTE(222222, "Daffy", "Duck", 0, 2, 0.22, 10.0, 20.0, 30.0);
        theHT.addEmployee(thePTE);
        System.out.println("Added the PTE to the hash table!");
                
        theFTE = new FTE(333333, "Lola", "Bunny", 1, 5, 0.17, 90000.00);
        theHT.addEmployee(theFTE);
        System.out.println("Added the FTE to the hash table!");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        DisplayAllEmps_jFrame theNumItems_jFrame = new DisplayAllEmps_jFrame();
        theNumItems_jFrame.setVisible(true);
        theNumItems_jFrame.setMainHT(theHT);  // Have theSeparateJFrame mainHT point to the real HT.
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pressed_jButton3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressed_jButton3
        // TODO add your handling code here:
        AddNewEmployee_jFrame theANEJFrame = new AddNewEmployee_jFrame();
        theANEJFrame.setVisible(true);
        theANEJFrame.setMainHT(theHT);
    }//GEN-LAST:event_pressed_jButton3

    private void clicked_jButton4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicked_jButton4
        // TODO add your handling code here:
        Weather_jFrame theAnotherSeparateJFrame = new Weather_jFrame();
        theAnotherSeparateJFrame.setVisible(true);
        //System.out.println(theAnotherSeparateJFrame);
    }//GEN-LAST:event_clicked_jButton4

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
      FileWriter myWriter = new FileWriter("HashTable.txt");
      for (int i = 0; i < theHT.buckets.length; i++) {
        myWriter.write(i);
        myWriter.write("\n");
        int listSize = theHT.buckets[i].size();
        if (listSize == 0) {
            myWriter.write("    Nothing in its ArrayList!");
            myWriter.write("\n");
        }
        else {
            for (int j = 0; j < listSize; j++) {
                int theEmpNum = theHT.buckets[i].get(j).getEmpNum();
                EmployeeInfo theEmp = theHT.buckets[i].get(j);
                
                myWriter.write("    Employee " + theEmpNum+ " "+theEmp.getFirstName() + " " + theEmp.getLastName());
                myWriter.write("");
                myWriter.write("\n");
        }
       }
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.out.println("Set up remove employee frame");
        Monday_jFrame theMonday_jFrame = new Monday_jFrame();
        theMonday_jFrame.setMainHT(theHT);
        theMonday_jFrame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        GetEmployee GetJFrame = new GetEmployee();
        GetJFrame.setMainHT(theHT);
        GetJFrame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //WHAT YOU WANNA DO TO FUTURE ME- SEND EMPLOYEE NUMBER, REMOVE THAT EMPLOYEE, REPLACE WITH NEW EMPLOYEE!!!
        EditEmployee GetJFrame = new EditEmployee();
        GetJFrame.setMainHT(theHT);
        GetJFrame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    // End of variables declaration//GEN-END:variables

}
