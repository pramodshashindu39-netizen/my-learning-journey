import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewStudentProfilePage extends JFrame {
    private JLabel lblTitle, lblSearchId, lblName, lblNic, lblPrfMarks, lblDbmsMarks, lblGpa;
    private JTextField txtSearchId, txtName, txtNic, txtPrfMarks, txtDbmsMarks, txtGpa;
    private JButton btnSearch, btnBack;

    public ViewStudentProfilePage() {
        setTitle("View Student Profile");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblTitle = new JLabel("View Student Profile");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        JPanel centerPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        
        lblSearchId = new JLabel("Enter Student ID"); 
        lblSearchId.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblSearchId);
        
        txtSearchId = new JTextField(10); 
        txtSearchId.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(txtSearchId);
        
        lblName = new JLabel("Name"); 
        lblName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblName);
        
        txtName = new JTextField(15); 
        txtName.setFont(new Font("Arial", Font.PLAIN, 18)); 
        txtName.setEditable(false); centerPanel.add(txtName);
        
        lblNic = new JLabel("NIC"); 
        lblNic.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblNic);
        
        txtNic = new JTextField(15); 
        txtNic.setFont(new Font("Arial", Font.PLAIN, 18)); 
        txtNic.setEditable(false); 
        
        centerPanel.add(txtNic);
        
        lblPrfMarks = new JLabel("PRF Marks"); 
        lblPrfMarks.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblPrfMarks);
        
        txtPrfMarks = new JTextField(15); 
        txtPrfMarks.setFont(new Font("Arial", Font.PLAIN, 18)); 
        txtPrfMarks.setEditable(false); 
        
        centerPanel.add(txtPrfMarks);
        
        lblDbmsMarks = new JLabel("DBMS Marks"); 
        lblDbmsMarks.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblDbmsMarks);
        
        txtDbmsMarks = new JTextField(15); 
        txtDbmsMarks.setFont(new Font("Arial", Font.PLAIN, 18)); 
        txtDbmsMarks.setEditable(false); 
        
        centerPanel.add(txtDbmsMarks);
        
        lblGpa = new JLabel("GPA"); 
        lblGpa.setFont(new Font("Arial", Font.PLAIN, 18)); 
        centerPanel.add(lblGpa);
        
        txtGpa = new JTextField(15); 
        txtGpa.setFont(new Font("Arial", Font.PLAIN, 18)); 
        txtGpa.setEditable(false); 
        centerPanel.add(txtGpa);
        
        add("Center", centerPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSearch = new JButton("SEARCH"); 
        btnSearch.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnSearch);
        
        btnBack = new JButton("BACK"); 
        btnBack.setFont(new Font("Arial", Font.BOLD, 16)); 
        buttonPanel.add(btnBack);
        
        
        
        
        add("South", buttonPanel);

        btnBack.addActionListener(new ActionListener() {
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
                    JOptionPane.showMessageDialog(null, "This student does not exist in the system");
                    txtName.setText(""); 
                    txtNic.setText(""); 
                    txtPrfMarks.setText(""); 
                    txtDbmsMarks.setText(""); 
                    txtGpa.setText("");
                } else {
                    txtName.setText(student.getName());
                    txtNic.setText(student.getNic());
                    
                    int prf = student.getPrfMarks();
                    if (prf == -2) { 
						txtPrfMarks.setText("Not Conducted"); 
					}
                    else if (prf == -1) { 
						txtPrfMarks.setText("Absent"); 
					}
                    else { 
						txtPrfMarks.setText(String.valueOf(prf)); 
					}
                    
                    int dbms = student.getDbmsMarks();
                    
                    if (dbms == -2) { 
						txtDbmsMarks.setText("Not Conducted"); 
					}
                    else if (dbms == -1) { 
						txtDbmsMarks.setText("Absent"); 
					}
                    else { 
						txtDbmsMarks.setText(String.valueOf(dbms)); 
					}
                    
                    double finalGpa = calculateFinalGpa(prf, dbms);
                    txtGpa.setText(String.valueOf(finalGpa));
                }
            }
        });
    }

    private double calculateFinalGpa(int prfMarks, int dbmsMarks) {
        
        if (prfMarks < 0 && dbmsMarks < 0) {
			return 0.0;
		}
		
        double prfGpa = getGpaValue(prfMarks);
        double dbmsGpa = getGpaValue(dbmsMarks);
        return (prfGpa + dbmsGpa) / 2.0;
    }

    private double getGpaValue(int marks) {
        if (marks < 0) return 0.0;
        if (marks >= 90 && marks <= 100) return 4.25;
        if (marks >= 80 && marks <= 89)  return 4.00;
        if (marks >= 75 && marks <= 79)  return 3.70;
        if (marks >= 70 && marks <= 74)  return 3.30;
        if (marks >= 65 && marks <= 69)  return 3.00;
        if (marks >= 60 && marks <= 64)  return 2.70;
        if (marks >= 55 && marks <= 59)  return 2.30;
        if (marks >= 50 && marks <= 54)  return 2.00;
        if (marks >= 45 && marks <= 49)  return 1.70;
        if (marks >= 40 && marks <= 44)  return 1.30;
        if (marks >= 30 && marks <= 39)  return 1.00;
        if (marks >= 20 && marks <= 29)  return 0.70;
        return 0.0;
    }
}
