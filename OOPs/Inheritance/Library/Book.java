package Library;

public class Book  {
    public String Title;
    public String BookPublicationYear;



    public Book(String title, String year){

        this.Title=title;
        this.BookPublicationYear=year;





    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Year=" + BookPublicationYear +

                '}';
    }
}
