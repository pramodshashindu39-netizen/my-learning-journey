import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentManagementPage extends JFrame {
    private JLabel lblTitle;
    private JButton btnAddStudent;
    private JButton btnUpdateStudent;
    private JButton btnViewStudent;
    private JButton btnDeleteStudent;
    private JButton btnBack;

    public StudentManagementPage() {
        setTitle("Student Management");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        lblTitle = new JLabel("Student Management");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        add(lblTitle);

        btnAddStudent = new JButton("Add Student");
        btnAddStudent.setFont(new Font("Arial", Font.BOLD, 16));
        btnAddStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                AddStudentPage addStudentFrame = new AddStudentPage();
                addStudentFrame.setVisible(true);
            }
        });
        add(btnAddStudent);

        btnUpdateStudent = new JButton("Update Student");
        btnUpdateStudent.setFont(new Font("Arial", Font.BOLD, 16));
        btnUpdateStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                UpdateStudentProfilePage updateStudentFrame = new UpdateStudentProfilePage();
                updateStudentFrame.setVisible(true);
            }
        });
        add(btnUpdateStudent);

        btnViewStudent = new JButton("View Student Profile");
        btnViewStudent.setFont(new Font("Arial", Font.BOLD, 16));
        btnViewStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                ViewStudentProfilePage viewStudentFrame = new ViewStudentProfilePage();
                viewStudentFrame.setVisible(true);
            }
        });
        add(btnViewStudent);

        btnDeleteStudent = new JButton("Delete Student Profile");
        btnDeleteStudent.setFont(new Font("Arial", Font.BOLD, 16));
        btnDeleteStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                DeleteStudentForm deleteStudentFrame = new DeleteStudentForm();
                deleteStudentFrame.setVisible(true);
            }
        });
        
        add(btnDeleteStudent);

        btnBack = new JButton("<- Back to Home Page");
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                new HomePage().setVisible(true);
            }
        });
        add(btnBack);
    }
}
