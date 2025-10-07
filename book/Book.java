package book;

public class Book {
    private String title ;
     private String author;
     private int  year;
     private String ISBN;

     Book (){}
    Book (String title,String author,int year,String ISBN){
         this.title = title;
         this.author=author;
         this.ISBN=ISBN;
         this.year=year;
    }
    public  String getTitle (){
         return this.title;
    }
    public String getAuthor(){
         return author;
    }
    public int getYear(){
         return year;
    }
    public String getISBN(){
         return  ISBN;
    }

    @Override
    public String toString()
    {

        return String.format("title: %s\nauthor: %s\nyear edition : %d\nISBN: %s\n",getTitle(),getAuthor(),getYear(),getISBN());
    }
}
