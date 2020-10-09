import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clicker implements ActionListener{

    private double points;
    private double multiplier;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton clicker;
    private JButton zwiekszMnoznik;

    public Clicker(){

        multiplier = 1;

        frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        clicker = new JButton("Click me!");
        clicker.setBounds(20, 20, 250, 50);
        clicker.addActionListener(this);

        zwiekszMnoznik = new JButton("Increase Multiplier by 1 for 10 points");
        zwiekszMnoznik.setBounds(20, 70, 250 ,25);
        zwiekszMnoznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(points >= 10){
                    multiplier++;
                    points = points - 10;
                    label.setText("Points: " + points);
                }

            }
        });

        label = new JLabel("Points; " + points);
        label.setBounds(20, 90, 250, 50);

        frame.add(zwiekszMnoznik);
        frame.add(label);
        frame.add(clicker);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Clicker();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        points = points + (1 * multiplier);
        label.setText("Points: " + points);
    }
}
