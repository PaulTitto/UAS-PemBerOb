
import PackInterface.Varian2;
import PackInterface.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khoirul
 */
public  class Pizza extends bahan implements Varian2 {
    int banyakPesan ;
    double totalKeuntungan = 40/100;
    int HargaSatuan;
    double banyakAdonan = 1950 / 190;
    double banyakTepung = 1000 / banyakAdonan;
    double banyakGula = 100 / banyakAdonan;
    double banyakButter = 100/banyakAdonan;
    double banyakRagi = 20/banyakAdonan;
    double banyakSusuBubuk = 200/banyakAdonan;
    double banyakSusuCair = 180/banyakAdonan;
    double banyakTelur = 50/banyakAdonan;
    double banyakEs = 300/banyakAdonan;
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

    @Override
    protected double totalHargaBeli() {
          return this.hargaTepungroti + this.hargaGularoti + this.hargaButterRoti + this.hargaRagiroti + this.hargaSusuBubukroti + this.hargaSusuCairroti + this.hargaTelurroti + this.hargaEsroti;
    }

    @Override
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

    @Override
    public int jumlahPesan() {
      int harga = this.banyakPesan * this.hargaVar1();
      return harga;  
    }



    double getBanyakTelur(){
        return this.banyakTelur;
    }

    @Override
    double hitungBeratBahan(){
        return banyakTepung + banyakGula + banyakButter + banyakRagi + banyakSusuBubuk + banyakSusuCair + banyakTelur + banyakEs;
    }
    
    @Override
    void hitungHargaBeli(){ 
        System.out.println("harga beli bahan : " + this.totalHargaBeli());
    }

    
    double hargaVar1(){
        return ((this.totalHargaBeli() + this.hargaSosisV1)* this.totalKeuntungan) + (this.totalHargaBeli() + this.hargaSosisV1) ;
    }
    
    double hargaVar2(){
        return ((this.totalHargaBeli() + this.hargaKejuV2)* this.totalKeuntungan) + ( this.totalHargaBeli() + this.hargaKejuV2);
    }
    
     public static void main(String[] args) {
        Pizza test = new Pizza();
        test.tampilBahan();
        test.banyakPesan = 10;
        test.hargaVar1();
        System.out.println("harga pizza 1 isi coklat : " + test.hargaSosisV1+ ", banyak pesan : " + test.banyakPesan);
        test.jumlahPesan();
    }
}
