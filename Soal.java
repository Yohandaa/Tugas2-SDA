package com.sda.tugas2;
import java.util.LinkedList;

public class Soal {
    public static void main(String[] args) {
        LinkedList <String> nama = new LinkedList<String>();
        nama.add("Y");
        nama.add("O");
        nama.add("H");
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("A");
        System.out.println("Nama\t:"+nama+", Ukuran :" +nama.size());
        //Penambahan karakter lain
        nama.add(0,"K");
        nama.add(1,"H");
        nama.add(4,"");
        System.out.println("output sesudah tambah karakter lain dari nama\t:"+nama+", Ukuran :" +nama.size());
        //sisipan karakter lain
        nama.set(1,"I");
        nama.set(8,"K");
        System.out.println("output sesudah sisipan karakter lain dari nama\t:"+nama+", Ukuran :" +nama.size());
        //hapus karakter yang diinginkan
        nama.remove(1);
        nama.remove(8);
        nama.removeLast();
        System.out.println("output sesudah remove karakter lain dari nama\t:"+nama+", Ukuran :" +nama.size());
        System.out.println("Is List empty?\t " +nama.isEmpty());
        //fungsi push
        nama.push("A");
        nama.push("N");
        System.out.println("output nama sesudah fungsi push\t:"+nama+", Ukuran :" +nama.size());
        //fungsi pop
        nama.pop();
        System.out.println("output nama sesudah fungsi pop\t:"+nama+", Ukuran :" +nama.size());
       

    }
}
