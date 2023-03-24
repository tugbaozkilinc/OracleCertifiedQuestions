package oraclecertifiedquestions;

import java.io.IOException;
import java.nio.CharBuffer;

class Book implements java.lang.Readable, Bokks {

    @Override
    public void readBook() {

    }

    @Override
    public void setBookMark() {

    }
    protected void revolve(){

    }
    String msg;

    Book(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Book{" +
                "msg='" + msg + '\'' +
                '}';
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
