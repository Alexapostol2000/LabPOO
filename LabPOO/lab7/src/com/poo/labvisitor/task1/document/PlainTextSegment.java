package com.poo.labvisitor.task1.document;

public class PlainTextSegment extends TextSegment{
    public PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public void acceptVisitor(DocumentVisitor doc) {
        doc.visit(this);
    }
}
