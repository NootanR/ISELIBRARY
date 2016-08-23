/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary;

import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author rnootan
 */
import javax.swing.JOptionPane;
public class Connector {
    public static Connection Connr;
    public  Connector(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
          // JOptionPane.showMessageDialog(null,"Internet Connection Sucessful");
           
        }
        catch(ClassNotFoundException cnfe){
                JOptionPane.showMessageDialog(null,"Connection "+cnfe);
            }
        String url ="jdbc:mysql://localhost:3306/iselibrary";
        try{
            Connr = DriverManager.getConnection(url,"root","tiger");
           // JOptionPane.showMessageDialog( null,"Database connected");
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null,"No Database"+se);
        }
        }

    /**
     *
     */
    public static void  CheckConnect(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           JOptionPane.showMessageDialog(null,"Internet Connection Sucessful");
           
        }
        catch(ClassNotFoundException cnfe){
                JOptionPane.showMessageDialog(null,"Connection "+cnfe);
            }
        String url ="jdbc:mysql://localhost:3306/iselibrary";
        try{
            Connr = DriverManager.getConnection(url,"root","tiger");
            JOptionPane.showMessageDialog( null,"Database connected");
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null,"No Database"+se);
        }
        }
        
       public static Connection obtain()
        {
        return Connr;
        }
        
    }
    

