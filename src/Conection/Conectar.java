package Conection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ruth
 */
public class Conectar {
   Connection connection = null;

   public Connection Conexion()  {
      try{
         Class.forName("org.gjt.mm.mysql.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost/arantza","root","");
        System.out.println("OK");
      }
      catch(SQLException e){
         System.out.println(e);
         
      } catch (ClassNotFoundException ex) {
           Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
           
       }
       return connection;
   }

    public void connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Connection getConn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
