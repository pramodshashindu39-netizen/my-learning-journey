import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeleteStudentProfilePage extends JFrame {
    private JLabel lblTitle, lblSearchId, lblName, lblNic, lblPrfMarks, lblDbmsMarks, lblGpa;
    private JTextField txtSearchId, txtName, txtNic, txtPrfMarks, txtDbmsMarks, txtGpa;
    private JButton btnSearch, btnDelete, btnCancel;

    public DeleteStudentProfilePage() {
        setTitle("Delete Student Form");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblTitle = new JLabel("Delete Student Profile");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        JPanel centerPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        
        lblSearchId = new JLabel("Enter Student ID"); 
        lblSearchId.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(lblSearchId);
        
        txtSearchId = new JTextField(10); 
        txtSearchId.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(txtSearchId);
        
        lblName = new JLabel("Name"); 
        lblName.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(lblName);
        
        txtName = new JTextField(15); 
        txtName.setFont(new Font("Arial", Font.BOLD, 18)); 
        txtName.setEditable(false); centerPanel.add(txtName);
        
        lblNic = new JLabel("NIC"); 
        lblNic.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(lblNic);
        
        txtNic = new JTextField(15); 
        txtNic.setFont(new Font("Arial", Font.BOLD, 18)); 
        txtNic.setEditable(false);
        centerPanel.add(txtNic);
        
        lblPrfMarks = new JLabel("PRF Marks"); 
        lblPrfMarks.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(lblPrfMarks);
        
        txtPrfMarks = new JTextField(15); 
        txtPrfMarks.setFont(new Font("Arial", Font.BOLD, 18)); 
        txtPrfMarks.setEditable(false); 
        centerPanel.add(txtPrfMarks);
        
        lblDbmsMarks = new JLabel("DBMS Marks"); 
        lblDbmsMarks.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(lblDbmsMarks);
        
        txtDbmsMarks = new JTextField(15); 
        txtDbmsMarks.setFont(new Font("Arial", Font.BOLD, 18)); 
        txtDbmsMarks.setEditable(false); 
        centerPanel.add(txtDbmsMarks);
        
        lblGpa = new JLabel("GPA"); 
        lblGpa.setFont(new Font("Arial", Font.BOLD, 18)); 
        centerPanel.add(lblGpa);
        
        txtGpa = new JTextField(15); 
        txtGpa.setFont(new Font("Arial", Font.BOLD, 18)); 
        txtGpa.setEditable(false); 
        centerPanel.add(txtGpa);
        
        add("Center", centerPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSearch = new JButton("SEARCH"); 
        btnSearch.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnSearch);
        
        btnDelete = new JButton("DELETE"); 
        btnDelete.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnDelete);
        
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
                    JOptionPane.showMessageDialog(null, "This student does not exist in the system!");
                    txtName.setText(""); 
                    txtNic.setText(""); 
                    txtPrfMarks.setText(""); 
                    txtDbmsMarks.setText(""); 
                    txtGpa.setText("");
                } else {
                    txtName.setText(student.getName());
                    txtNic.setText(student.getNic());
                    txtPrfMarks.setText(String.valueOf(student.getPrfMarks()));
                    txtDbmsMarks.setText(String.valueOf(student.getDbmsMarks()));
                    txtGpa.setText("0.0");
                }
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String id = txtSearchId.getText();
                boolean isDeleted = StudentCollection.deleteStudent(id);
                
                if (isDeleted) {
                    JOptionPane.showMessageDialog(null, id + " Successfully Deleted!");
                    txtSearchId.setText(""); txtName.setText(""); 
                    txtNic.setText(""); 
                    txtPrfMarks.setText(""); 
                    txtDbmsMarks.setText(""); 
                    txtGpa.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Delete Failed!");
                }
            }
        });
    }
}
