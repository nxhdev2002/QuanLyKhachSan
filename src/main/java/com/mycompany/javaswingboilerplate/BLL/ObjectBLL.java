/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswingboilerplate.BLL;

/**
 *
 * @author S_member
 */
public class ObjectBLL {
    public static ObjectBLL instance;
    public ObjectBLL() {
        
    }

    public static ObjectBLL getInstance() {
        if (instance == null) {
            instance = new ObjectBLL();
        }
        return instance;
    }
}
