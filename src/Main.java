import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Silnia sil = new Silnia();

        System.out.println("Program oblicza silnie n!");
        System.out.print("n= ");
        boolean sukces = false;
        while (!sukces)
        {
            try
            {
                String s = in.readLine();
                int n = Integer.parseInt(s);
                if(n > 0)
                {
                    long siln = sil.silnia(n);
                    System.out.println(n+"!= " + siln);
                    sukces = true;
                }
                else
                {
                    System.err.println("Blad! To nie jest liczba nieujemna!");
                    System.out.print("\nn= ");
                }
            }
            catch (Exception e)
            {
                System.err.println("Blad! Niewlasciwy format danych!");
                System.out.print("\nn= ");
            }
        }

    }
}