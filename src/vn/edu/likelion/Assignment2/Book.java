package vn.edu.likelion.Assignment2;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Book extends SuperClass implements _InterFace{
    public String AuthorName;
    public int SL;
    static ArrayList<Book> ListBook;

    // Constructor section
    public Book(){}
    public Book(ArrayList<Book> List) { ListBook = List;}
    public Book(int ID,String BookName, String AuthorName, int SL){
        this.ID = ID;
        this.Name = BookName;
        this.AuthorName = AuthorName;
        this.SL = SL;
    }
    //interface inherited section

    public void addElement(Book book) {
        book.setID(Book.ListBook.size());
        Book.ListBook.add(book);
    }

    public void updateElement(Book book) {
        Book.ListBook.set(book.getID(),book);
    }

    public void deleteElement(int index){
        Book book = new Book();
        Book.ListBook.remove(index);

        for( int i = 0 ; i <Book.ListBook.size(); i++){
            book = Book.ListBook.get(i);
            book.setID(i);
            Book.ListBook.set(i, book);
        }
    }
    public static void getListBook(){
        for(var item: Book.ListBook){
            System.out.println(item.ID +" "+ item.Name + " " + item.AuthorName+ " " + item.SL);
        }
    }

    public Book getBook( int ID){
        return Book.ListBook.get(ID);
    }
    public Book getBook(String name){
        int ID = 0;
        END:
        for(var item: Book.ListBook){
            if(item.getName() == name){
                ID = item.getID();
                break END;
            }
        }
        return getBook(ID);

    }
    //getter setter
    public void setAuthorName(String AuthorName)
    {
        this.AuthorName = AuthorName;
    }
    public String getAuthorName()
    {
        return this.AuthorName;
    }
    public void setSL(int SL){
        this.SL = SL;
    }
    public int getSL(){
        return this.SL;
    }

    public void setID(int ID){ this.ID = ID ;}
    public int getID() { return this.ID;}
    public void setName(String Name){ this.Name= Name;}
    public String getName() { return this.Name;}

}
