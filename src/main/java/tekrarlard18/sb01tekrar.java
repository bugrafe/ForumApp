package tekrarlard18;

public class sb01tekrar { public static void main(String[] args) {

    StringBuilder bgr=new StringBuilder(9);
    bgr.append(21);
    bgr.append("yusufbugraferiz");
    System.out.println(bgr);
    int a=bgr.capacity();
    System.out.println(a);
    System.out.println(bgr.length());
    bgr.reverse();
    System.out.println(bgr);
    bgr.deleteCharAt(16);
    bgr.deleteCharAt(15);
    System.out.println(bgr);
    bgr.delete(1,3);
    System.out.println(bgr);
    bgr.replace(0,15,"Ayse Kubra Feriz");
    System.out.println(bgr);
    bgr.insert(11,"ilk ");
    System.out.println(bgr);

    StringBuilder kbr=new StringBuilder(4);
    kbr.append("Ayse Bugra Feriz");

    int akf=bgr.compareTo(kbr);
    System.out.println(akf);
    boolean adsf=kbr.isEmpty();
    System.out.println(adsf);
    String kbr2=kbr.toString().toUpperCase();
    System.out.println(kbr2);

    StringBuilder kbrNew=new StringBuilder(kbr2);
    System.out.println(kbrNew);
    kbrNew.insert(16,"çok güzel");
    System.out.println(kbrNew);











}
}
