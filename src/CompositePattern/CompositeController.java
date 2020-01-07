package CompositePattern;

public class CompositeController {
    public static void main(String[] args) {
        Image image0 = new Image("image1", 10);
        Image image1 = new Image("image2", 11);

        PDF pdf0 = new PDF("pdf1", 20);
        PDF pdf1 = new PDF("pdf2", 21);

        FileFolder imageFolder = new FileFolder("iFolder", 1);
        imageFolder.addFile(image0);
        imageFolder.addFile(image1);
        imageFolder.addFile(image0.copyFile());

        FileFolder pdfFolder = new FileFolder("pFolder", 2);
        pdfFolder.addFile(pdf0);
        pdfFolder.addFile(pdf1);
        pdfFolder.addFile(pdf1.copyFile());

        FileFolder rootFolder=new FileFolder("root",0);
        rootFolder.addFile(pdfFolder);
        rootFolder.addFile(imageFolder);
        rootFolder.addFile(image0);
        rootFolder.showFileDetails();

    }
}
