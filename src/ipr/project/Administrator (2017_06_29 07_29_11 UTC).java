package ipr.project;
//Project Under Package Named project in ipr

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.GregorianCalendar;
import java.util.Calendar;
//Importing various Classes to be Used

public class Administrator extends javax.swing.JFrame {

    public Administrator() {
        initComponents();
       
        try{
        Class.forName("java.sql.Driver");
         Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         Statement stmt2 = con2.createStatement();
         String query2 = "Show Tables;";
         ResultSet rs2 = stmt2.executeQuery(query2);
                          while(rs2.next()){
                          jComboBox1.addItem(new Object[]{rs2.getString("Tables_in_class12_project")});                          
                          }
                          }
        catch(Exception e){
        jOptionPane1.showMessageDialog(null,e);
    }
        
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.addRow(new Object[]{nam.App});
        model.addRow(new Object[]{nam.Query});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JazzPoster", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MPS  Examination  Database  Management");

        jComboBox1.setFont(new java.awt.Font("Nineteen", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Schedule", "Students_Details", "Test_1", "Test_2", "Test_3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel2.setText("Choose Database");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Select The Cell to be Modified");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowSelectionAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel4.setText("Original Value");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Pre-Existing Value");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel5.setText("New Value $");

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("New Value");
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Functions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Graffiti", 0, 12))); // NOI18N

        jButton1.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton1.setText("Replace $");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton2.setText("Delete Record -");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton3.setText("Add Record +");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jToggleButton1.setText("Replicate Selected Table");
        jToggleButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Replica_");
        jTextField1.setVisible(false);

        jButton7.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton7.setText("OK");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.setVisible(false);

        jLabel14.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel14.setText("Name");
        jLabel14.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
            }
        ));
        jTable2.setToolTipText("Insert Data For New Record");
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel3.setText("Insert New Record +");

        jLabel6.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel6.setText("Database");

        jLabel7.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel7.setText("Records");

        jLabel8.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel8.setText("0");

        jLabel9.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel9.setText("Fields");

        jLabel10.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel10.setText("0");

        jTextField2.setText("");
        Calendar cal = new GregorianCalendar();
        int Month = cal.get(Calendar.MONTH);
        int Year = cal.get(Calendar.YEAR);
        int Day = cal.get(Calendar.DAY_OF_MONTH);
        jTextField2.setText("Set Today's Announcement Date:"+Day + "-" + (Month + 1) + "-" + Year);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton9.setText("SET");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Lucida Bright", 0, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Queries and Applications"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setToolTipText("All Queries and Application by Students");
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable3);

        jLabel18.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel18.setText("Done!");
        jLabel18.setVisible(false);

        jButton4.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton4.setText("DONE !");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try{
        Class.forName("java.sql.Driver");
         Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         Statement stmt2 = con2.createStatement();
         String query2 = "Show Tables;";
         ResultSet rs2 = stmt2.executeQuery(query2);
                          while(rs2.next()){
                          jComboBox1.addItem(new Object[]{rs2.getString("Tables_in_class12_project")});                          
                          }
                          }
        catch(Exception e){
        jOptionPane1.showMessageDialog(null,e);
    }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);            
        
        if(jComboBox1.getSelectedItem().toString().equals("Schedule")){
            try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 = "Select* from Schedule;";
                   ResultSet rs1 = stmt1.executeQuery(query1);
        while(rs1.next())
        {
             String TestID = rs1.getString("TestID");
             String Datee = rs1.getString("Date");
             String Type = rs1.getString("Type");
             String Subject = rs1.getString("Subject");
             int Max_Marks = Integer.parseInt(rs1.getString("Maximum_Marks"));
             String Note = rs1.getString("Note");
             String No_Of_Q = rs1.getString("No_Of_Q");
          model.addRow(new Object[] {TestID,Datee,Type,Subject,Max_Marks,Note,No_Of_Q});
        }
        jLabel8.setText(""+jTable1.getRowCount());
        jLabel10.setText(""+jTable1.getColumnCount());
        rs1.close();
        stmt1.close();
        con1.close();
    }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
        }
        if(jComboBox1.getSelectedItem().toString().equals("Students_Details")){
            
            try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 = "Select* from Students_Details;";
                   ResultSet rs1 = stmt1.executeQuery(query1);
        
        while(rs1.next())
        {
             String Name = rs1.getString("Name");
             String Username = rs1.getString("Username");
             String Class = rs1.getString("Class");
             String Section = rs1.getString("Section");
             String Exam_Roll = rs1.getString("Exam_Roll");
          model.addRow(new Object[] {Name,Username,Class,Section,Exam_Roll});
        }
        jLabel8.setText(""+jTable1.getRowCount());
        jLabel10.setText(""+jTable1.getColumnCount());
        rs1.close();
        stmt1.close();
        con1.close();
    }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
            
        }
        if(jComboBox1.getSelectedItem().toString().startsWith("Test_")){
            
            try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 = "Select* from Test_"+(jComboBox1.getSelectedIndex()-1)+";";
                   ResultSet rs1 = stmt1.executeQuery(query1);
        
        while(rs1.next())
        {
            
             String Q_No = rs1.getString("Q_No");
             String Type = rs1.getString("Type");
             String Question = rs1.getString("Question");
             String Sol_MCQ = rs1.getString("Sol_MCQ");
             String Sol_INT = rs1.getString("Sol_INT");
             String Opt_A = rs1.getString("Opt_A");
             String Opt_B = rs1.getString("Opt_B");
             String Opt_C = rs1.getString("Opt_C");
             String Opt_D = rs1.getString("Opt_D");
             
          model.addRow(new Object[] {Q_No,Type,Question,Sol_MCQ,Sol_INT,Opt_A,Opt_B,Opt_C,Opt_D});     
        }
        jLabel8.setText(""+jTable1.getRowCount());
        jLabel10.setText(""+jTable1.getColumnCount());
        rs1.close();
        stmt1.close();
        con1.close();
    }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
        }        
        jTextField1.setText("Replica_"+jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTextArea1.setText(jTable1.getValueAt(jTable1.getSelectedRow(),jTable1.getSelectedColumn()).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String x="A";
     try
         {
        Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt2 = con1.createStatement();
                   String query2 = "Desc "+jComboBox1.getSelectedItem().toString()+";";
                   ResultSet rs2 = stmt2.executeQuery(query2);
                   rs2.absolute(jTable1.getSelectedColumn()+1);
                   String k = rs2.getString("Field");
                   String type = rs2.getString("Type");
                   
         Statement stmt1 = con1.createStatement();
         String p="";
         if(type.startsWith("int")){
             p ="";
         }
         if(type.startsWith("varchar") || type.startsWith("date")){
             p ="'";
         }          
         String query1 ="Delete from "+jComboBox1.getSelectedItem().toString()+" where "+k+"="+p+jTextArea1.getText()+p+";";
                           
                   int rs0 = stmt1.executeUpdate(query1);
                   x=query1;
       }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
        System.out.println(""+x);
        for(int q=0;q<=jTable1.getColumnCount()-1;q++){
                   jTable1.setValueAt("",jTable1.getSelectedRow(),q);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Login Login = new Login();
                this.hide();
                Login.show();     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String x ="A";    
        try
         {
         Class.forName("java.sql.Driver");
         Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt2 = con2.createStatement();
                   String query2 = "Desc "+jComboBox1.getSelectedItem().toString()+";";
                   ResultSet rs2 = stmt2.executeQuery(query2);
                   rs2.absolute(jTable1.getSelectedColumn()+1);
                   String k = rs2.getString(1);
                   String type =rs2.getString(2);
             System.out.println(query2+"\t"+jComboBox1.getSelectedItem().toString());
         String p="";
         Statement stmt1 = con2.createStatement();
         if(type.startsWith("int")){
             p ="";
         }
         if(type.startsWith("varchar") || type.startsWith("date")){
             p ="'";
         }         
                   String query1 = "Update "+jComboBox1.getSelectedItem().toString()+" set "+k+"="+p+jTextArea2.getText()+p+" where "+k+"="+p+jTextArea1.getText()+p+";";
  
                   x=query1;
                   int rs1 = stmt1.executeUpdate(query1);
                                   
    }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
            jTable1.setValueAt(jTextArea2.getText(), jTable1.getSelectedRow(), jTable1.getSelectedColumn());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String A = ""+jTable2.getValueAt(0,0);
        String B = ""+jTable2.getValueAt(0,1);
        String C = ""+jTable2.getValueAt(0,2);
        String D = ""+jTable2.getValueAt(0,3);
        String E = ""+jTable2.getValueAt(0,4);
        String F = ""+jTable2.getValueAt(0,5);
        String G = ""+jTable2.getValueAt(0,6);
        String H = ""+jTable2.getValueAt(0,7);
        String I = ""+jTable2.getValueAt(0,8);
        String J = ""+jTable2.getValueAt(0,9);
        
        if(jComboBox1.getSelectedItem().toString().equals("Schedule")){
        try
         {
        Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 ="Insert Into "+"Schedule"+" values("+A+",'"+B+"','"+C+"','"+D+"',"+E+",'"+F+"',"+G+");";
                   int rs1 = stmt1.executeUpdate(query1);
       }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
        }
        
        if(jComboBox1.getSelectedItem().toString().equals("Students_Details")){
        try
         {
        Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 ="Insert Into "+"Students_Details"+" values('"+A+"','"+B+"',"+C+","+D+","+E+");";
                   int rs1 = stmt1.executeUpdate(query1);
       }
          catch(Exception e)
    {
        jOptionPane1.setMessage(e);
    }
        }
        
        if(jComboBox1.getSelectedItem().toString().startsWith("Test_")){
        try
         {
        Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 ="Insert Into "+jComboBox1.getSelectedItem().toString()+" values("+A+",'"+B+"','"+C+"','"+D+"',"+E+",'"+F+"','"
                           +G+"','"+H+"','"+I+"');";
                   int rs1 = stmt1.executeUpdate(query1);
       }
          catch(Exception e)
    {
        System.out.println(""+e);
    }
        }
        
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
     model.addRow(new Object[] {A,B,C,D,E,F,G,H,I,J});
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(jToggleButton1.isSelected()){
            jTextField1.setVisible(true);
            jButton7.setVisible(true);
            jLabel14.setVisible(true);
        }
        if(jToggleButton1.isSelected()==false){
            jTextField1.setVisible(false);
            jButton7.setVisible(false);
            jLabel14.setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         Statement stmt1 = con1.createStatement();
                   String query1 = "Create Table "+jTextField1.getText()+" as Select* from "+jComboBox1.getSelectedItem().toString()+";";
                   System.out.println(""+query1);
                   int rs1 = stmt1.executeUpdate(query1);
         }
        catch(Exception e){
            
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(jTextField2.getText().startsWith("Set Today's Announcement Date")){
            ;
        }
        else{
        nam.Announcement = jTextField2.getText();
        jLabel18.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
