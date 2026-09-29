import javax.swing.*;
import java.awt.*;

class AddStudentForm extends JFrame{
	private JTextField txtId;
	
	private JButton addButton;
	private JButton closeButton;
	
	AddStudentForm(){
		setSize(300,300);
		setTitle("Add Student Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel lblTitle=new JLabel("Add Student Form");
		lblTitle.setFont(new Font("",1,28));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		txtId=new JTextField(5);
		txtId.setFont(new Font("",1,20));
		JTextField txtName=new JTextField(10);
		txtName.setFont(new Font("",1,20));
		JTextField txtPrfMarks=new JTextField(3);
		txtPrfMarks.setFont(new Font("",1,20));
		JTextField txtDbmsMarks=new JTextField(3);
		txtDbmsMarks.setFont(new Font("",1,20));
		
		JLabel lblId=new JLabel("Student ID");	
		lblId.setFont(new Font("",1,20));
		JLabel lblName=new JLabel("Name");	
		lblName.setFont(new Font("",1,20));
		JLabel lblPrfMarks=new JLabel("PRF Marks");	
		lblPrfMarks.setFont(new Font("",1,20));
		JLabel lblDbmsMarks=new JLabel("DBMS Marks");	
		lblDbmsMarks.setFont(new Font("",1,20));
		
		JPanel panel=new JPanel(new GridLayout(4,2));	
		panel.add(lblId);
		panel.add(txtId);
		panel.add(lblName);	
		panel.add(txtName);	
		panel.add(lblPrfMarks);	
		panel.add(txtPrfMarks);	
		panel.add(lblDbmsMarks);
		panel.add(txtDbmsMarks);
		add("West",panel);

		
		JPanel panel2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		addButton=new JButton("Add");
		setFont(new Font("",Font.BOLD,25));
		
		closeButton=new JButton("Close");
		setFont(new Font("",Font.BOLD,25));
		
		panel2.add(addButton);
		panel2.add(closeButton);
		
		add("South",panel2);
		
		
		pack();
		
	}

	
	
}

class Demo{
	public static void main(String[] args) {
		new AddStudentForm().setVisible(true);
	}
}
