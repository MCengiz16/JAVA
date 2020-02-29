package TestQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exportable {
   public static void main(String[] args) {
      LocalDate date1= LocalDate.now();
      LocalDate date2= LocalDate.of(2020,2,18);
      LocalDate date3= LocalDate.parse("2020-02-18", DateTimeFormatter.ISO_DATE);
      System.out.println(date1);
      System.out.println(date2);
      System.out.println(date3);
   }
}