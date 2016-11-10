
package ControleBanco;

import bean.FormAgendamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class ControlaBd {
    //public static Connection con =null;
    public static Connection conectaBd() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbPet","root","rafaelajulia");
            JOptionPane.showMessageDialog(null,"Conectado com o banco");
            return con;
            
        } catch (ClassNotFoundException ex){
            System.out.println("Classa não encontrada, adicione o driver nas bibliotecas");
            Logger.getLogger(FormAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch(SQLException e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
        return null;
        
    }
}
