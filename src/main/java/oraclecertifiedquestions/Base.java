package oraclecertifiedquestions;

public class Base {
    public void test(){
        System.out.println("Base");
    }

    private char var;

    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1;
        var2 = 'e';
        Base obj1 = new Base();
        Base obj2 = obj1;
        obj1.var = 'o';
        obj2.var = 'i';
        System.out.println(var1 + ", " + var2);
        System.out.println(obj1.var + ", " + obj2.var);
    } // a, e, i, i





}
