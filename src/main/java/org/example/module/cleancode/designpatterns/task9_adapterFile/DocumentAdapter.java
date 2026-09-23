package org.example.module.cleancode.designpatterns.task9_adapterFile;

public class DocumentAdapter implements DocumentProcessor {
    private Document document;

    public DocumentAdapter(Document document) {
        this.document = document;
    }


    @Override
    public void processor() {
        String docTemp = document.getDoc();
        String pdfTemp = docTemp + " PDF";

        System.out.println("Адаптирую Document в формат обработки. Результат: " + pdfTemp);
    }
}
