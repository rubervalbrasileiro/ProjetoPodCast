
package dao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Familia Brasileiro
 */
public class ConexaoBD {
    public Connection conn; //criando um objeto do tipo connection chamado conn
     private Statement st;    //criando um objeto do tipo Statement chamado st para  execução de comando SQL
     
     public String url = "jdbc:mysql://localhost:3306/podcast"; // nome do banco de dados
     public String user = "root"; // usuario
     public String password = "#SENAC986525"; //senha do MySQL 
     
     
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password); // sofreu alteração "jdbc:mysql://localhost:3306/cenaflix_db","root","#SENAC986525"
            System.out.println("Conexão realizada com sucesso");
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM podcast"); //variavel da classe ResultSet para receber o valor da consulta)
            rs.next();
            System.out.println(rs.getInt("COUNT(*)"));
            return conn;
        }catch(ClassNotFoundException | SQLException ex){
             System.out.println("Falha na conexão com o banco " + ex.getMessage());
            return conn;
            }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        
        }
        
    }
    
}
