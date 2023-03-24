package oraclecertifiedquestions;

public class B extends A{

    public void test(){
        System.out.println("B");
    }

    int x;
    int y;
    int example;

    public void doStuff(int x, int y) {
        x = x;       // this.x = x; this.y = y; olsaydı ==> 100 200 100 200 olurdu
        y = this.y;
    }
    public void display() {
        System.out.println(x +" " +y +" ");
    }

    public static void main(String[] args) {
        B m1 = new B();
        m1.x = 100;
        m1.y = 200;
        B m2 = new B();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
        // 100 200
        // 0 0
        System.out.println(m1.example); // 0  Deger atanmamis olsa bile yazdirabiliyorsun
        System.out.println("Hello " + new StringBuilder("Java SE 8")); // Hello Java SE 8
        System.out.println("Hello " + new DerivedA("Java SE 8").msg); //  Hello Java SE 8

        // Example:
        String creditCard = "1234-5678-9098-7654";
        String built = "xxxx-xxxx-xxxx-";
        StringBuilder sb = new StringBuilder(creditCard);
        sb.substring(15, 19);
        System.out.println(built + sb); // xxxx-xxxx-xxxx-1234-5678-9098-7654
        System.out.println(built + creditCard.substring(15, 19)); // xxxx-xxxx-xxxx-7654
        StringBuilder sbBuilt = new StringBuilder(built);
        sbBuilt.append(creditCard, 15, 19);
        System.out.println(sbBuilt.toString()); // xxxx-xxxx-xxxx-7654
        StringBuilder sbNew = sb.insert(0, built);
        System.out.println(sbNew.toString()); // xxxx-xxxx-xxxx-1234-5678-9098-7654

    }

}
