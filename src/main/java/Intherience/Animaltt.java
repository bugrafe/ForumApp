package Intherience;

public class Animaltt {
    //public final class Animal - final olan bir class'ın child 'ı olamaz.
    //OOP (Object Oriented Programming - Nesne Tabanlı Programlama )
    //Gercek hayatta gordugumuz bircok (nesnenin) bilgisayar ortamina aktarılma şeklidir.
    //Yani bir object’in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar ortamında
    // gösterilmesi buna örnek olarak verilebilir.


    /*
        Object Yönelimli Programlamanın Faydaları:

        1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
        2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
        ile çalıştırılabilir. Substring() method'u 1 kere yazilmis ama surekli kullanabiliyoruz.
        3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
        4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
        5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class' ta değişiklik
        yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

        /* OOP'leri 4 temel özellikte inceleyebiliriz.
        1. Inheritance - Miras Alma
        2. Polymorphism - Çok Biçimlilik
        3. Encapsulation - Kapsülleme
        4. Abstraction - Soyutlama
        */

    //1. Inheritance - Miras Alma
    //ozellikleri bir class'tan diger class'lara alan bir kavramdır.

    //Siz bir class olusturcaksiniz ama daha önce olusturulmus bir class sizin istediğiniz özelliklerin
    //bir cogunu kapsiyor. O zaman direkt yeni olusturdugunuz class'in , özelliklerini kullanmak istediginiz
    //class'a child yaparsınız.

    //Bunu da "extends" keyword'u (uzanmak) kullanarak yapariz.

        /*
        Inheritance'in Faydalari nelerdir?

        1) Kodun yeniden kullanılmasına yardımcı olur.
        2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
        emekten tasarruf sağlayabiliriz.
        3) Kolayca update yapabiliriz.
        4) Class'lari kuculturuz.
        5) Daha az geliştirme ve bakım maliyetine yol açar.
        */

    public void eat() {
        System.out.println("Animals eat");
        final double pi = 3.14;
        //pi=3; final olan bir variable degistirilemez.
    }

    public void drink() {
        System.out.println("Animals drink");
    }

    //return type durumlarina bakalim.
    public Animaltt create() { //Animal data type'dır.
        return new Animaltt(); //Yeni bir Animal objesi ürettik ve cağrıldıgı yere return ettik
    }

    //Parent’ta int veri turunde bir method acip, child’da override etseydik ne olurdu?
    public int add(int a, int b) {
        return a + b;
    }

    //Peki Parent’ta Class veri turunde bir method acip, child’da override etseydik ne olurdu?
    public Number carpma(Integer a, Integer b) {
        return a * b;
    }


//Override isleminde access modifier’larin durumlari ne olmalidir, onu ogrenelim
//Soru1: private method’lar override edilebilir mi?
//Cevap1: private method’lar override edilemezler (parent ‘eat’)cunku;
//     override edebilmek icin o method’a baska bir class’dan ulasabilmek gerekir.
//     Ama private method’lar baska classlardan ulasilamaz methodlardir

//child'in access modifier'i parent'tan daha dar olamaz. Ornek: parent public - child protected
// olamaz cunku bu hata, Child class'ının eat metodunun, Parent class'ının eat metodundan daha az
// erişilebilir olmasından kaynaklanır.

    /*Return type void ise degisim olmaz. Hep void olarak kalir*/

//Soru2: static method'lar override edilebilir mi?
//Cevap2: static method'lar override edilemezler cunku; static variable veya method'lar
// tum objeler icin ortaktir. Java static method'larin override edilmesine musaade etmez.

//Soru3: static method'lar overload edilebilir mi?
//Cevap3: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
// ornegin; pi sayisini farkli bir method icinde yine kullanabilirsiniz.

//final keyword'u
    /*Override'da ozel bir durum vardir:

    1- Java'da "final" anahtar kelimesi (keyword) ile işaretlenen bir method, alt sınıflar tarafından override edilemez.
    2- Yani, bir sınıfın alt sınıfları, final olarak işaretlenmiş bir methodu değiştiremez veya üzerine yazamaz.
    3- Bu method, final olarak işaretlenerek nihai ve değiştirilemez hale getirilir.
    4- Final Variables, Final Classes, Final Parametreler'de olabilir.

    Sonuc: "Final" kelimesi, programcılara kodlarını daha güvenli ve öngörülebilir hale getirme, optimizasyon sağlama
    veya belirli davranışları zorlamada yardımcı olmak için kullanılır.*/

}
