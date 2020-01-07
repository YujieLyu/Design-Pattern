package CompositePattern;

public class PDF implements File {

    private String name;
    private int id;

    public PDF(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void showFileDetails(){
        System.out.println("I'm "+this.name+", id is "+this.id);
    }

    public File copyFile(){
        return new PDF(this.name+"copy",this.id*2);
    }


}
