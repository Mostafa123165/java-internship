package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<LibraryItem> libraryItems = new ArrayList<>();

    public void add(LibraryItem item) {
        libraryItems.add(item);
    }

    public void remove(int index){
        checkIfValidIndex(index);
        libraryItems.remove(index);
    }

    public void update(LibraryItem item , int index){
        checkIfValidIndex(index);
        libraryItems.set(index,item);
    }

    private void checkIfValidIndex(int index) {
        if(index >= libraryItems.size())
            throw new IndexOutOfBoundsException("Invalid index");
    }

    public boolean checkExistItem(Class<?> item) {
        for(LibraryItem libraryItem : libraryItems) {
            if(item.isInstance(libraryItem)) {
                return true ;
            }
        }
        return false;
    }


    public void displayInformation(int index) {
        System.out.println(libraryItems.get(index).displayInformation());
    }
}
