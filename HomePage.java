





public class HomePage extends ParentClass{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify
	private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel Azhar_comLabel;
    private java.awt.Button minimize;
    private java.awt.Button Exit;
    private java.awt.Button Maximize;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel login_signupLabel;
    private javax.swing.JLabel blogsLabel;;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel AzharcopyrightLabel;
    private javax.swing.JLabel BackgroundImageLabel;
    private javax.swing.JLabel questionmarkIconLabel;
   
    private javax.swing.JLabel WhatisLifeLabel;
    private javax.swing.JLabel boyonpictureLabel;
    private javax.swing.JLabel bruceleequoteLabel;
    private javax.swing.JLabel clickLabel;
    private javax.swing.JLabel frontSidegalaxyLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maninriverLabel;
    private javax.swing.JLabel manwithwatchhadLabel;
    private java.awt.Button nextButton;
    private javax.swing.JLabel plantInHandLabel;
    private javax.swing.JLabel videoLabel; 
    private LoginPage pg1 ;
    private ContactPage con1;
    private BlogsPage blog1;
  
    
    
    //Constructor//
    public HomePage() {
    jframe_Components();	
    }
    private void jframe_Components() {
        jPanel1 = new javax.swing.JPanel();
        login_signupLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        blogsLabel = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        questionmarkIconLabel = new javax.swing.JLabel();
        Azhar_comLabel = new javax.swing.JLabel();
        Exit = new java.awt.Button();
        Maximize = new java.awt.Button();
        minimize = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        AzharcopyrightLabel = new javax.swing.JLabel();
        WhatisLifeLabel = new javax.swing.JLabel();
        clickLabel = new javax.swing.JLabel();
        frontSidegalaxyLabel = new javax.swing.JLabel();
        videoLabel = new javax.swing.JLabel();
        boyonpictureLabel = new javax.swing.JLabel();
        manwithwatchhadLabel = new javax.swing.JLabel();
        bruceleequoteLabel = new javax.swing.JLabel();
        plantInHandLabel = new javax.swing.JLabel();
        maninriverLabel = new javax.swing.JLabel();
        nextButton = new java.awt.Button();
        BackgroundImageLabel = new javax.swing.JLabel();
        pg1 = new LoginPage();
        con1 = new ContactPage();
        blog1 = new BlogsPage();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);//used to remove default close,maximize,and minimize option as well as java icon
        setPreferredSize(new java.awt.Dimension(1365, 755));

        jPanel1.setBackground(new java.awt.Color(1, 50, 67));//it used to set background color
        jPanel1.setForeground(new java.awt.Color(25, 181, 254));//it is used for textcolor
        jPanel1.setPreferredSize(new java.awt.Dimension(1356, 61));//it is used to set size of panel
        jPanel1.setLayout(null);//it used to make null the layoutpatern which helps to add oneownself

