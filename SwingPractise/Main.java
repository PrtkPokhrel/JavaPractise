import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setVisible(true); // make frame visible
        frame.setSize(400, 400); // sets x dimension and y dimension of frame
        frame.setTitle("This is the title"); // sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the application when exit is clicked
        frame.setResizable(false); // prevent frame from being resized

        ImageIcon img = new ImageIcon("porce.jpg");
        frame.setIconImage(img.getImage()); // Sets the Icon image
        // frame.getContentPane().setBackground(Color.green); //Sets the backgorund
        // color of the frame
        frame.getContentPane().setBackground(new Color(81, 1, 120)); // different way to set the background color
          

    }
}