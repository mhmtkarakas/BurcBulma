import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      int month, day;
      String burc ="";
      boolean isError =false;

      Scanner input = new Scanner(System.in);
      System.out.print("Dogdugunuz ay : ");
      month = input.nextInt();

      System.out.print("Dogdugunuz gun : ");
      day = input.nextInt();

      if(month == 1){
          if(day >= 1 && day <= 21){
              System.out.print("Burcunuz : Oglak " );
          }else{
              System.out.print("Burcunuz : Kova " );
          }
      }else if(month == 2){
          if(day >= 22 && day <= 19){
              System.out.print("Burcunuz : Kova " );
          }else{
              System.out.print("Burcunuz : Balik " );
          }
      }else if(month == 3){
          if(day >= 20 && day <= 20){
              System.out.print("Burcunuz : Balik " );
          }else{
              System.out.print("Burcunuz : Koc " );
          }
      }else if(month == 4){
          if(day >= 21 && day <= 20){
              System.out.print("Burcunuz : Koc " );
          }else{
              System.out.print("Burcunuz : Boga " );
          }
      }else if(month == 5){
          if(day >= 21 && day <= 21){
              System.out.print("Burcunuz : Boga " );
          }else{
              System.out.print("Burcunuz : Ikizler " );
          }
      }else if(month == 6){
          if(day >= 21 && day <= 21){
              System.out.print("Burcunuz : Ikizler " );
          }else{
              System.out.print("Burcunuz : Yengec " );
          }
        }else if(month == 7){
          if(day >= 23 && day <= 22){
              System.out.print("Burcunuz : Yengec " );
          }else{
              System.out.print("Burcunuz : Aslan " );
          }
      }else if(month == 8){
          if(day >= 23 && day <= 22){
              System.out.print("Burcunuz : Aslan " );
          }else{
              System.out.print("Burcunuz : Basak " );
          }
      }else if(month == 9){
          if(day >= 23 && day <= 22){
              System.out.print("Burcunuz : Basak " );
          }else{
              System.out.print("Burcunuz : Terazi " );
          }
      }else if(month == 10){
          if(day >= 23 && day <= 22){
              System.out.print("Burcunuz : Terazi " );
          }else{
              System.out.print("Burcunuz : Akrep " );
          }
      }else if(month == 11){
          if(day >= 23 && day <= 21){
              System.out.print("Burcunuz : Akrep " );
          }else{
              System.out.print("Burcunuz : Yay " );
          }
      }else if(month == 12){
          if(day >= 22 && day <= 21){
              System.out.print("Burcunuz : Yay " );
          }else{
              System.out.print("Burcunuz : Oglak " );
          }
      }


    }
}