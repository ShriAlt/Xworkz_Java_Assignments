package com.xworkz.internal;

public interface Notebook {
    void writeNotes();
    void tearPage();
    void closeNotebook();
    default void rule(){}
}
