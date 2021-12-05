import javax.swing.*;
import java.awt.*;

public class LoginSignup extends JFrame{

    JLabel title;
    JTextField username;
    JTextField password;
    JButton login;
    JButton signup;

    public LoginSignup() {

        setTitle("Registration");
        setBackground(Color.black);
        setBounds(0,0,1280,720);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setLayout(null);

        title = new JLabel("Log in");
        title.setBounds(640,10,50,0);
        add(title);

        username = new JTextField("Username");
        username.setBounds(380,289,289,35);
        username.setFont(new Font("Arial", Font.BOLD, 20));
        username.setBorder(null);
        add(username);

        password = new JTextField("Password");
        password.setBounds(380,349,289,35);
        password.setFont(new Font("Arial", Font.BOLD, 20));
        password.setBorder(null);
        add(password);

        login = new JButton("Login");
        login.setBounds(380, 409, 289, 32);
        login.setFont(new Font("Arial", Font.BOLD, 20));
        login.setBorder(null);
        add(login);

        signup = new JButton("Signup");
        signup.setBounds(380, 459, 289, 32);
        signup.setFont(new Font("Arial", Font.BOLD, 20));
        signup.setBorder(null);
        add(signup);

    }
    public static void main(String[] args) {
        new LoginSignup().setVisible(true);
    }
}