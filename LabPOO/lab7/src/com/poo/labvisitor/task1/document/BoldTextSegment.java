package com.poo.labvisitor.task1.document;

import com.poo.labvisitor.task1.document.DocumentVisitor;

public class BoldTextSegment extends TextSegment {
    public BoldTextSegment(String content) {
        super(content);
    }

    @Override
    public void acceptVisitor(DocumentVisitor doc) {
        doc.visit(this);
    }
}
