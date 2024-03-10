package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void hesapMakinesi(){

        System.out.println("--Hesap Makinesi--");
        Scanner input=new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi numarasını kullanarak giriniz");
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Bölme");
        System.out.println("4.Çarpma");
        byte secim=input.nextByte();
        System.out.println("İşlem yapmak istediğiniz ilk sayıyı giriniz");
        double sayi1=input.nextInt();
        System.out.println("İşlem yapmak istediğiniz ikinci sayıyı giriniz");
        double sayi2=input.nextInt();


        switch (secim){
            case 1:
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                if (sayi2==0){
                    System.out.println("Payda sıfır olamaz");
                }else {
                    System.out.println(sayi1/sayi2);
                }
                break;
            case 4:
                System.out.println(sayi1*sayi2);
                break;
            default:
                System.out.println("Geçersiz işlem");
        }








    }
}
