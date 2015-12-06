/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softinvent;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruth
 */

public class Conexxion {
    private Connection connection;
    private String error = null;

    
   
 

    public Conexxion(String user, String pass, String bd, String host) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            this.connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + bd, user, pass);

        } catch (ClassNotFoundException | SQLException ex) {

            this.error = ex.getMessage();

        }

    }

   

    public String getError() {


        return this.error;


    }

    public Connection getConexion() {

        return this.connection;

    }

    public void Cerrar() {
        try {

            this.connection.close();
        } catch (SQLException ex) {

            Logger.getLogger(Conexxion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}

   

    
   

    