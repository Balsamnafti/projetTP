/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import Model.User;
import configs.crude;
import java.sql.*;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author root
 */
public class UserController {
    private crude crude = new crude();
       
    public boolean insert(User e) {
        String sql =  "INSERT INTO user(login, password) VALUES ('"
                + e.getLogin()+ "','" +e.getPwd()+ "')";
        System.out.println(sql);
        return crude.exeInsert(sql);   
    }
    
    public boolean update(int id, User e) {
        String sql = "UPDATE user SET login = '"+ e.getLogin()+ "',"
                + " password = '"+ e.getLogin()+ "' WHERE id= "+ id;
        System.out.println(sql);
        return crude.exeUpdate(sql);    
    }
    
    public boolean delete(User e) {
        String sql = "DELETE FROM user WHERE id= "+ e.getId();
        System.out.println(sql);
        return crude.exeDelete(sql);    
    }
       
    public List<User> getAll() {
    try {
            String sql = "SELECT * FROM user";
            ResultSet rs = crude.exeRead(sql);
            List<User> liste = new ArrayList<User>();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setFirstname(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setLogin(rs.getString(4));
                user.setPwd(rs.getString(5));
               
                liste.add(user);
            }
            return liste;
        } catch (SQLException ex) {
                System.err.println(ex.getMessage());
             JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);

            return null;
        }
    }

  public User findByLoginPwd(String login, String pwd){
      User user=null;
      try{
          String sql = "SELECT * FROM user WHERE login = '"+login+"' AND pwd = '"+pwd+"'";
          ResultSet rs = crude.exeRead(sql);
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt(1));
                user.setFirstname(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setLogin(rs.getString(4));
                user.setPwd(rs.getString(5));
            }
            
      }catch (SQLException ex){
          System.err.println(ex.getMessage());
          JOptionPane.showMessageDialog(null,"Erreur AdministratorDAO","Erreur",JOptionPane.ERROR_MESSAGE );
          return null;
      }
      return user;
  }
}
