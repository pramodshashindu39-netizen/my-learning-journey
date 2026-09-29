import javax.swing.*;
import java.awt.*;
class AddStudentForm extends JFrame{
	private JTextField txtId;	
	private JTextField txtName;	
	private JTextField txtPrfMarks;	
	private JTextField txtDbmsMarks;	
	
	private JButton btnAdd;
	private JButton btnCancel;
	
	AddStudentForm(){
		setTitle("Delete Student Form");
		setSize(400,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnAdd=new JButton("Delete Student");
		btnAdd.setFont(new Font("",1,20));
		btnCancel=new JButton("Cancel");
		btnCancel.setFont(new Font("",1,20));
		buttonPanel.add(btnAdd);
		buttonPanel.add(btnCancel);
		add("South",buttonPanel);
		
		JLabel lblTitle=new JLabel("Delete New Student Form");
		lblTitle.setFont(new Font("",1,28));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		add("North",lblTitle);
		
		JPanel textPanel=new JPanel(new GridLayout(4,1));
		
		txtId=new JTextField(5);
		txtId.setFont(new Font("",1,20));
		JPanel idTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanel.add(txtId);
		textPanel.add(idTextPanel);
		
		txtName=new JTextField(15);
		txtName.setFont(new Font("",1,20));
		JPanel nameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(txtName);
		textPanel.add(nameTextPanel);
		
		txtPrfMarks=new JTextField(3);
		txtPrfMarks.setFont(new Font("",1,20));
		JPanel prfTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		prfTextPanel.add(txtPrfMarks);
		textPanel.add(prfTextPanel);
		
		txtDbmsMarks=new JTextField(3);
		txtDbmsMarks.setFont(new Font("",1,20));
		JPanel dbmsTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		dbmsTextPanel.add(txtDbmsMarks);
		textPanel.add(dbmsTextPanel);

		add("East",textPanel);
		
		JLabel lblId=new JLabel("Student ID");	
		lblId.setFont(new Font("",1,20));
		JLabel lblName=new JLabel("Name");	
		lblName.setFont(new Font("",1,20));
		JLabel lblPrfMarks=new JLabel("PRF Marks");	
		lblPrfMarks.setFont(new Font("",1,20));
		JLabel lblDbmsMarks=new JLabel("DBMS Marks");	
		lblDbmsMarks.setFont(new Font("",1,20));
		JPanel labelPanel=new JPanel(new GridLayout(4,1,4,4));	
		labelPanel.add(lblId);
		labelPanel.add(lblName);	
		labelPanel.add(lblPrfMarks);	
		labelPanel.add(lblDbmsMarks);
		add("West",labelPanel);
	}
}
class Demo{
	public static void main(String[] args) {
		new AddStudentForm().setVisible(true);
	}
}
