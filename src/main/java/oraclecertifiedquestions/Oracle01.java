package oraclecertifiedquestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oracle01 {

    public static void main(String[] args) {

        // Example 1:
        String date1 = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date1); // 2014-05-04
        // String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME); // time is not assigned here, that's why throws an exception
        // System.out.println(date);
        String date2 = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date2); // 2014-05-04

        // Example:
        LocalDate date = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println(date); // 2014-06-20

        // Example 2:
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE)); // 2014-07-31 If it was written with parse() it would throw exception.

        // Example 3:
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1; // String str2 = sb1.toString(); --> false // String str2 = "Duke"; --> false
        System.out.println(str1==str2); // true

        // Example 4:
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4, 5};
        nums2 = nums1;
        for(int w : nums2){
            System.out.print(w + ": "); // 1: 2: 3:
        }
        System.out.println();

        // Example 5.1:
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s -> { System.out.print(s); return s.length() <=2; })){ // If blogunun sart kismi lambda ile yazilmis, ArrayList sınıfının removeIf() methodu kullanılmış
                                                                                    // Array icindeki String ifadenin uzunlugu 2 ye esit veya kucuk ise removeIf() methodu ile siliniyor.
            System.out.println("Removed");                                          // update haline bak silinmis goreceksin. return s.length() <=2; boolean return eder
        }
        // HiHowAreYouRemoved
        // s.length() <2  -->  HiHowAreYou
        System.out.println("arrList = " + arrList); // arrList = [How, Are, You]

        // Example 5.2:
        List<String> arrList1 = new ArrayList<>(Arrays.asList("Hi", "How", "Are", "You"));
        if (arrList1.removeIf(s ->  s.length() <= 2)) {
            System.out.println("Removed");
        }
        System.out.println("arrList = " + arrList1); // arrList = [How, Are, You]
        // Removed

        // Example 6:
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names); // [Robb, Rick, Bran]

        // Example 7:
        int[] array1 = {1, 2, 3};
        int[] array2 = new int[5];
        array2 = array1;
        System.out.println("array2 = " + Arrays.toString(array2)); // [1, 2, 3]
        for (int w : array2){
            System.out.print(w + " "); // 1, 2, 3
        }
        System.out.println();
        // Note: count; cannot be following break; or continue; statements!!

        // Example 8:
        int[][] n = {{1, 3}, {2, 4}};
        for(int i = n.length-1; i>=0; i--){
            for(int y : n[i]){
                System.out.print(y);
            }
        } // 2413
        System.out.println();

        // Example 9:
        String[][] chs = new String[5][2];
        System.out.println(Arrays.deepToString(chs));
        chs[0] = new String[2];
        chs[1] = new String[5];
        System.out.println(Arrays.deepToString(chs));

        // Example 10:
        int x = 10;
        int y = ++x;
        System.out.println("y = " + y); // 11
        System.out.println("x = " + x); // 11
        int z;
        if(y>=10 && y<=++x){ // || isareti olursa 11, cunku or isaretinde ilki true olunca ikinci sarta bakmaz dolayisiyla x in degeri artmaz
            System.out.println(y); // 11
            System.out.println(x); // 12
            z = x;
        } else {
            z = x++;
        }
        System.out.println(z); // 12

        // Example 11:
        int[] arr1 = new int[] {1, 2, 3};

        // Example 12:
        try {
            method();
        }catch (MyException e){
            System.out.println("A");
        }

        // Example 13:
        Oracle01 obj = new Oracle01();
        //obj.readCard(1234); ==> hata verir, main method signature yanina exception eklenmeli
        obj.checkCard(1234);



    }
    public static void method(){
        try{
            throw Math.random()>0.5 ? new MyException() : new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("B");
        }
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }
    void readCard(int cardNo) throws Exception{
        System.out.println("Reading Card");
    }


}





