import javax.swing.*;
public class Label {
    public static void main(String[] args) {
        //These are frames that helps us create a frame
        JFrame frame = new JFrame();
        frame.setTitle("My Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        //labels
        JLabel label = new JLabel(); //Create a label object

        ImageIcon image = new ImageIcon("SwingPractise/tree.jpg");

        label.setIcon(image); //sets the image in the window

        label.setText("Hello World"); //sets the text hello world


        frame.add(label); //adds label
    }
}

//a label is a gui component that displays text or image or both




