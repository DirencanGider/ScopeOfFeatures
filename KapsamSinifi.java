public class KapsamSinifi {
    private int privateDegisken = 30;  //  Private alan ekledik.  //  1

    public KapsamSinifi() {  //  Constructor ekledik. Fakat ders videosunda içi boş olduğu için içini ve altındaki this satırını sildim.  //  2
        System.out.println("privateDegisken = " + privateDegisken);  //  5
    }

    public void onileCarp() {  // Fonksiyon ekledik.  //  3
        int privateDegisken = 10;  /*  Main metodu içerisinde onileCarp fonk. çağırdığımızda, üstte ilk tanımladığımız
                                       privateDegisken = 30 yerine bu fonksiyon içerisinde tanımladığımız 10 sayısını baz alarak
                                       işlem yapar.
                                       Bu privateDegisken = 10'u yoruma alır ve tekrar fonksiyonu Main classında çağırırsak bu sefer
                                       java ilk tanımladığımız 30 sayısını baz alarak işlemlerini gerçekleştirir.

                                       Yani bizim bu classta aynı isimli iki farklı değişkenimiz var ama java en yerel yani en lokal olan
                                       değişkene öncelik verir. Yani metodun içerisinde tanımlanmış privateDegisken = 10 değişkeni
                                       en lokal değişkendir. */  //  6

        for (int i = 1; i < 6 ; i++) {

            System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));  //  4

        }
    }

    // Şimdi bunları inner class oluşturarak detaylı bir şekilde öğrenmeye çalışalım. KapsamSinifi2 adında class oluşturup oradan devam edeceğiz.  //  9

}
