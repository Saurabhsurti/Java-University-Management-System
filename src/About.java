import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(1200, 600);
        setLocation(200, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/myphoto.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(650, 30, 500, 500);
        add(image);
        
        JLabel heading = new JLabel("<html>University Management System</html>");
        heading.setBounds(70, 20, 500, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Saurabh Surti");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel rollno = new JLabel("Enrollment number: 21002170110194");
        rollno.setBounds(70, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: saurabhsurti@gmail.com");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}