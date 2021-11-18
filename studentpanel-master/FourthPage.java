import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FourthPage extends JFrame  {
	  private JLabel idlabel;
	  private JLabel namelabel;
	  private JLabel passwordlabel;
	  private JLabel emaillabel;
	  private JLabel contactlabel;
	  
	  private JTextField idfield;
	  private JTextField namefield;
	  private JTextField passfield; 
	  private JTextField emailfield;
	  private JTextField contactfield; 
	  
	  private JButton addaccountant;
	  private JButton back;
	  
	  private String name;
	  private String id;
	  private String password;
	  private String email;
	  private int contact;
	  
	  public FourthPage() {
		  super("Admin Section");
		  label();
		  button();
	  }
	  
	  private void label() {
		  idlabel = new JLabel("Id : ");
			setLayout(null);
			idlabel.setBounds(50, 30, 100, 30);
			idlabel.setBackground(Color.BLACK);
			idlabel.setForeground(Color.WHITE);
			idlabel.setOpaque(true);
			idlabel.setHorizontalAlignment(JLabel.CENTER);
			add(idlabel);
			
			idfield = new JTextField();
			idfield.setBounds(155, 30, 250, 30);
			idfield.setForeground(Color.MAGENTA);
			idfield.setBackground(Color.WHITE);
			idfield.setHorizontalAlignment(JTextField.CENTER);
			idfield.setForeground(Color.GRAY);
			add(idfield);
			
			
			
			
			
		  namelabel = new JLabel("Name : ");
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
			passwordlabel.setBounds(50, 110, 100, 30);
			passwordlabel.setBackground(Color.BLACK);
			passwordlabel.setForeground(Color.WHITE);
			passwordlabel.setOpaque(true);
			passwordlabel.setHorizontalAlignment(JLabel.CENTER);
			add(passwordlabel);
		  
			passfield = new JTextField();
			passfield.setBounds(155, 110, 250, 30);
			passfield.setForeground(Color.MAGENTA);
			passfield.setBackground(Color.WHITE);
			passfield.setHorizontalAlignment(JTextField.CENTER);
			add(passfield);
			
			emaillabel = new JLabel("Email : ");
			setLayout(null);
			emaillabel.setBounds(50, 150, 100, 30);
			emaillabel.setBackground(Color.BLACK);
			emaillabel.setForeground(Color.WHITE);
			emaillabel.setOpaque(true);
			emaillabel.setHorizontalAlignment(JLabel.CENTER);
			add(emaillabel);
			
			emailfield = new JTextField();
			emailfield.setBounds(155, 150, 250, 30);
			emailfield.setForeground(Color.MAGENTA);
			emailfield.setBackground(Color.WHITE);
			emailfield.setHorizontalAlignment(JTextField.CENTER);
			add(emailfield);
			
			contactlabel = new JLabel("Contact No : ");
			setLayout(null);
			contactlabel.setBounds(50, 190, 100, 30);
			contactlabel.setBackground(Color.BLACK);
			contactlabel.setForeground(Color.WHITE);
			contactlabel.setOpaque(true);
			contactlabel.setHorizontalAlignment(JLabel.CENTER);
			add(contactlabel);
			
			contactfield = new JTextField();
			contactfield.setBounds(155, 190, 250, 30);
			contactfield.setForeground(Color.MAGENTA);
			contactfield.setBackground(Color.WHITE);
			contactfield.setHorizontalAlignment(JTextField.CENTER);
			add(contactfield);	
			
	  }

	  private void button() {
		  addaccountant = new JButton("Add Accountant");
		  addaccountant.setToolTipText("Click Please");
		  addaccountant.setForeground(Color.BLACK);
		  addaccountant.setBounds(170, 260, 150, 30);
		  addaccountant.addActionListener(e->{
			  id=idfield.getText();
			  name=namefield.getText();
			  password=passfield.getText();
			  email=emailfield.getText();
			  contact=Integer.parseInt(contactfield.getText());
			  if(id.isEmpty()||name.isEmpty()||password.isEmpty()||email.isEmpty()||contactfield.getText().isEmpty())
			  {
				  JOptionPane.showMessageDialog(null, "Textbox is Empty!");
			  }
			  else {
				   dbcon b= new dbcon();
					b.insert(id,name,password,email,contact);
					
					FourthPage a=new FourthPage();
					a.setLayout(null);
					a.setVisible(true);
					a.setBounds(0, 0, 600, 400);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					a.setLocationRelativeTo(null);
					dispose();
			  }
				
			});
			add(addaccountant);
			
			back = new JButton("Back");
			back.setToolTipText("Click Please");
			back.setForeground(Color.BLACK);
			back.setBounds(500, 260, 80, 30);
			back.addActionListener(e->{
				dispose();
				ThirdPage a=new ThirdPage();
				a.setLayout(null);
				a.setVisible(true);
				a.setBounds(0, 0, 600, 400);
				a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				a.setLocationRelativeTo(null);
			});
			add(back);
	  }
	  
	  
	public static void main(String[] args) {
		
		FourthPage a=new FourthPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);
		
	}

}
