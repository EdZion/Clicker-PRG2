import javax.swing.*;

public class ClickerGui {
    private JPanel Jpanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JTextArea textArea1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ClickerGui");
        frame.setContentPane(new ClickerGui().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
