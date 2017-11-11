package ipr.project;
//Project Under Package Named project in ipr

import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
//Importing various Classes to be Used

public class Dashboardad extends javax.swing.JFrame {
    
    public Dashboardad() {
        
        initComponents();
                  
        String Datee="",TestID="",Type="",Subject="",Note="",No_Of_Q="";
        
        DefaultTableModel model = (DefaultTableModel) Schedule_Table.getModel();
        try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 = "Select* from Schedule;";
                   ResultSet rs1 = stmt1.executeQuery(query1);
        
        while(rs1.next())
        {
            
             TestID = rs1.getString("TestID");
             Datee = rs1.getString("Date");
             Type = rs1.getString("Type");
             Subject = rs1.getString("Subject");
             int Max_Marks = Integer.parseInt(rs1.getString("Maximum_Marks"));
             Note = rs1.getString("Note");
             No_Of_Q = rs1.getString("No_Of_Q");
             
          model.addRow(new Object[] {TestID,Datee,Subject,Type,Max_Marks,No_Of_Q,Note});
          CB_Exm_Titles.addItem(TestID.concat("-"+Subject.concat("-"+Type.concat("-"+Max_Marks))));
            
        }
        rs1.close();
        stmt1.close();
        con1.close();
    }
          catch(Exception e)
    {
        jOptionPane1.showMessageDialog(null,e);
    }
        
        
try
{
Class.forName("java.sql.Driver");
         Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt2 = con2.createStatement();
                   String query2 = "Select Date from Schedule;";
                   ResultSet rs2 = stmt2.executeQuery(query2);
        
        if(rs2.next())
{
    String dt=rs2.getString("Date");

String query3="Select dayofyear('"+dt+"')-dayofyear(Date(Now())) from schedule;";
ResultSet rs3=stmt2.executeQuery(query3);

rs3.first();
    int d=rs3.getInt(1);
    
    if(d==0){
            No_Of_Days.setText("");
            Lbl_Days_to_go.setForeground(Color.red);
            Lbl_Days_to_go.setText("Today's your Exam; Best Of Luck!!");
        }    
    else{
        No_Of_Days.setText("");
        Lbl_Days_to_go.setForeground(Color.green);
        Lbl_Days_to_go.setText(" No Recent Exam :)");
    }
    if(d<=3 && d>=1){        
    No_Of_Days.setText(""+d);
    Lbl_Days_to_go.setText(" Days To Go; Be Prepared!!");
    }
    if(d<0){        
    No_Of_Days.setText("");
    Lbl_Days_to_go.setText("Last Exam has been Conducted!!");
    }
    
}
}

catch(Exception e){

}

TP_Nxt_Exam.setText(""+Schedule_Table.getValueAt(0, 0)+"|"+Schedule_Table.getValueAt(0, 1)+"|"+Schedule_Table.getValueAt(0, 2)+"|"+Schedule_Table.getValueAt(0, 3)+"|"+Schedule_Table.getValueAt(0, 4)+"|"+Schedule_Table.getValueAt(0, 5));

//Code for Announcement Marquee-Transition
Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){
                    
            int i;
                  public void run()
                {   
                    if(Announcement.getX()<665){
                    i = Announcement.getX()+1;
                    Announcement.setBounds(i, Announcement.getY(), Announcement.getWidth(), Announcement.getHeight());
                    }    
                    if(Announcement.getX()==665){
                    Announcement.setBounds(144, Announcement.getY(), Announcement.getWidth(), Announcement.getHeight());                    
                    }              
                }
                };
                timer.scheduleAtFixedRate(task, 0, 50);               
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jToolBar1 = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton1 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        Lbl_Announcements = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Schedule_Table = new javax.swing.JTable();
        Lbl_Exm_Schedule = new javax.swing.JLabel();
        Lbl_Nxt_Exam = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TP_Nxt_Exam = new javax.swing.JTextPane();
        No_Of_Days = new javax.swing.JLabel();
        Lbl_Days_to_go = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        From = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        To = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Ta_reason = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        Prnt_Sig = new javax.swing.JCheckBox();
        Btn_File_leave_rqst = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Sub = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TA_Query = new javax.swing.JTextArea();
        Btn_Post_Query = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Teacher = new javax.swing.JTextField();
        Lbl_Exm_Titles = new javax.swing.JLabel();
        TakeTest_Btn = new javax.swing.JButton();
        CB_Exm_Titles = new javax.swing.JComboBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        Announcement = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(551, 350, 284, 100));
        jDialog1.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cannot be Taken Today");

        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(81, 81, 81))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog2.setBounds(new java.awt.Rectangle(526, 208, 335, 385));
        jDialog2.setResizable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Instructions");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Make Sure That You Solve the Test by Yourself... NO Cheating.\n\nA Specified Amount of Time Will be Given for the Test.\n\nThe Application will automatically get Freezed when the Time gets up.. Nothing can be done further.. The Form filled upto then will be taken for Assesment.\n\nAn Assistive-Interacting Message Box Will Accompany you while Performing the Test to Help you by giving Important Messages.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton7.setText("Proceed To Test!!");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog3.setBounds(new java.awt.Rectangle(519, 366, 329, 70));
        jDialog3.setResizable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Please Fill All the Entries");

        jButton9.setText("OK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 665, 600));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(665, 622));

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("User Information");
        jToolBar1.setPreferredSize(new java.awt.Dimension(866, 33));

        filler2.setAutoscrolls(true);
        jToolBar1.add(filler2);

        jLabel16.setFont(new java.awt.Font("Lobster 1.4", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(nam.Name);
        jLabel16.setAlignmentY(0.0F);
        jLabel16.setAutoscrolls(true);
        jLabel16.setPreferredSize(new java.awt.Dimension(250, 55));
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jToolBar1.add(jLabel16);

        jSeparator1.setAutoscrolls(true);
        jToolBar1.add(jSeparator1);

        jLabel2.setFont(new java.awt.Font("Lobster 1.4", 0, 24)); // NOI18N
        jLabel2.setText(""+nam.Clas+"-A"+nam.Sec);
        jLabel2.setAutoscrolls(true);
        jToolBar1.add(jLabel2);

        jSeparator2.setAutoscrolls(true);
        jToolBar1.add(jSeparator2);

        jLabel3.setFont(new java.awt.Font("Lobster 1.4", 0, 24)); // NOI18N
        jLabel3.setText(""+nam.Exam_Roll);
        jLabel3.setAutoscrolls(true);
        jToolBar1.add(jLabel3);

        jSeparator3.setAutoscrolls(true);
        jToolBar1.add(jSeparator3);

        filler1.setAutoscrolls(true);
        jToolBar1.add(filler1);

        jButton1.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.setToolTipText("Logout");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        filler3.setAutoscrolls(true);
        jToolBar1.add(filler3);

        Lbl_Announcements.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Lbl_Announcements.setText("Announcements");

        Schedule_Table.setAutoCreateRowSorter(true);
        Schedule_Table.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        Schedule_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test ID", "Date", "Type", "Subject", "Maximum Marks", "No Of Questions", "NOTE:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Schedule_Table.setToolTipText("Exam Schedule");
        Schedule_Table.setAutoscrolls(false);
        Schedule_Table.setCellSelectionEnabled(true);
        Schedule_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Schedule_Table);

        Lbl_Exm_Schedule.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Lbl_Exm_Schedule.setText("Exam Schedule");

        Lbl_Nxt_Exam.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Lbl_Nxt_Exam.setText("Next Exam");

        TP_Nxt_Exam.setEditable(false);
        TP_Nxt_Exam.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(TP_Nxt_Exam);

        No_Of_Days.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        No_Of_Days.setText("");

        Lbl_Days_to_go.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Lbl_Days_to_go.setText("Days To Go");

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setText("From");

        From.setText("DD-MM-YY (Including The Day of Leave)");
        From.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FromMouseClicked(evt);
            }
        });

        jLabel13.setText("To");

        To.setText("DD-MM-YY (Including The Day of Leave)");
        To.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToMouseClicked(evt);
            }
        });

        Ta_reason.setColumns(20);
        Ta_reason.setLineWrap(true);
        Ta_reason.setRows(5);
        Ta_reason.setText("Submit the Reason Over Here");
        Ta_reason.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ta_reasonMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Ta_reason);

        jLabel14.setText("Reason :");

        Prnt_Sig.setText("PARENT'S SIGANTURES");

        Btn_File_leave_rqst.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        Btn_File_leave_rqst.setText("FILE LEAVE REQUEST");
        Btn_File_leave_rqst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_File_leave_rqstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(Btn_File_leave_rqst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Prnt_Sig))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(16, 16, 16)
                        .addComponent(To))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(Btn_File_leave_rqst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Prnt_Sig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(From, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(To, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Prnt_Sig, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Btn_File_leave_rqst, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setText("To Teacher");

        jLabel20.setText("Subject");

        Sub.setText("Subject of Query");
        Sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubMouseClicked(evt);
            }
        });

        jLabel21.setText("Query :");

        TA_Query.setColumns(20);
        TA_Query.setLineWrap(true);
        TA_Query.setRows(5);
        TA_Query.setText("Ask Your Queries Over Here");
        TA_Query.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TA_QueryMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(TA_Query);

        Btn_Post_Query.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        Btn_Post_Query.setText("POST QUERY");
        Btn_Post_Query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Post_QueryActionPerformed(evt);
            }
        });

        jLabel22.setText("Genuine Queries Accepted");

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("Note:");

        Teacher.setText("Teacher's Name");
        Teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeacherMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(Btn_Post_Query, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(22, 22, 22)
                            .addComponent(Sub))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel22))))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addComponent(Btn_Post_Query)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jLayeredPane2.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Sub, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Btn_Post_Query, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Teacher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Lbl_Exm_Titles.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        Lbl_Exm_Titles.setText("Examination Titles");

        TakeTest_Btn.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        TakeTest_Btn.setText("Take Test");
        TakeTest_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TakeTest_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeTest_BtnActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(jTextPane4);

        Announcement.setText(""+nam.Announcement);
        Announcement.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Lbl_Nxt_Exam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(No_Of_Days)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Days_to_go))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Lbl_Exm_Schedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_Announcements, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_Exm_Titles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TakeTest_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_Exm_Titles, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Announcement))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Announcements)
                    .addComponent(Announcement, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_Exm_Titles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CB_Exm_Titles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lbl_Exm_Schedule)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TakeTest_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lbl_Nxt_Exam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(No_Of_Days)
                        .addComponent(Lbl_Days_to_go))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Btn_File_leave_rqstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_File_leave_rqstActionPerformed
