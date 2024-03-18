import java.sql.Connection;
import java.sql.DriverManager;

public class Hello {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Ashitosh@6390");
            System.out.println(con);
        }
        catch (Exception e){

        }
    }
}
