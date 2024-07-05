package com.test.dp.behavioral.visitor;

import java.io.File;

public class PdfFile extends ResourceFile {
    PdfFile(String filePath) {
        super(filePath);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
