import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddStudentPage extends JFrame {
    private JLabel lblTitle;
    private JLabel lblBatchNumber;
    private JLabel lblNic;
    private JLabel lblName;
    private JLabel lblLecturerMode;
    
    private JTextField txtBatchNumber;
    private JTextField txtNic;
    private JTextField txtName;
    private JTextField txtLecturerMode;
    
    private JButton btnCancel;
    private JButton btnAddStudent;

    public AddStudentPage() {
        setTitle("Add Student");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblTitle = new JLabel("Add Student");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        JPanel labelPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        
        lblBatchNumber = new JLabel("Batch Number"); 
        lblBatchNumber.setFont(new Font("Arial", Font.PLAIN, 18)); 
        labelPanel.add(lblBatchNumber);
        
        lblNic = new JLabel("NIC"); 
        lblNic.setFont(new Font("Arial", Font.PLAIN, 18)); 
        labelPanel.add(lblNic);
        
        lblName = new JLabel("Name"); 
        lblName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        labelPanel.add(lblName);
        
        lblLecturerMode = new JLabel("Lecturer Mode"); 
        lblLecturerMode.setFont(new Font("Arial", Font.PLAIN, 18)); 
        labelPanel.add(lblLecturerMode);
        
        add("West", labelPanel);

        JPanel textPanel = new JPanel(new GridLayout(4, 1, 10, 10));
      
        txtBatchNumber = new JTextField(15); 
        txtBatchNumber.setFont(new Font("Arial", Font.PLAIN, 18)); 
        textPanel.add(txtBatchNumber);
        
        txtNic = new JTextField(15); 
        txtNic.setFont(new Font("Arial", Font.PLAIN, 18)); 
        textPanel.add(txtNic);
        
        txtName = new JTextField(15); 
        txtName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        textPanel.add(txtName);
        
        txtLecturerMode = new JTextField(15); 
        txtLecturerMode.setFont(new Font("Arial", Font.PLAIN, 18)); 
        textPanel.add(txtLecturerMode);
        
        add("East", textPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnCancel = new JButton("CANCEL"); 
        btnCancel.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnCancel);
        
        btnAddStudent = new JButton("ADD STUDENT"); 
        btnAddStudent.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnAddStudent);
        add("South", buttonPanel);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                new StudentManagementPage().setVisible(true);
            }
        });

        btnAddStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String batchNum = txtBatchNumber.getText(); 
                String nic = txtNic.getText();
                String name = txtName.getText();
                String mode = txtLecturerMode.getText();
                
                String autoId = StudentCollection.createRegistrationNo(mode, batchNum);
                
                if (nic.length()==10){
					Student s1 = new Student(autoId, name, nic, -2, -2);
					StudentCollection.addNewStudent(s1);
                
					JOptionPane.showMessageDialog(null, name + " Successfully Added!	Registration No is : " + autoId);
				
				}else{
					JOptionPane.showMessageDialog(null,  " NIC not Valid please input 10 digit NIC  . Example : 200514103720" );
				}
                
                
                

                
                txtBatchNumber.setText("");
                txtNic.setText("");
                txtName.setText("");
                txtLecturerMode.setText("");
            }
        });
    }
}
