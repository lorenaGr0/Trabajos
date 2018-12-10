/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author mary
 */
public interface OfficesDao {
    
    public String createOffice(OfficesModel newOffice); //Recibe un objeto OfficeModel y crea una nueva oficina en la base de datos
    
    public ArrayList<OfficesModel> readOffices(); //Devuelve un listado de las oficinas almacenadas de la tabla Offices
    
    public String updateOffice(OfficesModel auxOffice); //Recibe un objeto de tipo OfficeModel y actualiza una oficina
    
    public String deleteOffice(String officeCode); //Borra una oficina de la tabla offices de acuerdo al ID recibido
    
    
        
}
