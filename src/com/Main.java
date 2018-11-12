package com;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) throws IOException {
//        File file=new File("someFile.txt");
//        if(!file.exists()){file.createNewFile();}
        Path path = Paths.get("file.txt").toAbsolutePath();

//        File file=new File("someFile.txt");
//        path=file.toPath();
//        System.out.println( path.getFileName());
//        System.out.println( path.getRoot());
//        System.out.println( path.getParent());
//        System.out.println( path.isAbsolute());
//        System.out.println( path.getFileSystem());
//
//        Files files;
//        Files.copy(Paths.get("someFile.txt"),Paths.get("someFile2.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.move(Paths.get("someFile2.txt"),Paths.get("someFile3.txt"),StandardCopyOption.REPLACE_EXISTING);
//        Files.deleteIfExists(Paths.get("someFile3.txt"));
//
//       System.out.println(Files.size(path));
//        System.out.println(Files.isDirectory(path));
//        System.out.println(Files.isHidden(path));
//        System.out.println(Files.isExecutable(path));
//        System.out.println(Files.isReadable(path));
//        System.out.println(Files.isWritable(path));

//        System.out.println( Files.getAttribute(path,"size", LinkOption.NOFOLLOW_LINKS));
//
//        BasicFileAttributes attributes=Files.readAttributes(path,BasicFileAttributes.class,LinkOption.NOFOLLOW_LINKS);
//        PosixFileAttributes posix= Files.readAttributes(path,PosixFileAttributes.class,LinkOption.NOFOLLOW_LINKS);
//
//

//        byte[]bytes=Files.readAllBytes(path);
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//
//        }
//        Files.write(path, "new chars\n in file".getBytes());

        java.util.List<String> list=Files.readAllLines(Paths.get("file.txt"));
//        for (String s :list) {
//            System.out.println(s);
//
//        }
//        Files.write(path,"bla\nhaha".getBytes());
//        Files.write(path,"bla\nhaha".getBytes(),StandardOpenOption.APPEND);
//        java.util.List<String> list1=new ArrayList<String>();
//        list1.add("new");
//        Files.write(path,list1);
//        InputStream is=Files.newInputStream(path);
//        OutputStream os=Files.newOutputStream(path);
//        Reader reader=Files.newBufferedReader(path);
//        Writer writer=Files.newBufferedWriter(path);


//        try(DirectoryStream<Path> entries=Files.newDirectoryStream(Paths.get("."))){
//            for (Path path1 : entries) {
//                System.out.println(path1.getFileName());
//            }
//        }
    Files.walkFileTree(Paths.get("."),new HashSet<FileVisitOption>(),3,new MyFileVisitor());

    }
}

class MyFileVisitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

//class MyVisitor implements FileVisitor{
//    @Override
//    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
//        return null; }
//    @Override
//    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
//        return null; }
//    @Override
//    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
//        return null; }
//    @Override
//    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
//        return null; }
//}
//







