/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lorena
 */
public class OfficesDaoImpl implements OfficesDao{

    Conexion con = new Conexion();
    
    public String createOffice(OfficesModel newOffice) {
        String serverAnswer = null;
        try {
            PreparedStatement preparedStatement = con.getConnetion().prepareStatement("INSERT INTO offices (officecode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory) VALUES(?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, newOffice.getOfficecode());
            preparedStatement.setString(2, newOffice.getCity());
            preparedStatement.setString(3, newOffice.getPhone());
            preparedStatement.setString(4, newOffice.getAddressLine1());
            preparedStatement.setString(5, newOffice.getAddressLine2());
            preparedStatement.setString(6, newOffice.getState());
            preparedStatement.setString(7, newOffice.getCountry());
            preparedStatement.setString(8, newOffice.getPostalCode());
            preparedStatement.setString(9, newOffice.getTerritory());
            
            int numAffectedRows = preparedStatement.executeUpdate();
            
            if (numAffectedRows > 0) {
                serverAnswer = "The office was inserted";
            }
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
            serverAnswer = "There was an error";
        }
        return serverAnswer;
    }

    @Override
    public ArrayList<OfficesModel> readOffices() {
        ArrayList<OfficesModel>officesList = new ArrayList();
       OfficesModel auxOffice;
       try {
           PreparedStatement preparedStatement=con.getConnetion().prepareStatement("SELECT *FROM  offices");
           ResultSet resultSet= preparedStatement.executeQuery();
           while (resultSet.next()){
              auxOffice =new OfficesModel(); 
              
              
              auxOffice.setOfficecode(resultSet.getString(1));
              //System.out.println(resultSet.getString(1));
              auxOffice.setCity(resultSet.getString(2));
              auxOffice.setPhone(resultSet.getString(3));
              auxOffice.setAddressLine1(resultSet.getString(4));
              auxOffice.setAddressLine2(resultSet.getString(5));
              auxOffice.setState(resultSet.getString(6));
              auxOffice.setCountry(resultSet.getString(7));
              auxOffice.setPostalCode(resultSet.getString(8));
              auxOffice.setTerritory(resultSet.getString(9));
              
              officesList.add(auxOffice);
           }
       }catch (SQLException e){
           System.out.println("ERROR"+e.getMessage());
           
       }
        return officesList;
    }

    @Override
    public String updateOffice(OfficesModel auxOffice) {
        //throw new UnsupportedOperationException("Not supported yet.");To change body of generated methods, choose Tools | Templates.
        String serverAnswer = null;
        try{
            PreparedStatement preparedStatement=con.getConnetion().prepareStatement("UPDATE offices SET city=?, phone=?, addressLine1=?, addressLine2=?, state=?, country=?, postalCode=?, territory=? WHERE offices.officeCode = ?");
            preparedStatement.setString(1, auxOffice.getCity());
            preparedStatement.setString(2, auxOffice.getPhone());
            preparedStatement.setString(3, auxOffice.getAddressLine1());
            preparedStatement.setString(4, auxOffice.getAddressLine2());
            preparedStatement.setString(5, auxOffice.getState());
            preparedStatement.setString(6, auxOffice.getCountry());
            preparedStatement.setString(7, auxOffice.getPostalCode());
            preparedStatement.setString(8, auxOffice.getTerritory());
            preparedStatement.setString(9, auxOffice.getOfficecode());
            
            int numAffectedRows = preparedStatement.executeUpdate();
            if (numAffectedRows > 0) {
                serverAnswer = "The office was updated";
            }
        }catch (SQLException e){
           System.out.println("ERROR"+e.getMessage());   
           serverAnswer = "There was an error";
       }
        return serverAnswer;
    }

    @Override
    public String deleteOffice(String officeCode) {
        //throw new UnsupportedOperationException("Not supported yet."); To change body of generated methods, choose Tools | Templates.
        String serverAnswer = null;
        try{
            PreparedStatement preparedStatement = con.getConnetion().prepareStatement("DELETE FROM offices WHERE officeCode = ?");
            preparedStatement.setString(1, officeCode);
            
            int numAffectedRows = preparedStatement.executeUpdate();
            if (numAffectedRows > 0) {
                serverAnswer = "The office was correctly deleted!";
        }
    }catch (SQLException e){
        System.out.println("ERROR"+e.getMessage());   
           serverAnswer = "There was an error";
    }
    return serverAnswer;
}

}