package oraclecertifiedquestions;

public class A {

    String example = "Welcome";

    public A() {
        String example = "Hello";
    }

    public void test(){
        System.out.println("A");
    }

    String myStr = "9009";
    public void doStuff(String str){
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch (NumberFormatException e){
            System.err.println("Error");
        }
        System.out.println("myStr: " + myStr + " myNum: " + myNum);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.doStuff("7007"); // myStr: 9009 myNum: 7007
        System.out.println(obj.example); // Welcome     example = "Hello"; olsaydi eger Hello yazdirirdi
        String[] names = {"Thomas", "Peter", "Joseph"};
        String[] pwd = new String[3];
        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid name");
        }
        //omas
        //Invalid name

        add(10, 20); //Float sum is: 30.0
        add(10.0, 20.0); //Double sum is: 30.0

        String example = null;
        //System.out.println(example.concat("java")); ==> NullPointerException atar

    }
    public static void add(Integer x, Integer y){
        System.out.println("Integer sum is: " + (x+y));
    }
    public static void add(float x, float y){
        System.out.println("Float sum is: " + (x+y));
    }
    public static void add(double x, double y){
        System.out.println("Double sum is: " + (x+y));
    }



}
