package com.test.dp.behavioral.visitor;

public class Compressor implements Visitor {
    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("compress pdfFile");
    }

    @Override
    public void visit(PptFile pptFile) {
        System.out.println("compress pptFile");
    }
}
