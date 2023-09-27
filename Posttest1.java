/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author USER
 */
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        ArrayList<Orang> ListOrang = new ArrayList<>();

        
        
        ListOrang.add(new Orang("Giselle", "Memotret Pemandangan"));
        ListOrang.add(new Orang("Reli", "Makan Pedas"));
        ListOrang.add(new Orang("Milondi", "Workout"));
        ListOrang.add(new Orang("Haruto", "Nontok Tiktok"));
        ListOrang.add(new Orang("Ajun", "Tidur"));

                for (Orang orang : ListOrang) {
            System.out.println("Nama: " + orang.nama);
            System.out.println("Hobi: " + orang.hobi);
            System.out.println();
        }
    }
}

    

