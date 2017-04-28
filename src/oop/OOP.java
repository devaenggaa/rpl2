/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Evan
 */
public class OOP {
    
    //inisialisasi atribut
    String nama,npm,kelas;
    double uts,uas,n;
    
    //inisialisasi method data_diri
    public void data_diri() {
        //menampilkan data diri
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("NPM : " + npm);
        //melakukan perhitungan nilai dan mencetak nilai
        n = (uts * 0.7) + (uas * 0.3);
        System.out.println("Nilai : " + n + "\n");
    }
    
    public static void main(String[] args) {

        //inisialisasi objek
        OOP o1, o2, o3, o4, o5;
        o1 = new OOP();
        o2 = new OOP();
        o3 = new OOP();
        o4 = new OOP();
        o5 = new OOP();
        
        //mengisikan variabel dalam objek 1
        o1.nama = "Devangga";
        o1.kelas = "4IA01";
        o1.npm = "11111111";
        o1.uts = 50;
        o1.uas = 50;
        
        //mengisikan variabel dalam objek 2
        o2.nama = "Reza";
        o2.kelas = "4IA02";
        o2.npm = "22222222";
        o2.uts = 60;
        o2.uas = 40;
        
        //mengisikan variabel dalam objek 3
        o3.nama = "Suksmana";
        o3.kelas = "4IA03";
        o3.npm = "33333333";
        o3.uts = 70;
        o3.uas = 30;
        
        //mengisikan variabel dalam objek 4
        o4.nama = "Evan";
        o4.kelas = "4IA04";
        o4.npm = "44444444";
        o4.uts = 80;
        o4.uas = 20;
        
        //mengisikan variabel dalam objek 5
        o5.nama = "Epang";
        o5.kelas = "4IA05";
        o5.npm = "55555555";
        o5.uts = 90;
        o5.uas = 10;
        
        //melakukan pemanggilan method perobjek
        o1.data_diri();
        o2.data_diri();
        o3.data_diri();
        o4.data_diri();
        o5.data_diri();
    }
    
}
