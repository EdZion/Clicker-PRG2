import java.sql.*;

public class clickerDB {

    public void dbSave(String username, int clickbonus, int clickscore) throws SQLException{
        Connection conn = null;
        Statement stmt;


        conn = DriverManager.getConnection(
                "jdbc:mysql://" + DatabaseLoginData.DBURL + ":" + DatabaseLoginData.port + "/" + DatabaseLoginData.DBname +
                        "? allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                DatabaseLoginData.user, DatabaseLoginData.password);

        stmt = conn.createStatement();

        String save = "INSERT INTO SAVE (Score, Upgrade1, Upgrade2, Upgrade3, Upgrade4, Upgrade5, Upgrade6, User) VALUES ("+clickscore+" , "+clickbonus+" ,'"+username+"')";
        System.out.println(save);
        stmt.executeUpdate(save);
    }
}