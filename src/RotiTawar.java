/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import PackInterface.*;

public  class RotiTawar extends bahan implements Varian2, Varian22 {
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
    double hargaCoklatV1 = (this.hargaCoklat / this.beratCoklat) * 80 ;
    double hargaKejuV2 = (this.hargaKeju / this.beratKeju) * 80;

    public double getBanyakTelur() {
        return banyakTelur;
    }

    
    @Override
    protected double totalHargaBeli() {
        return this.hargaTepungroti + this.hargaGularoti + this.hargaButterRoti + this.hargaRagiroti + this.hargaSusuBubukroti + this.hargaSusuCairroti + this.hargaTelurroti + this.hargaEsroti;
    }

    @Override
    protected void tampilBahan() {
        System.out.println("komposisi roti tawar ");
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
    
    @Override
    double hitungBeratBahan(){
        return banyakTepung + banyakGula + banyakButter + banyakRagi + banyakSusuBubuk + banyakSusuCair + banyakTelur + banyakEs;
    }
    
    @Override
    void hitungHargaBeli(){ 
        System.out.println("harga beli bahan : " + this.totalHargaBeli());
    }
  
    
    @Override
    public int jumlahPesan() {
      double harga = this.banyakPesan * this.hargaVar1();
      return (int) harga;
    }
    
    double hargaVar1(){
        return ((this.totalHargaBeli() + this.hargaCoklatV1)* this.totalKeuntungan) + (this.totalHargaBeli() + this.hargaCoklatV1) ;
    }
    
    double hargaVar2(){
        return ((this.totalHargaBeli() + this.hargaKejuV2)* this.totalKeuntungan) + ( this.totalHargaBeli() + this.hargaKejuV2);
    }

    @Override
    public int Jumlahpesan2() {
      double harga = this.banyakPesan * this.hargaVar2();
      return (int) harga;
    }
   
}
