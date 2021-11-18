import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class FifthPage extends JFrame {
	private JButton addstudent;
	private JButton viewstudent;
	private JButton editstudent;
	private JButton logout;
	private JButton delete;
	private JButton back;
	
	
	private JLabel rolllabel;
	private JTextField rollfield;
	
	
	 public String[] columnNames= {"Name","Email","Course","Fee","Paid","Due","City","Country","Contact","Roll"};
	private String roll;
	
	public FifthPage() {
		super("Acountant Section");
		button();
		label();
	}
	

	private void label() {
		rollfield = new JTextField();
		rollfield.setBounds(175, 150, 250, 30);
		rollfield.setForeground(Color.MAGENTA);
		rollfield.setBackground(Color.WHITE);
		rollfield.setHorizontalAlignment(JTextField.CENTER);
		rollfield.setVisible(false);
		add(rollfield);
		
		rolllabel = new JLabel("Roll : ");
		setLayout(null);
		rolllabel.setBounds(70, 150, 100, 30);
		rolllabel.setBackground(Color.BLACK);
		rolllabel.setForeground(Color.WHITE);
		rolllabel.setOpaque(true);
		rolllabel.setHorizontalAlignment(JLabel.CENTER);
		rolllabel.setVisible(false);
		add(rolllabel);
		
	}


	private void button() {
		addstudent = new JButton("Add Student");
		addstudent.setToolTipText("Click Please");
		addstudent.setForeground(Color.BLACK);
		addstudent.setBounds(200, 80, 200, 30);
		addstudent.addActionListener(e->{		
				dispose();
				seventhPage a=new seventhPage();
				a.setLayout(null);
				a.setVisible(true);
				a.setBounds(0, 0, 600, 500);
				a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				a.setLocationRelativeTo(null);
		});
		add(addstudent);
			
		viewstudent = new JButton("View Student");
		viewstudent.setToolTipText("Click Please");
		viewstudent.setForeground(Color.BLACK);
		viewstudent.setBounds(200, 180, 200, 30);
		viewstudent.addActionListener(e->{		
			showTableData();		
		});
		add(viewstudent);
				
		editstudent = new JButton("Delete Student");
		editstudent.setToolTipText("Click Please");
		editstudent.setForeground(Color.BLACK);
		editstudent.setBounds(200, 130, 200, 30);
		editstudent.addActionListener(e->{		
			addstudent.setVisible(false);
			viewstudent.setVisible(false);
			editstudent.setVisible(false);
			logout.setVisible(false);
			delete.setVisible(true);
			rollfield.setVisible(true);
			rolllabel.setVisible(true);
			back.setVisible(true);
		});
		add(editstudent);
					
						
		logout = new JButton("Logout");
		logout.setToolTipText("Click Please");
		logout.setForeground(Color.BLACK);
		logout.setBounds(250, 230, 80, 30);
		logout.addActionListener(e->{		
			dispose();
			firstPage a=new firstPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setBounds(0, 0, 600, 400);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setLocationRelativeTo(null);			
		});
		add(logout);
		
		delete = new JButton("Delete");
		delete.setToolTipText("Click Please");
		delete.setForeground(Color.BLACK);
		delete.setBounds(250, 230, 80, 30);
		delete.setVisible(false);
		delete.addActionListener(e->{		
			roll = rollfield.getText();
			dbcon b= new dbcon();
			b.delete(roll);
			JOptionPane.showMessageDialog(null, "Data is safely deleted!");
			
		});
		add(delete);
		
		back = new JButton("Back");
		back.setToolTipText("Click Please");
		back.setForeground(Color.BLACK);
		back.setBounds(500, 330, 80, 30);
		back.setVisible(false);
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
		FifthPage a=new FifthPage();
		a.setLayout(null);
		a.setVisible(true);
		a.setBounds(0, 0, 600, 400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setLocationRelativeTo(null);
	}
	
	public void showTableData() {

        JFrame frame1 = new JFrame("Database Search Result");
        frame1.setLayout(new BorderLayout());

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        JTable table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        String name = "";
        String email = "";
        String course = "";
        String fee = "";
        String paid = "";
        String due = "";
        String city = "";
        String country = "";
        String contact = "";
        String roll = "";
        
        dbcon db=new dbcon();
        ResultSet rs =db.Allstudent();
        try {
			while(rs.next()) {
				name = rs.getString("Name");
				email = rs.getString("Email");
			    course= rs.getString("Course");
			    fee= rs.getString("Fee");
			    paid= rs.getString("Paid");
			    due= rs.getString("Due");
			    city= rs.getString("City");
			    country= rs.getString("Country");
			    contact= rs.getString("Contact");
			    roll= rs.getString("Roll");
			    
			    model.addRow(new Object[]{name, email, course, fee,paid,due,city,country,contact,roll});
   }
		} catch (SQLException e) {
			e.printStackTrace();
		}
        frame1.add(scroll);
		frame1.setVisible(true);
		frame1.setSize(700, 200);
		frame1.setLocation(300, 250);
}
	

}