        login_signupLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        login_signupLabel.setForeground(new java.awt.Color(25, 181, 254));
        login_signupLabel.setText("login/signup");
        login_signupLabel.addMouseListener(new java.awt.event.MouseListener() {

			public void mousePressed(java.awt.event.MouseEvent e) {
			    
			     con1.dispose();
				pg1.setVisible(true);
				
			
        }

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				login_signupLabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				login_signupLabel.setForeground(new java.awt.Color(255,255,255));
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				login_signupLabel.setForeground(new java.awt.Color(255, 0,0));
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				login_signupLabel.setForeground(new java.awt.Color(25, 181, 254));
				
			}});

        login_signupLabel.setBounds(1245, 37, 87, 24);
        jPanel1.add(login_signupLabel);
       
       

        contactLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // it used to ("fontstyle",Bold(1)plane(0)Italic(2)boldand italic(3), size)
        contactLabel.setForeground(new java.awt.Color(25, 181, 254));
        contactLabel.setText("Contact");
        contactLabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				pg1.dispose();
				
				con1.setVisible(true);
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				contactLabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				contactLabel.setForeground(new java.awt.Color(255,255,255));
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			
			   	contactLabel.setForeground(new java.awt.Color(255, 0,0));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				contactLabel.setForeground(new java.awt.Color(25, 181, 254));
			}
        	
        });
        jPanel1.add(contactLabel);
        contactLabel.setBounds(1172, 38, 55, 23);//it means(x-axis,yaxis,width,hight)in fram

        blogsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        blogsLabel.setForeground(new java.awt.Color(25, 181, 254));
        blogsLabel.setText("   Blogs");
        blogsLabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				//   mouseClicked(e);
				pg1.dispose();
				con1.dispose();
				clickLabelMouseClicked(e);
				blog1.setVisible(true);

								
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				
				blogsLabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				blogsLabel.setForeground(new java.awt.Color(255,255,255));
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			
				blogsLabel.setForeground(new java.awt.Color(255, 0,0));
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				blogsLabel.setForeground(new java.awt.Color(25, 181, 254));
			}
        	
        });
        jPanel1.add(blogsLabel);
        blogsLabel.setBounds(1108, 41, 50, 17);
        super.setLabelOnScreen(homeLabel, new java.awt.Font("Tahoma", 1, 14) , new java.awt.Color(25, 181, 254), "Home", 1057,41, 41, 17);
        super.getlabelOnScreen();
        jPanel1.add(homeLabel);
         homeLabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				mouseClicked(e);
				Homepage(e);
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				mousePressed(e);
				
				homeLabel.setForeground(new java.awt.Color(0,255,0));
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				homeLabel.setForeground(new java.awt.Color(255,255,255));
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				homeLabel.setForeground(new java.awt.Color(255, 0,0));
		
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
				homeLabel.setForeground(new java.awt.Color(25, 181, 254));
			}
        	
        });
        
        homeLabel.setBounds(1057, 41, 41, 17);

        questionmarkIconLabel.setForeground(new java.awt.Color(25, 181, 254));
        questionmarkIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/question1.jpg"))); 
       // questionmarkIconLabel.setIcon(new javax.swing.ImageIcon("question2.jpg"));
        questionmarkIconLabel.setPreferredSize(new java.awt.Dimension(23, 25));
        questionmarkIconLabel.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        questionmarkIconLabel.setVerticalTextPosition(javax.swing.JLabel.CENTER);
        questionmarkIconLabel.setVerticalAlignment(javax.swing.JLabel.EAST);
        jPanel1.add(questionmarkIconLabel);
        questionmarkIconLabel.setBounds(40, 4, 40, 37);
        
       /* super.setButtonOnScreen(Exit, new java.awt.Color(0, 255, 255), new java.awt.Color(255, 0, 0),new java.awt.Font("Dialog", 3, 12), "X",1320, 0, 24, 22 );
        super.getButtonOnScreen();
       // jPanel1.add(Exit);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
         jPanel1.add(Exit);
        
        
      
       
        
       
       
        super.setButtonOnScreen( Maximize, new java.awt.Color(102, 255, 255),new java.awt.Color(255, 0, 0), new java.awt.Font("Dialog", 1, 14), "=", 1300, 0, 27, 17);
        super.getButtonOnScreen();
        
        Maximize.addActionListener(new java.awt.event.ActionListener() {//implement actionListener to perfome some work on a button
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximizeActionPerformed(evt);
            }
        });
        jPanel1.add(Maximize);
        super.setButtonOnScreen(minimize, new java.awt.Color(102,255,255),new java.awt.Color(255,0,0), new java.awt.Font("Dialog",1,14), "--", 1280,0,24,22);
        super.getButtonOnScreen();
       
        minimize.addActionListener(new java.awt.event.ActionListener(){ // to perfome and action on a button we must have to implement actionListener abstract ,methode called actionperfomed
        	public void actionPerformed(java.awt.event.ActionEvent evt) { //abstract methode
        	  minimizeActionperformed(evt);//passed in body the user desired implementation on button
        	}
        });
         jPanel1.add(minimize);*/
         
        super.setLabelOnScreen(Azhar_comLabel, new java.awt.Font("Tahoma", 1, 14) , new java.awt.Color(25, 181, 254),"Azhar.com", 30, 38, 75, 20);
        super.getlabelOnScreen();
        jPanel1.add(Azhar_comLabel);
        Azhar_comLabel.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				/*Window browser =new  Windows();
				browser.
			}*/}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				Azhar_comLabel.setForeground(new java.awt.Color(0,255,0));
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				Azhar_comLabel.setForeground(new java.awt.Color(255,255,255));
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				Azhar_comLabel.setForeground(new java.awt.Color(255, 0,0));
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				Azhar_comLabel.setForeground(new java.awt.Color(25, 181, 254));
				
			}
        	
        });
        
        Exit.setActionCommand("Back");
        Exit.setBackground(new java.awt.Color(0, 255, 255));
        Exit.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 0, 0));
        Exit.setLabel("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
       
        Exit.setBounds(1320, 0, 24, 22);
        jPanel1.add(Exit);
        minimize.setActionCommand("Back");
        minimize.setBackground(new java.awt.Color(102, 255, 255));
        minimize.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 0, 0));
        minimize.setLabel("--");
        minimize.addActionListener(new java.awt.event.ActionListener(){ // to perfome and action on a button we must have to implement actionListener abstract ,methode called actionperfomed
        	public void actionPerformed(java.awt.event.ActionEvent evt) { //abstract methode
        	  minimizeActionperformed(evt);//passed in body the user desired implementation on button
        	}
       });
        minimize.setBounds(1280, 0, 24, 22);
        jPanel1.add(minimize);
      
        // Exit.setBounds(1346, 0, 24, 22);

        Maximize.setActionCommand("Back");
        Maximize.setBackground(new java.awt.Color(102, 255, 255));
        Maximize.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Maximize.setForeground(new java.awt.Color(255, 0, 0));
        Maximize.setLabel("=");
        Maximize.addActionListener(new java.awt.event.ActionListener() {//implement actionListener to perfome some work on a button
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximizeActionPerformed(evt);
            }
        });
        Maximize.setBounds(1300, 0, 24, 22);
        jPanel1.add(Maximize);
        
       
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1365, 1654));

        jPanel2.setPreferredSize(new java.awt.Dimension(1360, 1654));
        jPanel2.setLayout(null);
        super.setLabelOnScreen(AzharcopyrightLabel, new java.awt.Font("Times New Roman", 3, 24), new java.awt.Color(255, 255, 255), "copy right :@ Azhar ud Din",700, 1530, 380, 29);
        super.getlabelOnScreen();
        jPanel2.add(AzharcopyrightLabel);
       
        //super.setLabelOnScreen(Azhar_comLabel, getFont(), getForeground(), getName(), ERROR, ALLBITS, WIDTH, ABORT)
        WhatisLifeLabel.setFont(new java.awt.Font("Times New Roman", 3, 48)); 
        WhatisLifeLabel.setForeground(new java.awt.Color(192, 6, 22));
        WhatisLifeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WhatisLifeLabel.setText("   What is Life??");
        jPanel2.add(WhatisLifeLabel);
        WhatisLifeLabel.setBounds(500, 160, 370, 50);//seting area in panel

        clickLabel.setBackground(new java.awt.Color(0, 255, 0));
        clickLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // font changes
        clickLabel.setForeground(new java.awt.Color(50, 60, 87));
        clickLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/arrowicon.png"))); 
        clickLabel.setText("Clik");
        clickLabel.setFocusable(false);
        clickLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clickLabel.addMouseListener(new java.awt.event.MouseAdapter() { // making label as clickable
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               clickLabelMouseClicked(evt);
                
            }
           public void mouseEntered(java.awt.event.MouseEvent evt) {
        	   clickLabel.setForeground(new java.awt.Color(0, 0,255));
       		
               
            }
           public void mouseExited(java.awt.event.MouseEvent evt) {
        	   clickLabel.setBackground(new java.awt.Color(0, 255, 0));
           }
        });
        jPanel2.add(clickLabel);
        clickLabel.setBounds(660, 220, 46, 30);

        frontSidegalaxyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/walpaper.jpg"))); 
        frontSidegalaxyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(frontSidegalaxyLabel);
        frontSidegalaxyLabel.setBounds(-40, -120, 2550, 830);

        videoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/mulkyvid.gif"))); 
        videoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(videoLabel);
        videoLabel.setBounds(130, 830, 690, 330);

        boyonpictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/boylife.jpg"))); 
        jPanel2.add(boyonpictureLabel);
        boyonpictureLabel.setBounds(890, 800, 680, 370);

        manwithwatchhadLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        manwithwatchhadLabel.setForeground(new java.awt.Color(255, 255, 255));
        manwithwatchhadLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/Life and time.jpg"))); 
        manwithwatchhadLabel.setText("Relation between Life and Time");
        manwithwatchhadLabel.setToolTipText("");
        manwithwatchhadLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        manwithwatchhadLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        manwithwatchhadLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manwithwatchhadLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(manwithwatchhadLabel);
        manwithwatchhadLabel.setBounds(570, 1240, 270, 210);

        bruceleequoteLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); 
        bruceleequoteLabel.setForeground(new java.awt.Color(255, 255, 255));
        bruceleequoteLabel.setText("       \"if you love Life, do not waste time, for time is what life is made up of\", bruce lee.");
        jPanel2.add(bruceleequoteLabel);
        bruceleequoteLabel.setBounds(380, 710, 870, 40);

        plantInHandLabel.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        plantInHandLabel.setForeground(new java.awt.Color(255, 255, 255));
        plantInHandLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/life.jpg"))); 
        plantInHandLabel.setText("How to spend Life");
        plantInHandLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        plantInHandLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.pink, null, null));
        plantInHandLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plantInHandLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(plantInHandLabel);
        plantInHandLabel.setBounds(840, 1240, 240, 210);

        maninriverLabel.setFont(new java.awt.Font("Times New Roman", 3, 14)); 
        maninriverLabel.setForeground(new java.awt.Color(255, 255, 255));
        maninriverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/disasterlife.jpg"))); // NOI18N
        maninriverLabel.setText("pain of Life");
        maninriverLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        maninriverLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.red, java.awt.Color.darkGray));
        maninriverLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maninriverLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(maninriverLabel);
        maninriverLabel.setBounds(1080, 1240, 250, 210);

       nextButton.setFont(new java.awt.Font("Dialog", 1, 12)); 
        nextButton.setLabel("Next");
        nextButton.addMouseMotionListener(new java.awt.event.MouseMotionListener() {
        	

			@Override
			public void mouseDragged(java.awt.event.MouseEvent e) {
				nextButton.setBackground(new java.awt.Color(255, 145,0));
				
			}

			@Override
			public void mouseMoved(java.awt.event.MouseEvent e) {
				nextButton.setForeground(new java.awt.Color(255,0,0));
				
			}
        	
        	
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				nextButton(e);
				
				
			}
        	
        });
        jPanel2.add(nextButton);
        nextButton.setBounds(1220, 1490, 42, 24);

        BackgroundImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        BackgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/sky.jpg"))); // NOI18N
        BackgroundImageLabel.setText("jLabel15");
        jPanel2.add(BackgroundImageLabel);
        BackgroundImageLabel.setBounds(0, 690, 1380, 970);

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());//getContentpane() helps in implementation of Jframe
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        ); 

        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }
     
    
    // -------------------------------fuctions perfoming by labels and Buttons clicked--------------------------
   
   
    
    private void nextButton(java.awt.event.ActionEvent evt) {
    	dispose();
    	blog1.setVisible(true);
    }
	
	  
   
  

	   
	  
   
    }
    
	    
	


