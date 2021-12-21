import javax.swing.*;
import java.awt.*;

public class MyGui implements Runnable {
    @Override
    public void run() {
          //Frame
        JFrame frame = new JFrame();
        frame.setTitle("Memory Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("MemoryLogo.png"); // adds logo
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0,34,54)); // change color rgc scale



    }
}
