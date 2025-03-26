package filesystem;

import java.util.HashSet;
import java.util.Set;

public class Folder implements FileSystem {

    private String name;
    private Set<FileSystem> files = new HashSet();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(FileSystem file) {
        files.add(file);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystem file : files) {
            file.showDetails();
        }
    }
}
