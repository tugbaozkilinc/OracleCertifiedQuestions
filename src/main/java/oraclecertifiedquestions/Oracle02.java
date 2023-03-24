package oraclecertifiedquestions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oracle02 {

    public static void main(String[] args) {

        // Example 1:
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1+s2; // (long) yazmayinca int deger oldugu icin CTE veriyor, ya bu sekilde L koymalisin ==> Long s3 = 234L;
        // String s4 = (String)(s3*s2); Compilation fails

        // Example 2:
        int[] numbers;
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.println(Arrays.toString(numbers)); // [0, 0, 30, 40]

        // Example 3:
        for(int x = 0; x<3; ++x){ // x++ ile ayni sonucu veriyor
            System.out.println("Welcome " + x);
        }
        int x = 100;
        do {
            ++x;
            System.out.println("Welcome " + x);
        }while (x<100); // Welcome 101

        // Example 4:
        int z;
        // z++; // CTE verir
        int a;
        int y = 1;
        while(y<3){
            // a++; // CTE verir
            a = 10;
            y++;
        }
        // System.out.println(a); // CTE verir

        // Example 4:
        int x1 = 1;
        int y1 = 1;

        if (x1++ <++y1){
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }
        System.out.println("Log " + x1 + ": " + y1);

        // Example 5:
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i< arr.length; i++){
            for (int k = 0; k<arr[i].length; k++){
                System.out.print(arr[i][k] + " ");
                continue;
            }
            continue;
        } // A B C D E

        int ab = 2;
        float cv = (float)ab;
        float acv = (float)1.23;

        // Example 6:
        System.out.println();
        System.out.println("Hello " + new StringBuilder("Java Se 8")); // Hello Java Se 8
        System.out.println("Hello " + new Book("Java Se 8")); // Hello oraclecertifiedquestions.Book@47f6473 ==> toString() olmadan

        // Example 7:
        float v1 = (12.34501 <= 12.4500) ? 12.456f : 124.5602f; // ikisinde de f olmali, true ya da false ne olursa olsun
        float v2 = v1 + 1024;
        System.out.println(v2); // 1036.456

        // Example 8:
        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10);
        System.out.println(date); // 2012-01-30 atama yapmadigin icin degisiklik gerceklesmez.

        // Example 9:
        float decimalNumber = 234.02F; // float abc = 234; Bu sekilde ondalikli sayi yazmazsan hata vermiyor.
        float abc = (float)345.0;
        // Float decimalNumber1 = 234.02; hata verir -> Float decimalNumber2 = (float)234.09;
        int num = 300;
        float number = (float) num;

        // Example 10
        int[] array = new int[]{1,2,3};
        // Note: switch te continue kullanamazsin ancak loop icinde kullanabilirsin!!!

        // Example 11:
        List<String> list = new ArrayList<>();
        list.add("Tech");
        list.add("Expert");
        list.set(0, "Java");
        list.forEach(t -> t.concat("Forum"));
        list.replaceAll(t -> t.concat("Group"));
        System.out.println(list); // [JavaGroup, ExpertGroup]

        // Example 12:
        String[] arrayOne = new String[2];
        int idx = 0;
//        for (String w : arrayOne){
//            arrayOne[idx].concat(" element " + idx);
//            idx++;
//        }
//        for (idx = 0; idx <arrayOne.length ; idx++) {
//            System.out.println(arrayOne[idx]);
//        } // NullPointerException atar cunku null a concat islemi yapamazsin

        // Example 13:
        int average = 9;
        if (++average<10){ // average++<10 ==> Hello Universe
            System.out.println("Hello Universe");
        } else {
            System.out.println("Hello World");
        } // Hello World

        // Example 14:
        Double price = 200D;
        System.out.println(price); // 200.0

        // Example 15:
        String[][] multiArray = new String[3][]; // Sagdaki bos birakilabiliyor.





    }
}
