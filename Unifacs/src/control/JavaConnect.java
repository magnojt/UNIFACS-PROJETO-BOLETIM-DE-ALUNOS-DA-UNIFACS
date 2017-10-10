
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class JavaConnect {
    Connection conn = null;
    public static Connection ConectDb (){
     try{
      Class.forName("org.sqlite.JDBC");
      Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Regina\\Documents\\NetBeansProjects\\Unifacs\\unifacs.sqlite");
       //JOptionPane.showMessageDialog(null,"Bem vindo, Banco de dados conectado");
        return conn ;
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
         return null;
     }
     }
}
