import javax.swing.*;

public class ClickerGui {
    private JPanel Jpanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ClickerGui");
        frame.setContentPane(new ClickerGui().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
