import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Latihan {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int correct = 0;

      System.out.print("Berapa soal yang kamu inginkan?");
      int question = in.nextInt();
      System.out.println("");

      System.out.print("Tulis nama kamu! [Z]akka, [N]ada, atau [A]rsa?");
      String name = in.next();

      int max = 0;
      if(name.equals("Z") || name.equals("z")) max = 500;
      else if(name.equals("N") || name.equals("n")) max = 50;
      else if (name.equals("A") || name.equals("a")) max = 20;

      Calendar calendar = Calendar.getInstance();
      Date date = new Date();
      long startTime = calendar.getTimeInMillis();

      for(int i = 0; i < question; i++){
          int x = (int)(Math.random() * max);

          int maxTemp = max;
          
          // spesifik untuk Arsa, dibuat jangan terlalu sulit, maksimal jumlahnya 30
          if(max == 20 && x > 15) maxTemp = 30 - x;
          int y = (int)(Math.random() * maxTemp);
          
          System.out.print("Berapakah " + x + " + " + y + "? ");
          int ans = in.nextInt();
          
          if(ans == x+y) {
              System.out.println("Yeay betul!");
              correct++;
          }
          else System.out.println("wah, harusnya jawabannya " + (x+y));

          System.out.println("");
      }

      /*long endTime = date.getTime();

      System.out.println(startTime + " --- " + endTime);
      long diff = (endTime - startTime);

      System.out.println(diff + " **** " + (int)diff);
      int minute = 0, second = 0;
      if(diff > 60) minute = (int)diff / 60;
      second = (int)diff % 60;
      */

      System.out.println("Kamu berhasil menjawab " + correct + " dari " + question + " pertanyaan loh");
      System.out.println("Nilai kamu adalah " + (correct * 100 / question));
      
      //System.out.println("Kamu berhasil menyelesaikan dalam " + minute + " menit dan " + second + " detik");
    }
}