//Code for Leave Filing
        String o ="";
        if(Prnt_Sig.isSelected()){
    o ="Parent's Signature Given";
}
        else{
            o ="Parent's Signature Not Given";
        }
        if(From.equals("dd-mm-yy (Including The Day of Leave)") || To.equals("dd-mm-yy (Including The Day of Leave)") || Ta_reason.getText().isEmpty()){
 jDialog2.setVisible(true);
}
else{
    nam.App = "From: "+From.getText()+"\n"+"To: "+To.getText()+"\n"+"Reason: "+Ta_reason.getText()+"\n"+o;
    Btn_File_leave_rqst.setText("LEAVED Filed");
}
    }//GEN-LAST:event_Btn_File_leave_rqstActionPerformed

    private void TakeTest_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeTest_BtnActionPerformed
        //Code to Initialise Test
        nam.Test_Info = (String)CB_Exm_Titles.getSelectedItem();
        nam.Test_ID = Integer.parseInt(""+Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),0));
        nam.Date = (String)Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),1);
        nam.Type = (String)Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),2);
        nam.Subject = (String)Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),3);
        nam.Max_Marks = Integer.parseInt(""+Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),4));
        nam.No_Of_Q = Integer.parseInt(""+Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),5));
        nam.Note = (String)Schedule_Table.getValueAt(CB_Exm_Titles.getSelectedIndex(),6);
                      
        String j ="0", k="0";
                
        Calendar cal = new GregorianCalendar();
        int Month = cal.get(Calendar.MONTH);
        int Year = cal.get(Calendar.YEAR);
        int Day = cal.get(Calendar.DAY_OF_MONTH);
        
        if((Month+1)>=10){
            j="";
        }else{
            j="0";
        }
        
        if(Day>=10){
            k="";
        }else{
            k="0";
        }
        
        String f = Year+"-"+j+(Month+1)+"-"+k+Day;
        if(nam.Date.equals(f))
        {        
          jDialog2.setVisible(true);
          this.hide();
        }
        else
      {           
      jDialog1.setVisible(true);
      }
    }//GEN-LAST:event_TakeTest_BtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CB_Exm_Titles.requestFocus();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog2.setVisible(false);
        Test Test = new Test();
        Test.show();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jDialog2.setVisible(false);
        Dashboardad Dashboardad = new Dashboardad();
                        Dashboardad.show();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jDialog3.setVisible(false);
        From.requestFocus();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void Btn_Post_QueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Post_QueryActionPerformed
        if(Teacher.equals("Teacher Name") || Sub.equals("Subject") || TA_Query.getText().isEmpty()){
 jDialog3.setVisible(true);
}
else{
    nam.Query = "To Teacher: "+Teacher.getText()+"\n"+"Subject: "+Sub.getText()+"\n"+"Query: "+TA_Query.getText()+"\n";
Btn_Post_Query.setText("QUERY Posted");
        }
    }//GEN-LAST:event_Btn_Post_QueryActionPerformed
    
    private void FromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FromMouseClicked
       if(From.getText().equals("DD-MM-YY (Including The Day of Leave)")){
            From.setText("");
        }
    }//GEN-LAST:event_FromMouseClicked

    private void ToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToMouseClicked
        if(To.getText().equals("DD-MM-YY (Including The Day of Leave)")){
            To.setText("");
        }
    }//GEN-LAST:event_ToMouseClicked

    private void TeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherMouseClicked
        if(Teacher.getText().equals("Teacher's Name")){
            Teacher.setText("");
        }
    }//GEN-LAST:event_TeacherMouseClicked

    private void SubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubMouseClicked
       if(Sub.getText().equals("Subject of Query")){
            Sub.setText("");
        }
    }//GEN-LAST:event_SubMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login Login = new Login();
       this.hide();
       Login.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Ta_reasonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ta_reasonMouseClicked
        // TODO add your handling code here:
        if(Ta_reason.getText().equals("Submit the Reason Over Here")){
            Ta_reason.setText("");
        }
    }//GEN-LAST:event_Ta_reasonMouseClicked

    private void TA_QueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TA_QueryMouseClicked
        // TODO add your handling code here:
        if(TA_Query.getText().equals("Ask Your Queries Over Here")){
            TA_Query.setText("");
        }
    }//GEN-LAST:event_TA_QueryMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboardad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboardad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboardad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboardad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
                 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new Dashboardad().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Announcement;
    private javax.swing.JButton Btn_File_leave_rqst;
    private javax.swing.JButton Btn_Post_Query;
    private javax.swing.JComboBox CB_Exm_Titles;
    private javax.swing.JTextField From;
    private javax.swing.JLabel Lbl_Announcements;
    private javax.swing.JLabel Lbl_Days_to_go;
    private javax.swing.JLabel Lbl_Exm_Schedule;
    private javax.swing.JLabel Lbl_Exm_Titles;
    private javax.swing.JLabel Lbl_Nxt_Exam;
    private javax.swing.JLabel No_Of_Days;
    private javax.swing.JCheckBox Prnt_Sig;
    private javax.swing.JTable Schedule_Table;
    private javax.swing.JTextField Sub;
    private javax.swing.JTextArea TA_Query;
    private javax.swing.JTextPane TP_Nxt_Exam;
    private javax.swing.JTextArea Ta_reason;
    private javax.swing.JButton TakeTest_Btn;
    private javax.swing.JTextField Teacher;
    private javax.swing.JTextField To;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}