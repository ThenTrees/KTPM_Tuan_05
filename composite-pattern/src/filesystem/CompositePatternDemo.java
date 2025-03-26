package filesystem;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        File saoKe = new File("saoKe.docx", 100);
        File changLog = new File(  "Changelog.docx", 200);
        File homeFile = new File("homeFile.txt", 50);
        home.addFile(homeFile);

        root.addFile(saoKe);
        root.addFile(changLog);
        root.addFile(home);

        root.showDetails();
    }

}
