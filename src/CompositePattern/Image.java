package CompositePattern;

public class Image implements File {

    private String name;
    private int id;

    public Image(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int  getId(){
        return id;
    }

    public void showFileDetails() {
        System.out.println("I'm "+this.name+", id is "+this.id);
    }

    public File copyFile() {
        return new Image(this.name + "copy", this.id * 2);
    }


}
