/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import PackInterface.*;
public class RotiTawar extends bahan implements Varian2 {
    int banyakPesan ;
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
    public void jumlahPesan() {
      double harga = this.banyakPesan * this.hargaVar1();
        System.out.println("total harga : " + harga);  
    }
    
    double hargaVar1(){
        return ((this.totalHargaBeli() + this.hargaCoklatV1)* 40 /100) + (this.totalHargaBeli() + this.hargaCoklatV1) ;
    }
    
    double hargaVar2(){
        return ((this.totalHargaBeli() + this.hargaKejuV2)* 40 / 100) + ( this.totalHargaBeli() + this.hargaKejuV2);
    }
    
    public static void main(String[] args) {
        RotiTawar test = new RotiTawar();
        test.banyakPesan = 20;
        test.hargaVar1();
        System.out.println("harga roti tawar varian 1 isi coklat : " + test.hargaCoklatV1 + ", banyak pesan : " + test.banyakPesan);
        test.jumlahPesan();
    }
}
