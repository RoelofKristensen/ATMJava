package jd522_sa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rjnkr
 */
public  class Account {
    int id;
    double balance;
    Date dateCreated;   
    public Account(){
    }
    public int getID(){
        return id;
    }
    public void setID(int ID){
        this.id = ID;
    }
    
    public double getBalance(){
        return balance;
    }
    public void setBalance(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm";
            Connection conn = DriverManager.getConnection(url, "root","MySQL@Enter15");
            ResultSet result = conn.createStatement().executeQuery("SELECT * "
                    + "FROM userinfo WHERE ID= "+ id + ";");
            if(result.next()) {
                balance =  result.getFloat("currentbalance");}
        }catch(SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }catch (ClassNotFoundException cE){
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
    }
    
    public Date getDate(){
        return dateCreated;
    }
    public void setDate(){
        dateCreated = new Date();
    }
    
    public boolean Withdraw(double withdraw){
        boolean Success = false;
        if((getBalance() - withdraw)> 0){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/atm";
                Connection conn = DriverManager.getConnection(url, "root","MySQL@Enter15");

                PreparedStatement stat = conn.prepareStatement("UPDATE userinfo "
                + "SET currentbalance = '"+(getBalance() - withdraw)+"'WHERE ID ="+ id + ";");
                
                stat.executeUpdate();
                Success = true;
            }catch(SQLException e){
                System.out.println("SQL Exception: "+ e.toString());
            }catch (ClassNotFoundException cE){
                System.out.println("Class Not Found Exception: "+ cE.toString());
            }
        }else{
           JOptionPane.showMessageDialog(null, "insufficient funds");
        }
        return Success;
    }
    
    public boolean Deposit(double deposit){
        boolean Success = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm";
            Connection conn = DriverManager.getConnection(url, "root","MySQL@Enter15");

            PreparedStatement stat = conn.prepareStatement("UPDATE userinfo SET "
            + "currentbalance = '"+(getBalance() + deposit)+"'WHERE ID ="+ id + ";");
            stat.executeUpdate();
            Success = true;
        }catch(SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }catch (ClassNotFoundException cE){
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
        return Success;
}
    
    private String name() {
        String Name = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/atm";
            Connection conn = DriverManager.getConnection(url, "root","MySQL@Enter15");
            
            ResultSet result = conn.createStatement().executeQuery("SELECT * FROM userinfo WHERE ID= "+ id + ";");
            
            if(result.next()) {
                Name =  result.getString("username");
          
            }  
        }catch(SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }catch (ClassNotFoundException cE){
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
        return Name;
    }
    
    public void printStatement(){
        setBalance();
        setDate();
        JOptionPane.showMessageDialog(null, "Name: "+name()+
                "\nCurrent Balance:"+ getBalance() +
                "\nCurrent date: "+getDate());
    }   
}
