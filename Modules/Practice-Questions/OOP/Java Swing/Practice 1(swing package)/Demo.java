import javax.swing.*;
class Demo{
	public static void main(String args[]){
			JFrame f1=new JFrame();
	
			f1.setSize(400,450);
			f1.setLocation(400,100);
			f1.setTitle("Calculator");
			f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f1.setVisible(true);
			
			JFrame f2=new JFrame();

			f2.setSize(400,450);
			f2.setLocationRelativeTo(null);
			f2.setTitle("Calculator");
			f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f2.setVisible(true);
			
	}
}
