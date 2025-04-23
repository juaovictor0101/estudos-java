package javaviradonojiraya.javacore.Minterfaces.test;

import javaviradonojiraya.javacore.Minterfaces.domain.DataBaseLoader;
import javaviradonojiraya.javacore.Minterfaces.domain.DataLouder;
import javaviradonojiraya.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();
        System.out.println(" -------------------------------- ");

        dataBaseLoader.remove();
        fileLoader.remove();
        System.out.println(" -------------------------------- ");

        fileLoader.checkPermission();
        dataBaseLoader.checkPermission();
        System.out.println(" -------------------------------- ");

        DataBaseLoader.retrieveMaxDataSize();
        DataLouder.retrieveMaxDataSize();


    }
}
