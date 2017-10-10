
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexao {
    Connection conn = null;
     public static Connection ConectDb (){
     try{
      Class.forName("org.sqlite.JDBC");
      Connection conn = DriverManager.getConnection("jdbc:sqlite:BoletimUnifacs.sqlite");
       //JOptionPane.showMessageDialog(null,"Bem vindo, Banco de dados conectado");
        return conn ;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         return null;
     }
     }
     
     }

