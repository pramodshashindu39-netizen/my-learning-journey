import javax.swing.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //0,1,2,3
		f1.setVisible(true);
		try{Thread.sleep(3000);}catch(Exception ex){}
		f1.setVisible(true);
		
		JFrame f2=new JFrame();
		f2.setSize(500,500);
		f2.setTitle("Calculator");
		f2.setLocationRelativeTo(null);
		f2.setDefaultCloseOperation(3); //0,1,2,3
		f2.setVisible(true);
	}
}
//JFrame.DO_NOTHING_ON_CLOSE->0
//JFrame.HIDE_ON_CLOSE->1
//JFrame.DISPOSE_ON_CLOSE->2
//JFrame.EXIT_ON_CLOSE->3
