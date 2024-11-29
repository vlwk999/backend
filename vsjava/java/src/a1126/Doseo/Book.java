package a1126.Doseo;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    //생성자
    public Book(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        
        ISBN = iSBN;
    }
    
    //도서 정보 출력 메소드
    public void displayInfo(){
        System.out.println("Title : " + title);
        System.out.println("author : " + author);
        System.out.println("isbn : " + ISBN);

    }

}
