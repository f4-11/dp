package com.test.dp.behavioral.visitor;

public class PptFile extends ResourceFile {
    PptFile(String filePath) {
        super(filePath);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
