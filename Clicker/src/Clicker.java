import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;



public class Clicker {

    String username;
    view v;
    int clickscore = 0;
    int clickbonus = 0;
    private clickerDB db;

    //Upgrade cost for upgrade number n
    int upgrade1cost = 50;
    int upgrade2cost = 300;
    int upgrade3cost = 1000;
    int upgrade4cost = 2500;
    int upgrade5cost = 5000;
    int upgrade6cost = 10000;

    // Upgrade number n click bonus
    int upgrade1cb = 1;
    int upgrade2cb = 10;
    int upgrade3cb = 25;
    int upgrade4cb = 75;
    int upgrade5cb = 200;
    int upgrade6cb = 500;


    public String getUsername () {
        return username;
    }

    public int getClickscore () {
        return clickscore;
    }

    public int getClickbonus () {
        return clickbonus;
    }



    public Clicker() {
        v = new view();
        JFrame frame = new JFrame("ClickerGUI");
        frame.setContentPane(v.getJPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700, 500));
        frame.pack();
        frame.setVisible(true);


        v.getSavebutton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    db.dbSave(username, clickscore, clickbonus);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });


//Action listener for the "click button" that increases clickscore in proportion to how much clickbonus/upgrades the user has.
        v.getClickerButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clickscore = clickscore + clickbonus + 1;
                v.getTextArea1().setText("Score: " + clickscore);
            }
        });

        /*
Action listener for upgrade button 1 which checks if the user can afford an upgrade and if they can,
it deducts the upgrade cost from clickscore and increases the clickbonus accordingly
        */
        v.getButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (clickscore > upgrade1cost) {
                    clickscore = clickscore - upgrade1cost;
                    clickbonus = clickbonus + upgrade1cb;
                    v.getTextArea1().setText("Score: " + clickscore);
                }
            }
        });
    }

    public static void main(String[] args) {
        Clicker c = new Clicker();
    }
}