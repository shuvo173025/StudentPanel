import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class seventhPage extends JFrame {
	private JLabel namelabel;
	private JLabel emaillabel;
	private JLabel courselabel;
	private JLabel feelabel;
	private JLabel paidlabel;
	private JLabel duelabel;
	private JLabel citylabel;
	private JLabel countrylabel;
	private JLabel contactlabel;
	private JLabel rolllabel;
	
	private JTextField namefield;
	private JTextField emailfield;
	private JTextField coursefield;
	private JTextField feefield;
	private JTextField paidfield;
	private JTextField duefield;
	private JTextField cityfield;
	private JTextField countryfield;
	private JTextField contactfield;
	private JTextField rollfield;
	
	private JButton addstudent;
	private JButton back;
	
	private String name,email,course,fee,paid,due,city,country,contact,roll;
	

	
	public seventhPage() {
		super("Add Student");
		label();
		textfield();
		button();
	}
	
	private void textfield() {
		namefield = new JTextField();
		namefield.setBounds(155, 10, 250, 30);
		namefield.setForeground(Color.MAGENTA);
		namefield.setBackground(Color.WHITE);
		namefield.setHorizontalAlignment(JTextField.CENTER);
		add(namefield);
		
		emailfield = new JTextField();
		emailfield.setBounds(155, 50, 250, 30);
		emailfield.setForeground(Color.MAGENTA);
		emailfield.setBackground(Color.WHITE);
		emailfield.setHorizontalAlignment(JTextField.CENTER);
		add(emailfield);
		
		coursefield = new JTextField();
		coursefield.setBounds(155, 90, 250, 30);
		coursefield.setForeground(Color.MAGENTA);
		coursefield.setBackground(Color.WHITE);
		coursefield.setHorizontalAlignment(JTextField.CENTER);
		add(coursefield);
		
		feefield = new JTextField();
		feefield.setBounds(155, 130, 250, 30);
		feefield.setForeground(Color.MAGENTA);
		feefield.setBackground(Color.WHITE);
		feefield.setHorizontalAlignment(JTextField.CENTER);
		add(feefield);
		
		paidfield = new JTextField();
		paidfield.setBounds(155, 170, 250, 30);
		paidfield.setForeground(Color.MAGENTA);
		paidfield.setBackground(Color.WHITE);
		paidfield.setHorizontalAlignment(JTextField.CENTER);
		add(paidfield);
		
		duefield = new JTextField();
		duefield.setBounds(155, 210, 250, 30);
		duefield.setForeground(Color.MAGENTA);
		duefield.setBackground(Color.WHITE);
		duefield.setHorizontalAlignment(JTextField.CENTER);
		add(duefield);
		
		cityfield = new JTextField();
		cityfield.setBounds(155, 290, 250, 30);
		cityfield.setForeground(Color.MAGENTA);
		cityfield.setBackground(Color.WHITE);
		cityfield.setHorizontalAlignment(JTextField.CENTER);
		add(cityfield);
		
		countryfield = new JTextField();
		countryfield.setBounds(155, 330, 250, 30);
		countryfield.setForeground(Color.MAGENTA);
		countryfield.setBackground(Color.WHITE);
		countryfield.setHorizontalAlignment(JTextField.CENTER);
		add(countryfield);
		
		contactfield = new JTextField();
		contactfield.setBounds(155, 370, 250, 30);
		contactfield.setForeground(Color.MAGENTA);
		contactfield.setBackground(Color.WHITE);
		contactfield.setHorizontalAlignment(JTextField.CENTER);
		add(contactfield);
		
		rollfield = new JTextField();
		rollfield.setBounds(155, 250, 250, 30);
		rollfield.setForeground(Color.MAGENTA);
		rollfield.setBackground(Color.WHITE);
		rollfield.setHorizontalAlignment(JTextField.CENTER);
		add(rollfield);
		
		
	}

	private void label() {
		namelabel = new JLabel("Name : ");
		setLayout(null);
		namelabel.setBounds(50, 10, 100, 30);
		namelabel.setBackground(Color.BLACK);
		namelabel.setForeground(Color.WHITE);
		namelabel.setOpaque(true);
		namelabel.setHorizontalAlignment(JLabel.CENTER);
		add(namelabel);
			
		emaillabel = new JLabel("Email : ");
		setLayout(null);
		emaillabel.setBounds(50, 50, 100, 30);
		emaillabel.setBackground(Color.BLACK);
		emaillabel.setForeground(Color.WHITE);
		emaillabel.setOpaque(true);
		emaillabel.setHorizontalAlignment(JLabel.CENTER);
		add(emaillabel);
				
		courselabel = new JLabel("Course : ");
		setLayout(null);
		courselabel.setBounds(50, 90, 100, 30);
		courselabel.setBackground(Color.BLACK);
		courselabel.setForeground(Color.WHITE);
		courselabel.setOpaque(true);
		courselabel.setHorizontalAlignment(JLabel.CENTER);
		add(courselabel);
					
		feelabel = new JLabel("Fee : ");
		setLayout(null);
		feelabel.setBounds(50, 130, 100, 30);
		feelabel.setBackground(Color.BLACK);
	    feelabel.setForeground(Color.WHITE);
		feelabel.setOpaque(true);
		feelabel.setHorizontalAlignment(JLabel.CENTER);
		add(feelabel);
						
		paidlabel = new JLabel("Paid : ");
		setLayout(null);
		paidlabel.setBounds(50, 170, 100, 30);
		paidlabel.setBackground(Color.BLACK);
		paidlabel.setForeground(Color.WHITE);
		paidlabel.setOpaque(true);
		paidlabel.setHorizontalAlignment(JLabel.CENTER);
		add(paidlabel);
							
		duelabel = new JLabel("Due : ");
		setLayout(null);
		duelabel.setBounds(50, 210, 100, 30);
		duelabel.setBackground(Color.BLACK);
		duelabel.setForeground(Color.WHITE);
		duelabel.setOpaque(true);
		duelabel.setHorizontalAlignment(JLabel.CENTER);
		add(duelabel);
									
		citylabel = new JLabel("City : ");
		setLayout(null);
		citylabel.setBounds(50, 290, 100, 30);
		citylabel.setBackground(Color.BLACK);
		citylabel.setForeground(Color.WHITE);
		citylabel.setOpaque(true);
		citylabel.setHorizontalAlignment(JLabel.CENTER);
		add(citylabel);
										
		countrylabel = new JLabel("Country : ");
		setLayout(null);
		countrylabel.setBounds(50, 330, 100, 30);
		countrylabel.setBackground(Color.BLACK);
		countrylabel.setForeground(Color.WHITE);
		countrylabel.setOpaque(true);
		countrylabel.setHorizontalAlignment(JLabel.CENTER);
		add(countrylabel);
											
		contactlabel = new JLabel("Contact No : ");
		setLayout(null);
		contactlabel.setBounds(50, 370, 100, 30);
		contactlabel.setBackground(Color.BLACK);
		contactlabel.setForeground(Color.WHITE);
		contactlabel.setOpaque(true);
		contactlabel.setHorizontalAlignment(JLabel.CENTER);
		add(contactlabel);	
		
		rolllabel = new JLabel("Roll No : ");
		setLayout(null);
		rolllabel.setBounds(50, 250, 100, 30);
		rolllabel.setBackground(Color.BLACK);
		rolllabel.setForeground(Color.WHITE);
		rolllabel.setOpaque(true);
		rolllabel.setHorizontalAlignment(JLabel.CENTER);
		add(rolllabel);	
		
	}
	
	
private void button() {
	addstudent = new JButton("Add Student");
	addstudent.setToolTipText("Click Please");
	addstudent.setForeground(Color.BLACK);
	addstudent.setBounds(180, 420, 180, 30);
	addstudent.addActionListener(e->{
		name=namefield.getText();
		email=emailfield.getText();
		course=coursefield.getText();
		fee=feefield.getText();
		paid=paidfield.getText();
		due=duefield.getText();
		city=cityfield.getText();
		country=countryfield.getText();
		contact=contactfield.getText();
		roll=rollfield.getText();
				
		
		dbcon b= new dbcon();
		b.insert1(name,email,course,fee,paid,due,city,country,contact,roll);
		dispose();
		seventhPage a=new seventhPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 500);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);

	});
	add(addstudent);
	
	
	back = new JButton("Back");
	back.setToolTipText("Click Please");
	back.setForeground(Color.BLACK);
	back.setBounds(480, 420, 80, 30);
	back.addActionListener(e->{
		dispose();
		FifthPage a=new FifthPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);
	});
	add(back);
		
	}
	
	
	
	public static void main(String[] args) {
		seventhPage a=new seventhPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 500);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);


	}

}
