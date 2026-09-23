import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btnExit=new JButton();
		btnExit.setText("Exit");
		btnExit.setFont(new Font("",Font.BOLD,25));
		f1.add(btnExit,BorderLayout.NORTH);
		
		JButton btnCancel=new JButton("Cancel");
		btnCancel.setFont(new Font("",Font.BOLD,25));
		f1.add(btnCancel,BorderLayout.WEST);

		
		
		
		f1.setVisible(true);
	}
}
