public class SignupPage extends ParentClass{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	
	// Variables declaration - do not modify 
	//private SignUpDataStorepage signupData;
	public java.util.HashMap<String,SignUpDataStorepage> userData;
	
    private java.awt.Button SignUpButton;
    private javax.swing.JTextField UserIdTextField;
    private java.awt.Button exitButton;
    private javax.swing.JCheckBox jCheckBoxLabel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private java.awt.Button manimizeButton;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberUserEnteredTextField;
    private javax.swing.JTextField randomNumberGeneratedTextField;
    private javax.swing.JLabel retypeEmaillabel;
    private javax.swing.JTextField retypeUserEmailConfirmationTextField;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel userConfirmPasswordLabel;
    private javax.swing.JLabel userEmaillabel;
    private javax.swing.JTextField userEnteredEmailTextField;
    private javax.swing.JPasswordField userEnteredPasswordField;
    private javax.swing.JPasswordField userEnteredPasswordFieldConfirmation;
    private javax.swing.JTextField userFirstnameTextField;
    private javax.swing.JLabel userIdlabel;
    private javax.swing.JLabel userLastnameLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userPasswordLabel;
    private javax.swing.JTextField userRandomNumberEnteringTextField;
    private javax.swing.JTextField userlastNameTextField;
    // End of variables declaration 
    
    
    //----------------------constructor------------
    public SignupPage() {
    	SignupPageComponents();
    }
   // public SignupPage(String userId );
             
    private void SignupPageComponents() {
        userData =new java.util.HashMap<>();
       
      
        userIdlabel = new javax.swing.JLabel();
        userLastnameLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        retypeEmaillabel = new javax.swing.JLabel();
        userEmaillabel = new javax.swing.JLabel();
        userPasswordLabel = new javax.swing.JLabel();
        userConfirmPasswordLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        jCheckBoxLabel = new javax.swing.JCheckBox();
        randomNumberGeneratedTextField = new javax.swing.JTextField();
        userRandomNumberEnteringTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        UserIdTextField = new javax.swing.JTextField();
        userFirstnameTextField = new javax.swing.JTextField();
        userlastNameTextField = new javax.swing.JTextField();
        showPassword = new javax.swing.JCheckBox();
        userEnteredEmailTextField = new javax.swing.JTextField();
        retypeUserEmailConfirmationTextField = new javax.swing.JTextField();
        userEnteredPasswordFieldConfirmation = new javax.swing.JPasswordField();
        userEnteredPasswordField = new javax.swing.JPasswordField();
        phoneNumberUserEnteredTextField = new javax.swing.JTextField();
        manimizeButton = new java.awt.Button();
        exitButton = new java.awt.Button();
        SignUpButton = new java.awt.Button();
        jLabel13 = new javax.swing.JLabel();
        
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(415, 699));
        
        this.setBounds(800,10, 415,699);
        getContentPane().setLayout(null);
        this.setUndecorated(true);

        userIdlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userIdlabel.setText("User Id");
        getContentPane().add(userIdlabel);
        userIdlabel.setBounds(10, 80, 118, 26);

        userLastnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userLastnameLabel.setText("User Last name");
        getContentPane().add(userLastnameLabel);
        userLastnameLabel.setBounds(10, 200, 118, 26);

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameLabel.setText("User first Name");
        getContentPane().add(userNameLabel);
        userNameLabel.setBounds(10, 150, 118, 26);

        retypeEmaillabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retypeEmaillabel.setText("Retype email:");
        getContentPane().add(retypeEmaillabel);
        retypeEmaillabel.setBounds(10, 300, 112, 26);

        userEmaillabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userEmaillabel.setText("User email :");
        getContentPane().add(userEmaillabel);
        userEmaillabel.setBounds(10, 250, 118, 26);
       

        userPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userPasswordLabel.setText("Password");
        getContentPane().add(userPasswordLabel);
        userPasswordLabel.setBounds(10, 360, 114, 36);

        userConfirmPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userConfirmPasswordLabel.setText("Confirm your password");
        getContentPane().add(userConfirmPasswordLabel);
        userConfirmPasswordLabel.setBounds(0, 400, 150, 36);

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneNumberLabel.setText("Phone Number");
        getContentPane().add(phoneNumberLabel);
        phoneNumberLabel.setBounds(10, 450, 114, 36);

        signInLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 255, 255));
        signInLabel.setText("Sign in");
        signInLabel.addMouseListener(new java.awt.event.MouseListener() {

    		@Override
    		public void mouseClicked(java.awt.event.MouseEvent e) {
    			dispose();
    			new LoginPage().setVisible(true);
    			
    		}

    		
    		@Override
    		public void mousePressed(java.awt.event.MouseEvent e) {
    			
    			signInLabel.setForeground(new java.awt.Color(0,255,0));
    		}
    			
    		

    		@Override
    		public void mouseReleased(java.awt.event.MouseEvent e) {
    			
    			signInLabel.setForeground(new java.awt.Color(255,255,255));
    		}

    		@Override
    		public void mouseEntered(java.awt.event.MouseEvent e) {
    			signInLabel.setForeground(new java.awt.Color(255, 0,0));
    			
    		}

    		@Override
    		public void mouseExited(java.awt.event.MouseEvent e) {
    			signInLabel.setForeground(new java.awt.Color(25, 181, 254));
    			
    		}});
        getContentPane().add(signInLabel);
        signInLabel.setBounds(300, 650, 57, 15);

        jCheckBoxLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxLabel.setText("confirm you are not a robot");
        jCheckBoxLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              if (jCheckBoxLabel.isSelected()) 
            	randomNumberGeneratedTextField.setText(new  SignUpDataStorepage().getrandomnumberdigitLimit(1000000000));
            
            else
            	randomNumberGeneratedTextField.setText("click first checkbox");
            }
        });
        getContentPane().add(jCheckBoxLabel);
        jCheckBoxLabel.setBounds(10, 500, 200, 25);

        
        randomNumberGeneratedTextField.setText("click first checkbox");
        getContentPane().add(randomNumberGeneratedTextField);
        randomNumberGeneratedTextField.setBounds(30, 530, 143, 71);

        userRandomNumberEnteringTextField.setText("Rewrite that number");
        userRandomNumberEnteringTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              if(jCheckBoxLabel.isSelected()) {
            	  if(!randomNumberGeneratedTextField.getText().equals( userRandomNumberEnteringTextField.getText())) {
            	    
            	  }
            		  
              }
            }
        });
        userRandomNumberEnteringTextField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if (userRandomNumberEnteringTextField.getText().equals("Rewrite that number")) {
					 userRandomNumberEnteringTextField.setText("");
				}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				/*if (userRandomNumberEnteringTextField.getText().equals("")) {
					 
				javax.swing.JOptionPane.showMessageDialog(userRandomNumberEnteringTextField, "Please, Re_Enter the Numbers", "Error in user Not Robot Confirmation", javax.swing.JOptionPane.WARNING_MESSAGE);
				}
			else if(!userRandomNumberEnteringTextField.getText().equals( randomNumberGeneratedTextField.getText())){
				javax.swing.JOptionPane.showMessageDialog(userRandomNumberEnteringTextField, "Please, enter correct numbers", "Error in user not robot confirmation", javax.swing.JOptionPane.WARNING_MESSAGE);
			}*/
        	
        }});
        getContentPane().add(userRandomNumberEnteringTextField);
        userRandomNumberEnteringTextField.setBounds(180, 580, 164, 34);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("if you have already signup, so clck on ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(80, 650, 210, 20);

        UserIdTextField.setText("Enter the Id");
        UserIdTextField.addMouseListener(new java.awt.event.MouseListener() {
        	
           /* public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }*/

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
			  if(UserIdTextField.getText().equals("Enter the Id"))
				UserIdTextField.setText("");
				
			}

			@Override

			
			
				public void mousePressed(java.awt.event.MouseEvent e) {
				//UserIdTextField.setForeground(new java.awt.Color(0,255,0));
			}
				
			

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				//UserIdTextField.setForeground(new java.awt.Color(0,0,0));
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				//UserIdTextField.setForeground(new java.awt.Color(255, 0,0));
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
			
				/*if(UserIdTextField.getText().equals("")) 
					javax.swing.JOptionPane.showMessageDialog(UserIdTextField, "Please, enter your Id", "Error in UserId", javax.swing.JOptionPane.WARNING_MESSAGE);
				*/
				
			}
           });
        getContentPane().add(UserIdTextField);
        UserIdTextField.setBounds(150, 80, 223, 32);

        userFirstnameTextField.setText("Enter your FIrst Name");
        getContentPane().add(userFirstnameTextField);
        userFirstnameTextField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( userFirstnameTextField.getText().equals("Enter your FIrst Name") ){
					 userFirstnameTextField.setText("");	
			}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				
			/*if( userFirstnameTextField.getText().equals("") )
					javax.swing.JOptionPane.showMessageDialog(userFirstnameTextField, "Please, enter your First name", "Error in UserFirst name", javax.swing.JOptionPane.WARNING_MESSAGE);
			  */
			}

		
        	
        });
        userFirstnameTextField.setBounds(150, 150, 223, 32);

        userlastNameTextField.setText("Enter your Last Name");
       
        userlastNameTextField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( userlastNameTextField.getText().equals("Enter your Last Name") ){
					userlastNameTextField.setText("");	
			}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				/*if( userlastNameTextField.getText().equals("") )
				javax.swing.JOptionPane.showMessageDialog(userlastNameTextField, "Please, enter your last name", "Error in User last name", javax.swing.JOptionPane.WARNING_MESSAGE);
				*/
			}

		
        	
        });
        getContentPane().add(userlastNameTextField);
        userlastNameTextField.setBounds(150, 200, 223, 32);

        userEnteredEmailTextField.setText("Enter your emial");
        getContentPane().add(userEnteredEmailTextField);
        
        userEnteredEmailTextField.setBounds(150, 250, 223, 32);
        userEnteredEmailTextField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( userEnteredEmailTextField.getText().equals("Enter your emial") ){
					userEnteredEmailTextField.setText("");	
			}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
			/*	if( userEnteredEmailTextField.getText().equals(""))
				javax.swing.JOptionPane.showMessageDialog(userEnteredEmailTextField, "Please, enter your email ", "Error in User Email", javax.swing.JOptionPane.WARNING_MESSAGE);
				*/
				
			}

		
        	
        });

        retypeUserEmailConfirmationTextField.setText("Retype your emial");
        getContentPane().add(retypeUserEmailConfirmationTextField);
        retypeUserEmailConfirmationTextField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( retypeUserEmailConfirmationTextField.getText().equals("Retype your emial") ){
					retypeUserEmailConfirmationTextField.setText("");	
			}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
			/*	if( retypeUserEmailConfirmationTextField.getText().equals("") )	
				javax.swing.JOptionPane.showMessageDialog(retypeUserEmailConfirmationTextField, "Please, ReType your email", "Error in Email confirmatione", javax.swing.JOptionPane.WARNING_MESSAGE);
				else if(!retypeUserEmailConfirmationTextField.getText().equals(userEnteredEmailTextField.getText()) )
					javax.swing.JOptionPane.showMessageDialog(retypeUserEmailConfirmationTextField, "Please, ReType correctly your email", "Error in Email confirmatione", javax.swing.JOptionPane.WARNING_MESSAGE);
			*/}
             
		
        	
        });
        retypeUserEmailConfirmationTextField.setBounds(150, 300, 221, 32);
        showPassword.setFont(new java.awt.Font("Tahoma", 0, 12));
        showPassword.setText("show");
        showPassword.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if(showPassword.isSelected()) {
					userEnteredPasswordField.setEchoChar((char)0);
					userEnteredPasswordFieldConfirmation.setEchoChar((char)0);
				}
				else {
					userEnteredPasswordField.setEchoChar('*');
					userEnteredPasswordFieldConfirmation.setEchoChar('*');
				}
					
			}
        	
        });
        showPassword.setForeground(new java.awt.Color(25, 181, 254));
        showPassword.setBounds(270, 434, 70, 20);
        getContentPane().add(showPassword);
        userEnteredPasswordFieldConfirmation.setText("Retype your password");
        userEnteredPasswordFieldConfirmation.setEchoChar((char)0);
        userEnteredPasswordFieldConfirmation.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( String.valueOf(userEnteredPasswordFieldConfirmation.getPassword()).equals("Retype your password") ){
				userEnteredPasswordFieldConfirmation.setText("");	
			}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				/*if( String.valueOf(userEnteredPasswordFieldConfirmation.getPassword()).equals("") )
				javax.swing.JOptionPane.showMessageDialog(userEnteredPasswordFieldConfirmation, "Please, enter your password name", "Error in Password", javax.swing.JOptionPane.WARNING_MESSAGE);
				else if( !String.valueOf(userEnteredPasswordFieldConfirmation.getPassword()).equals( String.valueOf(userEnteredPasswordField.getPassword()))) {
					javax.swing.JOptionPane.showMessageDialog(userEnteredPasswordFieldConfirmation, "Please, Retype correct  password ", "Error in Password", javax.swing.JOptionPane.WARNING_MESSAGE);
				}*/
			
			}

		
        	
        });
      
        userEnteredPasswordFieldConfirmation.setFont(new java.awt.Font("NewTimeRoman",0, 14));
        getContentPane().add(userEnteredPasswordFieldConfirmation);
        userEnteredPasswordFieldConfirmation.setBounds(150, 400, 221, 31);
        
       
       
        
        userEnteredPasswordField.setText("Enter the Password");
        userEnteredPasswordField.setFont(new java.awt.Font("NewTimeRoman",0, 14));
        getContentPane().add(userEnteredPasswordField);
        userEnteredPasswordField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( String.valueOf(userEnteredPasswordField.getPassword()).equals("Enter the Password") ){
				userEnteredPasswordField.setText("");	
			}
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				/*if( String.valueOf(userEnteredPasswordField.getPassword()).equals("") )
						javax.swing.JOptionPane.showMessageDialog(userFirstnameTextField, "Please, enter your First name", "Error in UserFirst name", javax.swing.JOptionPane.WARNING_MESSAGE);
			*/
			}

		
        	
        });
        userEnteredPasswordField.setBounds(150, 350, 221, 31);

        phoneNumberUserEnteredTextField.setText("Enter phone Number");
        phoneNumberUserEnteredTextField.setFont(new java.awt.Font("NewTimeRoman",0, 14));
        getContentPane().add(phoneNumberUserEnteredTextField);
        phoneNumberUserEnteredTextField.addMouseListener(new java.awt.event.MouseListener() {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				
				
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				if( String.valueOf( phoneNumberUserEnteredTextField.getText()).equals("Enter phone Number") ){
					 phoneNumberUserEnteredTextField.setText("");	
			}
				
			}
            
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				
				
			
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				/*if( String.valueOf( phoneNumberUserEnteredTextField.getText()).equals("") )
				javax.swing.JOptionPane.showMessageDialog(phoneNumberUserEnteredTextField, "Please, enter your phoneNumber with country code", "Error in phone Number", javax.swing.JOptionPane.WARNING_MESSAGE);
				*/
			}

		
        	
        });
        phoneNumberUserEnteredTextField.setBounds(150, 454, 221, 36);

        manimizeButton.setActionCommand("Back");
        manimizeButton.setBackground(new java.awt.Color(102, 255, 255));
        manimizeButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        manimizeButton.setForeground(new java.awt.Color(255, 0, 0));
        manimizeButton.setLabel("=");
        manimizeButton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		manimaizeActionPerfomed(evt);
        	}
        });
        getContentPane().add(manimizeButton);
        manimizeButton.setBounds(350, 0, 24, 22);

        exitButton.setActionCommand("Back");
        exitButton.setBackground(new java.awt.Color(0, 255, 255));
        exitButton.setFont(new java.awt.Font("Dialog", 3, 12)); 
        exitButton.setForeground(new java.awt.Color(255, 0, 0));
        exitButton.setLabel("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
              exitActionPerformed(evt);
        	}
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(370, 0, 24, 22);

        SignUpButton.setBackground(new java.awt.Color(153, 153, 255));
        SignUpButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        SignUpButton.setLabel("SignUp");
        SignUpButton.addActionListener(new java.awt.event.ActionListener(){

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				if( String.valueOf( phoneNumberUserEnteredTextField.getText()).equals("") )
					javax.swing.JOptionPane.showMessageDialog(phoneNumberUserEnteredTextField, "Please, enter your phoneNumber with country code", "Error in phone Number", javax.swing.JOptionPane.WARNING_MESSAGE);
				 else if( String.valueOf(userEnteredPasswordField.getPassword()).equals("") )
					javax.swing.JOptionPane.showMessageDialog(userFirstnameTextField, "Please, enter your First name", "Error in UserFirst name", javax.swing.JOptionPane.WARNING_MESSAGE);
				   else  if( String.valueOf(userEnteredPasswordFieldConfirmation.getPassword()).equals("") )
					javax.swing.JOptionPane.showMessageDialog(userEnteredPasswordFieldConfirmation, "Please, enter your password name", "Error in Password", javax.swing.JOptionPane.WARNING_MESSAGE);
					  else if( !String.valueOf(userEnteredPasswordFieldConfirmation.getPassword()).equals( String.valueOf(userEnteredPasswordField.getPassword()))) 
						javax.swing.JOptionPane.showMessageDialog(userEnteredPasswordFieldConfirmation, "Please, Retype correct  password ", "Error in Password", javax.swing.JOptionPane.WARNING_MESSAGE);
					  else if( retypeUserEmailConfirmationTextField.getText().equals("") )	
							javax.swing.JOptionPane.showMessageDialog(retypeUserEmailConfirmationTextField, "Please, ReType your email", "Error in Email confirmatione", javax.swing.JOptionPane.WARNING_MESSAGE);
						else if(!retypeUserEmailConfirmationTextField.getText().equals(userEnteredEmailTextField.getText()) )
							javax.swing.JOptionPane.showMessageDialog(retypeUserEmailConfirmationTextField, "Please, ReType correctly your email", "Error in Email confirmatione", javax.swing.JOptionPane.WARNING_MESSAGE);
						else if( userEnteredEmailTextField.getText().equals(""))
							javax.swing.JOptionPane.showMessageDialog(userEnteredEmailTextField, "Please, enter your email ", "Error in User Email", javax.swing.JOptionPane.WARNING_MESSAGE);
						  else if( userFirstnameTextField.getText().equals("") )
							javax.swing.JOptionPane.showMessageDialog(userFirstnameTextField, "Please, enter your First name", "Error in UserFirst name", javax.swing.JOptionPane.WARNING_MESSAGE);
					         else if( userlastNameTextField.getText().equals("") )
							  javax.swing.JOptionPane.showMessageDialog(userlastNameTextField, "Please, enter your last name", "Error in User last name", javax.swing.JOptionPane.WARNING_MESSAGE);
					          else if(UserIdTextField.getText().equals("")) 
					        		    	javax.swing.JOptionPane.showMessageDialog(UserIdTextField, "Please, enter your Id", "Error in UserId", javax.swing.JOptionPane.WARNING_MESSAGE);
					          else if (isSignUp_Key_macthes_hashMapkeys(UserIdTextField.getText())== true)
					        	 
					        	  javax.swing.JOptionPane.showMessageDialog(UserIdTextField, "Please, enter another Id, this id "+UserIdTextField.getText()+"is already in use", "Error in UserId", javax.swing.JOptionPane.WARNING_MESSAGE);   
					          else if(isSignUp_Key_macthes_hashMapkeys(UserIdTextField.getText())!= true)
					          {
					        	  
					        	  userData.put(  userIdlabel.getText(),
					        		       new SignUpDataStorepage(
					        		       userFirstnameTextField.getText() ,
					        		       userlastNameTextField.getText(),
					                       String.valueOf(userEnteredPasswordField.getPassword()),
					        		       retypeUserEmailConfirmationTextField.getText(),
					        		       phoneNumberUserEnteredTextField.getText()
					        		       )
					        		       );
					        	  javax.swing.JOptionPane.showMessageDialog( SignUpButton, "Congratulation for sign up!  Sorry, system is on update ", "Error in UserId", javax.swing.JOptionPane.WARNING_MESSAGE);
			                       dispose();
			                      new UseraccessPage(userFirstnameTextField.getText(),userlastNameTextField.getText()).setVisible(true);
					        	    	    
					          }
				    //  throw new UserDefiedExcept();        	    	
					        	    	 
			        //}
			       // catch(Exception e1){
			        //	javax.swing.JOptionPane.showMessageDialog(UserIdTextField, "Please, enter another Id, this id "+UserIdTextField.getText()+"is already in use", "Error in UserId", javax.swing.JOptionPane.WARNING_MESSAGE);
			        	
			        //}
					        	  			
              } 	
        });	 
        getContentPane().add(SignUpButton);
        SignUpButton.setBounds(350, 600, 56, 24);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/clocktower2.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, -90, 420, 880);
        
        pack();
    }
                 //---------------------------fields behaviores--------------
           private void  exitActionPerformed(java.awt.event.ActionEvent evt) {
        	   dispose();
           }
           private void	manimaizeActionPerfomed(java.awt.event.ActionEvent evt) {
        	   this.setExtendedState(SignupPage.ICONIFIED);
        	   
           }

		public java.util.HashMap<String,SignUpDataStorepage> getUserData() {
			return userData;
		}

		public void setUserData(java.util.HashMap<String,SignUpDataStorepage> userData) {
			this.userData = userData;
		}
		
		
		public Boolean isSignUp_Key_macthes_hashMapkeys(String new_signup_UserId ) {
			Boolean getresult = false;
			for(String HashMapkeyscounting: userData.keySet()) {
				if(HashMapkeyscounting != new_signup_UserId ) {
					getresult = true;
					break;
				}
			}
			return getresult;
			
		}
           
 }

