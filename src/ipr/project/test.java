package ipr.project;
//Project Under Package Named project in ipr

//import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
//Importing various Classes to be Used

public class Test extends javax.swing.JFrame {

    public Test(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        Hour = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Minute = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Second = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Q_Slider = new javax.swing.JSlider();
        NXT_Q = new javax.swing.JButton();
        Prev_Q = new javax.swing.JButton();
        EX_CP = new javax.swing.JToggleButton();
        Visual_Timer = new javax.swing.JProgressBar();
        Question = new javax.swing.JPanel();
        Lbl_Q_No = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QTA = new javax.swing.JTextArea();
        Lbl_Type = new javax.swing.JLabel();
        Mark_Each = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Q_Size_Slider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        MCQ = new javax.swing.JPanel();
        OPTA = new javax.swing.JCheckBox();
        OPTB = new javax.swing.JCheckBox();
        OPTC = new javax.swing.JCheckBox();
        OPTD = new javax.swing.JCheckBox();
        Integer_M = new javax.swing.JPanel();
        Button = new javax.swing.JPanel();
        Submit_Ans_Btn = new javax.swing.JButton();
        Completion_Bar = new javax.swing.JProgressBar();
        Flag_btn = new javax.swing.JToggleButton();
        Clear_Btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Left = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Submitted = new javax.swing.JLabel();
        Integer_Ans_Lbl = new javax.swing.JLabel();
        INT_Ans = new javax.swing.JTextField();
        Start_Test_Btn = new javax.swing.JButton();
        Robot = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Q_Tbl = new javax.swing.JTable();
        Submit_Test_Btn = new javax.swing.JButton();

        jDialog1.setVisible(false);
        jDialog1.setTitle("Time Up");
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setBounds(new java.awt.Rectangle(507, 329, 363, 120));
        jDialog1.setPreferredSize(new java.awt.Dimension(353, 110));

        jLabel9.setFont(new java.awt.Font("Lobster 1.4", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("Time's Up");

        jButton15.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton15.setText("OK, Get The Report");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Test Is Over!!");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("The Entries Done Uptill the Exit of Test Window had been Submitted!!");

        jButton9.setFont(new java.awt.Font("NFS font", 0, 12)); // NOI18N
        jButton9.setText("Logout and Exit");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1.getAccessibleContext().setAccessibleDescription("");

        jDialog2.setAlwaysOnTop(true);
        jDialog2.setBounds(new java.awt.Rectangle(564, 329, 249, 120));

        jLabel12.setFont(new java.awt.Font("Lobster 1.4", 0, 22)); // NOI18N
        jLabel12.setText("Are you Sure?");

        jLabel3.setFont(new java.awt.Font("Lobster 1.4", 0, 18)); // NOI18N
        jLabel3.setText("Once Submitted No Alteration can be Done!");

        jButton4.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addComponent(jLabel3)))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog3.setAlwaysOnTop(true);
        jDialog3.setBounds(new java.awt.Rectangle(612, 235, 163, 318));

        jLabel13.setFont(new java.awt.Font("Lobster 1.4", 0, 36)); // NOI18N
        jLabel13.setText("Report");

        jLabel14.setText("Correct");

        jLabel15.setText("Incorrect");

        jLabel16.setText("Attempted");

        jLabel17.setText("Not Attempted");

        jLabel18.setText("Total Questions");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Marks");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Total");

        jLabel32.setText("Percentage");

