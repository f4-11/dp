package com.test.dp.behavioral.visitor;

public abstract class ResourceFile {
    protected String filePath;
    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Visitor visitor);
}
