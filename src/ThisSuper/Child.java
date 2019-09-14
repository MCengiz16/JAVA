package ThisSuper;

public class Child extends Parent {
    int num3;

    Child(){
        super();
        super.num2=4;
        this.num3=6;
    }
    public void printChild(){
        System.out.println(num1+" "+num2+" "+num3);
    }
}
