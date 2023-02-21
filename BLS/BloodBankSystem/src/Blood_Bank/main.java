/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Blood_Bank;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kasun Dhananjaya
 */

public class main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        LoginToSicurityDB login = new LoginToSicurityDB();
        login.Retriew("User", "ICT");
        System.out.println(login.getQureyout());
        
        
             
}
    
}