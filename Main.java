import java.util.ArrayList ;

class Book{
    private String title;
    private int page;
    Book(String title, int page){
        this.title = title;
        this.page = page;
    }

    public String title(){
        return this.title;
    }

    
    public int page(){
        return this.page;
    }

    public void getInfo(){
        System.out.print("");
    }

}

class Novel extends Book{
    
    Novel(String title, int page){
        super(title, page);
    }

    public void getInfo(){
        System.out.print("「" + title() + "」は面白い小説です");
    }
}

class Textbook extends Book{
    
    Textbook(String title, int page){
        super(title, page);
    }

    public void getInfo(){
        System.out.print("「" + title() + "」は教科書です（" + page() + "）ページ");
    }
}



class Main {
    public static void main(String[]args){
        ArrayList<Book>books = new ArrayList<>();
        books.add(new Novel("人間失格", 100));
        books.add(new Novel("坊ちゃん", 500));
        books.add(new Novel("数A", 100));
        books.add(new Novel("数B", 300));

        for(Book b: books){
            if(b.page() >= 200){
                b.getInfo();
                System.out.println( "（大作）");
            } else {
                b.getInfo();
                System.out.println("");
            }

        }
    }
}
