import javax.swing.*;    //ImageIcon, JFrame, JLabel;
import java.awt.FlowLayout;

public class lab_01 extends JFrame {

    ImageIcon image1;
    ImageIcon image2;
    JLabel label1;
    JLabel label2;

    lab_01(){
        setLayout(new FlowLayout());
        image1 = new ImageIcon(getClass().getResource("raspi.png"));
        label1 = new JLabel(image1);
        add(label1);


        image2 = new ImageIcon(getClass().getResource("raspi.png"));
        label2 = new JLabel(image2);
        add(label2);


    }

    public static void main(String args[]){
        lab_01 gui = new lab_01();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Iamge for lab01");
    }

}
