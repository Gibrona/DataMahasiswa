/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datamahasiswa;

/**
 *
 * @author Comp 4
 */
public class DataMahasiswa {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Mahasiswa mahasiswa1 = new Mahasiswa("Alice", "123456789", "Teknik Informatika", 2022);
        Mahasiswa mahasiswa2 = new Mahasiswa("Bob", "987654321", "Sistem Informasi", 2021);

        // Menampilkan informasi mahasiswa
        System.out.println("Mahasiswa 1:");
        mahasiswa1.tampilkanInfo();
        System.out.println();

        System.out.println("Mahasiswa 2:");
        mahasiswa2.tampilkanInfo();
        System.out.println();

        // Mengubah informasi mahasiswa
        mahasiswa1.setNama("Charlie");
        mahasiswa1.setAngkatan(2023);

        // Menampilkan informasi mahasiswa setelah diubah
        System.out.println("Setelah diubah:");
        mahasiswa1.tampilkanInfo();
    }
    }
    

