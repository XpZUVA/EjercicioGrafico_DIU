import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Patron extends JFrame {

    public Patron() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        setTitle("Dibujando una forma general");
        setBackground(Color.WHITE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        Random random = new Random();
        Graphics2D g2d = (Graphics2D) g;


        GeneralPath casa = new GeneralPath();
        int x[] = {0, -20, 0, 60, 60, 40, 40, 60, 60};
        int y[] = {0, 60, 120, 120, 70, 70, 50, 50, 0};

        casa.moveTo(x[0], y[0]);

        for (int i = 1; i < x.length; i++) {
            casa.lineTo(x[i], y[i]);
        }
        casa.closePath();

        g2d.translate(165, 105);


        for (int i = 0; i < 6; i++) {
            g2d.rotate(Math.PI /3, 58, 165);
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256),
                    random.nextInt(256)));
            g2d.fill(casa);

        }
    }


}
