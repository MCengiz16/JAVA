//package Cipher;
//
//public class Cipher {
//    private String word;
//    private int numToShift;
//
//    Cipher(){
//        this.word="Java is fun";
//        this.numToShift=1;
//    }
//    Cipher(String word, int num){
//        this.word =word;
//        this.numToShift=num;
//    }
//
//    public String getWord() {
//        return word;
//    }
//
//    public String cipher(){
//        String ciphered="";
//        for (int i =0;i<word.length();i++){
//            if(word.charAt(i)==32){
//                ciphered=ciphered+" " ;
//            }
//            else {
//                ciphered = ciphered + Character.toString(word.charAt(i) + numToShift);
//            }
//
//        }
//        return ciphered;
//    }
//    public String deCipher(){
//        String deCiphered="";
//        for (int i =0;i<word.length();i++){
//
//            if(word.charAt(i)==32){
//                deCiphered=deCiphered+" " ;
//            }
//            else {
//                deCiphered = deCiphered + Character.toString(cipher().charAt(i) - numToShift);
//            }
//
//        }
//        return deCiphered;
//    }
//}
