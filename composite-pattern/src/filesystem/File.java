package filesystem;

public class File implements FileSystem {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + ", Size: " + size);
    }
}
