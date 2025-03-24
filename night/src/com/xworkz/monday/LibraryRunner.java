package com.xworkz.monday;

import com.xworkz.mondayAgain.Location;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library=new Library();
        library.location="mangore";
        library.librarianName="Harsha";
        library.display();
        library.displayLocation();
        Location location=new Location();
        location.location();
    }
}
