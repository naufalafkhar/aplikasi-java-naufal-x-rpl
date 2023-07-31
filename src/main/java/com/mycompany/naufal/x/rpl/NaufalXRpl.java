/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.naufal.x.rpl;

import java.util.Scanner;

/**
 *
 * @author HanifRamadhan
 */
public class NaufalXRpl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int itu digunakan untuk angka
        // string itu digunakan untuk huruf
        String nama;
        int bilangan1;
        int bilangan2;
        int hasil;
        System.out.println("KALKULATOR PENAMBAHAN");
        
        System.out.print("Masukkan Nama Kamu: ");
        nama = input.next();
        
        System.out.println("----------------------------------------------");
        System.out.print("BILANGAN PERTAMA: ");
        bilangan1 = input.nextInt(); 
        
        System.out.println("--------------------------------------------");
        System.out.print("BILANGAN KEDUA: ");
        bilangan2 = input.nextInt();
        
        System.out.println("----------------------------------------------");
        hasil=bilangan1+bilangan2;
        System.out.print("{nama}, ");
        System.out.println("HASILNYA ADALAH " + hasil);
    }
}
