import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true); //sets the visibility to be true

        frame.setSize(500, 500); //sets height and width of the frame

        frame.setTitle("Bank Management System"); //sets the  title of the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when clicked x

        frame.setResizable(true); //cannot resize the windows if set to false

        ImageIcon image = new ImageIcon("SwingPractise/porce.jpg"); //create an Image icon

        frame.setIconImage(image.getImage()); //change the icon of the frame

        frame.getContentPane().setBackground(Color.red);


    }
}
