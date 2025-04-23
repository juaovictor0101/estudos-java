package javaviradonojiraya.javacore.WNio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Samsung\\Documents\\Estudos\\estudos java\\pasta_renomeada");
        Path p2 = Paths.get("C:\\Users\\Samsung\\Documents\\Estudos\\estudos java","pasta_renomeada");
        Path p3 = Paths.get("C:","Users\\Samsung\\Documents\\Estudos\\estudos java\\pasta_renomeada");
        Path p4 = Paths.get("C:","Users","Samsung","Documents","Estudos","estudos", "java","pasta_renomeada");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
