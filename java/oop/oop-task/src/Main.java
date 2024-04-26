import Library.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Java core", "Mostafa tarek", LocalDate.of(2005, 1, 4));
        Dvd dvd1 = new Dvd("Dvd name", "Jon", LocalDate.of(2020, 1, 4));
        Magazine magazine1 = new Magazine("Mark", "", LocalDate.of(2020, 1, 4));
        Book book2 = new Book("Java Core", "Mostafa Tarek", LocalDate.of(2005, 1, 4));
        Dvd dvd2 = new Dvd("The Matrix", "Lana Wachowski, Lilly Wachowski", LocalDate.of(1999, 3, 31));
        Magazine magazine2 = new Magazine("National Geographic", "Various Authors", LocalDate.of(2022, 4, 15));


        library.add(book1);
        library.add(dvd1);
        library.add(magazine1);

        library.add(book2);
        library.add(dvd2);
        library.add(magazine2);

        if(library.checkExistItem(Dvd.class))  System.out.println("Dvds is exist\n");
        else System.out.println("Dvds is not exist\n");

        library.displayInformation(0);
        library.displayInformation(1);
        library.displayInformation(2);
        System.out.println("\n");

        library.remove(1);
        library.remove(3);

        if(library.checkExistItem(Dvd.class))  System.out.println("Dvds is exist\n");
        else System.out.println("Dvds is not exist\n");

        Book book3 = new Book("English practice", "Mark", LocalDate.of(2020, 1, 4));

        library.displayInformation(0);
        library.update(book3,0);
        library.displayInformation(0);


    }

}
