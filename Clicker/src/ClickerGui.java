import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerGui {
    private JPanel Jpanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton ClickButton;
    private JTextArea textArea1;
    private JButton Savebutton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("ClickerGui");
        frame.setContentPane(new ClickerGui().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}