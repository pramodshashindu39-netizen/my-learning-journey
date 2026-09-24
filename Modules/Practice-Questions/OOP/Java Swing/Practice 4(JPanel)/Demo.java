import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Add Student Form");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel l1=new JLabel("Add Student Form");
		l1.setFont(new Font("",Font.BOLD,30));
		l1.setHorizontalAlignment(JLabel.CENTER);
		f1.add("North",l1);
		
		JLabel l2=new JLabel("Student ID");
		l2.setFont(new Font("",Font.BOLD,30));
		l2.setHorizontalAlignment(JLabel.CENTER);
		f1.add(l2);
		
		JLabel l3=new JLabel("Student Name");
		l3.setFont(new Font("",Font.BOLD,30));
		l3.setHorizontalAlignment(JLabel.CENTER);
		f1.add(l3);
		
		JLabel l4=new JLabel("PRF Marks");
		l4.setFont(new Font("",Font.BOLD,30));
		l4.setHorizontalAlignment(JLabel.CENTER);
		f1.add("North",l1);
		
		JLabel l5=new JLabel("DBMS Marks");
		l5.setFont(new Font("",Font.BOLD,30));
		l5.setHorizontalAlignment(JLabel.CENTER);
		f1.add("North",l1);
		
		
		
		f1.setVisible(true);
		
		
	}
}
