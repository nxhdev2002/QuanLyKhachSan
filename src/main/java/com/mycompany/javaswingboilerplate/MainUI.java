/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswingboilerplate;

import javax.swing.*;
/**
 *
 * @author S_member
 */
public class MainUI extends javax.swing.JFrame {
    public MainUI() {
        this.setBounds(0,0,500,600);
        initComponents();
    }
    
    public void initComponents() {
        JPanel p = new JPanel();
        p.setLayout(null);
        
        JTextField txtUser = new JTextField();
        JTextField txtPassword = new JTextField();
        
        txtUser.setBounds(40,100,100,60);
        txtPassword.setBounds(70,100,100,60);
        
        p.add(txtUser);
        p.add(txtPassword);
        
        this.add(p);
    }
}
