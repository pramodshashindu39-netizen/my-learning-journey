import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Add Student Form");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new GridLayout(4,2,2,2));
		
		JLabel idLabel=new JLabel("ID : ");
		idLabel.setFont(new Font("",1,25));
		
		JLabel nameLabel=new JLabel("Name : ");
		nameLabel.setFont(new Font("",1,25));
		
		JLabel prfLabel=new JLabel("prf : ");
		prfLabel.setFont(new Font("",1,25));
		
		JLabel dbmsLabel=new JLabel("dbms : ");
		dbmsLabel.setFont(new Font("",1,25));

		JTextField idTextField=new JTextField(10);
		idTextField.setFont(new Font("",1,25));
		
		JTextField nameTextField=new JTextField(10);
		nameTextField.setFont(new Font("",1,25));
		
		JTextField prfTextField=new JTextField(10);
		prfTextField.setFont(new Font("",1,25));
		
		JTextField dbmsTextField=new JTextField(10);
		dbmsTextField.setFont(new Font("",1,25));
		
		f1.add(idLabel,idTextField,nameLabel,nameTextField,prfLabel);
		
		idTextField.setHorizontalAlignment(JTextField.TRAILING);
		idTextField.setFont(new Font("",1,25));
		f1.add("South",idTextField);
		f1.setVisible(true);
	}
}
