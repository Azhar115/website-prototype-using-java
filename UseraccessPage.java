

public class UseraccessPage extends ParentClass {
	 /**
	 * UseraccessPage 
	 */
	 private javax.swing.JLabel jLabel1;
	private static final long serialVersionUID = 1L;
	
	
	public UseraccessPage(String First_name,String Last_Name) {
		two_Name_ContructorMethode( First_name, Last_Name);
		
	}
	public UseraccessPage(String IDname) {
		Id_Name_ContructorMethode(IDname);
	}
	
		
		private void two_Name_ContructorMethode(String First_name,String Last_Name) {
		   jLabel1 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setPreferredSize(new java.awt.Dimension(800, 600));
	        getContentPane().setLayout(null);

	       // jLabel1.setBackground(new java.awt.Color(0, 0, 0));
	        jLabel1.setForeground(new java.awt.Color(0,0,0));
	        jLabel1.setFont(new java.awt.Font("NewTimesRoman",1,23));
	        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
	       //jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
	        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
	       jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
	        jLabel1.setText("Dear  ' "+ First_name+" "+ Last_Name+ " '   System is on UpDate");
	        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
	        getContentPane().add(jLabel1);
	        jLabel1.setBounds(10, 46, 700, 580);

	        pack();
  }
		private void Id_Name_ContructorMethode(String IdName) {
			   jLabel1 = new javax.swing.JLabel();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		        setPreferredSize(new java.awt.Dimension(800, 600));
		        getContentPane().setLayout(null);

		       // jLabel1.setBackground(new java.awt.Color(0, 0, 0));
		        jLabel1.setForeground(new java.awt.Color(0,0,0));
		        jLabel1.setFont(new java.awt.Font("NewTimesRoman",1,27));
		        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
		       //jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
		        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		       jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
		        jLabel1.setText("Dear  '" +IdName+ "'    System is on UpDate");
		        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
		        getContentPane().add(jLabel1);
		        jLabel1.setBounds(10, 46, 700, 580);

		        pack();
	  }
}
