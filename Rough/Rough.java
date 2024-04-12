package Rough;

import javax.swing.*;

public class Rough {
  public static void main(String[] args) {

    JFrame frame=new JFrame();
    JLabel label=new JLabel();
    ImageIcon image=new ImageIcon("SwingPractise/porce.png");


    frame.setTitle("Rough");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setVisible(true);

    label.setText("Hello world");
    label.setIcon(image);
    frame.add(label);




  }
  }


