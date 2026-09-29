import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new GridLayout(4,4));
		
		JButton btn7=new JButton("7");
		btn7.setFont(new Font("",Font.BOLD,25));
		f1.add(btn7);
		
		JButton btn8=new JButton("8");
		btn8.setFont(new Font("",Font.BOLD,25));
		f1.add(btn8);
		
		JButton btn9=new JButton("9");
		btn9.setFont(new Font("",Font.BOLD,25));
		f1.add(btn9);
		
		JButton btnG=new JButton("*");
		btnG.setFont(new Font("",Font.BOLD,25));
		f1.add(btnG);
		
		JButton btn4=new JButton("4");
		btn4.setFont(new Font("",Font.BOLD,25));
		f1.add(btn4);
		
		JButton btn5=new JButton("5");
		btn5.setFont(new Font("",Font.BOLD,25));
		f1.add(btn5);
		
		JButton btn6=new JButton("6");
		btn6.setFont(new Font("",Font.BOLD,25));
		f1.add(btn6);
		
		JButton btnD=new JButton("/");
		btnD.setFont(new Font("",Font.BOLD,25));
		f1.add(btnD);
		
		JButton btn1=new JButton("1");
		btn1.setFont(new Font("",Font.BOLD,25));
		f1.add(btn1);
		
		JButton btn2=new JButton("2");
		btn2.setFont(new Font("",Font.BOLD,25));
		f1.add(btn2);
		
		JButton btn3=new JButton("3");
		btn3.setFont(new Font("",Font.BOLD,25));
		f1.add(btn3);
		
		JButton btnP=new JButton("+");
		btnP.setFont(new Font("",Font.BOLD,25));
		f1.add(btnP);
		
		
		JButton btn0=new JButton("0");
		btn0.setFont(new Font("",Font.BOLD,25));
		f1.add(btn0);
		
		
		JButton btnDot=new JButton(".");
		btnDot.setFont(new Font("",Font.BOLD,25));
		f1.add(btnDot);
		
		JButton btnE=new JButton("=");
		btnE.setFont(new Font("",Font.BOLD,25));
		f1.add(btnE);
		
		JButton btnM=new JButton("-");
		btnM.setFont(new Font("",Font.BOLD,25));
		f1.add(btnM);
		
		
		f1.setVisible(true);
	}
}
