package view;

import java.sql.*;
import java.util.*;
import model.*;

public class MailListReaderBD {

    private static Connection connect(){

        String url = "jdbc:sqlite:Kata5P2/KATA5.db";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public List<Mail> readMailBD(){
        String sql = "SELECT Mail FROM EMAIL";
        List<Mail> emails = new ArrayList<Mail>();
        try(Connection con = this.connect();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){

            while(rs.next()) {
                System.out.println(rs.getString("Mail"));
                emails.add(new Mail(rs.getString("Mail")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return emails;
    }

}
