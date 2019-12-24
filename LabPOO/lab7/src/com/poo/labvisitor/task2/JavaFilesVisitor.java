package com.poo.labvisitor.task2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;


public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles;

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link:%s", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular link:%s", file);
        } else if (attr.isOther()) {
            System.out.format("Other:%s", file);
        }

        System.out.println("(" + attr.size() + "bytes)");
        return FileVisitResult.CONTINUE;
    }
    // add to javaFiles all the Java related files: the ones with .java and .class extensions

    @Override
    public FileVisitResult postVisitDirectory(Path dir,
                                              IOException exc) {
        System.out.format("Directory: %s%n", dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        if (dir.getFileName().toString().equals("SCCS")) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get(".");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();
        Files.walkFileTree(startingDir, filesVisitor);

    }
}
