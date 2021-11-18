import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ThirdPage  extends JFrame {
	 private JButton addaccountant;
	 private JButton viewaccountant;
	 private JButton logout;
	 public String[] columnNames= {"Id","Name","Password","Email","Contact"};
	
	  
	  public ThirdPage() {
		  super("Admin");
		  button();
	  }
	  
	private void button() {
		addaccountant = new JButton("Add Accountant");
		addaccountant.setToolTipText("Click Please");
		addaccountant.setBounds(225, 75, 150, 25);
		addaccountant.setForeground(Color.BLACK);
		addaccountant.addActionListener(e->{
			
			FourthPage a=new FourthPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setBounds(0, 0, 600, 400);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setLocationRelativeTo(null);
			dispose();
		});
		add(addaccountant);
		
		viewaccountant = new JButton("View Accountant");
		viewaccountant.setToolTipText("Click Please");
		viewaccountant.setBounds(225, 160, 150, 25);
		viewaccountant.setForeground(Color.BLACK);
		viewaccountant.addActionListener(e->{
			showTableData();
		});
		add(viewaccountant);
		
		logout = new JButton("Logout");
		logout.setToolTipText("Click Please");
		logout.setBounds(225, 245,150, 25);
		logout.setForeground(Color.BLACK);
		logout.addActionListener(e->{
			
			firstPage a=new firstPage();
			a.setLayout(null);
			a.setVisible(true);
			a.setBounds(0, 0, 600, 400);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setLocationRelativeTo(null);
			dispose();
		});
		add(logout);
		
	}



	public static void main(String[] args) {
		
		ThirdPage a=new ThirdPage();
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

        String id = "";
        String name = "";
        String password = "";
        String email = "";
        String contact = "";
        
        dbcon db=new dbcon();
        ResultSet rs =db.Alluser();
        try {
			while(rs.next()) {
				id = rs.getString("id");
				name = rs.getString("Name");
			    password= rs.getString("Password");
			    email= rs.getString("Email");
			    contact= rs.getString("Contact");
			    model.addRow(new Object[]{id, name, password, email,contact});
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
