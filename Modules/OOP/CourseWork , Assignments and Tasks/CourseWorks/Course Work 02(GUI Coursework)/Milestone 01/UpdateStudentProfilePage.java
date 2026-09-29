import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdateStudentProfilePage extends JFrame {
    private JLabel lblTitle;
    private JLabel lblSearchId;
    private JLabel lblNic;
    private JLabel lblName;
    
    private JTextField txtSearchId;
    private JTextField txtNic;
    private JTextField txtName;
    
    private JButton btnSearch;
    private JButton btnUpdate;
    private JButton btnCancel;

    public UpdateStudentProfilePage() {
        setTitle("Update Student Form");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblTitle = new JLabel("Update Student Form");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        lblSearchId = new JLabel("Enter Student ID");
        lblSearchId.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblSearchId);
        txtSearchId = new JTextField(10); 
        txtSearchId.setFont(new Font("Arial", Font.PLAIN, 18));
        centerPanel.add(txtSearchId);
        
        lblNic = new JLabel("Student NIC"); 
        lblNic.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblNic);
        
        txtNic = new JTextField(15); 
        txtNic.setFont(new Font("Arial", Font.PLAIN, 18));
        centerPanel.add(txtNic);
        
        lblName = new JLabel("Student Name");
        lblName.setFont(new Font("Arial", Font.PLAIN, 18));
        centerPanel.add(lblName);
        txtName = new JTextField(15); 
        
        txtName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(txtName);
        add("Center", centerPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        btnSearch = new JButton("SEARCH"); 
        btnSearch.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnSearch);
        
        btnUpdate = new JButton("UPDATE"); 
        btnUpdate.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnUpdate);
        
        btnCancel = new JButton("CANCEL"); 
        btnCancel.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnCancel);
        
        add("South", buttonPanel);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                new StudentManagementPage().setVisible(true);
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String id = txtSearchId.getText();
                Student student = StudentCollection.searchStudent(id);
                
                if (student == null) {
                    JOptionPane.showMessageDialog(null, id + " student not found...");
                    txtNic.setText("");
                    txtName.setText("");
                } else {
                    txtNic.setText(student.getNic());
                    txtName.setText(student.getName());
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String id = txtSearchId.getText();
                String name = txtName.getText();
                String nic = txtNic.getText();
                
                Student oldStudent = StudentCollection.searchStudent(id);
                int prfMarks = oldStudent.getPrfMarks();
                int dbmsMarks = oldStudent.getDbmsMarks();
                
                Student updatedStudent = new Student(id, name, nic, prfMarks, dbmsMarks);
                boolean isUpdate = StudentCollection.updateStudent(updatedStudent);
                
                if (isUpdate) {
                    JOptionPane.showMessageDialog(null, "Update Success");
                    txtSearchId.setText("");
                    txtNic.setText("");
                    txtName.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Update Fail");
                }
            }
        });
    }
}
