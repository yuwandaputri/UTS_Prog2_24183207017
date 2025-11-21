/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Scanner;

//kelas utama (MainProgram)
public class MainProgram {
    public static void main (String[] args){
        //variabel lokal scanner
        Scanner scanner = new Scanner(System.in);
        //variabel lokal untuk input
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        int pilihan;
        do {
            //menu sederhana
            System.out.println("===== MENU ===== ");
            System.out.println("1. Tambah Data Buku");
            System.out.println("2. Tampilkan Data Buku");
            System.out.println("3. Keluar");
            System.out.println("Pilih Menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan){
                case 1:
                    //menambah data buku
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Nama Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    //membuat objek baru dengan kontruktor berparameteer
                    Buku bukuBaru = new Buku(judul, penulis, ISBN, tahunTerbit);
                    //menambah ke list buku
                    daftarBuku.add(bukuBaru);
                    
                    System.out.println("Data Buku Berhasil ditambahkan");
                    break;
                
                case 2:
                    //menampilkan semua data buku
                    if (daftarBuku.isEmpty()){
                        System.out.println("Belum ada data buku");
                    }
                    else{
                        System.out.println("Daftar Buku: ");
                        for (Buku b : daftarBuku){
                            b. tampilkanData();
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Keluar dari program");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid");    
            }
        }while (pilihan != 3);
        
        
        scanner.close();
    }
}

