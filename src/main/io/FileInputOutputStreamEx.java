package io;

import java.io.File;
import java.io.IOException;

public class FileInputOutputStreamEx {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\d.zip");
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");
        System.out.println("경로를 제외한 파일명 : "+fileName);
        System.out.println("오직 파일명 : "+fileName.substring(0,pos));
        System.out.println("확장자명 : "+fileName.substring(pos+1));
        System.out.println("f.getPath() : "+f.getPath());
        System.out.println("f.getAbsolutePath() : "+f.getAbsolutePath());
        System.out.println("f.getCanonicalPath() : "+f.getCanonicalPath());
        System.out.println("f.getParent() : "+f.getParent());
    }
}
