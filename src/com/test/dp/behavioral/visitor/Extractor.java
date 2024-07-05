package com.test.dp.behavioral.visitor;

public class Extractor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("extract pdfFile");
    }

    @Override
    public void visit(PptFile pptFile) {
        System.out.println("extract pptFile");
    }
}
