/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import Varian.Varian2;
import Varian.Varian3;

/**
 *
 * @author USER
 */
//public class RotiManis {
//
//    private static class bahan {
//
//        public bahan() {
//        }
//    }
//
//    private static interface Varian2 {
//    }
public class RotiManis extends bahan implements Varian3 {
     int banyakPesan ;
    double totalKeuntungan = 40/100;
     int HargaSatuan;
    double banyakAdonan = 2350 / 50;
    double banyakTepung = 1000 / banyakAdonan;
    double banyakGula = 150 / banyakAdonan;
    double banyakButter = 150/banyakAdonan;
    double banyakRagi = 20/banyakAdonan;
    double banyakSusuBubuk = 300/banyakAdonan;
    double banyakSusuCair = 250/banyakAdonan;
    double banyakTelur = 80/banyakAdonan;
    double banyakEs = 400/banyakAdonan;
    double hargaTepungroti = (this.hargaTepungTerigu/ this.beratKemasanTepungTerigu) * this.banyakTepung;
    double hargaGularoti = (this.hargaGulaPasir / this.beratKemasanGulaPasir) * this.banyakGula;  
    double hargaButterRoti = (this.hargaRagi / this.beratKemasanRagi) * this.banyakRagi;
    double hargaRagiroti = (this.hargaRagi / this.beratKemasanRagi) * this.banyakRagi;
    double hargaSusuBubukroti = (this.hargaSusuBubuk / this.beratSusuBubuk) * this.banyakSusuBubuk;
    double hargaSusuCairroti = (this.hargaSusuCair / this.beratKemasanSusuCair) * this.banyakSusuCair;
    double hargaTelurroti =(this.hargaTelur / this.beratKemasanTelur) * this.banyakTelur;
    double hargaEsroti = (this.hargaEsBatu / this.beratKemasanEsBatu) * this.banyakEs;
    double hargaSosisV1 = (this.hargaSosis / this.beratSosis) * 50 ;
    double hargaKejuV2 = (this.hargaKeju / this.beratKeju) * 30;
    double hargaSmokedbBeefV3 = (this.hargaSmokedBeef / this.beratSmokedBeef * 50);
    double hargaBawangBombayV4 = (this.hargaBawangBombay / this.beratBawangBombay) * 30;


    protected double totalHargaBeli() {
          return this.hargaTepungroti + this.hargaGularoti + this.hargaButterRoti + this.hargaRagiroti + this.hargaSusuBubukroti + this.hargaSusuCairroti + this.hargaTelurroti + this.hargaEsroti;
    }
    protected void tampilBahan() {
        System.out.println("komposisi pizza ");
        System.out.println("tepung : " + this.banyakTepung + " gram");
        System.out.println("gula pasir : " + this.banyakGula + " gram");
        System.out.println("butter : " + this.banyakButter + " gram");
        System.out.println("ragi : " + this.banyakRagi + " gram");
        System.out.println("susu bubuk : " + this.banyakSusuBubuk + " gram");
        System.out.println("susu cair : " + this.banyakSusuCair + " gram");
        System.out.println("telur : " + this.banyakTelur + " gram");
        System.out.println("es batu : " + this.banyakEs + " gram");
        System.out.println("total bahan untuk satu bungkus roti : " + this.hitungBeratBahan() + " gram");
    }
//    public int jumlahPesan() {
//      return (int) (this.banyakPesan * this.hargaVar1());
//    }



    double getBanyakTelur(){
        return this.banyakTelur;
    }


    @Override
    public double jumlahPesan() {
        return (int) (this.banyakPesan * this.hargaVar1());
    }

    double hitungBeratBahan(){
        return banyakTepung + banyakGula + banyakButter + banyakRagi + banyakSusuBubuk + banyakSusuCair + banyakTelur + banyakEs;
    }
    void hitungHargaBeli(){ 
        System.out.println("harga beli bahan : " + this.totalHargaBeli());
    }

    
    double hargaVar1(){
        return ((this.totalHargaBeli() + this.hargaSosisV1)* this.totalKeuntungan) + (this.totalHargaBeli() + this.hargaSosisV1) ;
    }
    
    double hargaVar2(){
        return ((this.totalHargaBeli() + this.hargaKejuV2)* this.totalKeuntungan) + ( this.totalHargaBeli() + this.hargaKejuV2);
    }

//    @Override
//    public int Jumlahpesan2() {
//
//    }

    @Override
    public void varian3(int jumlahPesan) {
        System.out.println((this.banyakPesan * this.hargaVar1()));
    }
//    public static void main(String[Roti manisss] args) {
//        Rotimanisss test = new Rotimanisss();
//        test.tampilBahan();
//        test.banyakPesan = 10;
//        test.hargaVar1();
//        System.out.println("harga Rotimanisss 1 isi coklat : " + test.hargaSosisV1+ ", banyak pesan : " + test.banyakPesan);
//        test.jumlahPesan();
//    }
    }
