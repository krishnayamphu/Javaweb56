package com.ky.dao;

import com.ky.jdbc.ConnectDB;
import com.ky.jdbc.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO {
    public static ArrayList<User> getUsers(){
        ArrayList<User> users=new ArrayList<>();
        Connection conn = null;
        try {
            conn = ConnectDB.connect();
            String sql = "SELECT * FROM users";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                users.add(new User(rs.getInt("id"),rs.getString("username"),rs.getString("password")));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return users;
    }
    public static User getUser(int id){
        User user = null;
        Connection conn = null;
        try {
            conn = ConnectDB.connect();
            String sql = "SELECT * FROM users WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                user=new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return user;
    }
    public static void addUser(User user) {
        Connection conn = null;
        try {
            conn = ConnectDB.connect();
            String sql = "INSERT INTO users VALUES (null,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            int status = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public static void deleteUser(int id){
        Connection conn = null;
        try {
           conn=ConnectDB.connect();
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            int status = ps.executeUpdate();
            System.out.println("data deleted successfully");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public static void updateUser(User user){
        Connection conn = null;
        try {
           conn=ConnectDB.connect();
            String sql = "UPDATE users SET username=?, password=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setInt(3,user.getId());
            int status = ps.executeUpdate();
            System.out.println("data updated successfully");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
