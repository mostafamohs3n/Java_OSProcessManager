/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcessManager;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;


import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mostafa
 */
public class MainFrame extends javax.swing.JFrame {

    private DefaultTableModel ListAllProcessesUserModel;
    private DefaultTableModel ListProcesssStopModel;
    private final String[] ListAllProcesssModelColumns = {"PID", "TTY","TIME", "CMD"};
    private final String[] ProcessStopModelColumns = {"PID", "CMD"};
    private DefaultTableModel displayProcessTableModel;
    private DefaultTableModel SendSignalTableModel;
    private DefaultListModel displayProcessListModel;

    /**
     * Creates new form StartingFrame
     */
    public MainFrame() {
        displayProcessTableModel = new DefaultTableModel(ListAllProcesssModelColumns, 0);
        ListAllProcessesModel = new DefaultTableModel(ListAllProcesssModelColumns, 0);
        ListAllProcessesUserModel = new DefaultTableModel(ListAllProcesssModelColumns, 0);
        ListProcesssStopModel = new DefaultTableModel(ProcessStopModelColumns, 0);
        SendSignalTableModel = new DefaultTableModel(ProcessStopModelColumns, 0);
        displayProcessListModel = new DefaultListModel();
        
        //SendSignalComboBox.setModel(null);
        
       // populateProcessStopList();
        //DisplayProcessIDjList.setModel(null);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListAllProcessjTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListUserTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListUserProcessesjTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        DisplayProcessIDjList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        RunProcessTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ProcessStopjTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SendSignalComboBox = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        SendSignalProcessTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Listing all processes in the System");

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ListAllProcessjTable.setModel(ListAllProcessesModel);
        ListAllProcessjTable.setEditingColumn(0);
        ListAllProcessjTable.setEditingRow(0);
        jScrollPane1.setViewportView(ListAllProcessjTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("List Proccesses", jPanel1);

        jLabel2.setText("Listing all processes by User in the System");

        ListUserTextField.setText("User name");
        ListUserTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListUserTextFieldActionPerformed(evt);
            }
        });

        ListUserProcessesjTable.setModel(ListAllProcessesUserModel);
        jScrollPane2.setViewportView(ListUserProcessesjTable);

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListUserTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("List By User", jPanel2);

        jLabel3.setText("Listing Processes ID of Procesess");

        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        DisplayProcessIDjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(DisplayProcessIDjList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Display Process ID", jPanel3);

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jLabel4.setText("Enter Process Command");

        RunProcessTextField.setText("Process Command");
        RunProcessTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunProcessTextFieldActionPerformed(evt);
            }
        });

        jButton4.setText("Run");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RunProcessTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(RunProcessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(412, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Run Process", jPanel6);

        jLabel5.setText("Please Select the Process then press Kill");

        ProcessStopjTable.setModel(displayProcessTableModel);
        jScrollPane5.setViewportView(ProcessStopjTable);

        jButton5.setText("Kill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Refresh");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Stop Process", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Run/Stop Process", jPanel4);

        jLabel6.setText("Choose the SIgnal to send");

        SendSignalComboBox.setBackground(new java.awt.Color(255, 255, 255));
        SendSignalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SendSignalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendSignalComboBoxActionPerformed(evt);
            }
        });

        SendSignalProcessTable.setModel(SendSignalTableModel);
        jScrollPane4.setViewportView(SendSignalProcessTable);

        jButton6.setText("Send Signal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SendSignalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendSignalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Send Signals", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListAllProcessesModel = new DefaultTableModel(ListAllProcesssModelColumns, 0);
        try {
            //DefaultListModel listModel = new DefaultListModel();
            String Text="";
            p = Runtime.getRuntime().exec("ps -e");
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0, y=0;
            Vector rowData = new Vector();
            while (sc.hasNext()){
                k++;
                if(k < 5){
                    sc.next();
                }else{
                    if(y == 4){
                        y=0;
                        ListAllProcessesModel.addRow(rowData);
                        rowData = new Vector();
                        rowData.add(sc.next().trim());
                    }else{
                        rowData.add(sc.next().trim());
                    }
                    y++;

                }
            }
            ListAllProcessjTable.setModel(ListAllProcessesModel);
            ListAllProcessjTable.setDefaultEditor(Object.class, null);

            p.destroy();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ListUserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListUserTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListUserTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                
        ListAllProcessesUserModel = new DefaultTableModel(ListAllProcesssModelColumns, 0);
        try {
            //DefaultListModel listModel = new DefaultListModel();
            String Text="";
            p = Runtime.getRuntime().exec("ps -u "+ListUserTextField.getText().toString());
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0, y=0;
            Vector rowData = new Vector();
            while (sc.hasNext()){
                k++;
                if(k < 5){
                    sc.next();
                }else{
                    if(y == 4){
                        y=0;
                        ListAllProcessesUserModel.addRow(rowData);
                        rowData = new Vector();
                        rowData.add(sc.next().trim());
                    }else{
                        rowData.add(sc.next().trim());
                    }
                    y++;

                }
            }
            ListUserProcessesjTable.setModel(ListAllProcessesUserModel);
            ListUserProcessesjTable.setDefaultEditor(Object.class, null);

            p.destroy();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String Text="";
            p = Runtime.getRuntime().exec("ps -e -o %p");
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0;
            while (sc.hasNext()){
                if(k == 0)
                    sc.next();
                displayProcessListModel.addElement(sc.next());
                k++;
            }          
            DisplayProcessIDjList.setModel(displayProcessListModel);
            

            p.destroy();
        } catch (IOException ex) {

        }   
    }//GEN-LAST:event_jButton3ActionPerformed
   
    private void populateProcessStopList(){
         ListProcesssStopModel = new DefaultTableModel(ProcessStopModelColumns, 0);
         try {
            String Text="";
            p = Runtime.getRuntime().exec("ps -e -o %p%c");
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0, y=0;
            Vector rowData = new Vector();
            while (sc.hasNext()){
                k++;
                if(k < 3){
                    sc.next();
                }else{
                    if(y == 2){
                        y=0;
                        ListProcesssStopModel.addRow(rowData);
                        rowData = new Vector();
                        rowData.add(sc.next().trim());
                    }else{
                        rowData.add(sc.next().trim());
                    }
                    y++;

                }
            }
            ProcessStopjTable.setModel(ListProcesssStopModel);
            ProcessStopjTable.setDefaultEditor(Object.class, null);

            p.destroy();
        } catch (IOException ex) {

        }
    }
     
    private void populateSendSignalProcess(){
         SendSignalTableModel = new DefaultTableModel(ProcessStopModelColumns, 0);
         try {
            String Text="";
            p = Runtime.getRuntime().exec("ps -e -o %p%c");
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0, y=0;
            Vector rowData = new Vector();
            while (sc.hasNext()){
                k++;
                if(k < 3){
                    sc.next();
                }else{
                    if(y == 2){
                        y=0;
                        SendSignalTableModel.addRow(rowData);
                        rowData = new Vector();
                        rowData.add(sc.next().trim());
                    }else{
                        rowData.add(sc.next().trim());
                    }
                    y++;

                }
            }
            SendSignalProcessTable.setModel(SendSignalTableModel);
            SendSignalProcessTable.setDefaultEditor(Object.class, null);

            p.destroy();
        } catch (IOException ex) {

        }
    }
    
    private void populateComboBoxSignal(){
        
        String[] ComboBoxSignalList = {
            "SIGABORT - Process Abort",
            "SIGALRM - Alarm Clock",
            "SIGFPE - Floating Point Exception",
            "SIGHUP - Hangup",
            "SIGILL - Illegal Instruction",
            "SIGINT - Terminal Interrupt",
            "SIGKILL - Kill Process",
            "SIGPIPE - Write on pipe with no reader",
            "SIGQUIT - Terminal Quit",
            "SIGSEGV - Invalid Memory Segment Access",
            "SIGTERM - Termination",
            "SIGUSR1 - User-defined Signal 1",
            "SIGUSR2 - User-defined Signal 2",
            "SIGCHLD - Child process has stopped or exited",
            "SIGCONT - Continue Executing if stopped",
            "SIGSTOP - Stop Executing",
            "SIGTSTP - Terminal Stop Signal",
            "SIGTTIN - Background process trying to read",
            "SIGTTOU - Background process trying to write"
        };
        SendSignalComboBox.setModel(new DefaultComboBoxModel(ComboBoxSignalList));
    }
    private void RunProcessTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunProcessTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RunProcessTextFieldActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //System.out.println(RunProcessTextField.getText());
        try {
            p = Runtime.getRuntime().exec(""+RunProcessTextField.getText().toString());
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0;
            while (sc.hasNext()){
                sc.next();
            }
            p.waitFor();
        } catch (Exception ex) {
           
        } 
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
        populateProcessStopList();
    }//GEN-LAST:event_jTabbedPane2StateChanged
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int getSelectedR = ProcessStopjTable.getSelectedRow();
        try {
            p = Runtime.getRuntime().exec("kill "+ProcessStopjTable.getValueAt(getSelectedR, 0));
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0;
            while (sc.hasNext());                         
            populateProcessStopList();
            
            
        } catch (Exception e) {}
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void SendSignalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendSignalComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SendSignalComboBoxActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

        populateComboBoxSignal();
        populateSendSignalProcess();
        DisplayProcessIDjList.setModel(displayProcessListModel);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int getSelectedR = SendSignalProcessTable.getSelectedRow();
        String selectedSIG= ((SendSignalComboBox.getSelectedItem().toString().trim().split(" - "))[0]);
        selectedSIG = selectedSIG.substring(3);
        try {
            p = Runtime.getRuntime().exec("kill -"+selectedSIG +" "+SendSignalProcessTable.getValueAt(getSelectedR, 0));
            Scanner sc = new Scanner(new InputStreamReader(p.getInputStream()));
            int k=0;
            while (sc.hasNext());                         
            populateProcessStopList();
            
            
        } catch (Exception e) {}
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        populateProcessStopList();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> DisplayProcessIDjList;
    private javax.swing.JTable ListAllProcessjTable;
    private javax.swing.JTable ListUserProcessesjTable;
    private javax.swing.JTextField ListUserTextField;
    private javax.swing.JTable ProcessStopjTable;
    private javax.swing.JTextField RunProcessTextField;
    private javax.swing.JComboBox<String> SendSignalComboBox;
    private javax.swing.JTable SendSignalProcessTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
   String s; Process p;
   DefaultTableModel ListAllProcessesModel;
}
