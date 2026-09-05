package org.example.module.cleancode.designpatterns.task9_adapterFile;

public class DOCprocessor implements DocumentProcessor {
    @Override
    public void processor() {
        System.out.println("Читаю DOC файл");
    }
}
