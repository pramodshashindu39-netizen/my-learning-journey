import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		JButton[] buttonArray=new JButton[16];
		String [] buttonName={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		
		JTextField txtId=new JTextField(5);
		txtId.setHorizontalAlignment(JTextField.RIGHT);
		txtId.setFont(new Font("",1,50));
		
		JPanel centerPanel=new JPanel();
		for (int i = 0; i < 16; i++){
			buttonArray[i]=new	JButton(buttonName[i]);
			buttonArray[i].setFont(new Font("",Font.BOLD,25));
			f1.add(buttonArray[i]);
			centerPanel.add(buttonArray[i]);
			
		}
		
		
		
		centerPanel.setLayout(new GridLayout(4,4));
		
		f1.add("North",txtId);
		f1.add("Center",centerPanel);
		f1.pack();
		f1.setVisible(true);
	}
}
