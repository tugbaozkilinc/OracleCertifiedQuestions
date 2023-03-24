package oraclecertifiedquestions;

import java.util.ArrayList;
import java.util.List;

public class DerivedA extends Base{

    String msg;
    DerivedA(String msg){
        this.msg = msg;
    }
    DerivedA(){

    }

   public void test(){
       System.out.println("DerivedA");
   }

    public static void main(String[] args) {
       int x = 100;
       int a = x++;
       int b = ++x;
       int c = x++;
       int d = (a<b) ? (a<c) ? a : (b<c) ? b : c: x;
       System.out.println(d); // 100

        //Example:
        Boolean[] booleans = new Boolean[2];
        booleans[0] = new Boolean(Boolean.parseBoolean("true"));
        booleans[1] = new Boolean(null);
        System.out.println(booleans[0] + " " + booleans[1]); //true false

        //Example:
        List<String> myList = new ArrayList<>();
        String[] myArray;
        try {
            while (true){
                myList.add("My String");//OutOfMemoryError
                break;
            }
        }catch (RuntimeException e){
            System.out.println("Caught a Runtime Exception");
        }catch (Exception e){
            System.out.println("Caught a Exception");
        }
        System.out.println("Ready to use");

    }

}
