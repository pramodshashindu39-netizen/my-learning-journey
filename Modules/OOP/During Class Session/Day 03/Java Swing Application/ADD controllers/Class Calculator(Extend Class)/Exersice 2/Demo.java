import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
		
	JButton[] buttonArray=new JButton[16];
	String[] buttonName={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

	private JTextField txtDisplay;
	
	Calculator(){
		setTitle("Calculator");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		txtDisplay=new JTextField();
		txtDisplay.setFont(new Font("",1,20));
		add("North",txtDisplay);

		setVisible(true);
	}
	
}
class Demo{
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		
	}
}
