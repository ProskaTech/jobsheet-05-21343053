//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prakpbo.js05.java.khalilul_afwan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author KHALILUL
 */
public class GetInputFromKeyboard1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hobi = "";
        
        try{
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda : ");
            hobi = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
        
        System.out.println("Jadi Hobi Anda " + hobi + ". Hobi yang bagus " + name + ".");
    }
}
