public class SwitchMonthNumberToString {
    public static void main(String[] args) {
        int month = 11;
        String mounthName=" ";

        switch (month){
            case 1: mounthName="Ocak";
            break;
            case 2: mounthName="subat";
                break;
            case 3: mounthName="mart";
                break;
            case 4: mounthName="nisan";
                break;
            case 5: mounthName="Mayis";
                break;
            case 6: mounthName="Haziran";
                break;
            case 7: mounthName="Temmuz";
                break;
            case 8: mounthName="agustos";
                break;
            case 9: mounthName="Eylul";
                break;
            case 10: mounthName="Ekim";
                break;
            case 11: mounthName="Kasim";
                break;
            case 12: mounthName="Aralik";
                break;

                default:
                    System.out.println("invalid");

        }
        System.out.println(mounthName);
    }
}
