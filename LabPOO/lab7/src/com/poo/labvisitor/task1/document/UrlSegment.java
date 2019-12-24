package com.poo.labvisitor.task1.document;

public class UrlSegment extends TextSegment {
    private String url;
    private String description;

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public UrlSegment(String url, String description) {
        super("Filler");
        this.url = url;
        this.description = description;
    }

    @Override
    public void acceptVisitor(DocumentVisitor doc) {
        doc.visit(this);
    }

}
