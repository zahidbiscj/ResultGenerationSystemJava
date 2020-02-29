/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultgenerationsystems;

import java.sql.*;

///mysql er shathe connection 

public class OracleConnection {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1/cpi","root","");
            System.out.println("connected");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students");
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
