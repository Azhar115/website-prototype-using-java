

public class ContactPage extends ParentClass{
	 // Variables declaration - do not modify                     
    private javax.swing.JLabel Addreesvariable;
    private javax.swing.JLabel Azhar_comLabel;
    private java.awt.Button exit;
    private java.awt.Button minimize;
    private java.awt.Button BackPagelabel;
    private javax.swing.JLabel Blogslbael;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel IconPageLabel;
    private javax.swing.JLabel LoginSignUplabel;
    private javax.swing.JCheckBox addressmapserchBoxchecker;
    private javax.swing.JLabel emailaddresslabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration       
    
    //---------------------------Constructors-----------------------
    public ContactPage() {
    	ContactPageComponents();
    }
    
    private void ContactPageComponents() {
    	 jPanel2 = new javax.swing.JPanel();
         LoginSignUplabel = new javax.swing.JLabel();
         Blogslbael = new javax.swing.JLabel();
         HomeLabel = new javax.swing.JLabel();
         Azhar_comLabel = new javax.swing.JLabel();
         IconPageLabel = new javax.swing.JLabel();
         exit = new java.awt.Button();
         minimize = new java.awt.Button();
         Addreesvariable = new javax.swing.JLabel();
         jLabel4 = new javax.swing.JLabel();
         jLabel1 = new javax.swing.JLabel();
         BackPagelabel = new java.awt.Button();
         emailaddresslabel = new javax.swing.JLabel();
         addressmapserchBoxchecker = new javax.swing.JCheckBox();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setUndecorated(true);
         setPreferredSize(new java.awt.Dimension(500, 209));
           setBackground(new java.awt.Color(1, 50, 67));
         setBounds(850,100,480,209);
         getContentPane().setLayout(null);
         
     
         jPanel2.setBackground(new java.awt.Color(1, 50, 67));
         jPanel2.setForeground(new java.awt.Color(25, 181, 254)); 
         jPanel2.setLayout(null);

         LoginSignUplabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
         LoginSignUplabel.setForeground(new java.awt.Color(25, 181, 254));
         LoginSignUplabel.setText("login/signup");
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
         jPanel2.add(LoginSignUplabel);
         LoginSignUplabel.setBounds(390, 30, 87, 24);

         Blogslbael.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
         Blogslbael.setForeground(new java.awt.Color(25, 181, 254));
         Blogslbael.setText("   Blogs");
         blogsLabel.addMouseListener(new java.awt.event.MouseListener() {

 			@Override
 			public void mouseClicked(java.awt.event.MouseEvent e) {
 				//mouseClicked(e);
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
         jPanel2.add(Blogslbael);
         Blogslbael.setBounds(320, 30, 50, 17);

         HomeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
         HomeLabel.setForeground(new java.awt.Color(25, 181, 254));
         HomeLabel.setText("Home");
         HomeLabel.addMouseListener(new java.awt.event.MouseListener() {

 			@Override
 			public void mouseClicked(java.awt.event.MouseEvent e) {
 				mouseClicked(e);
 				Homepage(e);
 				
 			}

 			@Override
 			public void mousePressed(java.awt.event.MouseEvent e) {
 				mousePressed(e);
 				
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
         jPanel2.add(HomeLabel);
         HomeLabel.setBounds(280, 30, 41, 17);

         Azhar_comLabel.setForeground(new java.awt.Color(25, 181, 254));
         Azhar_comLabel.setText("Azhar.com");
         jPanel2.add(Azhar_comLabel);
         Azhar_comLabel.setBounds(10, 38, 63, 14);

         IconPageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("Azharimage/question1.jpg"))); // NOI18N
         jPanel2.add(IconPageLabel);
         IconPageLabel.setBounds(10, 0, 51, 36);

         exit.setActionCommand("Back");
         exit.setBackground(new java.awt.Color(0, 255, 255));
         exit.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
         exit.setForeground(new java.awt.Color(255, 0, 0));
         exit.setLabel("X");
         exit.addActionListener(new java.awt.event.ActionListener() {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		exitActionPerformed(evt); 
        	 }
         });
         jPanel2.add( exit);
         exit.setBounds(465, 0, 24, 22);

         minimize.setActionCommand("Back");
         minimize.setBackground(new java.awt.Color(102, 255, 255));
         minimize.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
         minimize.setForeground(new java.awt.Color(255, 0, 0));
         minimize.setLabel("--");
         minimize.addActionListener(new java.awt.event.ActionListener() {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		 minimizeActionPerformed(evt);
        	 }
         });
         
         jPanel2.add(minimize);
         minimize.setBounds(440, 0, 24, 22);

         getContentPane().add(jPanel2);
         jPanel2.setBounds(0, 0, 489, 54);

         Addreesvariable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
         Addreesvariable.setText("Post address:      Farid Kot Road,Arooj center room 608.");
         getContentPane().add(Addreesvariable);
         Addreesvariable.setBounds(30, 120, 346, 29);

         jLabel4.setText("Phone Number:      +923160822366");
         getContentPane().add(jLabel4);
         jLabel4.setBounds(30, 90, 309, 28);

         jLabel1.setText("please contect us if you have any problem related my work .");
         getContentPane().add(jLabel1);
         jLabel1.setBounds(80, 140, 344, 59);

         BackPagelabel.setActionCommand("Back");
         BackPagelabel.setBackground(new java.awt.Color(153, 153, 255));
         BackPagelabel.setLabel("Back");
         BackPagelabel.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                new BlogsPage().setVisible(true);
             }
         });
         getContentPane().add(BackPagelabel);
         BackPagelabel.setBounds(10, 180, 38, 24);

         emailaddresslabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
         emailaddresslabel.setText("Email:             azharharud115@gmail.com");
         getContentPane().add(emailaddresslabel);
         emailaddresslabel.setBounds(30, 60, 290, 20);

         addressmapserchBoxchecker.setText("search on Map");
         getContentPane().add(addressmapserchBoxchecker);
         addressmapserchBoxchecker.setBounds(380, 120, 112, 23);

         pack();
     }          
    
    //-------------------------fields behaviore---------------------
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
    	dispose();//it close but it does not close whole program
    }
     
    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
    	this.setExtendedState(ContactPage.ICONIFIED);
    }

    
}
