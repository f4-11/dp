package com.test.dp.behavioral.visitor;

import org.w3c.dom.Node;

public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PptFile pptFile);
}
