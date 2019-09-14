package Library;

import java.util.ArrayList;

public class BookList extends Books{
    ArrayList<String> list;

    public BookList(int ID, String name, String author, boolean availability, ArrayList<String> list) {
        super(ID, name, author, availability);
        this.list = list;
    }

    public void addBook(int ID, String name, String author, boolean availability){
        String book=ID+","+ name +","+author+","+ availability;
        this.list.add(book);
    }

    public void removeBook(int ID){
        String[] bookRemove=new String[0];
        for (String book: this.list){
            bookRemove=book.split("'");
            if (bookRemove[0].equals(ID)){
                this.list.remove(book);
            }
        }
    }
}
