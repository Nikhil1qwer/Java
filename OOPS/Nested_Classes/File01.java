package OOPS.Nested_Classes;

import java.util.*;

public class File01 {
    public class File01Inner {
        final static String FileName = "InnerFile";
        private int fileCount;
        private ArrayList<String> fileContent = new ArrayList<String>();

        public File01Inner() {
            System.out.println("Inner class constructor");
        }

        public int getFileCount() {
            return fileCount;
        }

        public void setFileContent(String fileContent) {
            this.fileContent.add(fileContent);
            fileCount++;
        }

        public String getFileContent(int index) {
            return fileContent.get(index);
        }
    }

    public static void main(String[] args) {
        File01 outer = new File01();
        File01Inner file = outer.new File01Inner();
        System.out.println(File01Inner.FileName);
        file.setFileContent("HELLO JAVA!");
        System.out.println(file.getFileContent(0) + " " + file.getFileCount());
    }
}
