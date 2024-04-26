package Library;

import java.time.LocalDate;

public class Book extends LibraryItem {
    public Book(String title, String author, LocalDate publicationYear) {
        super(title,author,publicationYear);
    }
    @Override
    String displayInformation() {
        return "Book{" +
                "title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", publicationYear=" + super.getPublicationYear() +
                '}';
    }

}
