import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JButton b1=new JButton();
		b1.setText("Enter");
		b1.setFont(new Font("",Font.BOLD,25));
		f1.add(b1);
		f1.setVisible(true);
		
		
	}
}
