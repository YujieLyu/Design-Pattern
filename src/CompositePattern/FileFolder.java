package CompositePattern;

import java.util.ArrayList;

public class FileFolder implements File {

    private ArrayList<File> files;
    private String name;
    private int id;

    public FileFolder(String name, int id) {
        this.name = name;
        this.id = id;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void DeleteFile(File file) {
        files.remove(file);
    }

    public void showFileDetails() {
        System.out.println("There are files in " + this.name + ", id: " + this.id);
        for (File file : files) {
            file.showFileDetails();
        }
    }

    @Override
    public File copyFile() {
        return new FileFolder(this.name + "copy", this.id * 2);
    }

}
