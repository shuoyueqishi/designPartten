package visitor;

import composite.FileTreatmentException;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootDir = new Directory("root");
            Directory bindDir = new Directory("bind");
            Directory usrDir = new Directory("usr");
            Directory tempDir = new Directory("temp");
            rootDir.add(bindDir);
            rootDir.add(usrDir);
            usrDir.add(tempDir);
            bindDir.add(new File("蓉蓉的日记.pdf",1024));
            bindDir.add(new File("涛涛的日记.pdf",2024));
            bindDir.add(new File("记账本.xlsx",3024));
            tempDir.add(new File("小矮人.mv",2000));
            tempDir.add(new File("mate pro20",2700));
            usrDir.add(new File("mate pro30",2700));
            rootDir.accept(new ListVisitor(""));
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
