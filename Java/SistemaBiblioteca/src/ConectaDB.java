import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaDB {
    // atributo
    private Connection conexao;
    // construtor
    public ConectaDB(){
        // sao as credenciais da sua conexao com BD
        String url = "jdbc:mariadb://localhost:3306/ed2";
        String user = "root";
        String pwd = "db123"; 
        try {
            conexao = DriverManager.getConnection(url, user, pwd);
            System.out.println("conexao realizada");
        } catch (Exception e) {
            System.out.println("Falha na conexao");
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConexaoDB(){
        return conexao;
    }
}
