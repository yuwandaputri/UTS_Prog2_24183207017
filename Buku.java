/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

//Kelas data/objek
public class Buku {
   //variabel global/atribut
   String judul;
   String penulis;
   String ISBN;
   int tahunTerbit;
   
   //Konstruktor default (tanpa parameter)
   public Buku(String judul, String penulis, String ISBN){
       this.judul = " ";
       this.penulis = " ";
       this.ISBN = " ";
   }  
   
   //Konstruktor berparameter
   public Buku(String judul, String penulis, String ISBN, int tahunTerbit){
       this.judul = judul;
       this.penulis = penulis;
       this.ISBN = ISBN;
       this.tahunTerbit = tahunTerbit;
   }   
   
   //method set dan get disetiap atribut
   public void setJudul(String judul){
       this.judul = judul;
   }
   
   public String getjudul(){
       return judul;
   }
   
   public void setPenulis(String penulis){
       this.penulis = penulis;
   }
   
   public String getPenulis(){
       return penulis;
   }
   
    public void setISBN(String ISBN){
       this.ISBN = ISBN;
   }
   
   public String getISBN(){
       return ISBN;
   }
   
    public void settahunTerbit(int tahunTerbit){
       this.tahunTerbit = tahunTerbit;
   }
   
   public int gettahunTerbit(){
       return tahunTerbit;
   }
   
   //method tambahan 
   public void tampilkanData(){
       System.out.println("Judul : "+judul);
       System.out.println("Penerbit : "+penulis);
       System.out.println("ISBN : "+ISBN);
       System.out.println("Tahun Terbit : "+tahunTerbit);
       
   }
}
