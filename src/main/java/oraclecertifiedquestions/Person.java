package oraclecertifiedquestions;

import java.util.Arrays;

public class Person {

    String name;
    int age = 25;

    public Person(String name) {
        setName(name);
    }

    public Person(String name, int age) {
        // Person(name); hata verir ==> new Person(name); bu sekilde yazmalisin
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Person[] arr = {new Person("Mercury"), new Person("Venus")};
        System.out.println(Arrays.toString(arr)); // [hashcode, hashcode]
        System.out.println(arr[1].name); // Venus
    }
}
