package ipr.project;
//Project Under Package Named project in ipr

import java.sql.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
//Importing Various Classes to be Used

public class Login extends javax.swing.JFrame {

    int Timerun=0;   
    public Login()
    {
        initComponents();
//Code for Day, Date       
        new Thread()
                {
              public void run()    
                          {                              
                              while(Timerun==0)
                              {
        Calendar cal = new GregorianCalendar();
        int Month = cal.get(Calendar.MONTH);
        int Year = cal.get(Calendar.YEAR);
        int Day = cal.get(Calendar.DAY_OF_MONTH);
        int Hour = cal.get(Calendar.HOUR_OF_DAY);
        int Minute = cal.get(Calendar.MINUTE);
        int Second = cal.get(Calendar.SECOND);
        int Day_week = cal.get(Calendar.DAY_OF_WEEK);
        String x="";
        switch(Day_week)
        {
            case 1 : x="Sunday";
                break;
                case 2 : x="Monday";
                break;
                case 3 : x="Tuesday";
                break;
                case 4 : x="Wednesday";
                break;
                case 5 : x="Thursday";
                break;
                case 6 : x="Friday";
                break;
                case 7 : x="Saturday";
                break;
         }
        Lbl_Date_Day.setText(Day + "-" + (Month + 1) + "-" + Year+"  "+x);
        Lbl_Time.setText(Hour + ":" + Minute + ":" + Second);
                                      }                              
                          }                    
                }.start();
        
    //Code for Transition
        Timer Timer = new Timer();
        
        TimerTask Task = new TimerTask(){
                    
            int i;
                  public void run()
                {   
                    if(Lbl_MPS.getY()>0){

                        if(Lbl_MPS.getHeight()>=100){
                        i = Lbl_MPS.getY()-1;                    
                    Lbl_MPS.setBounds(Lbl_MPS.getX(), i, (Lbl_MPS.getWidth()+2), 100);                               
                    }
                        else{
                        i = Lbl_MPS.getY()-2;                    
                    Lbl_MPS.setBounds(Lbl_MPS.getX(), i, (Lbl_MPS.getWidth()+2), (Lbl_MPS.getHeight()+1));
                        }
                }
                    if(Lbl_MPS.getY()==0){
                     Timer.cancel();
                        Name_frm.setVisible(true);
                        Username_frm.setVisible(true);
                        Txt_Name.setVisible(true);
                        Txt_Usrnm.setVisible(true);
                        Btn_Login.setVisible(true);
                        Lbl_Time.setVisible(true);                       
                        Lbl_Date_Day.setVisible(true);
                        Btn_Admin.setVisible(true);
                    }                    
               
                }
                  
                };
                
                Timer.scheduleAtFixedRate(Task, 0, 50);              
                
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jDialog4 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel13 = new javax.swing.JLabel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jDialog1 = new javax.swing.JDialog();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Lbl_MPS = new javax.swing.JLabel();
        Name_frm = new javax.swing.JLabel();
        Username_frm = new javax.swing.JLabel();
        Txt_Name = new javax.swing.JTextField();
        Txt_Usrnm = new javax.swing.JTextField();
        Btn_Login = new javax.swing.JButton();
        Lbl_Date_Day = new javax.swing.JLabel();
        Lbl_Time = new javax.swing.JLabel();
        Btn_Admin = new javax.swing.JButton();
        Roll_frm = new javax.swing.JLabel();
        Lbl_Class = new javax.swing.JLabel();
        CB_Roll = new javax.swing.JComboBox();
        CB_Class = new javax.swing.JComboBox();
        Class_frm = new javax.swing.JLabel();
        CB_Sec = new javax.swing.JComboBox();
        Section_frm = new javax.swing.JLabel();
        Lbl_Sec = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jDialog2.setTitle("Error");
        jDialog2.setAlwaysOnTop(true);
        jDialog2.setBounds(new java.awt.Rectangle(529, 327, 309, 135));
        jDialog2.setResizable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Wrong or Incomplete Entry");

        jButton3.setText("RETRY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Kindly Fix this!!");

        org.jdesktop.layout.GroupLayout jDialog2Layout = new org.jdesktop.layout.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jDialog2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel15)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jDialog2Layout.createSequentialGroup()
                        .add(60, 60, 60)
                        .add(jDialog2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jDialog2Layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jButton3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton4))
                            .add(jLabel17))
                        .add(68, 68, 68)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel15)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel17)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jDialog2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton3)
                    .add(jButton4))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog4.setBounds(new java.awt.Rectangle(496, 326, 388, 135));
        jDialog4.setResizable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Congratulations,");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText(" You Have Succesfully Logged in..");

        jButton5.setText("Proceed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jProgressBar1.setIndeterminate(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText(nam.Name);
        //jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipr/project/"+nam.Exam_Roll+".png")));

        org.jdesktop.layout.GroupLayout jDialog4Layout = new org.jdesktop.layout.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jDialog4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel12)
                    .add(jDialog4Layout.createSequentialGroup()
                        .add(jLabel11)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel13))
                    .add(jDialog4Layout.createSequentialGroup()
                        .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 291, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton5)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jDialog4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(jLabel11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel12)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jDialog4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDialog1.setBounds(new java.awt.Rectangle(508, 334, 350, 100));

        jButton6.setText("Enter Administration Centre");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Never Mind");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jDialog1Layout = new org.jdesktop.layout.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jDialog1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jDialog1Layout.createSequentialGroup()
                        .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSpinner3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSpinner3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton7)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(443, 194, 480, 382));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(480, 380));

        Lbl_MPS.setFont(new java.awt.Font("Bauhaus 93", 0, 55)); // NOI18N
        Lbl_MPS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipr/project/logo31.png"))); // NOI18N
        Lbl_MPS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Name_frm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Name_frm.setText("Name");

        Username_frm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Username_frm.setText("Username");

        Txt_Name.setFont(new java.awt.Font("Kalinga", 0, 18)); // NOI18N
        Txt_Name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NameActionPerformed(evt);
            }
        });

        Txt_Usrnm.setFont(new java.awt.Font("Kalinga", 0, 18)); // NOI18N
        Txt_Usrnm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Btn_Login.setFont(new java.awt.Font("NFS font", 0, 18)); // NOI18N
        Btn_Login.setText("Login");
        Btn_Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LoginActionPerformed(evt);
            }
        });

        Lbl_Date_Day.setFont(new java.awt.Font("Monotype Corsiva", 0, 21)); // NOI18N
        Lbl_Date_Day.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_Date_Day.setText("Date");

        Lbl_Time.setFont(new java.awt.Font("DigifaceWide", 0, 18)); // NOI18N
        Lbl_Time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lbl_Time.setText("Time");
        Lbl_Time.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Btn_Admin.setFont(new java.awt.Font("NFS font", 0, 18)); // NOI18N
        Btn_Admin.setText("Admin");
        Btn_Admin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AdminActionPerformed(evt);
            }
        });

        Roll_frm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Roll_frm.setText("Roll No");
        Roll_frm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Lbl_Class.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        Lbl_Class.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Class.setText("C");

        CB_Roll.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        CB_Roll.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        CB_Roll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CB_Roll.setEnabled(false);

        CB_Class.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        CB_Class.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12" }));
        CB_Class.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CB_Class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ClassActionPerformed(evt);
            }
        });

        Class_frm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Class_frm.setText("Class");

        CB_Sec.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        CB_Sec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2" }));
        CB_Sec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CB_Sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_SecActionPerformed(evt);
            }
        });
        CB_Sec.setEnabled(false);

        Section_frm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Section_frm.setText("Section");

        Lbl_Sec.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        Lbl_Sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Sec.setText("S");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(Username_frm)
                                    .add(Class_frm)
                                    .add(Section_frm)
                                    .add(Name_frm)
                                    .add(Roll_frm))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(Txt_Usrnm)
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                                .add(Lbl_Class, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(Lbl_Sec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(CB_Roll, 0, 47, Short.MAX_VALUE))
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, CB_Sec, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, CB_Class, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Btn_Admin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, Btn_Login, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(Txt_Name)))
                            .add(layout.createSequentialGroup()
                                .add(Lbl_Date_Day, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(Lbl_Time, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 20, Short.MAX_VALUE)
                        .add(Lbl_MPS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 450, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(Lbl_MPS)
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(Name_frm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(Txt_Name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Txt_Usrnm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Username_frm, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Class_frm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(CB_Class, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .add(Btn_Login, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(Section_frm)
                        .add(Btn_Admin))
                    .add(layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(CB_Sec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, CB_Roll, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(Lbl_Class, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(Roll_frm)
                        .add(Lbl_Sec, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Lbl_Date_Day)
                    .add(Lbl_Time, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LoginActionPerformed
    //Code for Login Security
        if (Txt_Name.getText().isEmpty()==false && Txt_Usrnm.getText().isEmpty()==false && Lbl_Class.getText().isEmpty()==false && Lbl_Sec.getText().isEmpty()==false && CB_Roll.getSelectedIndex() != -1){
                    
                nam.Name = Txt_Name.getText();
                nam.Username = Txt_Usrnm.getText();
                nam.Clas = Integer.parseInt(Lbl_Class.getText());
                nam.Sec = Integer.parseInt(Lbl_Sec.getText());
                nam.Exam_Roll = ((nam.Clas * 1000)+(nam.Sec * 100)+(CB_Roll.getSelectedIndex()+1));
                                
                try
         {
         Class.forName("java.sql.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");                        
         Statement stmt = con.createStatement();
                   String query = "Select* from Students_Details where Username='"+nam.Username+"' and Exam_Roll="+nam.Exam_Roll+";";
                   ResultSet rs = stmt.executeQuery(query);
                   boolean flag=false;
                   
                   while(rs.next()){                       
                       if(rs.getInt("Exam_Roll")==nam.Exam_Roll && rs.getString("Username").equals(nam.Username))
                       {         
                        flag=true;
                        rs.last();                        
                       }
                      else
                   {
                       flag=false;
                   }     
                   }                   
                       if(flag==true){                           
                           this.hide();
                        jDialog4.setVisible(true);
                       }
                       else{                           
                      jDialog2.setVisible(true);                     
                       }                           
    }
         catch(Exception e)
    {
        jOptionPane1.showMessageDialog(null,e);
    }
                
         } 
           else {
                   jDialog2.setVisible(true);
                }
        
     // if(buttonGroup1.getSelection().equals(jRadioButton2.getModel())){
            
            if(Txt_Name.getText().equals("Admin") && Txt_Usrnm.getText().equals("Admin")){
                this.hide();
                Administrator Administrator = new Administrator();
                Administrator.show();               
            }
            else
            {
                jDialog2.setVisible(true);
            }
      // }
    }//GEN-LAST:event_Btn_LoginActionPerformed

    private void CB_SecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_SecActionPerformed
        Lbl_Sec.setText(""+CB_Sec.getSelectedItem().toString());
        CB_Roll.setEnabled(true);
    }//GEN-LAST:event_CB_SecActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog2.setVisible(false);
        Txt_Usrnm.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog4.setVisible(false);
        Dashboardad Dashboardad = new Dashboardad();
                        Dashboardad.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CB_ClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ClassActionPerformed
        Lbl_Class.setText(""+CB_Class.getSelectedItem().toString());
        CB_Sec.setEnabled(true);
    }//GEN-LAST:event_CB_ClassActionPerformed

    private void Btn_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AdminActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_Btn_AdminActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Code for Admin Lock
        int code=((Integer.parseInt(jSpinner1.getValue().toString())*10000)+(Integer.parseInt(jSpinner2.getValue().toString())*100)+(Integer.parseInt(jSpinner3.getValue().toString())));
if(code==123456)       {
    jDialog1.setVisible(false);
        Administrator Administrator = new Administrator();
                        Administrator.show();
                        this.hide();
} 
else{
    jDialog2.setVisible(true);
}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NameActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Admin;
    private javax.swing.JButton Btn_Login;
    private javax.swing.JComboBox CB_Class;
    private javax.swing.JComboBox CB_Roll;
    private javax.swing.JComboBox CB_Sec;
    private javax.swing.JLabel Class_frm;
    private javax.swing.JLabel Lbl_Class;
    private javax.swing.JLabel Lbl_Date_Day;
    private javax.swing.JLabel Lbl_MPS;
    private javax.swing.JLabel Lbl_Sec;
    private javax.swing.JLabel Lbl_Time;
    private javax.swing.JLabel Name_frm;
    private javax.swing.JLabel Roll_frm;
    private javax.swing.JLabel Section_frm;
    private javax.swing.JTextField Txt_Name;
    private javax.swing.JTextField Txt_Usrnm;
    private javax.swing.JLabel Username_frm;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}
