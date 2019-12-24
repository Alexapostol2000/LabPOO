package com.poo.labvisitor.task1.document;

import com.poo.labvisitor.task1.document.*;

public class DokuWikiVisitor implements DocumentVisitor {
    private StringBuilder document = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        document.append("//");
        document.append(italicTextSegment.getContent());
        document.append("//");
    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {
        document.append(plainTextSegment.getContent());
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        document.append("**");
        document.append(boldTextSegment.getContent());
        document.append("**");
    }

    @Override
    public void visit(UrlSegment urlSegment) {
        document.append("[[");
        document.append(urlSegment.getUrl());
        document.append(" | ");
        document.append(urlSegment.getDescription());
        document.append("]]");
    }

    @Override
    public StringBuilder getDocument() {
        return document;
    }
}
