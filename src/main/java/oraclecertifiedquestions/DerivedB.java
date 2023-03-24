package oraclecertifiedquestions;

public class DerivedB extends DerivedA{

    public DerivedB() {
    }

    String name;
    public DerivedB(String name){
        this.name = name;
    }

    public void test(){
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3;
        b1 = (Base) b2;
        b1.test();
        b4.test();
        // DerivedA
        // DerivedB
        DerivedB[] students = new DerivedB[2];
        students[0] = new DerivedB("Richard");
        students[1] = new DerivedB("Donald");
        for (DerivedB w : students) {
            System.out.println(" " + w.name);
        } // NullPointerException => 0. index null oldugu icin

        //Example
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};
        for (int[] a : arr){
            for (int i = 0; i< arr.length; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println(); //1 3
                                  //1 3
        }

    }

}
