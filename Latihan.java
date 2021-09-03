import java.util.Scanner;
/*import java.util.Calendar;
import java.util.Date;
*/
public class Latihan {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int correct = 0;

      System.out.print("Berapa soal yang kamu inginkan? ");
      int question = in.nextInt();
      System.out.println("");

      System.out.print("Tulis nama kamu! [Z]akka, [N]ada, atau [A]rsa? ");
      String name = in.next();

      boolean includeSub = false;
      if(!name.equals("A") && !name.equals("a")){
        System.out.print("Apakah kamu menginginkan soal pengurangan juga? [Y]a atau [T]idak? ");
        String substraction = in.next();
        includeSub = substraction.equals("Y") || substraction.equals("y");
        System.out.println("");
      }

      int max = 0;
      if(name.equals("Z") || name.equals("z")) max = 1000;
      else if(name.equals("N") || name.equals("n")) max = 100;
      else if (name.equals("A") || name.equals("a")) max = 20;

      int maxTemp = 0;

      //TODO: tambahin pertanyaan apakah soalnya mau ke samping atau ke bawah

      for(int i = 0; i < question; i++){
          int x = (int)(Math.random() * max);

          maxTemp = max;
          
          // spesifik untuk Arsa, dibuat jangan terlalu sulit, maksimal jumlahnya 30

          boolean isAdd = true;
          if(includeSub) isAdd = ( Math.random() < 0.5 );

          if(isAdd){
            if(max == 20 && x > 0) maxTemp = 30 - x;
            int y = (int)(Math.random() * maxTemp);
            
            //TODO: kalo pertanyaannya ke bawah, format tampilannya harus diubah sedikit

            System.out.print("Berapakah " + x + " + " + y + "? ");
            int ans = in.nextInt();

            if(ans == x+y) {
              System.out.println("Yeay betul!");
              correct++;
            }
            else System.out.println("wah, harusnya jawabannya " + (x+y));

          } else {
            int y = (int)(Math.random() * x);

            System.out.print("Berapakah " + x + " - " + y + "? ");
            int ans = in.nextInt();

            if(ans == x-y){
              System.out.println("Yeay betul!");
              correct++;
            }
            else System.out.println("wah, harusnya jawabannya " + (x-y));
          }

          System.out.println("");
      }

      System.out.println("Kamu berhasil menjawab " + correct + " dari " + question + " pertanyaan loh");
      System.out.println("Nilai kamu adalah " + (correct * 100 / question));
    }
}