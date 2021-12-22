import javax.swing.*;
import java.awt.*;

public class Game {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("It WOrks!");

    Game(){
        label.setBounds(250,300,300,200);
        label.setFont(new Font(null,Font.PLAIN,30));

        frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Memory Game"); // Title Headline
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);
        frame.add(label);

    }
}

