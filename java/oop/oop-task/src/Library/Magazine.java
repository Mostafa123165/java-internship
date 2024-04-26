package Library;

import java.time.LocalDate;

public class Magazine extends LibraryItem{

    public Magazine(String title, String author, LocalDate publicationYear) {
        super(title,author,publicationYear);
    }

    @Override
    String displayInformation() {
        return "Magazine{" +
                "title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", publicationYear=" + super.getPublicationYear() +
                '}';
    }
}
