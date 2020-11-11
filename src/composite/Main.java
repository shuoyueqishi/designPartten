package composite;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("making root entries....");
            Directory rootDir = new Directory("root");
            Directory bindDir = new Directory("bind");
            Directory tempDir = new Directory("temp");
            Directory usrDir = new Directory("usr");
            rootDir.add(bindDir);
            rootDir.add(tempDir);
            rootDir.add(usrDir);
            bindDir.add(new File("div",1000));
            bindDir.add(new File("latex",20000));
            tempDir.add(new File("My Fight",4028));
            rootDir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
