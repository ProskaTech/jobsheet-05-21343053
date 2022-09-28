//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js05.java.khalilul_afwan;

import java.util.Scanner;

/**
 *
 * @author KHALILUL
 */
public class Tugas01bJS5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Word 1: ");
        String word1 = in.nextLine();
        
        System.out.print("Enter Word 2: ");
        String word2 = in.nextLine();
        
        System.out.print("Enter Word 3: ");
        String word3 = in.nextLine();
        
        System.out.println("" + word1 + " " + word2 + " " + word3);

        in.close();
    }
}
