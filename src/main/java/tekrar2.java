public class tekrar2 {
    public static void main(String[] args) {

        String str="Java code yaz";
        System.out.println(str.substring(5));


        String str1="Java is java";


        System.out.println(str1.lastIndexOf("v"));




        String s="Learn";
        System.out.println(s.length()>s.charAt(2));


        int satir=5;
        int a=1;

        for (int i = 0; i <satir ; i++) { //satırlar icin

            for (int j = 0; j <= i; j++) { //sutunlar icin
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

    }
}
