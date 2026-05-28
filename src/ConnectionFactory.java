import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String usuario = "postgres";
    private static String senha = "1234"; 
    private static String host = "localhost";
    private static String port = "5432";
    private static String db = "postgres"; 

    public static Connection obterConexao() {
        try {
            var url = String.format(
                "jdbc:postgresql://%s:%s/%s", 
                host, port, db
            );
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}