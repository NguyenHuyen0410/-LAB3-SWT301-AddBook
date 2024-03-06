package fa.training.entity;

import fa.training.utils.ValidatorUtils;

import java.util.Date;

public class Magazine extends Publication implements Comparable<Magazine>{
    private String author;
    private int volumn;
    private int edition;

    public Magazine(){

    }

    public Magazine(String author, int volumn, int edition) {
        this.author = author;
        this.volumn = volumn;
        this.edition = edition;
    }

    public Magazine(int publicationYear, String publisher, Date publicationDate, String author, int volumn, int edition) {
        super(publicationYear, publisher, publicationDate);
        this.author = author;
        this.volumn = volumn;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublister(){
        return super.getPublisher();
    }

    public int getPublicationYear(){
        return super.getPublicationYear();
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVolumn() {
        return volumn;
    }

    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void display() {
        System.out.printf("Author = %s, Publication Year = %d, Publication Date = %s, Publisher = %s, Volunm = %d, Edition = %d\n",
                author, super.getPublicationYear(), ValidatorUtils.dateToString(super.getPublicationDate()), super.getPublisher(), volumn, edition);
    }

    @Override
    public int compareTo(Magazine o) {
        Integer volumn = getVolumn();
        Integer ovolumn = o.volumn;
        return volumn.compareTo(ovolumn);
    }
}
