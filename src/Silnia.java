import java.io.*;
public class Silnia
{
    public static long silnia(int n)
    {
        int wynik = 1;
        //if(n == 0) return 1;
       // else return n * silnia(n -1 );
        for(int i = n; i>0; i--)
        {
            wynik *= i;
        }
        return wynik;
    }
}
