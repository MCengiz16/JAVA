package Library;

import java.util.ArrayList;

public class Requests extends  BookList {

    public Requests(int ID, String name, String author, boolean availability, ArrayList<String> list) {
        super(ID, name, author, availability, list);
    }

    public void requestBook(String ID){
        for (String bookToRequest :super.list){

        }


    }
    public void requestBook(String name, String author){


    }


}
