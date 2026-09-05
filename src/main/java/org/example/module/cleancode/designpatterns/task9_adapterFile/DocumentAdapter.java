package org.example.module.cleancode.designpatterns.task9_adapterFile;

public class DocumentAdapter {
    private Document document;

    public DocumentAdapter(Document document) {
        this.document = document;
    }

    public String getDocument() {
        String docTemp = document.getDoc();
        String pdfTemp = docTemp + "PDF";
        return pdfTemp;
    }
}
