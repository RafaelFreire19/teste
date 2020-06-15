import java.util.Locale;
public class PrimeiroPrograma {
     public static void main (String[] args){
          String produto1="Computer" ;
          String produto2="Office desk";
          int age = 30;
          int code = 5290;
          char gender = 'F';
          double price1 = 2100.0;
          double price2 = 650.50;
          double measure = 53.234567;
          System.out.print("Products:");
          System.out.printf("%n%s, which price is, $%.2f.", produto1,price1);
          System.out.printf("%n%s, which price is, $%.2f.", produto2,price2);
          System.out.printf("%n%nRecord: %d years old, code %d and gender: n%s.",age,code,gender);
          System.out.printf("%n%nMensure with eight decimal places %f.", measure);
          System.out.printf("%nRouded (three decimal places: %.3f.",measure);
          Locale.setDefault(Locale.US);
          System.out.printf("%nUS decimal point: %.3f.",measure);
     }
}
