/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class RotiHanariMainClass {
   public static void main(String[] args) {
        RotiTawar r1 = new RotiTawar();
        r1.tampilBahan();
        r1.banyakPesan = 20;
        r1.hargaVar1();
        System.out.println("harga roti tawar varian 1 isi coklat : " + r1.hargaVar1() + ", banyak pesan : " + r1.banyakPesan);
        r1.jumlahPesan();
        System.out.println("total pembelian : " + r1.jumlahPesan());
        r1.banyakPesan = 15;
        r1.hargaVar2();
        System.out.println("harga roti tawar varian 2 isi keju : " + r1.hargaVar2() + ", banyak pesan : " + r1.banyakPesan );
        r1.jumlahPesan();
        System.out.println("total pembelian : " + r1.jumlahPesan());
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        Pizza p1 = new Pizza();
        p1.tampilBahan();
        p1.banyakPesan = 10;
        p1.hargaVar1();
        System.out.println("harga pizza varian 1 : " + p1.hargaVar1() + ", banyak pesan : " + p1.banyakPesan);
        p1.jumlahPesan();
        System.out.println("total pembelian : " + p1.jumlahPesan());
        
    }
}
