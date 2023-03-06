

public class ParentClass extends javax.swing.JFrame implements java.awt.event.ActionListener,java.awt.event.MouseListener {
	
		
		
	
		// Variables declaration - do not modify
	    protected javax.swing.JPanel jPanel1;
		protected javax.swing.JLabel Azhar_comLabel;
	    protected java.awt.Button minimize;
	    protected javax.swing.JLabel label;
	    protected java.awt.Button Button;
	    protected java.awt.Button Maximize;
	    protected javax.swing.JLabel contactLabel;
	    protected javax.swing.JLabel login_signupLabel;
	    protected javax.swing.JLabel blogsLabel;;
	    protected javax.swing.JLabel homeLabel;
	    protected javax.swing.JLabel questionmarkIconLabel;
	    protected LoginPage pg1 ;
	    protected ContactPage con1;
	    protected BlogsPage blog1;
	    protected javax.swing.JCheckBox checklabelName;
	   public ParentClass() {
		parentClassComponents();
	}
    private void  parentClassComponents() {
    	checklabelName= new javax.swing.JCheckBox() ;
    	jPanel1 = new javax.swing.JPanel();
        login_signupLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        blogsLabel = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        questionmarkIconLabel = new javax.swing.JLabel();
        Azhar_comLabel = new javax.swing.JLabel();
       // Exit = new java.awt.Button();
        Maximize = new java.awt.Button();
        minimize = new java.awt.Button();}
       
        
        
        
    
@Override
public void mouseClicked(java.awt.event.MouseEvent e) {


	
}
@Override
public void mousePressed(java.awt.event.MouseEvent e) {
	
	
}
@Override
public void mouseReleased(java.awt.event.MouseEvent e) {
	
	
}
@Override
public void mouseEntered(java.awt.event.MouseEvent e) {
	
}

@Override
public void mouseExited(java.awt.event.MouseEvent e) {
	
	
}
@Override
   public void actionPerformed(java.awt.event.ActionEvent e) {
	
	
  }
 
   public void setButtonOnScreen(
		                                 java.awt.Button ButtonName,
		                                 java.awt.Color BackgroundColor,
		                                 java.awt.Color forgroundColor,
		                                 java.awt.Font font,String LabelText,
		                                 int x_axis_possitiononscreen,int Y_axis_positiononScreen,int width_of_Button,
		                                 int HieghtOgButton 
		                                 ) {
	   
      
	   ButtonName = new java.awt.Button();
	   ButtonName.setActionCommand("Back");
	   ButtonName.setBackground(BackgroundColor);
	   ButtonName.setFont(font); // NOI18N
	   ButtonName.setForeground(forgroundColor);
	   ButtonName.setLabel(LabelText);
	   ButtonName.setBounds(x_axis_possitiononscreen, Y_axis_positiononScreen, width_of_Button, HieghtOgButton );
}
  public java.awt.Button getButtonOnScreen() {
	
	return this.Button;
}

	

	  protected void setLabelOnScreen(     javax.swing.JLabel labelName,
			                             java.awt.Font labelfont,
			                            
			                             java.awt.Color Forgroundcolor,
			                             String  text,
			                             int x_axis_postionOnscreen,int y_axis_positionOnScreen,
			                             int widthof_label,int hieght_of_label
			                             ) {
	this.label = labelName;
	
	
	 labelName.setFont(labelfont); 
	 //labelName.setBackground(Backgroundcolor);
     labelName.setForeground(Forgroundcolor);
     labelName.setText(text);
     labelName.setBounds( x_axis_postionOnscreen, y_axis_positionOnScreen, widthof_label, hieght_of_label);
	}
	  protected void setcheckLabelOnScreen(   javax.swing.JCheckBox checklabelName,
              java.awt.Font labelfont,
             
              java.awt.Color Forgroundcolor,
              String  text,
              int x_axis_postionOnscreen,int y_axis_positionOnScreen,
              int widthof_label,int hieght_of_label
              ) {


this.checklabelName = checklabelName;
checklabelName.setFont(labelfont); 
//labelName.setBackground(Backgroundcolor);
checklabelName.setForeground(Forgroundcolor);
checklabelName.setText(text);
checklabelName.setBounds( x_axis_postionOnscreen, y_axis_positionOnScreen, widthof_label, hieght_of_label);
}
	  public  javax.swing.JCheckBox getcheckLabelOnscreen() {
		  return checklabelName; 
		  
	  }
	protected javax.swing.JLabel getlabelOnScreen(){
		return this.label;
	}

        public void loiginPageaccess(java.awt.event.MouseEvent evt) {
	    new LoginPage().setVisible(true);
      }
        public void Homepage(java.awt.event.MouseEvent evt) {
        	dispose();
        	new HomePage().setVisible(true);
        }
        public void clickLabelMouseClicked(java.awt.event.MouseEvent evt) {
      	  if(this.contains(getMousePosition())){
      		dispose();//it will jump into another fram and close the current frame
      		new BlogsPage().setVisible(true);
      	  }
      	  
        
        }
        
        public void  ExitActionPerformed(java.awt.event.ActionEvent evt) {
        	System.exit(0);
        }
       public void  MaximizeActionPerformed(java.awt.event.ActionEvent evt) {
    	  // if( this.getComponent(MAXIMIZED_BOTH) == Maximize)
    	   if(this.getExtendedState()!= MAXIMIZED_BOTH ) {
    	   this.setExtendedState(HomePage.MAXIMIZED_BOTH);}
    	   else if(this.getExtendedState()== MAXIMIZED_BOTH)
    		   this.setExtendedState(NORMAL);
           }
       public void   minimizeActionperformed(java.awt.event.ActionEvent evt) {
    	   this.setExtendedState(HomePage.ICONIFIED);
       }
}