        jButton6.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        jButton6.setText("Back to Dashboard");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("NFS font", 0, 14)); // NOI18N
        jButton8.setText("Exit");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32))
                        .addGap(26, 26, 26)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel33)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27)))
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Frame_Test"); // NOI18N

        Navigation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Hour.setBackground(new java.awt.Color(255, 255, 0));
        Hour.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        Hour.setForeground(new java.awt.Color(51, 255, 0));
        Hour.setText("00");

        jLabel23.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        jLabel23.setText(":");

        Minute.setBackground(new java.awt.Color(255, 255, 0));
        Minute.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        Minute.setForeground(new java.awt.Color(51, 255, 0));
        Minute.setText("00");

        jLabel25.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        jLabel25.setText(":");

        Second.setBackground(new java.awt.Color(255, 255, 0));
        Second.setFont(new java.awt.Font("DigifaceWide", 1, 18)); // NOI18N
        Second.setForeground(new java.awt.Color(51, 255, 0));
        Second.setText("00");

        jLabel22.setFont(new java.awt.Font("Lobster 1.4", 0, 20)); // NOI18N
        jLabel22.setText(""+nam.Test_Info);

        Q_Slider.setMajorTickSpacing(1);
        Q_Slider.setMaximum(10);
        Q_Slider.setMinimum(1);
        Q_Slider.setPaintLabels(true);
        Q_Slider.setPaintTicks(true);
        Q_Slider.setSnapToTicks(true);
        Q_Slider.setToolTipText("");
        Q_Slider.setValue(1);
        Q_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Q_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Q_SliderStateChanged(evt);
            }
        });
        Q_Slider.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                Q_SliderCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        Q_Slider.setEnabled(false);

        NXT_Q.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        NXT_Q.setText(">>");
        NXT_Q.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NXT_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NXT_QActionPerformed(evt);
            }
        });
        NXT_Q.setEnabled(false);

        Prev_Q.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Prev_Q.setText("<<");
        Prev_Q.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Prev_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prev_QActionPerformed(evt);
            }
        });
        Prev_Q.setEnabled(false);

        EX_CP.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        EX_CP.setSelected(true);
        EX_CP.setText("+");
        EX_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EX_CPActionPerformed(evt);
            }
        });

        Visual_Timer.setValue(100);
        Visual_Timer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Visual_Timer.setStringPainted(true);

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavigationLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Visual_Timer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Minute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Second)
                        .addGap(14, 14, 14))
                    .addGroup(NavigationLayout.createSequentialGroup()
                        .addComponent(Prev_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Q_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NXT_Q, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EX_CP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(Hour)
                        .addComponent(jLabel23)
                        .addComponent(Minute)
                        .addComponent(jLabel25)
                        .addComponent(Second)
                        .addComponent(EX_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Visual_Timer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NXT_Q, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prev_Q, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Q_Slider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Question.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Graffiti", 0, 18))); // NOI18N
        Question.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        Lbl_Q_No.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        QTA.setEditable(false);
        QTA.setBackground(new java.awt.Color(0, 0, 0));
        QTA.setColumns(20);
        QTA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        QTA.setForeground(new java.awt.Color(255, 255, 0));
        QTA.setLineWrap(true);
        QTA.setRows(5);
        QTA.setWrapStyleWord(true);
        QTA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        QTA.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(QTA);

        Lbl_Type.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        Lbl_Type.setForeground(new java.awt.Color(255, 0, 0));

        Mark_Each.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        Mark_Each.setForeground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jLabel1.setText("Marks");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jLabel4.setText("Type");

        jLabel34.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jLabel34.setText("Font   -");

        Q_Size_Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Q_Size_SliderStateChanged(evt);
            }
        });
        Q_Size_Slider.setEnabled(false);

        jLabel5.setText("+");

        javax.swing.GroupLayout QuestionLayout = new javax.swing.GroupLayout(Question);
        Question.setLayout(QuestionLayout);
        QuestionLayout.setHorizontalGroup(
            QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(QuestionLayout.createSequentialGroup()
                        .addComponent(Lbl_Q_No, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Q_Size_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbl_Type)
                        .addGap(38, 38, 38)
                        .addComponent(Mark_Each)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        QuestionLayout.setVerticalGroup(
            QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionLayout.createSequentialGroup()
                .addGroup(QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Q_Size_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(QuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Type)
                            .addComponent(Mark_Each)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel34)
                    .addComponent(Lbl_Q_No, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        buttonGroup1.add(OPTA);
        OPTA.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        OPTA.setText("A.");
        OPTA.setEnabled(false);

        buttonGroup1.add(OPTB);
        OPTB.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        OPTB.setText("B.");
        OPTB.setEnabled(false);

        buttonGroup1.add(OPTC);
        OPTC.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        OPTC.setText("C.");
        OPTC.setEnabled(false);

        buttonGroup1.add(OPTD);
        OPTD.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        OPTD.setText("D.");
        OPTD.setEnabled(false);

        javax.swing.GroupLayout MCQLayout = new javax.swing.GroupLayout(MCQ);
        MCQ.setLayout(MCQLayout);
        MCQLayout.setHorizontalGroup(
            MCQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MCQLayout.createSequentialGroup()
                .addGroup(MCQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OPTA)
                    .addComponent(OPTD)
                    .addComponent(OPTB)
                    .addComponent(OPTC))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MCQLayout.setVerticalGroup(
            MCQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MCQLayout.createSequentialGroup()
                .addComponent(OPTA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPTB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPTC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OPTD)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Integer_MLayout = new javax.swing.GroupLayout(Integer_M);
        Integer_M.setLayout(Integer_MLayout);
        Integer_MLayout.setHorizontalGroup(
            Integer_MLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        Integer_MLayout.setVerticalGroup(
            Integer_MLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Submit_Ans_Btn.setFont(new java.awt.Font("NFS font", 1, 14)); // NOI18N
        Submit_Ans_Btn.setText("SUBMIT");
        Submit_Ans_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Submit_Ans_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_Ans_BtnActionPerformed(evt);
            }
        });
        Submit_Ans_Btn.setEnabled(false);

        Completion_Bar.setMaximum(nam.No_Of_Q);
        Completion_Bar.setIndeterminate(true);
        Completion_Bar.setString("0");
        Completion_Bar.setStringPainted(true);

        Flag_btn.setFont(new java.awt.Font("NFS font", 1, 14)); // NOI18N
        Flag_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipr/project/flag-icon.png"))); // NOI18N
        Flag_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Flag_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flag_btnActionPerformed(evt);
            }
        });
        Flag_btn.setEnabled(false);

        Clear_Btn.setFont(new java.awt.Font("NFS font", 1, 14)); // NOI18N
        Clear_Btn.setText("CLEAR");
        Clear_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Clear_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_BtnActionPerformed(evt);
            }
        });
        Clear_Btn.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jLabel11.setText("Left");

        Left.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jLabel6.setText("Submitted");

        Submitted.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N

        javax.swing.GroupLayout ButtonLayout = new javax.swing.GroupLayout(Button);
        Button.setLayout(ButtonLayout);
        ButtonLayout.setHorizontalGroup(
            ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ButtonLayout.createSequentialGroup()
                        .addComponent(Submit_Ans_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Flag_btn))
                    .addComponent(Completion_Bar, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Left))
                    .addGroup(ButtonLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(Submitted)))
                .addContainerGap())
        );
        ButtonLayout.setVerticalGroup(
            ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Flag_btn)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Left))
                    .addComponent(Clear_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Submit_Ans_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Submitted)
                    .addComponent(Completion_Bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Integer_Ans_Lbl.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        Integer_Ans_Lbl.setText("Integer Answer");

        INT_Ans.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Integer_Ans_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INT_Ans, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Integer_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MCQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Question, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Integer_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Integer_Ans_Lbl)
                        .addComponent(INT_Ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Start_Test_Btn.setFont(new java.awt.Font("NFS font", 1, 15)); // NOI18N
        Start_Test_Btn.setText("START TEST");
        Start_Test_Btn.setToolTipText("Start Test");
        Start_Test_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Start_Test_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_Test_BtnActionPerformed(evt);
            }
        });

        Robot.setFont(new java.awt.Font("Graffiti", 0, 18)); // NOI18N
        Robot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Robot.setText("E-Buddy");
        Robot.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Q_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null},
                { new Integer(2), null, null},
                { new Integer(3), null, null},
                { new Integer(4), null, null},
                { new Integer(5), null, null},
                { new Integer(6), null, null},
                { new Integer(7), null, null},
                { new Integer(8), null, null},
                { new Integer(9), null, null},
                { new Integer(10), null, null},
                { new Integer(11), null, null},
                { new Integer(12), null, null},
                { new Integer(13), null, null},
                { new Integer(14), null, null},
                { new Integer(15), null, null},
                { new Integer(16), null, null},
                { new Integer(17), null, null},
                { new Integer(18), null, null},
                { new Integer(19), null, null},
                { new Integer(20), null, null},
                { new Integer(21), null, null},
                { new Integer(22), null, null},
                { new Integer(23), null, null},
                { new Integer(24), null, null},
                { new Integer(25), null, null},
                { new Integer(26), null, null},
                { new Integer(27), null, null},
                { new Integer(28), null, null},
                { new Integer(29), null, null},
                { new Integer(30), null, null},
                { new Integer(31), null, null},
                { new Integer(32), null, null},
                { new Integer(33), null, null},
                { new Integer(34), null, null},
                { new Integer(35), null, null},
                { new Integer(36), null, null},
                { new Integer(37), null, null},
                { new Integer(38), null, null},
                { new Integer(39), null, null},
                { new Integer(40), null, null},
                { new Integer(41), null, null},
                { new Integer(42), null, null},
                { new Integer(43), null, null},
                { new Integer(44), null, null},
                { new Integer(45), null, null},
                { new Integer(46), null, null},
                { new Integer(47), null, null},
                { new Integer(48), null, null},
                { new Integer(49), null, null},
                { new Integer(50), null, null}
            },
            new String [] {
                "Q", "Ans", "Flag"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Q_Tbl.getTableHeader().setReorderingAllowed(false);
        Q_Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Q_TblMouseClicked(evt);
            }
        });
        Q_Tbl.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Q_TblInputMethodTextChanged(evt);
            }
        });
        jScrollPane3.setViewportView(Q_Tbl);
        Q_Tbl.setEnabled(false);

        Submit_Test_Btn.setFont(new java.awt.Font("NFS font", 1, 15)); // NOI18N
        Submit_Test_Btn.setText("SUBMIT TEST");
        Submit_Test_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Submit_Test_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_Test_BtnActionPerformed(evt);
            }
        });
        Submit_Test_Btn.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Robot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Start_Test_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Submit_Test_Btn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_Test_Btn)
                    .addComponent(Start_Test_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Robot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Frame_Test");

        setSize(new java.awt.Dimension(809, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Flag_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flag_btnActionPerformed
        DefaultTableModel Model_T2 = (DefaultTableModel) Q_Tbl.getModel();
        
        if(Flag_btn.isSelected())
        {            
            Q_Tbl.setValueAt("#",Q_Slider.getValue()-1,2);
            Q_Tbl.setRowSelectionInterval(Q_Slider.getValue()-1,Q_Slider.getValue()-1);
            Q_Tbl.setSelectionBackground(Color.CYAN);
            Q_Tbl.setSelectionForeground(Color.DARK_GRAY);
        }      
        else
        {
            Q_Tbl.setValueAt("",Q_Slider.getValue()-1,2);
            Q_Tbl.setRowSelectionInterval(Q_Slider.getValue()-1,Q_Slider.getValue()-1);
            Q_Tbl.setSelectionBackground(Color.BLACK);
            Q_Tbl.setSelectionForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_Flag_btnActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Submit_Test_Btn.doClick();
        this.hide();
        jDialog1.setVisible(false);
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void Q_SliderCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Q_SliderCaretPositionChanged
    }//GEN-LAST:event_Q_SliderCaretPositionChanged

    private void Q_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Q_SliderStateChanged
      Flag_btn.setSelected(false);
      buttonGroup1.clearSelection();
      INT_Ans.setText("");
       
      int x = Integer.parseInt(Minute.getText());
      int y = Integer.parseInt(Second.getText());
      
      nam.alpha = (int)(x*100)+y;
      
        try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 = "Select* from Test_"+nam.Test_ID+";";
                   ResultSet rs1 = stmt1.executeQuery(query1);
                   
            rs1.absolute(Q_Slider.getValue());
       String Q_No = rs1.getString("Q_No");
       String Type = rs1.getString("Type");
       String Question = rs1.getString("Question");
       String Sol_MCQ = rs1.getString("Sol_MCQ");
       String Sol_ID = rs1.getString("Sol_Int");
       String Opt_A = rs1.getString("Opt_A");
       String Opt_B = rs1.getString("Opt_B");
       String Opt_C = rs1.getString("Opt_C");
       String Opt_D = rs1.getString("Opt_D");
       
       
                   QTA.setText(Question);
                   Lbl_Type.setText(Type);
                   OPTA.setText("A. "+Opt_A);
                   OPTB.setText("B. "+Opt_B);
                   OPTC.setText("C. "+Opt_C);
                   OPTD.setText("D. "+Opt_D);
                   
                Lbl_Q_No.setText(""+Q_Slider.getValue());   
                if(Type.equals("MCQ"))
                {
                    MCQ.setVisible(true);
                 Integer_M.setVisible(false);
                }
                if(Type.equals("INT"))
                {
                    Integer_M.setVisible(true);
                 MCQ.setVisible(false);
                }
                if(Q_Tbl.getValueAt((Q_Slider.getValue()-1), 2).toString().isEmpty()==true){
                                
                    Flag_btn.setSelected(false);
                    Q_Tbl.setRowSelectionInterval(Q_Slider.getValue()-1,Q_Slider.getValue()-1);
            Q_Tbl.setSelectionBackground(Color.BLACK);
            Q_Tbl.setSelectionForeground(Color.LIGHT_GRAY);
                }
                if(Q_Tbl.getValueAt((Q_Slider.getValue()-1), 2).toString().equals("#")==true){
                
                    Flag_btn.setSelected(true);
                    Q_Tbl.setRowSelectionInterval(Q_Slider.getValue()-1,Q_Slider.getValue()-1);
            Q_Tbl.setSelectionBackground(Color.CYAN);
            Q_Tbl.setSelectionForeground(Color.DARK_GRAY);
                }
    }
          catch(Exception e)
    {
       
    }
    }//GEN-LAST:event_Q_SliderStateChanged

    private void NXT_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NXT_QActionPerformed
        Q_Slider.setValue(Q_Slider.getValue()+1);        
    }//GEN-LAST:event_NXT_QActionPerformed

    private void Prev_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prev_QActionPerformed
        Q_Slider.setValue(Q_Slider.getValue()-1);
    }//GEN-LAST:event_Prev_QActionPerformed

    private void Submit_Ans_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_Ans_BtnActionPerformed
        Completion_Bar.setIndeterminate(false);
        
        if(Lbl_Type.getText().equals("INT")){
             Q_Tbl.setValueAt(Integer.parseInt(INT_Ans.getText()),(Q_Slider.getValue()-1),1);
            }
        
        if(Lbl_Type.getText().equals("MCQ")){
           if(buttonGroup1.getSelection()==OPTA.getModel()){
               Q_Tbl.setValueAt("A",Q_Slider.getValue()-1,1);
           }
           if(buttonGroup1.getSelection()==OPTB.getModel()){
               Q_Tbl.setValueAt("B",Q_Slider.getValue()-1,1);
           }
           if(buttonGroup1.getSelection()==OPTC.getModel()){
               Q_Tbl.setValueAt("C",Q_Slider.getValue()-1,1);
           }
           if(buttonGroup1.getSelection()==OPTD.getModel()){
               Q_Tbl.setValueAt("D",Q_Slider.getValue()-1,1);
           }
        }
        int k=0;
        for(int y=0;y<=(Q_Tbl.getRowCount()-1);y++){
            if(Q_Tbl.getValueAt(y,1)==null){
                k++;
            }                 
        }
        Submitted.setText(""+(Q_Tbl.getRowCount()-k));
        
        Left.setText(""+(nam.No_Of_Q-(Q_Tbl.getRowCount()-k)));
        
        Completion_Bar.setValue(Integer.parseInt(Submitted.getText()));
        Completion_Bar.setString(""+Integer.parseInt(Submitted.getText()));
        
    }//GEN-LAST:event_Submit_Ans_BtnActionPerformed

    private void EX_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EX_CPActionPerformed
        if(EX_CP.isSelected()){
        jScrollPane3.setVisible(true);
        }
        else{
        jScrollPane3.setVisible(false);
        }
    }//GEN-LAST:event_EX_CPActionPerformed

    private void Clear_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_BtnActionPerformed
        if(Lbl_Type.getText().equals("INT")){
            INT_Ans.setText("");
            Q_Tbl.setValueAt(null,Q_Slider.getValue()-1,1);
        }
        if(Lbl_Type.getText().equals("MCQ")){
           buttonGroup1.clearSelection();
           Q_Tbl.setValueAt(null,Q_Slider.getValue()-1,1);
        }
        int k=0;
        for(int y=0;y<=(Q_Tbl.getRowCount()-1);y++){
            if(Q_Tbl.getValueAt(y,1)==null){
                k++;
            }                 
        }
        Submitted.setText(""+(Q_Tbl.getRowCount()-k));
        
        Left.setText(""+(nam.No_Of_Q-(Q_Tbl.getRowCount()-k)));
        
        Completion_Bar.setValue(Integer.parseInt(Submitted.getText()));
        Completion_Bar.setString(""+Integer.parseInt(Submitted.getText()));
    }//GEN-LAST:event_Clear_BtnActionPerformed

    private void Submit_Test_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_Test_BtnActionPerformed
       nam.No_Of_Q_A = Integer.parseInt(Submitted.getText());
       nam.No_Of_Q_NA = Integer.parseInt(Left.getText());
       
       int i=0;
       
       try
         {
         Class.forName("java.sql.Driver");
         Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/Class12_Project","root","root");
         
         Statement stmt1 = con1.createStatement();
                   String query1 = "Select* from Test_"+nam.Test_ID+";";
                   ResultSet rs1 = stmt1.executeQuery(query1);
          
                   for(int x=1;x<=nam.No_Of_Q;x++){
                       rs1.absolute(x);
                       
                       String Sol_MCQ = rs1.getString("Sol_MCQ");
                       Integer Sol_INT = rs1.getInt("Sol_INT");
                       
                       if(Q_Tbl.getValueAt((x-1),1).equals(Sol_MCQ) || (Integer)Q_Tbl.getValueAt((x-1),1)==Sol_INT){               
                               i++;
                               System.out.println(" "+Q_Tbl.getValueAt((x-1),1)+" Equal to "+Sol_MCQ+" or "+Sol_INT+" "+(nam.No_Of_Q_A-i));
                                     }
                       else{
                           System.out.println(" "+Q_Tbl.getValueAt((x-1),1)+" Not Equal to "+Sol_MCQ+" or "+Sol_INT+" "+i);
                       }
                   }        
        rs1.close();
        stmt1.close();
        con1.close();
    }
          catch(Exception e)
    {
        jOptionPane1.showMessageDialog(null,e);
    }
       int k = (nam.Max_Marks/nam.No_Of_Q);
       double o = (double)((((double)i*(double)k)/(double)nam.Max_Marks)*100);
       
       jDialog2.setVisible(true);
       jLabel19.setText(""+i);
       jLabel21.setText(""+(nam.No_Of_Q_A-i));
       jLabel24.setText(""+nam.No_Of_Q_A);
       jLabel26.setText(""+nam.No_Of_Q_NA);
       jLabel27.setText(""+nam.No_Of_Q);
       jLabel29.setText(""+(i*k));
       jLabel31.setText(""+nam.Max_Marks);
       jLabel33.setText(""+o+" "+"%");
       
       
       
    }//GEN-LAST:event_Submit_Test_BtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDialog2.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      this.hide();        
        jDialog2.setVisible(false);
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Q_TblInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Q_TblInputMethodTextChanged
    }//GEN-LAST:event_Q_TblInputMethodTextChanged

    private void Q_TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Q_TblMouseClicked
    }//GEN-LAST:event_Q_TblMouseClicked

    private void Q_Size_SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Q_Size_SliderStateChanged
        Font font = new Font("Monospace", Font.PLAIN ,Q_Size_Slider.getValue());
        QTA.setFont(font);
    }//GEN-LAST:event_Q_Size_SliderStateChanged

    private void Start_Test_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_Test_BtnActionPerformed
        OPTA.setEnabled(true);      
        OPTB.setEnabled(true);
        OPTC.setEnabled(true);
        OPTD.setEnabled(true);
        INT_Ans.setEnabled(true);
        Flag_btn.setEnabled(true);
        Clear_Btn.setEnabled(true);
        Submit_Ans_Btn.setEnabled(true);
        Submit_Test_Btn.setEnabled(true);
        Q_Slider.setEnabled(true);
        Q_Slider.setMaximum(WIDTH);
        Q_Size_Slider.setEnabled(true);
        Prev_Q.setEnabled(true);
        NXT_Q.setEnabled(true);
        Q_Tbl.setEnabled(true);
       
        Robot.setText("Good Luck!!");
        Start_Test_Btn.setEnabled(false);
        
        int sec1 = Integer.parseInt(Second.getText());
                   int min1 = Integer.parseInt(Minute.getText());
                   int hour1 = Integer.parseInt(Hour.getText());
                   int gamma = (min1*100)+sec1;
                   //System.out.println(""+gamma);
        
        Timer timer = new Timer();
        
        TimerTask task = new TimerTask(){
                           
                  public void run()
                {
                   int sec = Integer.parseInt(Second.getText());
                   int min = Integer.parseInt(Minute.getText());
                   int hour = Integer.parseInt(Hour.getText());
                   int beta = (min*100)+sec;
                                      
                   if((nam.alpha-beta)>=100 && (nam.alpha-beta)<=110)
                       {
                           Robot.setText("Do not hesitate to Skip!!");
                       }    
                   else
                   {
                       Robot.setText("Good Luck!!");
                   }
                   
                   if(sec>=0 && sec<=10 && hour==0 && min==0)
                       {
                          Hour.setForeground(Color.red);
                          Minute.setForeground(Color.red);
                          Second.setForeground(Color.red);
                          Robot.setText("Last 10 Seconds!!");
                       }
                       
                   if(hour==0 && min==4 && sec>=50 && sec<=59)
                       {
                          Hour.setForeground(Color.green);
                          Minute.setForeground(Color.green);
                          Robot.setText("Just 5 Mins. Left, Hurry Up!!");
                       }
                   
                       if(hour==0 && min==1 && sec>=50 && sec<=59)
                       {
                          Hour.setForeground(Color.green);
                          Minute.setForeground(Color.green);
                          Robot.setText("Just 2 Mins. Left, Hurry Up!!");
                       }  
                       
                       if(sec<=45 && sec>=40)
                       {
                           Robot.setText("Check the Timer!!");
                       }
                                              
                       
                  if(sec==0)
                           {                                
                               if(hour==0 && min==0 && sec==0)
                           {
                               jDialog1.setVisible(true);
                               timer.cancel();
                               
                               Button.setVisible(false);
                               Navigation.setVisible(false);
                               MCQ.setVisible(false);
                               Integer_M.setVisible(false);
                               Question.setVisible(false);

                           }
                               else{
                               sec=59;
                             Second.setText(""+sec);
                               min-=1;
                             Minute.setText(""+min);
                                   }
                           }
                           else
                           {
                               sec-=1;
                               Second.setText(""+sec);                               
                           }
                          
                  if(min==0 && sec==0)
                           {
                               if(hour==0 && min==0 && sec==0)
                           {
                               jDialog1.setVisible(true);
                               timer.cancel();
                               
                               Button.setVisible(false);
                               Navigation.setVisible(false);
                               MCQ.setVisible(false);
                               Integer_M.setVisible(false);
                               Question.setVisible(false);
                           }
                               else{
                               min=59;
                               Minute.setText(""+min);
                               if(hour>=1)
                               {
                                hour-=1;
                               Hour.setText(""+hour);   
                               }
                                   }
                           }                 
                  double b = (((double)beta/(double)gamma)*100);
                           Visual_Timer.setValue((int)b);
                           //System.out.println(b);
                }
                  
                };
                
                timer.scheduleAtFixedRate(task, 0, 1000);
                                
                Q_Slider.setValue(2); Q_Slider.setValue(1);
    }//GEN-LAST:event_Start_Test_BtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Dashboard d = new Dashboard();
        d.show();
        jDialog3.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button;
    private javax.swing.JButton Clear_Btn;
    private javax.swing.JProgressBar Completion_Bar;
    private javax.swing.JToggleButton EX_CP;
    private javax.swing.JToggleButton Flag_btn;
    private javax.swing.JLabel Hour;
    private javax.swing.JTextField INT_Ans;
    private javax.swing.JLabel Integer_Ans_Lbl;
    private javax.swing.JPanel Integer_M;
    private javax.swing.JLabel Lbl_Q_No;
    private javax.swing.JLabel Lbl_Type;
    private javax.swing.JLabel Left;
    private javax.swing.JPanel MCQ;
    private javax.swing.JLabel Mark_Each;
    private javax.swing.JLabel Minute;
    private javax.swing.JButton NXT_Q;
    private javax.swing.JPanel Navigation;
    private javax.swing.JCheckBox OPTA;
    private javax.swing.JCheckBox OPTB;
    private javax.swing.JCheckBox OPTC;
    private javax.swing.JCheckBox OPTD;
    private javax.swing.JButton Prev_Q;
    private javax.swing.JTextArea QTA;
    private javax.swing.JSlider Q_Size_Slider;
    private javax.swing.JSlider Q_Slider;
    private javax.swing.JTable Q_Tbl;
    private javax.swing.JPanel Question;
    private javax.swing.JLabel Robot;
    private javax.swing.JLabel Second;
    private javax.swing.JButton Start_Test_Btn;
    private javax.swing.JButton Submit_Ans_Btn;
    private javax.swing.JButton Submit_Test_Btn;
    private javax.swing.JLabel Submitted;
    private javax.swing.JProgressBar Visual_Timer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
