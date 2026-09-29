import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		
		f1.setSize(600,600);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f1.setLayout(new FlowLayout());
		
		JButton btnNorth=new JButton();
		btnNorth.setText("North Button");
		btnNorth.setFont(new Font("",Font.BOLD,25));
		f1.add(btnNorth,BorderLayout.NORTH);
		
		JButton btnWest=new JButton();
		btnWest.setText("West Button");
		btnWest.setFont(new Font("",Font.BOLD,25));
		f1.add(btnWest,BorderLayout.WEST);
		
		JButton btnEast=new JButton("East Button");
		btnEast.setFont(new Font("",Font.BOLD,25));
		f1.add(btnEast,"East");
		
		JButton btnSouth=new JButton();
		btnSouth.setText("South Button");
		btnSouth.setFont(new Font("",Font.BOLD,25));
		f1.add(btnSouth,BorderLayout.SOUTH);
		
		JButton btnCenter=new JButton("Cancel");
		btnCenter.setText("Center Button");
		btnCenter.setFont(new Font("",Font.BOLD,25));
		f1.add(btnCenter,BorderLayout.CENTER);
		
		f1.setVisible(true);
	}
}
