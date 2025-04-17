package com.xworkz.internal;

public class NotebookImpl implements Notebook {
    public void writeNotes() {}
    public void tearPage() {}
    public void closeNotebook() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
