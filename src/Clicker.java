import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Clicker implements ActionListener{

    private double points;
    private double multiplier;
    private double increaseMultiplierPrize;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton clicker;
    private JButton increaseMultiplier;

    public Clicker(){

        multiplier = 1;
        increaseMultiplierPrize = 10;

        frame = new JFrame();
        frame.setSize(310, 170);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        clicker = new JButton("Click me!");
        clicker.setBackground(Color.lightGray); // Ustawia kolor tła przycisku
        clicker.setForeground(Color.darkGray); // Ustawia kolor czcionki
        clicker.setFocusPainted(false); // Usuwa kwadraty po najechaniu kursorem na button
        clicker.setBounds(20, 20, 250, 50);
        clicker.addActionListener(this);

        increaseMultiplier = new JButton("Increase Multiplier by 0.5 for " + increaseMultiplierPrize + " points");
        increaseMultiplier.setBackground(Color.lightGray); // Ustawia kolor tła przycisku
        increaseMultiplier.setForeground(Color.darkGray); // Ustawia kolor czcionki
        increaseMultiplier.setFocusPainted(false); // Usuwa kwadraty po najechaniu kursorem na button
        increaseMultiplier.setBounds(20, 75, 250 ,25);
        increaseMultiplier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(points >= increaseMultiplierPrize){
                    multiplier = multiplier + 0.5; // Dodaje 0.5 do mnożnika
                    points = points - increaseMultiplierPrize; // Odejmuje cenę zwiększenia mnożnika
                    increaseMultiplierPrize *= 2; // Zwiększa cenę
                    label.setText("Points: " + points); // Wyświetla punkty
                    increaseMultiplier.setText("Increase Multiplier by 0.5 for " + increaseMultiplierPrize + " points");
                }
            }
        });

        label = new JLabel("Points: " + points);  // Wyświetla punkty
        label.setBounds(20, 85, 250, 50);
        label.setForeground(Color.lightGray); // Zmienia kolor czcionki

        frame.add(increaseMultiplier);
        frame.add(label);
        frame.add(clicker);
        frame.add(panel);
        frame.setVisible(true);

        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                points = points + 1;
                label.setText("Points: " + points); // Wyświetla punkty
            }
        }, 1000,1000);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        points = points + (multiplier); // Dodaje do punktów 1*mnożnik
        label.setText("Points: " + points); // Wyświetla punkty
    }

    public static void main(String[] args) {
        new Clicker();
    }

}





