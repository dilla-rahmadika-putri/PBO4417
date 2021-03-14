package Pertemuan1.Praktek.Praktek1;

/**Dilla Rahmadika Putri A11.2019.11741*/
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {

   public static void main(String args[]) throws IOException {
       try (InputStreamReader cin = new InputStreamReader(System.in)) {
         System.out.println("Tekan huruf 'q' untuk keluar.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }
   }
}