import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://aws-1-ap-south-1.pooler.supabase.com:5432/postgres?user=postgres.iqrutswvdshgiweamckn&password=DemoProject@123";
        String user = "postgres";
        String pass = "DemoProject@123";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Connected to Supabase!");
        }
    }
}