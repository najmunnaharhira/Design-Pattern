// Main class to test the Composite Design Pattern for determining directory size
public class Main {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Root");

        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 150);

        Folder subFolder = new Folder("Subfolder");
        File file3 = new File("file3.txt", 200);
        subFolder.add(file3);

        rootFolder.add(file1);
        rootFolder.add(file2);
        rootFolder.add(subFolder);

        System.out.println("Total size of Root folder: " + rootFolder.getSize() + " bytes");
    }
}
