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
    private JLabel pointsLabel;
    private JFrame frame;
    private JPanel panel;
    private JButton clickerButton;
    private JButton increaseMultiplierButton;

    public Clicker(){

        multiplier = 1;
        increaseMultiplierPrize = 10;

        frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        clickerButton = new JButton("Click me!");
        clickerButton.setBackground(Color.lightGray); // Ustawia kolor tła przycisku
        clickerButton.setForeground(Color.darkGray); // Ustawia kolor czcionki
        clickerButton.setFocusPainted(false); // Usuwa kwadraty po najechaniu kursorem na button
        clickerButton.setBounds(20, 20, 350, 50);
        clickerButton.addActionListener(this);

        increaseMultiplierButton = new JButton("Increase Multiplier by 0.5 for " + increaseMultiplierPrize + " points");
        increaseMultiplierButton.setBackground(Color.lightGray); // Ustawia kolor tła przycisku
        increaseMultiplierButton.setForeground(Color.darkGray); // Ustawia kolor czcionki
        increaseMultiplierButton.setFocusPainted(false); // Usuwa kwadraty po najechaniu kursorem na button
        increaseMultiplierButton.setBounds(20, 75, 350 ,25);
        increaseMultiplierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(points >= increaseMultiplierPrize){
                    multiplier = multiplier + 0.5; // Dodaje 0.5 do mnożnika
                    points = points - increaseMultiplierPrize; // Odejmuje cenę zwiększenia mnożnika
                    increaseMultiplierPrize *= 2; // Zwiększa cenę
                    pointsLabel.setText("<html> Points: " + points + "<br>"
                            + "Multiplier: " + multiplier + "</html>");  // Wyświetla punkty
                    increaseMultiplierButton.setText("Increase Multiplier by 0.5 for " + increaseMultiplierPrize + " points");
                }
            }
        });

        pointsLabel = new JLabel("<html> Points: " + points + "<br>"
                + "Multiplier: " + multiplier + "</html>");  // Wyświetla punkty
        pointsLabel.setBounds(20, 85, 250, 100);
        pointsLabel.setText("<html> Points: " + points + "<br>"
                + "Multiplier: " + multiplier + "</html>");  // Wyświetla punkty
        pointsLabel.setForeground(Color.lightGray); // Zmienia kolor czcionki

        frame.add(increaseMultiplierButton);
        frame.add(pointsLabel);
        frame.add(clickerButton);
        frame.add(panel);
        frame.setVisible(true);

        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                points = points + 1;
                pointsLabel.setText("<html> Points: " + points + "<br>"
                        + "Multiplier: " + multiplier + "</html>");  // Wyświetla punkty
            }
        }, 1000,1000);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        points = points + (multiplier); // Dodaje do punktów 1*mnożnik
        pointsLabel.setText("<html> Points: " + points + "<br>"
                + "Multiplier: " + multiplier + "</html>");  // Wyświetla punkty
    }

    public static void main(String[] args) {
        new Clicker();
    }

}





