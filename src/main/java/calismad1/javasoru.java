package calismad1;

import java.util.*;

public class javasoru {
    public static void main(String[] args) {

       /* Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.*/
                Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);


        Object[] obg=product.values().toArray();
        Arrays.sort(obg);
        System.out.println(Arrays.toString(obg));

       Set<String> nSet=product.keySet();
       List<String> nSetEnyeni=new ArrayList<>(nSet);
       Collections.sort(nSetEnyeni);
        System.out.println(nSetEnyeni);



        //--------------------
        //Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
                List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();

        for (Integer w:myList) {
            Integer getir=myMap.get(w);

            if (getir==null){
                myMap.put(1,w);
            }else {
                myMap.put(w,getir+1);
            }
        }
        Collection<Integer> myValues=myMap.values();
        int tekrar=0;
        for (Integer w:myValues) {
        if (w>1){
            tekrar++;
        }
        }
        System.out.println(tekrar);


        //Map<String, Integer> product = new HashMap<>();
        //        product.put("Laptop", 82);
        //        product.put("TV", 53);
        //        product.put("Refrigerator", 12);
        //        product.put("Music System", 87);
        //        product.put("Mobile Phone", 53);


        //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
        //yazınız.

        Set<String> kontrol=product.keySet();
        boolean a=kontrol.contains("Laptop");
        System.out.println(a);
        System.out.println("product.containsKey(\"Laptop\") = " + product.containsKey("Laptop"));

       //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.


        Collection<Integer> totalUrun=product.values();
        int top=0;
        for (Integer w:totalUrun) {
            top=top+w;
        }
        System.out.println(top);

        //Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.
                List<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(31);
        myList2.add(15);
        myList2.add(7);
        myList2.add(13);

        Set<Integer> nMyList2=new HashSet<>(myList2);

        if (myList2.size()>nMyList2.size()){
            System.out.println("Tekrar eden var");
        }else {
            System.out.println("Tekrar eden yok");
        }
        System.out.println(nMyList2);

//Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
//bir kod yazınız.

        Set<Integer> mySet=new HashSet<>();
        mySet.add(10);
        mySet.add(15);
        mySet.add(21);
        mySet.add(7);
        mySet.add(25);
        System.out.println(mySet);

        List<Integer> myList22 = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);
        System.out.println("-");



        System.out.println("-");
       // mySet.removeAll(myList22);
        //System.out.println(mySet);

        //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        //Örnek: ‘Mississippi’ ´ Misp

        String mis="Mississippi";
        String[] misarr=mis.split("");

        List<String> anew=Arrays.asList(misarr);

        Set<String> sanew=new HashSet<>(anew);

        System.out.println(sanew);

       // Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
                //Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
        List<Integer> yourList = new ArrayList<>();
        yourList.add(10);
        yourList.add(31);
        yourList.add(15);
        yourList.add(7);
        yourList.add(15);
        yourList.add(7);
        yourList.add(7);


       HashSet<Integer> yourListSet=new HashSet<>(yourList);
        System.out.println(yourListSet.size());


    }
}
