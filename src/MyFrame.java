import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

            // label
        JLabel label = new JLabel();
        label.setText("Memory Game!");
        label.setHorizontalTextPosition(JLabel.CENTER); // adds label to center of logo
        label.setVerticalTextPosition(JLabel.TOP); // adds label to top on logo
        label.setForeground(Color.GREEN); // Font color
        label.setFont(new Font("MV Boli",Font.PLAIN,30)); // Sets Font Charastatics
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

            //Frame
        JFrame frame = new JFrame();
        frame.setTitle("Memory Game"); // Title Headline
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,700);
        frame.setVisible(true); // visibility
        frame.add(label);
        frame.getContentPane().setBackground(new Color(246, 17, 243, 255)); // change color rgb scale
            //Border
        Border border = BorderFactory.createLineBorder(Color.CYAN,20);
        label.setBorder(border); // add a border around frame


            // Logo
        ImageIcon image1 = new ImageIcon("MemoryLogo.png"); // adds logo
        frame.setIconImage(image1.getImage());
        ImageIcon image2 = new ImageIcon("MemoryLogo.png");
        label.setIcon(image2);



    }
}
