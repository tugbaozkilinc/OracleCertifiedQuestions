package oraclecertifiedquestions;

public class C extends A{

    String greet = "Hello";
    C(){
        String greet = "Ay";
    }

    static double area;
    int b = 2, h = 3;

    public void test(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        b1 = (A) b2;
        // A b3 = (B) b2; ClassCastException atar
        b1.test();
        // b3.test();
        C b4 = new C();
        String greet = "Good Day";
        System.out.println(b4.greet); // Hello --> C() {this.greet = "ay";} yazarsan output Ay olur
        System.out.println(area); // 0.0

        double p, b, h;
        if(area==0){
            b = 3;
            h = 4;
            p = 0.5;
            area = b*h*p;
        }
        System.out.println(area); // 6.0

        // Note: Switch doesn't work with long, double, float, boolean. It works with String, char, int, byte, short

    }

}
