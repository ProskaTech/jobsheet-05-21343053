//Created by 21343053_Khalilul Afwan

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.prakpbo.js05.java.khalilul_afwan;

import java.util.Scanner;

/**
 *
 * @author KHALILUL
 */
public class Scanner1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukkan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama  : " + nama +
                           "\nNim   : " + NIM +
                           "\nNilai : " + nilai);

        in.close();
    }
}
