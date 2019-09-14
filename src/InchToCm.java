public class InchToCm {
    public static void main(String[] args) {
        converter(10,"cm");
        converter("inch",10);
    }

    public static void converter(int inch,String message){
        System.out.println(inch*2.54+message);

    }
    public static void converter(String message,int cm){
        System.out.println(cm*0.393701+message);

    }
}
