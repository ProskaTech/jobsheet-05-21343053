//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js05.java.khalilul_afwan;

import javax.swing.JOptionPane;

/**
 *
 * @author KHALILUL
 */
public class GetInputFromKeyboard2 {
    public static void main(String[] args){
        String name = "" , hobi = "";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hobi = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hobi Anda " + hobi + ". "
                + "Hobi yang bagus " +name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda" + hobi + ". Hobi yang bagus " + name);
    }
}
