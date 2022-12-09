package com.ky.jdbc;

import java.sql.*;

public class JDBCTest {
    public void getUsers(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb56", "root", "");
            String sql = "SELECT * FROM users";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("username")+" "+rs.getString("password"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void addUser(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb56", "root", "");
            String sql = "INSERT INTO users VALUES (null, 'admin', 'aa')";
//            String sql="CREATE TABLE users (id int PRIMARY KEY AUTO_INCREMENT,username varchar(255) NOT NULL,password varchar(255),  UNIQUE (username))";

            PreparedStatement ps = conn.prepareStatement(sql);
            int status = ps.executeUpdate();
            System.out.println("query execute successfully");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void deleteUser(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb56", "root", "");
            String sql = "DELETE FROM users WHERE id=?";
            int id=4;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            int status = ps.executeUpdate();
            System.out.println("data deleted successfully");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void updateUser(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb56", "root", "");
            int id=1;
            String username="aa";
            String password="p1";
            String sql = "UPDATE users SET username=?, password=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ps.setInt(3,id);
            int status = ps.executeUpdate();
            System.out.println("data updated successfully");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }



    public static void main(String[] args) {
    new JDBCTest().updateUser();
    }
}
