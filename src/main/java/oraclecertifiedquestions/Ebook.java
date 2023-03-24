package oraclecertifiedquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Ebook extends Book{

    public Ebook(String msg) {
        super(msg);
    }

    @Override
    public void setBookMark() {

    }

    @Override
    public void revolve() {

    }

    public static void main(String[] args) {
        // Note: main methodundaki args özelliğini, main metodu çalışırken içine parametre göndermek için kullanırız. String[] args yapısındanda anlaşılacağı gibi,
        // Array yapısında String ifadeleri parametre olarak gönderebiliyoruz, bunu yapmak için intellij in üst menüsünden Run --> Run Configuration kısmına tıklayınca,
        // önümüze gelen pencerede Program Argument kısmına istediğimiz argümanları(arg1 arg2 arg3...) aralarında boşluk olarak girebiliyoruz.
        boolean a = new Boolean(Boolean.valueOf(args[0]));
        boolean b = new Boolean(args[1]);
        System.out.println(a + " " + b); // false false

        List<String> list = new ArrayList<>(Arrays.asList("EN", "FR", "CH", "JP"));
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String e = itr.next();
            if (e=="CH"){
                break;
            }
            System.out.println(e + " ");
        } //EN FR


    }

}
