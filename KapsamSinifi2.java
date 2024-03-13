public class KapsamSinifi2 {

    private int privateDegisken = 30;  //  10

    public KapsamSinifi2() {  // Yine constructor oluşturup içeriğini sildik.  //  11
    }
    public void dahiliSinifKontrol() {  //  22

        DahiliSinif d = new DahiliSinif();  //  23

        System.out.println("Kontrol ediliyor..." + d.a);  //  24

    }

    public class DahiliSinif {  //  12
        private int privateDegisken = 20;  //  17
        private int a = 3;  //  22

        public void onlineCarp() {  //  13
            int privateDegisken = 10;  //  19

            for (int i = 1 ; i < 6 ; i++) {

                //System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken));
                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken)); /* Üstteki satırı yoruma aldık.
                                                                                                  Şimdi class'ımız içerisindeki
                                                                                                  ilk tanımlamış olduğumuz değişkeni
                                                                                                  kullanabilmek için class ismin ve this
                                                                                                  anahtar kelimesini kullanmamız gerekecek.
                                                                                                  Böylelikle aynı isimde olan değişkenlerden istediğimizi
                                                                                                  hedef göstererek kullanabiliyoruz. */  //  20

                /* Şimdi de inner class olan DahiliSinif içerisinde bir değişken oluşturup (private int a = 3;) dışındaki çerçeve class üzerinde kullanıp
                kullanmadığımızı kontrol edeceğiz. */  //  21
            }

        }

    }

}
