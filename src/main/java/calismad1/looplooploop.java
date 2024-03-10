package calismad1;

import java.util.Iterator;
import java.util.Scanner;

public class looplooploop {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        //int sum=0;
        //for (int i = 0; i <10 ; i++) {

           // sum=sum+input.nextInt();


      //  }
        //System.out.println(sum/10);



       /* Print the following patterns using loop :
        a.
                *
                **
                ***
                ****
        b.
                  *
                 ***
                *****
                 ***
                  *
        c.
            1010101
             10101
              101
               1
               */

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i >=0 ; i--) {
            for (int j = 0; j <1-i ; j++) {
                System.out.print(" ");
            }
            for (int r = 0; r <2*i+1 ; r++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Print multiplication table of 24, 50 and 29 using loop.

        for (int i = 0; i <25 ; i++) {
            System.out.println(i+"x"+24+"="+24*i);
        }
        System.out.println("-----------");
        //Herhangi bir n sayısının faktöriyeli n ile temsil edilir! ve 1*2*3*....*(n-1)*n'ye eşittir. Örneğin-
        //4! = 1*2*3*4 = 24
        //3! = 3*2*1 = 6
        //2! = 2*1 = 2
        //De
        //1! = 1
        //0! = 0
        //Bir sayının faktöriyelini hesaplamak için bir Java programı yazın.
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        int fuck=1;
        for (int i = 0; i <a+1 ; i++) {
            fuck=i*a;
        }
        System.out.println(a+"! ="+fuck);
        System.out.println("------");

        //Q tuşuna basana kadar kullanıcıdan tamsayı girişlerini alın
        // (Her tamsayı girişinden sonra çıkmak için q'ya basmasını isteyin). Tüm sayıların ortalamasını ve çarpımını yazdırın.
        Scanner input=new Scanner(System.in);
        String sayi="";
        int toplam=0;
        int carpim=1;
        int kactne=0;


        while (!sayi.equals("q")){
            System.out.println("çıkmak için q ya basınız");
            sayi=input.next();

            if (sayi.equals("q")){
                int number=Integer.parseInt(sayi);
                toplam+=number;
                carpim=carpim*number;
                kactne++;

            }
        }

        System.out.println("carpim : "+carpim+"\n"+
                "Ortalama : "+(toplam/kactne));







    }
}
