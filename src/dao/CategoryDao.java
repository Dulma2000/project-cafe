/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Category;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dulma
 */
public class CategoryDao {
    public static void save(Category category){
        String query="insert into category(name) values('"+category.getName()+"')";
        DbOperations.setDataOrDelete(query, "Category added successfully");
    }
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category>arrayList=new ArrayList<>();
        try{
            ResultSet rs=DbOperations.getData("select*from category ");
             while(rs.next())  {
                 Category category=new Category();
                 category.setId(rs.getInt("id"));
                 category.setName(rs.getString("name"));
                 arrayList.add(category);
             }     
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return arrayList;
    }
    public static void delete(String id){
        String query="delete from category where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "category deleted successfully");
    }
    
}
