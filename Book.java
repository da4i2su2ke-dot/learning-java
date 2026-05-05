package com.example.demo;    

public class Book{
    private int id;
    private String title;
    private String author;
    private int price;

    public Book(int id, String title, String author, int price){
        if(price <= 0){
            throw new IllegalArgumentException("値段が０未満です");
        }
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(int price){
        this.price = price;
    }
}