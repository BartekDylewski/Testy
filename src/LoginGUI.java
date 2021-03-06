//https://www.youtube.com/watch?v=iE8tZ0hn2Ws
//https://beginnersbook.com/2015/07/java-swing-tutorial/

//Proste menu logowania.
//User          Bartek
//Password      Dylewski

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener{

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JLabel success;

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(142, 80, 80, 25);
        loginButton.addActionListener(new LoginGUI());
        panel.add(loginButton);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        success.setText("");

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("Bartek") && password.equals("Dylewski")) {
            success.setText("Login successful!");
        } else{
            success.setText("Login unsuccessful :C");
        }

    }
}
