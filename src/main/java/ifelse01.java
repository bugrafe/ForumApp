import java.util.Scanner;

public class ifelse01 {
    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin uzunluk ve genişlik değerlerini alın ve kare olup olmadığını kontrol edin.

        Scanner input=new Scanner(System.in);/*
        System.out.println("Dikdörtgenin uzun kenarını girin");
        double tall=input.nextDouble();
        System.out.println("Dikdörtgenin kısa kenarını girin");
        double kısa=input.nextDouble();

        if (tall==kısa){
            System.out.println("Kare");
        } else if (kısa>tall) {
            System.out.println("Kısa kenar uzun kenardan büyük olamaz");
        }else {
            System.out.println("dikdörtgen");
        }

        //-----------------
        //ullanıcıdan iki int değeri alın ve aralarında en büyüğünü yazdırın.

        System.out.println("İki sayı girin");
        int a=input.nextInt();
        int b=input.nextInt();

        if (a>b){
            System.out.println(a);
        } else if (a==b) {
            System.out.println("iki sayı eşit");
        }else {
            System.out.println(b);*/

        //------------------------
        /*//Bir şirket, hizmet yılı 5 yıldan fazla olan çalışana %5 ikramiye vermeye karar verdi.
        //Kullanıcıdan maaşını ve hizmet yılını isteyin ve net bonus tutarını yazdırın.

        System.out.println("Hizmet year'ı girin");
        double hizmet=input.nextDouble();
        System.out.println("Maaşınızı giriniz");
        double maaş=input.nextDouble();

        if (hizmet>5){
            System.out.println(maaş+(maaş*5)/100+"$");
            System.out.println("Net bonus tutarı: "+(maaş*5)/100+"$");
        } else {
            System.out.println("Hizmet yılınız 5 yıldan küçük");
        }*/
        //------------------------------
        //Bir yılın artık yıl olup olmadığını kontrol etmek için bir program yazın.
        //Bir yıl 4'e bölünebiliyorsa artık yıldır, ancak yıl 2000, 1900, 2100 gibi yüzyıl yılı ise 400'e bölünebilir olmalıdır.

        /*System.out.println("Bir yıl giriniz");
        int year=input.nextInt();

        if (year%4==0){
            if (year%400==0){
                System.out.println("true Year");
            }else {
                System.out.println("year değil");
            }

        }else {
            System.out.println("year degil");
        }*/

        //-----------------------------------
        //Klavyeden 4 haneli bir sayı girilir. Orijinal sayıdan itibaren rakamları ters çevrilmiş
        // yeni bir sayı yazdırmak için bir program yazın. Örneğin-
        //GIRIŞ : 1234 ÇIKIŞ : 4321
        //GIRIŞ : 5982 ÇIKIŞ : 2895

        System.out.println("4 haneli bir sayı girin");
        int sayi=input.nextInt();
        int tersSayi=0;
        int kalan=0;

        while (sayi>0){
            kalan=sayi%10;
            tersSayi=tersSayi*10+kalan;
            sayi/=10;

        }

        System.out.println(tersSayi);






















    }
}
