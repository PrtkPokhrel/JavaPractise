import javax.swing.*;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        //These are frames that helps us create a frame
        JFrame frame = new JFrame();
        frame.setTitle("My Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        //labels
        JLabel label = new JLabel(); //Create a label object

        ImageIcon image = new ImageIcon("SwingPractise/tree.jpg"); //Creating a image object using ImageIcon class

        label.setIcon(image); //sets the image in the window

        label.setText("Hello World"); //sets the text hello world

        label.setHorizontalTextPosition(JLabel.LEFT); //sets text to the left side

        label.setVerticalTextPosition(JLabel.TOP); //sets text to the top side

        label.setForeground(Color.red); //sets color for the text

        label.setFont(new Font("Arial", Font.BOLD, 20)); //sets the font for the text

        label.setIconTextGap(200);  //sets text gaps from text to image

        label.setBackground(Color.blue); //sets the background color

        label.setOpaque(true);  //it needs to be true inorder to set the background color



        frame.add(label); //adds label
    }
}

//a label is a gui component that displays text or image or both




