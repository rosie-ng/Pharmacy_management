package main;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Pharmacy extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pre = null;
    ResultSet res = null;
    static int ex;
    User user;
    Company comp;
    static Drug drug;
    static Move_Drug move_drug;
    Buy_Drug buy;
    Date d;
    SimpleDateFormat dd;
    static String to;
    static String from;
    static String text;
    static String almost_expired_bar;
    static String expired_bar;

    public Pharmacy() {
        initComponents();
        con = Connect.connect();
        showDate();
        buttonvis();
        user = new User();
        drug = new Drug();
        comp = new Company();
        move_drug = new Move_Drug();
        buy = new Buy_Drug();
        loginas();
        warning();
        login_as();
        alert_message();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        userB = new javax.swing.JButton();
        drugs = new javax.swing.JButton();
        adduser = new javax.swing.JButton();
        deleteuser = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        adddrug = new javax.swing.JButton();
        deletedrug = new javax.swing.JButton();
        updatedrug = new javax.swing.JButton();
        searchdrug = new javax.swing.JButton();
        drugdetails = new javax.swing.JButton();
        newcom = new javax.swing.JButton();
        endwith = new javax.swing.JButton();
        update = new javax.swing.JButton();
        movedrug = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        logindetails = new javax.swing.JButton();
        changepass = new javax.swing.JButton();
        company = new javax.swing.JButton();
        editprice = new javax.swing.JButton();
        purchase = new javax.swing.JButton();
        renew_validate = new javax.swing.JButton();
        buydrug = new javax.swing.JButton();
        updatedeals = new javax.swing.JButton();
        alldeals = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        salesbill = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        shiftsales = new javax.swing.JButton();
        checkplace = new javax.swing.JButton();
        druglist = new javax.swing.JButton();
        movedrug1 = new javax.swing.JButton();
        expired1 = new javax.swing.JButton();
        almost = new javax.swing.JButton();
        retdrug = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Management");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pharmacy Management");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Today");

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 153));
        time.setText("00:00:00");

        today.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today.setForeground(new java.awt.Color(0, 0, 153));
        today.setText("00-00-0000");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Apps-session-logout-icon.png"))); // NOI18N
        jButton1.setToolTipText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Login As : ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login As : ");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User Name : ");

        username1.setBackground(new java.awt.Color(255, 255, 255));
        username1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("Login As : ");

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/2572420.postal.envelope.icon.dark.blue.isolated.on.black.background (2).jpg"))); // NOI18N
        jButton2.setToolTipText("Public Inbox");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Administration)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Log out");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel4)
                        .addGap(144, 144, 144)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3)
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(username)
                        .addGap(15, 15, 15)
                        .addComponent(username1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(today))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1220, 90);

        userB.setBackground(new java.awt.Color(0, 153, 153));
        userB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userB.setForeground(new java.awt.Color(255, 255, 255));
        userB.setText("User");
        userB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBActionPerformed(evt);
            }
        });
        jPanel1.add(userB);
        userB.setBounds(1050, 100, 140, 34);

        drugs.setBackground(new java.awt.Color(0, 153, 153));
        drugs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drugs.setForeground(new java.awt.Color(255, 255, 255));
        drugs.setText("Drugs");
        drugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsActionPerformed(evt);
            }
        });
        jPanel1.add(drugs);
        drugs.setBounds(860, 100, 150, 34);

        adduser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adduser.setText("Add User");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });
        jPanel1.add(adduser);
        adduser.setBounds(1050, 150, 140, 25);

        deleteuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteuser.setText("Delete User");
        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });
        jPanel1.add(deleteuser);
        deleteuser.setBounds(1050, 190, 140, 25);

        updateuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateuser.setText("Update User");
        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
            }
        });
        jPanel1.add(updateuser);
        updateuser.setBounds(1050, 230, 140, 25);

        adddrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adddrug.setText("Add Drug");
        adddrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddrugActionPerformed(evt);
            }
        });
        jPanel1.add(adddrug);
        adddrug.setBounds(860, 150, 150, 25);

        deletedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletedrug.setText("Delete Drug");
        deletedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedrugActionPerformed(evt);
            }
        });
        jPanel1.add(deletedrug);
        deletedrug.setBounds(860, 190, 150, 25);

        updatedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatedrug.setText("Update Drug");
        updatedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedrugActionPerformed(evt);
            }
        });
        jPanel1.add(updatedrug);
        updatedrug.setBounds(860, 230, 150, 25);

        searchdrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchdrug.setText("Search Drug");
        searchdrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdrugActionPerformed(evt);
            }
        });
        jPanel1.add(searchdrug);
        searchdrug.setBounds(860, 270, 150, 25);

        drugdetails.setBackground(new java.awt.Color(0, 153, 153));
        drugdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drugdetails.setForeground(new java.awt.Color(255, 255, 255));
        drugdetails.setText("Drug Details");
        drugdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(drugdetails);
        drugdetails.setBounds(670, 100, 150, 34);

        newcom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newcom.setText("New Company");
        newcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcomActionPerformed(evt);
            }
        });
        jPanel1.add(newcom);
        newcom.setBounds(188, 154, 118, 25);

        endwith.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        endwith.setText("Delete Company");
        endwith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endwithActionPerformed(evt);
            }
        });
        jPanel1.add(endwith);
        endwith.setBounds(188, 195, 118, 25);

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("Updates");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(188, 236, 119, 25);

        movedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movedrug.setText("Drugs_List");
        movedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movedrugActionPerformed(evt);
            }
        });
        jPanel1.add(movedrug);
        movedrug.setBounds(860, 350, 150, 25);

        setting.setBackground(new java.awt.Color(0, 153, 153));
        setting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 255, 255));
        setting.setText("Setting");
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        jPanel1.add(setting);
        setting.setBounds(10, 102, 141, 34);

        logindetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logindetails.setText("Login Details");
        logindetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logindetailsActionPerformed(evt);
            }
        });
        jPanel1.add(logindetails);
        logindetails.setBounds(10, 154, 141, 25);

        changepass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changepass.setText("Change Password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        jPanel1.add(changepass);
        changepass.setBounds(10, 195, 143, 25);

        company.setBackground(new java.awt.Color(0, 153, 153));
        company.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        company.setForeground(new java.awt.Color(255, 255, 255));
        company.setText("Company");
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        jPanel1.add(company);
        company.setBounds(188, 102, 118, 34);

        editprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editprice.setText("Edit Prices");
        editprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpriceActionPerformed(evt);
            }
        });
        jPanel1.add(editprice);
        editprice.setBounds(670, 190, 150, 25);

        purchase.setBackground(new java.awt.Color(0, 153, 153));
        purchase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchase.setForeground(new java.awt.Color(255, 255, 255));
        purchase.setText("Purchases");
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });
        jPanel1.add(purchase);
        purchase.setBounds(520, 100, 130, 34);

        renew_validate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        renew_validate.setText("Renew_Validity");
        renew_validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renew_validateActionPerformed(evt);
            }
        });
        jPanel1.add(renew_validate);
        renew_validate.setBounds(670, 270, 150, 25);

        buydrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buydrug.setText("Buy Drugs");
        buydrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buydrugActionPerformed(evt);
            }
        });
        jPanel1.add(buydrug);
        buydrug.setBounds(520, 150, 130, 25);

        updatedeals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatedeals.setText("Update Deals");
        updatedeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedealsActionPerformed(evt);
            }
        });
        jPanel1.add(updatedeals);
        updatedeals.setBounds(520, 190, 130, 25);

        alldeals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alldeals.setText("All Deals");
        alldeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alldealsActionPerformed(evt);
            }
        });
        jPanel1.add(alldeals);
        alldeals.setBounds(520, 230, 130, 25);

        sales.setBackground(new java.awt.Color(0, 153, 153));
        sales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setText("Sales");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        jPanel1.add(sales);
        sales.setBounds(338, 102, 150, 34);

        salesbill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salesbill.setText("Bills");
        salesbill.setActionCommand("Bills");
        salesbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesbillActionPerformed(evt);
            }
        });
        jPanel1.add(salesbill);
        salesbill.setBounds(338, 154, 150, 25);

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 236, 141, 25);

        shiftsales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        shiftsales.setText("Shift Sales");
        shiftsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftsalesActionPerformed(evt);
            }
        });
        jPanel1.add(shiftsales);
        shiftsales.setBounds(338, 195, 150, 25);

        checkplace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkplace.setText("Check Places");
        checkplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkplaceActionPerformed(evt);
            }
        });
        jPanel1.add(checkplace);
        checkplace.setBounds(670, 150, 150, 25);

        druglist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        druglist.setText("Drugs_List");
        druglist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                druglistActionPerformed(evt);
            }
        });
        jPanel1.add(druglist);
        druglist.setBounds(0, 0, 94, 24);

        movedrug1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movedrug1.setText("Move Drug");
        movedrug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movedrug1ActionPerformed(evt);
            }
        });
        jPanel1.add(movedrug1);
        movedrug1.setBounds(860, 310, 150, 25);

        expired1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        expired1.setText("Expired Drugs");
        expired1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expired1ActionPerformed(evt);
            }
        });
        jPanel1.add(expired1);
        expired1.setBounds(670, 230, 150, 25);

        almost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        almost.setText("Almost_Finished");
        almost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almostActionPerformed(evt);
            }
        });
        jPanel1.add(almost);
        almost.setBounds(670, 310, 150, 25);

        retdrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retdrug.setText("Retrieval Drug");
        retdrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retdrugActionPerformed(evt);
            }
        });
        jPanel1.add(retdrug);
        retdrug.setBounds(338, 235, 150, 25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/capsule.pill.health.medicine (1).jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 84, 1210, 510);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("About Pharmacy");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(153, 153, 153));
        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("About Developer");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1215, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void movedrug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movedrug1ActionPerformed
        new Move_Drug().setVisible(true);
    }//GEN-LAST:event_movedrug1ActionPerformed

    private void druglistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_druglistActionPerformed
        new Drug_List().setVisible(true);
    }//GEN-LAST:event_druglistActionPerformed

    private void checkplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkplaceActionPerformed
        new Move_Drug().setVisible(true);
    }//GEN-LAST:event_checkplaceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        sales();
    }//GEN-LAST:event_salesActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        if (!username.getText().equals("Employee")) {
            enterpurchase();
        } else {
            String pass = JOptionPane.showInputDialog("You are not allowed to check user Inforamtion\nTo get in please confirm Admin Password");
            String sql = "select NAME,PASSWORD from users where NAME='Tran Cao Van' ";
            try {
                pre = con.prepareStatement(sql);
                res = pre.executeQuery();
                if (res.next()) {
                    if (res.getString("PASSWORD").equals(pass)) {
                        enterpurchase();
                    } else if (pass.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You must write admin Password", "Failed Access", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password", "Failed Access", 2);
                    }
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
            }
        }
    }//GEN-LAST:event_purchaseActionPerformed

    private void editpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpriceActionPerformed
        new Edit_Price().setVisible(true);
    }//GEN-LAST:event_editpriceActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        company();
    }//GEN-LAST:event_companyActionPerformed

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        new Change_Password().setVisible(true);
    }//GEN-LAST:event_changepassActionPerformed

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        setting();
    }//GEN-LAST:event_settingActionPerformed

    private void movedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movedrugActionPerformed
        new Drug_List().setVisible(true);
    }//GEN-LAST:event_movedrugActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        comp.setVisible(true);
        comp.save.setEnabled(false);
        comp.update.setEnabled(true);
        comp.delete.setEnabled(false);
    }//GEN-LAST:event_updateActionPerformed

    private void endwithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endwithActionPerformed
        comp.setVisible(true);
        comp.save.setEnabled(false);
        comp.update.setEnabled(false);
        comp.delete.setEnabled(true);
    }//GEN-LAST:event_endwithActionPerformed

    private void newcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcomActionPerformed
        comp.setVisible(true);
        comp.save.setEnabled(true);
        comp.update.setEnabled(false);
        comp.delete.setEnabled(false);
    }//GEN-LAST:event_newcomActionPerformed

    private void drugdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugdetailsActionPerformed
        enterdrugdetails();
    }//GEN-LAST:event_drugdetailsActionPerformed

    private void searchdrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdrugActionPerformed
        new Search_Drug().setVisible(true);
    }//GEN-LAST:event_searchdrugActionPerformed

    private void updatedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedrugActionPerformed
        drug.setVisible(true);
        drug.adddrug.setEnabled(false);
        drug.deletedrug.setEnabled(false);
        drug.updatedrug.setEnabled(true);
    }//GEN-LAST:event_updatedrugActionPerformed

    private void deletedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedrugActionPerformed
        drug.setVisible(true);
        drug.updatedrug.setEnabled(false);
        drug.adddrug.setEnabled(false);
        drug.deletedrug.setEnabled(true);
    }//GEN-LAST:event_deletedrugActionPerformed

    private void adddrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddrugActionPerformed
        drug.setVisible(true);
        drug.updatedrug.setEnabled(false);
        drug.deletedrug.setEnabled(false);
        drug.adddrug.setEnabled(true);
    }//GEN-LAST:event_adddrugActionPerformed

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateuserActionPerformed
        user.setVisible(true);
        user.deleteuser.setEnabled(false);
        user.adduser.setEnabled(false);
        user.updateuser.setEnabled(true);
        user.id.setEditable(false);
    }//GEN-LAST:event_updateuserActionPerformed

    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserActionPerformed
        user.setVisible(true);
        user.adduser.setEnabled(false);
        user.updateuser.setEnabled(false);
        user.deleteuser.setEnabled(true);
    }//GEN-LAST:event_deleteuserActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        user.setVisible(true);
        user.deleteuser.setEnabled(false);
        user.updateuser.setEnabled(false);
        user.adduser.setEnabled(true);
    }//GEN-LAST:event_adduserActionPerformed

    private void drugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsActionPerformed
        enterdrugs();
    }//GEN-LAST:event_drugsActionPerformed

    private void userBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBActionPerformed
        if (!username.getText().equals("Employee")) {
            enteruser();
        } else {
            String pass = JOptionPane.showInputDialog(null, "You are not allowed to check user Inforamtion\nTo get in please confirm Admin Password");
            String sql = "select NAME,PASSWORD from users where NAME='Ebrahem Samer' ";
            try {
                pre = con.prepareStatement(sql);
                res = pre.executeQuery();
                if (res.next()) {
                    if (res.getString("PASSWORD").equals(pass)) {
                        enteruser();
                    } else if (pass.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "You must write admin Password", "Failed Access", 2);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Password", "Failed Access", 2);
                    }
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
            }
        }
    }//GEN-LAST:event_userBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void renew_validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renew_validateActionPerformed
        new Renew_Validity().setVisible(true);
    }//GEN-LAST:event_renew_validateActionPerformed

    private void expired1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expired1ActionPerformed
        new Expired_Drug().setVisible(true);
    }//GEN-LAST:event_expired1ActionPerformed

    private void logindetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logindetailsActionPerformed
        new Login_Details().setVisible(true);
    }//GEN-LAST:event_logindetailsActionPerformed

    private void buydrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buydrugActionPerformed
        buy.setVisible(true);
        buy.makedeal.setEnabled(true);
        buy.update.setEnabled(false);
    }//GEN-LAST:event_buydrugActionPerformed

    private void updatedealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedealsActionPerformed
        buy.setVisible(true);
        buy.update.setEnabled(true);
        buy.makedeal.setEnabled(false);
    }//GEN-LAST:event_updatedealsActionPerformed

    private void alldealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alldealsActionPerformed
        new All_Deal().setVisible(true);
    }//GEN-LAST:event_alldealsActionPerformed

    private void salesbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesbillActionPerformed
        new Sales_Bill().setVisible(true);
    }//GEN-LAST:event_salesbillActionPerformed

    private void almostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almostActionPerformed
        new Almost_Finish().setVisible(true);
    }//GEN-LAST:event_almostActionPerformed

    private void shiftsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftsalesActionPerformed
        new Shift_Sales().setVisible(true);
    }//GEN-LAST:event_shiftsalesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Inbox().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void retdrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retdrugActionPerformed
        new Retrieval_Drug().setVisible(true);
    }//GEN-LAST:event_retdrugActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new aboutPharmacy().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new aboutDeveloper().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    
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
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pharmacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddrug;
    private javax.swing.JButton adduser;
    private javax.swing.JButton alldeals;
    private javax.swing.JButton almost;
    private javax.swing.JButton buydrug;
    private javax.swing.JButton changepass;
    private javax.swing.JButton checkplace;
    private javax.swing.JButton company;
    private javax.swing.JButton deletedrug;
    private javax.swing.JButton deleteuser;
    private javax.swing.JButton drugdetails;
    private javax.swing.JButton druglist;
    private javax.swing.JButton drugs;
    private javax.swing.JButton editprice;
    private javax.swing.JButton endwith;
    private javax.swing.JButton expired1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logindetails;
    private javax.swing.JButton logout;
    private javax.swing.JButton movedrug;
    private javax.swing.JButton movedrug1;
    private javax.swing.JButton newcom;
    public javax.swing.JButton purchase;
    private javax.swing.JButton renew_validate;
    private javax.swing.JButton retdrug;
    private javax.swing.JButton sales;
    private javax.swing.JButton salesbill;
    private javax.swing.JButton searchdrug;
    private javax.swing.JButton setting;
    private javax.swing.JButton shiftsales;
    public static javax.swing.JLabel time;
    public static javax.swing.JLabel today;
    private javax.swing.JButton update;
    private javax.swing.JButton updatedeals;
    private javax.swing.JButton updatedrug;
    private javax.swing.JButton updateuser;
    public javax.swing.JButton userB;
    private javax.swing.JLabel username;
    public static javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
    private void showDate() {
        d = new Date();
        dd = new SimpleDateFormat("dd-MM-yyyy");
        today.setText(dd.format(d));

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss a");
                time.setText(dd.format(d));
            }
        }).start();
    }
    private void buttonvis() {
        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        checkplace.setVisible(false);
        editprice.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void uservis() {
        adduser.setVisible(true);
        deleteuser.setVisible(true);
        updateuser.setVisible(true);

    }
    private void aboutJMenu(){
        jMenu1.setVisible(false);
        jMenu2.setVisible(false);
    }
    private void enteruser() {
        userB.setEnabled(false);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(true);
        deleteuser.setVisible(true);
        updateuser.setVisible(true);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }
    private void enterdrugs() {
        drugs.setEnabled(false);
        userB.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(true);
        deletedrug.setVisible(true);
        updatedrug.setVisible(true);
        searchdrug.setVisible(true);
        movedrug.setVisible(true);
        movedrug1.setVisible(true);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enterdrugdetails() {
        drugdetails.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        editprice.setVisible(true);
        checkplace.setVisible(true);
        renew_validate.setVisible(true);
        expired1.setVisible(true);
        almost.setVisible(true);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }
    private void enterpurchase() {
        purchase.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(true);
        updatedeals.setVisible(true);
        alldeals.setVisible(true);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void sales() {
        sales.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(true);
        shiftsales.setVisible(true);
        retdrug.setVisible(true);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void setting() {
        setting.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(false);
        endwith.setVisible(false);
        update.setVisible(false);

        logindetails.setVisible(true);
        changepass.setVisible(true);
        logout.setVisible(true);
    }

    private void company() {
        company.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        purchase.setEnabled(true);
        setting.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        movedrug1.setVisible(false);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        renew_validate.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);

        buydrug.setVisible(false);
        updatedeals.setVisible(false);
        alldeals.setVisible(false);

        salesbill.setVisible(false);
        shiftsales.setVisible(false);
        retdrug.setVisible(false);

        newcom.setVisible(true);
        endwith.setVisible(true);
        update.setVisible(true);

        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void loginas() {
        String sql = "select ID,NAME from users where ID='" + Login.id.getText() + "' ";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            if (res.next()) {
                username1.setText(res.getString("NAME"));
                if (res.getString("ID").equals("1")) {
                    username.setText("Admin");
                } else {
                    username.setText("Employee");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }
    private void warning() {
        //check the Expiration of the drugs;
        int ex_year;
        int current_year;
        int ex_month;
        int ex_day;
        int current_month;
        int current_day;
        String sql = "select BARCODE,EXPIRATION_DATE from drugs";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                Warning warning = new Warning();
                ex_year = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[2]);
                ex_month = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[1]);
                ex_day = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[0]);
                current_year = Integer.parseInt(dd.format(d).split("-")[2]);
                current_month = Integer.parseInt(dd.format(d).split("-")[1]);
                current_day = Integer.parseInt(dd.format(d).split("-")[0]);
                if (ex_year == current_year) {
                    if (ex_month - current_month == 2) {
                        ex = 1;
                        almost_expired_bar = res.getString("BARCODE");
                        warning.setVisible(true);
                    } else if (ex_month == current_month) {
                        if (ex_day == current_day) {
                            ex = 0;
                            expired_bar = res.getString("BARCODE");
                            update_to_expired();
                            warning.setVisible(true);
                        }
                    }
                }

            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void update_to_expired() {
        String sql = "update drugs set EXPIRY='Expired' where BARCODE='" + expired_bar + "' ";
        try {
            pre = con.prepareStatement(sql);
            pre.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void login_as() {
        Date d = new Date();
        SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
        String sql = "insert into login (NAME,TYPE,DATE,TIME) values ('" + username1.getText() + "' ,'" + username.getText() + "' ,'" + today.getText() + "' ,'" + dd.format(d) + "' )";
        try {
            pre = con.prepareStatement(sql);
            pre.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void alert_message() {
        String sql = "select MESSAGE_TO,MESSAGE_FROM,MESSAGE_TEXT from message_history where MESSAGE_TO='" + username1.getText() + "' ";
        try {
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            if (res.next()) {
                to = res.getString("MESSAGE_TO");
                from = res.getString("MESSAGE_FROM");
                text = res.getString("MESSAGE_TEXT");
                new Alert().setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }
}
