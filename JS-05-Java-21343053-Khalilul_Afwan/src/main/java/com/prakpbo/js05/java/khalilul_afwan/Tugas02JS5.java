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
public class Tugas02JS5 {
    public static void main(String[] args){
        String word1 = "" , word2 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word 1 : ");
        word2 = JOptionPane.showInputDialog("Enter word 2 : ");
        
        String msg = " " + word1 + " " + word2 + " Hello";
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(" " + word1 + " " +word2 + " Hello");
    }
}