package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
@Service
public class BookService{
    ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getAllBooks(){
        return books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void updateBook(int id, Book book){
        for(Book b: books){
            if(id == b.getId()){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                b.setPrice(book.getPrice());
            }
        }
    }
    public void deleteBook(int id){
        books.removeIf(b -> id == b.getId()); 
    }
    public List<Book> getExpensiveBooks(){
        return books.stream()
        .filter(b -> b.getPrice() >= 2000)
        .collect(Collectors.toList());
    }
}