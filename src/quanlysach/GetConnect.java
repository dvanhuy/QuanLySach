/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class GetConnect {

    public static Connection getConnection(){
        String url="jdbc:sqlserver://LAPTOP-ATNHOQI8\\SQLEXPRESS:1433;databaseName=QuanLySach";
        String userName="sa";
        String password="12345";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            return DriverManager.getConnection(url,userName,password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Ket noi loi");
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
