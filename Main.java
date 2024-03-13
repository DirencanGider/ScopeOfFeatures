public class Main {
    public static void main(String[] args) {

        // KapsamSinifi kapsamSinifi = new KapsamSinifi();  //  7
        // kapsamSinifi.onileCarp();  //  8

        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif(); /* KapsamSinifi2 class'ı içerisinde yer alan
                                                                                     DahiliSinif inner class'ı static olarak
                                                                                     tanımlanmadığı için, içerisinde yer alan
                                                                                     onileCarp() metodunu burada kullanabilmemiz için
                                                                                     bu şekilde obje oluşturmamız gerekiyor. */  //  14
        kapsam.onlineCarp();  /* Bu durumda, privateDegisken adlı değişken değeri, KapsamSinifi2 class'ı için tanımlanmış olan
                                 değişkenin değeri olarak işlemlerde kullanılır. Çünkü DahiliSinif, KapsamSinifi2'nin bir alt class'ı
                                 olduğu için ve içerisinde herhangi bir değişken tanımlamadığı otomatik olarak bir üst sınıfın değişkenini
                                 yani KapsamSinifi2'nin privateDegisken'inin değerini alır.*/  //  15

        /* Sonrasında inner class olan DahiliSinif içerisine de bir privateDegisken tanımlarsak bu sefer onun değerini alacaktır.
           Çünkü yerel olan, lokal olan değişken o olacağı için Java tarafından öncelik ona tanınacaktır.. */  //  16

        /* Bu sefer de onileCarp() metodu içerisine bir privateDegisken tanımladık. Çalıştırdığımızda da en lokal/yerel
           değişken o olduğu için işlemlerde onu kullandı. */  //  18

    }
}
