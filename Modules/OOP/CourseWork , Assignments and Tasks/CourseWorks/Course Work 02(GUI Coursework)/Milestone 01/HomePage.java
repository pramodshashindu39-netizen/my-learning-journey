import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {
    private JLabel lblTitle;
    private JButton btnStudentManagement;
    private JButton btnBatchManagement;
    private JButton btnGradeManagement;
    private JButton btnReportGenerator;

    public HomePage() {
        setTitle("iCET Learning Management System");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        lblTitle = new JLabel("iCET Learning Management System");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle);

        btnStudentManagement = new JButton("Student Management");
        btnStudentManagement.setFont(new Font("Arial", Font.BOLD, 18));
        btnStudentManagement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                StudentManagementPage studentManagementFrame = new StudentManagementPage();
                studentManagementFrame.setVisible(true);
            }
        });
        add(btnStudentManagement);

        btnBatchManagement = new JButton("Batch Management");
        btnBatchManagement.setFont(new Font("Arial", Font.BOLD, 18));
        add(btnBatchManagement);

        btnGradeManagement = new JButton("Grade Management");
        btnGradeManagement.setFont(new Font("Arial", Font.BOLD, 18));
        add(btnGradeManagement);

        btnReportGenerator = new JButton("Report Generator");
        btnReportGenerator.setFont(new Font("Arial", Font.BOLD, 18));
        add(btnReportGenerator);
   
   
		
	}	
   
		public static void main(String[] args) {
			new HomePage().setVisible(true);
		}
	}



