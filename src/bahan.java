public abstract class bahan {
    private double tepungTerigu, gulaPasir, Butter, Ragi, susuBubuk, susuCair, Telur, esBatu;

//  Berat Bahan
    protected double beratKemasanTepungTerigu = 1000,
        beratKemasanGulaPasir = 1000,
    beratKemasanButter = 500,
    beratKemasanRagi = 11,
    beratSusuBubuk = 1000,
    beratKemasanSusuCair = 1000,
    beratKemasanTelur = 1000,
    beratKemasanEsBatu = 1000;

// Harga Bahan Roti
    protected double hargaTepungTerigu = 40000,
    hargaGulaPasir = 25000,
    hargaButter = 23000,
    hargaRagi = 5000,
    hargaSusuBubuk = 39000,
    hargaSusuCair = 24000,
    hargaTelur = 23000,
    hargaEsBatu = 2000;

//    Toping
    protected double keju, coklat, krimVanilla, selaiRedBean, sosis, smokedBeef, bawangBombay;
//Berat Bahan Toping
    protected double beratKeju = 250,
    beratCoklat = 500,
    beratKrimVanilla = 500,
    beratSelaiReadBean = 500,
    beratSosis = 1000,
    beratSmokedBeef = 1000,
    beratBawangBombay = 500;

//    Harga Toping
    protected double hargaKeju = 31000,
    hargaCoklat = 29000,
    hargaKrimVanilla = 30000,
    hargaSelaiRedBean = 25000,
    hargaSosis = 80000,
    hargaSmokedBeef = 90000,
    hargaBawangBombay = 40000;




    double hitungBeratBahan(){
        return 0;
    };

    void hitungHargaBeli(){
    };

    protected abstract double totalHargaBeli();

    protected abstract  void tampilBahan();
}
