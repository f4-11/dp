package com.test.dp.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> ResourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : ResourceFiles) {
            resourceFile.accept(extractor);
        }
        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : ResourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles() {
        List<ResourceFile> list = new ArrayList<ResourceFile>();
        list.add(new PdfFile("pdf"));
        list.add(new PptFile("ppt"));
        return list;
    }
}
