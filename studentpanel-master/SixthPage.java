import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SixthPage extends JFrame {
	  private JLabel namelabel;
	  private JLabel passwordlabel;
	  
	  private JTextField namefield;
	  private JTextField passfield;
	  
	  private JButton login;
	  private JButton back;
	  
	  private String s,s1,s2,s3;
	  private String password,email;
	  
	  
	  public SixthPage() {
		  super("Accountant Login");
		  label();
		  button();
	  }

	
	private void label() {
		
		namelabel = new JLabel("Email: ");
		setLayout(null);
		namelabel.setBounds(50, 70, 100, 30);
		namelabel.setBackground(Color.BLACK);
		namelabel.setForeground(Color.WHITE);
		namelabel.setOpaque(true);
		namelabel.setHorizontalAlignment(JLabel.CENTER);
		add(namelabel);
		
		namefield = new JTextField();
		namefield.setBounds(155, 70, 250, 30);
		namefield.setForeground(Color.MAGENTA);
		namefield.setBackground(Color.WHITE);
		namefield.setHorizontalAlignment(JTextField.CENTER);
		
		add(namefield);
		
		passwordlabel = new JLabel("password : ");
		setLayout(null);
		passwordlabel.setBounds(50, 140, 100, 30);
		passwordlabel.setBackground(Color.BLACK);
		passwordlabel.setForeground(Color.WHITE);
		passwordlabel.setOpaque(true);
		passwordlabel.setHorizontalAlignment(JLabel.CENTER);
		add(passwordlabel);
		
		passfield = new JTextField();
		passfield.setBounds(155, 140, 250, 30);
		passfield.setForeground(Color.MAGENTA);
		passfield.setBackground(Color.WHITE);
		passfield.setHorizontalAlignment(JTextField.CENTER);
		add(passfield);
			
	}
	
private void button() {
		
		login = new JButton("Login");
		login.setToolTipText("Click Please");
		login.setBounds(225, 200, 80, 30);
		login.setForeground(Color.BLACK);
		login.addActionListener(e->{
			email = namefield.getText();
			dbcon a= new dbcon();
			ResultSet user=a.checkuser(email);
			try {
				password = passfield.getText();
				if(user.next()) {
					
					if(user.getString("Password").equals(password)) {
						
						FifthPage ab=new FifthPage();
						ab.setLayout(null);
						ab.setVisible(true);
						ab.setBounds(0, 0, 600, 400);
						ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						ab.setLocationRelativeTo(null);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid password");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "user not found");
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		});
		add(login);
		
		
		back = new JButton("back");
		back.setToolTipText("Click Please");
		back.setBounds(225, 250, 80, 30);
		back.setForeground(Color.BLACK);
		back.addActionListener(e->{
			firstPage a=new firstPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setBounds(0, 0, 600, 400);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setLocationRelativeTo(null);
			dispose();
		});
		add(back);
	}
	

	public static void main(String[] args) {
		SixthPage a=new SixthPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);


	}

}
