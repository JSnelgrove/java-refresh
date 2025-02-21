public class Book{
    int id;
    String title;
    String author;
    int isbn;
    Date publishedDate;

    public Book(){}

    public Book(int id, String title,String author, int isbn, Date publishedDate){
        this.id= id;
        this.title = title;
        this.author= author;
        this.isbn= isbn;
        this.publishedDate= publishedDate;
    }   

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getISBN(){
        return this.isbn;
    }

    public void setISBN(int isbn){
        this.isbn = isbn;
    }   
    
    public String toString(){
        return  "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", publishedDate=" + publishedDate + "]";
    }
}
