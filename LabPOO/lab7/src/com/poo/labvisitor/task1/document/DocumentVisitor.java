package com.poo.labvisitor.task1.document;

import com.poo.labvisitor.task1.document.BoldTextSegment;
import com.poo.labvisitor.task1.document.ItalicTextSegment;
import com.poo.labvisitor.task1.document.PlainTextSegment;
import com.poo.labvisitor.task1.document.UrlSegment;

public interface DocumentVisitor {
    void visit(ItalicTextSegment italicTextSegment);

    void visit(PlainTextSegment plainTextSegment);

    void visit(BoldTextSegment boldTextSegment);

    void visit(UrlSegment urlSegment);

    StringBuilder getDocument();
}
