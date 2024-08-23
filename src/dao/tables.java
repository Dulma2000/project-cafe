/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Dulma
 */
public class tables {
    public static void main(String[] args){
        try{
            String UserTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable="create table product(Pid int(11) primary key,Pname varchar(25),Pqty int(11),Pprice int(11),Pcat varchar(30))";
            DbOperations.setDataOrDelete(UserTable, "UserTable created successfully");
            DbOperations.setDataOrDelete( categoryTable, "Category Table created successfully");
            DbOperations.setDataOrDelete(productTable, "productTable created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
}
