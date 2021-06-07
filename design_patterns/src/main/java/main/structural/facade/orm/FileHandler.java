package main.structural.facade.orm;

public class FileHandler {

    private String filename;
    private String content;


    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void writeToFile() {
        System.out.println("Content: " + content + " has been written to file : " + filename + " ");
    }

    public void readFromFile() {
        System.out.println("Content : " + content + "has been read from file: " + filename);
    }
}
