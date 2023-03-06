

public class BlogsPage extends ParentClass{
	 // Variables declaration - do not modify                     
    private javax.swing.JLabel Azhar_comlabel;
    private java.awt.Button exitButton;
    private java.awt.Button maximizeButton;
    private java.awt.Button minimizeButton;
    private javax.swing.JLabel Blogslabel;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel Login_signUpLabel;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private LoginPage pg1;
    private ContactPage con1;
    
    // End of variables declaration   
    
    public BlogsPage() {
         BlogsPageComponents();
    }
    private void BlogsPageComponents() {
        jPanel2 = new javax.swing.JPanel();
        Login_signUpLabel = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        Blogslabel = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        Azhar_comlabel = new javax.swing.JLabel();
        IconLabel = new javax.swing.JLabel();
        exitButton = new java.awt.Button();
        maximizeButton = new java.awt.Button();
        minimizeButton = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        pg1 = new LoginPage();
        con1 = new ContactPage();
        //blog1 = new BlogsPage(); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1387, 2100));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(1, 50, 67));
        jPanel2.setForeground(new java.awt.Color(25, 181, 254));
        jPanel2.setLayout(null);

        Login_signUpLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Login_signUpLabel.setForeground(new java.awt.Color(25, 181, 254));
        Login_signUpLabel.setText("login/signup");
        Login_signUpLabel.addMouseListener(new java.awt.event.MouseListener() {

			public void mousePressed(java.awt.event.MouseEvent e) {
			    
			     con1.dispose();
				pg1.setVisible(true);
				
			
        }

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				//mouseClicked(e);
				Login_signUpLabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				Login_signUpLabel.setForeground(new java.awt.Color(255,255,255));
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				Login_signUpLabel.setForeground(new java.awt.Color(255, 0,0));
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				Login_signUpLabel.setForeground(new java.awt.Color(25, 181, 254));
				
			}});
        jPanel2.add(Login_signUpLabel);
        Login_signUpLabel.setBounds(1191, 39, 87, 24);


        ContactLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ContactLabel.setForeground(new java.awt.Color(25, 181, 254));
        ContactLabel.setText("Contact");
        jPanel2.add(ContactLabel);
        ContactLabel.setBounds(1118, 40, 55, 23);
        ContactLabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				pg1.dispose();
				
				con1.setVisible(true);
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				ContactLabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				ContactLabel.setForeground(new java.awt.Color(255,255,255));
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			
			   	ContactLabel.setForeground(new java.awt.Color(255, 0,0));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				ContactLabel.setForeground(new java.awt.Color(25, 181, 254));
			}
        	
        });

        Blogslabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Blogslabel.setForeground(new java.awt.Color(25, 181, 254));
        Blogslabel.setText("   Blogs");
        jPanel2.add(Blogslabel);
        Blogslabel.setBounds(1054, 43, 50, 17);
        Blogslabel.addMouseListener(new java.awt.event.MouseListener() {

		
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				pg1.dispose();
				con1.dispose();
				clickLabelMouseClicked(e);
				// blog1.setVisible(true);

								
				
				
			}

			
			public void mousePressed(java.awt.event.MouseEvent e) {
				
				Blogslabel.setForeground(new java.awt.Color(0,255,0));
				
			}

	
			public void mouseReleased(java.awt.event.MouseEvent e) {
				Blogslabel.setForeground(new java.awt.Color(255,255,255));
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			
				Blogslabel.setForeground(new java.awt.Color(255, 0,0));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				Blogslabel.setForeground(new java.awt.Color(25, 181, 254));
			}
        	
        });

        HomeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HomeLabel.setForeground(new java.awt.Color(25, 181, 254));
        HomeLabel.setText("Home");
        jPanel2.add(HomeLabel);
        HomeLabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				Homepage(e);
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				
				HomeLabel.setForeground(new java.awt.Color(0,255,0));
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				HomeLabel.setForeground(new java.awt.Color(255,255,255));
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				HomeLabel.setForeground(new java.awt.Color(255, 0,0));
		
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				HomeLabel.setForeground(new java.awt.Color(25, 181, 254));
			}
        	
        });
        HomeLabel.setBounds(1003, 43, 41, 17);

        Azhar_comlabel.setForeground(new java.awt.Color(25, 181, 254));
        Azhar_comlabel.setText("Azhar.com");
        jPanel2.add(Azhar_comlabel);
        Azhar_comlabel.setBounds(10, 38, 65, 14);
        Azhar_comlabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				/*Window browser =new  Windows();
				browser.
			}*/}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				Azhar_comlabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				Azhar_comlabel.setForeground(new java.awt.Color(255,255,255));
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				Azhar_comlabel.setForeground(new java.awt.Color(255, 0,0));
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				Azhar_comlabel.setForeground(new java.awt.Color(25, 181, 254));
				
			}
        	
        });

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/question1.jpg"))); // NOI18N
        jPanel2.add(IconLabel);
        IconLabel.setBounds(10, 0, 51, 36);

       exitButton.setActionCommand("Back");
       exitButton.setBackground(new java.awt.Color(0, 255, 255));
       exitButton.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
       exitButton.setForeground(new java.awt.Color(255, 0, 0));
       exitButton.setLabel("X");
       exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton);
        exitButton.setBounds(1346, 0, 24, 22);

       maximizeButton.setActionCommand("Back");
       maximizeButton.setBackground(new java.awt.Color(102, 255, 255));
       maximizeButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
       maximizeButton.setForeground(new java.awt.Color(255, 0, 0));
       maximizeButton.setLabel("=");
       maximizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              maximizeActionPerformed(evt);
            }
        });
        jPanel2.add( maximizeButton);
        maximizeButton.setBounds(1321, 0, 24, 22);

       minimizeButton.setActionCommand("Back");
       minimizeButton.setBackground(new java.awt.Color(102, 255, 255));
       minimizeButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
       minimizeButton.setForeground(new java.awt.Color(255, 0, 0));
       minimizeButton.setLabel("--");
       minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               minimizeActionPerformed(evt);
            }
        });
        jPanel2.add( minimizeButton);
        minimizeButton.setBounds(1300, 0, 26, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 60);

        jScrollPane1.setDoubleBuffered(true);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 2100));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 2100));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 51));
        jLabel3.setText("BLogs about Life and Time");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 350, 530, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Bolgfrent3.jpg"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-30, -30, 1860, 650);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Bloglife.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 610, 580, 750);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Bloglife2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(550, 600, 790, 390);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Time.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1130, 1360, 220, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Time1.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1130, 1630, 230, 210);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/time3.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(580, 1000, 830, 360);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Time4.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(90, 1360, 1060, 430);

        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("Next");
        button1.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		dispose();
        		new ContactPage().setVisible(true);
        	}
        });
        jPanel1.add(button1);
        button1.setBounds(1290, 1860, 57, 24);

        button2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button2.setLabel(" Back");
        jPanel1.add(button2);
        button2.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		dispose();
        		new HomePage().setVisible(true);
        	}
        });
        button2.setBounds(1230, 1860, 48, 24);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 1370, 810);

        pack();
    }
    
    // methods on label
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
    	System.exit(0);
    }
    private void  maximizeActionPerformed(java.awt.event.ActionEvent evt) {
    	if(this.getExtendedState()!=MAXIMIZED_BOTH) {
    		this.setExtendedState(MAXIMIZED_BOTH);   		
    	}
    	else {
    		this.setExtendedState(NORMAL);
    	}
    }
    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
    	this.setExtendedState(BlogsPage.ICONIFIED);
    }
    
    

}


