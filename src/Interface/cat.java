package Interface;

public class cat implements Animal,Plant {
    public void makeSound(){
        System.out.println("meaw");
    }

    public void move(){
        System.out.println("move");
    }
    public void feed(){
        System.out.println("feed");
    }
    public void live(){
        System.out.println("live");
    }
}
