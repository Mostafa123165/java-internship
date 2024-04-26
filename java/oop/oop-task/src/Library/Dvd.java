package Library;

import java.time.LocalDate;

public class Dvd extends LibraryItem{

    public Dvd(String title, String author, LocalDate publicationYear) {
        super(title,author,publicationYear);
    }

    @Override
    String displayInformation() {
        return "Dvd{" +
                "title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", publicationYear=" + super.getPublicationYear() +
                '}';
    }

}
