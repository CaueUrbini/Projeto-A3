/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
    public class ModuloConexao {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/db_deposito";
        String user = "root";
        String password = "25012001";
        try {
            Class .forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } 
        catch (Exception e) {
            return null;
                
        }
    
    }
}

