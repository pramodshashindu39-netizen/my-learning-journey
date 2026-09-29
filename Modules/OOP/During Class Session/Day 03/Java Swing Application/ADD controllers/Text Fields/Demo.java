import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new FlowLayout());
		
		JTextField txtName=new JTextField(10);
		txtName.setHorizontalAlignment(JTextField.TRAILING);
		txtName.setFont(new Font("",1,25));
		f1.add("South",txtName);
		f1.setVisible(true);
	}
}
