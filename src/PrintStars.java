public class PrintStars {
    public static void main(String[] args) {

        for (int i=1;i<20;i++){
            for(int j=1;i>=j;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        int i = 1;
        while (i < 20) {
            int j = 1;
            while (i  >= j) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }


        int count= 1;
        String stairs = "";

        do { stairs=stairs+"*";System.out.println(stairs); count++; }
        while (count < 20);



    }
}

