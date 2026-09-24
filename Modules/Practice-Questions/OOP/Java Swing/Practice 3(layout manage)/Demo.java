import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Add Student Form");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new GridLayout(4,2,3,3));
		
		JLabel l1=new JLabel("Student ID");
		l1.setFont(new Font("",Font.BOLD,30));
		l1.setHorizontalAlignment(JLabel.CENTER);
		f1.add(l1);
		
		JLabel l2=new JLabel("Student Name");
		l2.setFont(new Font("",Font.BOLD,30));
		l2.setHorizontalAlignment(JLabel.CENTER);
		f1.add(l2);
		
		JLabel l3=new JLabel("PRF Marks");
		l3.setFont(new Font("",Font.BOLD,30));
		l3.setHorizontalAlignment(JLabel.CENTER);
		f1.add(l3);
		
		JLabel l4=new JLabel("DBMS Marks");
		l4.setFont(new Font("",Font.BOLD,30));
		l4.setHorizontalAlignment(JLabel.CENTER);
		f1.add(l4);
		
		JTextField t1=new JTextField();
		t1.setFont(new Font("",1,25));
		
		

		
		
		
		f1.setVisible(true);
		
		
	}
}
