import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginPage extends javax.swing.JFrame {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Variables declaration - do not modify  
	 SignupPage signup;
	private java.util.HashMap<String,SignUpDataStorepage> userData;
    private java.awt.Button exit;
    private java.awt.Button minimize;
    private java.awt.Button LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox checkBox;
    // End of variables declaration   
    
    public LoginPage() {
    	LoginPageComponents();
    }
    private void LoginPageComponents() {
    jLabel3 = new javax.swing.JLabel();
    signup  = new SignupPage();
    jTextField1 = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jPasswordField1 = new javax.swing.JPasswordField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    exit = new java.awt.Button();
    minimize = new java.awt.Button();
    LoginButton = new java.awt.Button();
    checkBox = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    this.setPreferredSize(new java.awt.Dimension(425,249));
    this.setBounds(800, 80, 425, 249);
    getContentPane().setLayout(null);

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel3.setText("User Name");
    getContentPane().add(jLabel3);
    jLabel3.setBounds(10, 70, 117, 32);

        jTextField1.setText("Enter your Email ");
        jTextField1.addMouseListener(new java.awt.event.MouseListener() {

  			@Override
  			public void mouseClicked(java.awt.event.MouseEvent e) {
  				
  				
  				
  				
  			}

  			@Override
  			public void mousePressed(java.awt.event.MouseEvent e) {
  				if( jTextField1.getText().equals("Enter your Email "))
  						jTextField1.setText("");
  				
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
			public void mouseExited(MouseEvent e) {
				
				
			}
  				
  		
    });       
    
    getContentPane().add(jTextField1);
    jTextField1.setBounds(120, 70, 232, 32);

    jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel4.setText("Enter Password");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(10, 120, 117, 32);

    jPasswordField1.setText("Enter the Password");
    jPasswordField1.addMouseListener(new java.awt.event. MouseListener() {

		@Override
		public void mouseClicked(java.awt.event.MouseEvent  e) {
			if(String.valueOf(jPasswordField1.getPassword()).equals("Enter the Password")) {
				jPasswordField1.setText("");
			}
			
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent  e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent  e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent  e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
    	
    });
    getContentPane().add(jPasswordField1);
    jPasswordField1.setBounds(120, 120, 232, 34);

    checkBox.setText("Show");
    checkBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
         if(checkBox.isSelected())
        	 jPasswordField1.setEchoChar((char)0);
         else
        	 jPasswordField1.setEchoChar('*');
        }
    });
    getContentPane().add(checkBox);
    checkBox.setBounds(350, 130,70, 23);

    jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
    jLabel1.setText("    If you have not creat acount so click on");
    getContentPane().add(jLabel1);
    jLabel1.setBounds(40, 200, 270, 33);

    jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
    jLabel2.setText("Signup");
    jLabel2.addMouseListener(new java.awt.event.MouseListener() {

		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			dispose();
			new SignupPage().setVisible(true);
			
		}

		
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {
			
			jLabel2.setForeground(new java.awt.Color(0,255,0));
		}
			
		

		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {
			
			jLabel2.setForeground(new java.awt.Color(255,255,255));
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {
			jLabel2.setForeground(new java.awt.Color(255, 0,0));
			
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			jLabel2.setForeground(new java.awt.Color(25, 181, 254));
			
		}});
    getContentPane().add(jLabel2);
    jLabel2.setBounds(320, 200, 60, 30);

    

    minimize.setActionCommand("Back");
    minimize.setBackground(new java.awt.Color(102, 255, 255));
    minimize.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    minimize.setForeground(new java.awt.Color(255, 0, 0));
    minimize.setLabel("=");
    minimize.addActionListener(new java.awt.event.ActionListener(){ // to perfome and action on a button we must have to implement actionListener abstract ,methode called actionperfomed
    	public void actionPerformed(java.awt.event.ActionEvent evt) { //abstract methode
    	  minimizeActionperformed(evt);//passed in body the user desired implementation on button
    	}
   });
    getContentPane().add( minimize);
    minimize.setBounds(350, 0, 30, 22);

    exit.setActionCommand("Back");
    exit.setBackground(new java.awt.Color(0, 255, 255));
    exit.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
    exit.setForeground(new java.awt.Color(255, 0, 0));
    exit.setLabel("X");
    exit.addActionListener(new java.awt.event.ActionListener() {
    	public void actionPerformed(java.awt.event.ActionEvent evt) {
    		exitActionPerfomed(evt);
    	}
    });
    getContentPane().add(exit);
    exit.setBounds(380, 0, 30, 22);

    LoginButton.setBackground(new java.awt.Color(0, 255, 204));
    LoginButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
    LoginButton.setLabel("Login");
    LoginButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	if( jTextField1.getText().equals(""))
        		javax.swing.JOptionPane.showMessageDialog(jTextField1, "Please, enter your Id ", "Error in login", javax.swing.JOptionPane.WARNING_MESSAGE);
			
        	else if(String.valueOf(jPasswordField1.getPassword()).equals(""))
				javax.swing.JOptionPane.showMessageDialog(jPasswordField1, "Please, enter your Password ", "Error in login", javax.swing.JOptionPane.WARNING_MESSAGE);
        	else 
        		{
        		
        		  if(signup.isSignUp_Key_macthes_hashMapkeys(jTextField1.getText())!=true) {
        		   javax.swing.JOptionPane.showMessageDialog(jTextField1, "Please, your id is invalid,signup or try back ", "Error in login", javax.swing.JOptionPane.WARNING_MESSAGE);
        	       }
        		  else
        		  {
        			 if (signup.isSignUp_Key_macthes_hashMapkeys(jTextField1.getText())==true) {
        				 if (!String.valueOf(jPasswordField1.getPassword()).equals(signup.userData.get(jTextField1.getText()).getUserPassword())) {
        					  javax.swing.JOptionPane.showMessageDialog(jPasswordField1, "wrong password!!! try again ", "Error in login", javax.swing.JOptionPane.WARNING_MESSAGE);
        				 }
        				 else if (String.valueOf(jPasswordField1.getPassword()).equals(signup.userData.get(jTextField1.getText()).getUserPassword())) {
        					 dispose();
        					 new UseraccessPage(jTextField1.getText());;
        				 }
        			 }
        		 }
        	
        	
        		}	
        }
    });
    getContentPane().add(LoginButton);
    LoginButton.setBounds(330, 170, 47, 24);
    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Azharimage/clcoksky1.jpg"))); // NOI18N
    getContentPane().add(jLabel5);
    jLabel5.setBounds(0, -10, 430, 260);

    pack();
}
    // methods
	
    private void exitActionPerfomed(java.awt.event.ActionEvent evt) {
    	dispose();
    }
    
     private void   minimizeActionperformed(java.awt.event.ActionEvent evt) {
  	   this.setExtendedState(HomePage.ICONIFIED);
     }

	

}
		


