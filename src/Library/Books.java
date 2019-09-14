package Library;

public abstract class Books {
  public int ID;
    public String name;
    public String author;
    public boolean availability;

    public Books(int ID, String name, String author, boolean availability) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.availability = availability;
    }
}
