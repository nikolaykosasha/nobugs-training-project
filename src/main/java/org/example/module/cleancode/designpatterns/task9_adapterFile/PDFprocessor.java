package org.example.module.cleancode.designpatterns.task9_adapterFile;

public class PDFprocessor implements DocumentProcessor {

    @Override
    public void processor() {
        System.out.println("Читаю PDF файл");
    }
}
