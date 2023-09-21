/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswingboilerplate.DAL;

/**
 *
 * @author S_member
 */
public class ObjectDAL {
    private static ObjectDAL instance;
    
    private ObjectDAL() {
    }
    
    public static ObjectDAL getInstance() {
        if (instance == null){
            instance = new ObjectDAL();
        }
        return instance;
    }
}
