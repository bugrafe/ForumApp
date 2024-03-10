package calismad1;

import java.util.*;

public class javasoru2 {
    public static void main(String[] args) {
        //Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        //yazınız.
        //Not:
        //Mountain Array ==> [0, 2, 5, 3, 1]
        //Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
        //Mountain Array Değil ==> [5, 2, 7, 1, 4]
        //Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan değer alıyorsa Mauntain Array değildir.

        int[] a={0, 2, 5, 3, 1};

        List<Integer> myList=new ArrayList<>();

        Arrays.stream(a).forEach(myList::add);

        int max=myList.stream().reduce(Integer.MIN_VALUE,Integer::max);
        int idxMax=myList.indexOf(max);
        List<Integer> part1=new ArrayList<>();
        myList.stream().filter(t-> myList.indexOf(t)<= idxMax).forEach(part1::add);
        List<Integer> sorhedPart=new ArrayList<>();
        part1.stream().forEach(sorhedPart::add);
        Collections.sort(sorhedPart);
        List<Integer> part2=new ArrayList<>();
        myList.stream().filter(t-> myList.indexOf(t) >= idxMax).forEach(part2::add);
        List<Integer> sorhedPart2=new ArrayList<>();
        part2.stream().forEach(sorhedPart2::add);
        Collections.sort(sorhedPart2);
        System.out.println(sorhedPart2);
        Collections.reverse(sorhedPart2);


        if (part1.equals(sorhedPart)&& part2.equals(sorhedPart2)){
            System.out.println("mountain");
        }else {
            System.out.println("mountain değil");
        }


        System.out.println("-");
        System.out.println(part1);
        System.out.println(sorhedPart);
        System.out.println(part2);
        System.out.println(sorhedPart2);
        // versiyon2

        System.out.println("bugra");
        System.out.println("bugra");
        System.out.println("bugra");
        System.out.println("bugra");
    }
}
